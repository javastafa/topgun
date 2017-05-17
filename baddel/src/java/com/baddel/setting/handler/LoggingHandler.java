/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baddel.setting.handler;


import java.util.Calendar;

/**
 *
 * @author mmetwally
 */
public class LoggingHandler {

    public static void logInfo(int project, String fileName, String logStr) {
        try {
            StringBuilder sb = new StringBuilder();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("infolog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            String dir = projectsDir + roboProjectName + "/";
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Info-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.text.SimpleDateFormat writeDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String writeFormat = writeDateFormat.format(Calendar.getInstance().getTime());
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            sb = sb.append("--");
            sb = sb.append(writeFormat);
            sb = sb.append("--");
            sb = sb.append(logStr);
            p.println(sb.toString());
            p.close();
            out.close();
            // System.out.println("--" + writeFormat + "--" + logStr);
        } catch (Exception e) {
        }
    }

    public static void logInfoDir(int project, String dirName, String fileName, String logStr) {
        try {
            StringBuilder sb = new StringBuilder();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("infolog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            if (dirName != null && !dirName.isEmpty()) {
                dirName = dirName + "/";
            } else {
                dirName = "";
            }
            String dir = projectsDir + roboProjectName + "/" + dirName;
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Info-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.text.SimpleDateFormat writeDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String writeFormat = writeDateFormat.format(Calendar.getInstance().getTime());
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + "-" + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            sb = sb.append("--");
            sb = sb.append(writeFormat);
            sb = sb.append("--");
            sb = sb.append(logStr);
            p.println(sb.toString());
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }

    public static void logInfoDirNoDate(int project, String dirName, String fileName, String logStr) {
        try {
            StringBuilder sb = new StringBuilder();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("infolog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            if (dirName != null && !dirName.isEmpty()) {
                dirName = dirName + "/";
            } else {
                dirName = "";
            }
            String dir = projectsDir + roboProjectName + "/" + dirName;
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Info-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + "-" + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            p.println(logStr);
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }

    public static void logInfo(String txt, String file, boolean delete) {

        try {
            java.io.File f = new java.io.File(file);
            if (!f.exists()) {
                f.createNewFile();
            } else {
                if (delete) {
                    f.delete();
                    f.createNewFile();
                }
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            p.println(txt);
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }

    public static void logPerform(int project, String fileName, String logStr) {
        try {
            StringBuilder sb = new StringBuilder();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("infolog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            String dir = projectsDir + roboProjectName + "/";
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Perform-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.text.SimpleDateFormat writeDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String writeFormat = writeDateFormat.format(Calendar.getInstance().getTime());
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            sb = sb.append("--");
            sb = sb.append(writeFormat);
            sb = sb.append("--");
            sb = sb.append(logStr);
            p.println(sb.toString());
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }

    public static void logError(int project, String fileName, String error, Exception ex) {
        try {
            StringBuilder sb = new StringBuilder();
            //ex.printStackTrace();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("errorlog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            String dir = projectsDir + roboProjectName + "/";
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Error-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.text.SimpleDateFormat writeDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String writeFormat = writeDateFormat.format(Calendar.getInstance().getTime());
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            sb = sb.append("--");
            sb = sb.append(writeFormat);
            sb = sb.append("--");
            sb = sb.append(error);
            p.println(sb.toString());
            ex.printStackTrace(p);
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }

    public static void logErrorDir(int project, String dirName, String fileName, String error, Exception ex) {
        try {
            StringBuilder sb = new StringBuilder();
//            Projectsetting projectsetting = ProjectsettingDAO.selectBysettingkeyAndPID("infolog", 0);
//            Roboproject roboproject = RoboprojectDAO.selectByid(project);
            String projectsDir = "/var/log/robocon/";
            String roboProjectName = project + "";
//            if (roboproject != null) {
//                roboProjectName = roboproject.getName();
//            }
//            if (projectsetting != null) {
//                projectsDir = projectsetting.getSettingvalue();
//            }
            if (dirName != null && !dirName.isEmpty()) {
                dirName = dirName + "/";
            } else {
                dirName = "";
            }
            String dir = projectsDir + roboProjectName + "/" + dirName;
            if (dir.equals("")) {
                return;
            }
            if (fileName == null || fileName.isEmpty()) {
                fileName = "Error-";
            }
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyyMMdd");
            java.text.SimpleDateFormat writeDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String writeFormat = writeDateFormat.format(Calendar.getInstance().getTime());
            java.util.Date now = new java.util.Date();
            java.io.File d = new java.io.File(dir);
            java.io.File f = new java.io.File(dir + fileName + dateFormat.format(now) + ".txt");
            if (!d.exists()) {
                d.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            java.io.FileOutputStream out;
            java.io.PrintStream p;
            out = new java.io.FileOutputStream(f, true);
            p = new java.io.PrintStream(out);
            sb = sb.append("--");
            sb = sb.append(writeFormat);
            sb = sb.append("--");
            sb = sb.append(error);
            p.println(sb.toString());
            ex.printStackTrace(p);
            p.close();
            out.close();
        } catch (Exception e) {
        }
    }
}
