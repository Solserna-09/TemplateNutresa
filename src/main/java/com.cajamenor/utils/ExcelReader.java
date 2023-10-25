package com.cajamenor.utils;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static int countRowsWithValues(String filePath) {
        int rowCount = 0;

        try (FileInputStream fis = new FileInputStream(new File(filePath))) {
            Workbook workbook = WorkbookFactory.create(fis);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (hasValuesInRow(row)) {
                    rowCount++;
                }
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }

        return rowCount;
    }

    private static boolean hasValuesInRow(Row row) {
        for (Cell cell : row) {
            if (cell.getCellType() != CellType.BLANK) {
                return true;
            }
        }
        return false;
    }
}