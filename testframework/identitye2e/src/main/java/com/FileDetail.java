package com;

public class FileDetail {
    private static String fileName;
    private static String mineType;
    private static long size;
    private static String fileExtension;

    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String fileName) {
        FileDetail.fileName = fileName;
    }

    public static String getMineType() {
        return mineType;
    }

    public static void setMineType(String mineType) {
        FileDetail.mineType = mineType;
    }

    public static long getSize() {
        return size;
    }

    public static void setSize(long size) {
        FileDetail.size = size;
    }

    public static String getFileExtension() {
        return fileExtension;
    }

    public static void setFileExtension(String fileExtension) {
        FileDetail.fileExtension = fileExtension;
    }

    @Override
    public String toString() {
        return "FileDetail [fileName] "+fileName+", [mineType]"+mineType+", [size]"+size+", [fileExtension]"+fileExtension;
    }

}
