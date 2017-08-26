package com;

import org.junit.Assert;
import org.junit.Test;

public class DirectoryUtilTest {
    private static String CURRENT_PROJECT_DIRECTORY = System.getProperty("user.dir");

    @Test
    public void testExtractFileDetailsForCSV() {
        DirectoryUtil directoryUtil = new DirectoryUtil();
        directoryUtil.extractFileDetails(CURRENT_PROJECT_DIRECTORY, SupportedFileFormat.CSV);
        Assert.assertTrue(directoryUtil.getFilesDetail().size() == 1);
        System.out.println("Total Number of files of CSV types ="+directoryUtil.getFilesDetail().size());
    }

    @Test
    public void testExtractFileDetailsForExcel() {
        DirectoryUtil directoryUtil = new DirectoryUtil();
        directoryUtil.extractFileDetails(CURRENT_PROJECT_DIRECTORY, SupportedFileFormat.Excel);
        Assert.assertTrue(directoryUtil.getFilesDetail().size() == 1);
        System.out.println("Total Number of files of XLS types ="+directoryUtil.getFilesDetail().size());
    }

    @Test
    public void testExtractFileDetailsForAny() {
        DirectoryUtil directoryUtil = new DirectoryUtil();
        directoryUtil.extractFileDetails(CURRENT_PROJECT_DIRECTORY, SupportedFileFormat.ANY);
        Assert.assertFalse(directoryUtil.getFilesDetail().size() == 1);
        System.out.println("Total Number of files of any types ="+directoryUtil.getFilesDetail().size());
    }
}