package org.example;

import java.util.List;

public class StudentAnalyzer {

    /**
     * Đếm số sinh viên có điểm xuất sắc (>= 8.0)
     * Chỉ tính điểm hợp lệ trong khoảng [0, 10]
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;

        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                if (score >= 8.0) {
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Tính điểm trung bình của các điểm hợp lệ (0–10)
     * Nếu không có điểm hợp lệ thì trả về 0
     */
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        int validCount = 0;

        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                sum += score;
                validCount++;
            }
        }

        if (validCount == 0) {
            return 0.0;
        }

        return sum / validCount;
    }
}