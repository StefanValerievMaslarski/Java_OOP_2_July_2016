package main.bg.softuni.contracts;


public interface Downloader  {

    void download(String fileUrl);

    void downloadOnNewThread(String fileUrl);
}
