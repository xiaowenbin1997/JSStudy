package com.example.utils;


import java.lang.reflect.Field;

public class RelectUtil {
    public static String jsonObject(Object obj) {
        Class className = null;
        Field[] fields = null;
        StringBuilder stringBuilder = new StringBuilder();
        className = obj.getClass();
        fields = className.getDeclaredFields();
        try {
            stringBuilder.append("{");
            for (int i = 0;i < fields.length;i++) {
                Field field = fields[i];
                field.setAccessible(true);
                String key = field.getName();
                Object value = field.get(obj);
                stringBuilder.append("\"");
                stringBuilder.append(key);
                stringBuilder.append("\"");
                stringBuilder.append(":");
                stringBuilder.append("\"");
                stringBuilder.append(value);
                stringBuilder.append("\"");
                if (i != fields.length - 1) {
                    stringBuilder.append(",");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}
