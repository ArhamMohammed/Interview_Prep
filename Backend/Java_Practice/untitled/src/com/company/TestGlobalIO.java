package com.company;
import java.io.*;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestGlobalIO {
    private static final String[] FILE_URLS = {
            "https://file-examples.com/storage/fedb66d828647a2629b3efb/2017/10/file-sample_150kB.pdf",
            "https://file-examples.com/storage/fedb66d828647a2629b3efb/2017/10/file-example_PDF_500_kB.pdf",
            "https://file-examples.com/storage/fedb66d828647a2629b3efb/2017/10/file-example_PDF_1MB.pdf"
    };
    private static final int THREAD_COUNT = FILE_URLS.length;
    public static void main (String args []){
                ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
//              Executor service helps in maintaining a pool of threads and assigns them tasks.
                for (String fileUrl : FILE_URLS) {
                    executor.execute(() -> {
//                  execute method will start executing a thread.
                        try {
                            downloadFile(fileUrl);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                }
                executor.shutdown();
//                an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
            }

            private static void downloadFile(String fileUrl) throws IOException {
                URL url = new URL(fileUrl);
                String fileName = fileUrl.substring(fileUrl.lastIndexOf("/") + 1);
                BufferedInputStream in = new BufferedInputStream(url.openStream());
//                     BufferedInputStream class is used to read information from stream.
                     FileOutputStream fileOutputStream = new FileOutputStream(fileName);
                    byte[] dataBuffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                        fileOutputStream.write(dataBuffer, 0, bytesRead);
                    }
                System.out.println("Downloaded: " + fileName);
            }
        }