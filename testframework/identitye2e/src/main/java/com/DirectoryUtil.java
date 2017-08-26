package com;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.util.ArrayList;

/**
 * This will scan configured directory in file system which will return fileDetails
 *
 * @see FileDetail
 */
public class DirectoryUtil {

    private ArrayList<FileDetail> filesDetail = new ArrayList<>();

    /**
     * This method will populate the
     *
     * @param path of the directory system
     */
    public void extractFileDetails(String path, SupportedFileFormat fileFormat) {
        File directory = new File(path);

        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile() && isSupportedFileType(file, fileFormat)) {
                populateFilesDetails(file);
            } else if (file.isDirectory()) {
                extractFileDetails(file.getAbsolutePath(), fileFormat);
            }
        }
    }

    private boolean isSupportedFileType(File file, SupportedFileFormat fileFormat) {
        return file.getName().endsWith(fileFormat.toString());
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }

    private void populateFilesDetails(File file) {
        FileDetail fileDetail = new FileDetail();
        fileDetail.setFileName(file.getName());
        fileDetail.setSize(file.length());
        fileDetail.setMineType(new MimetypesFileTypeMap().getContentType(file));
        fileDetail.setFileExtension(getFileExtension(file));
        filesDetail.add(fileDetail);
    }

    public ArrayList<FileDetail> getFilesDetail() {
        return filesDetail;
    }
}
