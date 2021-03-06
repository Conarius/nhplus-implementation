package model;

import utils.DateConverter;
import java.time.LocalDate;
import java.time.LocalTime;

public class Treatment {
    private long tid;
    private long pid;
    private long cid;
    private LocalDate date;
    private LocalTime begin;
    private LocalTime end;
    private String description;
    private String remarks;
    private Boolean locked;

    public Treatment(long pid,long cid, LocalDate date, LocalTime begin,
                     LocalTime end, String description, String remarks,Boolean locked) {
        this.pid = pid;
        this.cid = cid;
        this.date = date;
        this.begin = begin;
        this.end = end;
        this.description = description;
        this.remarks = remarks;
        this.locked = locked;
    }

    public Treatment(long tid, long pid,long cid, LocalDate date, LocalTime begin,
                     LocalTime end, String description, String remarks,Boolean locked) {
        this.tid = tid;
        this.pid = pid;
        this.cid = cid;
        this.date = date;
        this.begin = begin;
        this.end = end;
        this.description = description;
        this.remarks = remarks;
        this.locked = locked;
    }

    public long getTid() {
        return tid;
    }

    public long getPid() {
        return this.pid;
    }

    public long getCid() {
        return this.cid;
    }

    public void setCid(long cid){
        this.cid = cid;
    }

    public String getDate() {
        return date.toString();
    }

    public String getBegin() {
        return begin.toString();
    }

    public String getEnd() {
        return end.toString();
    }

    public void setDate(String s_date) {
        LocalDate date = DateConverter.convertStringToLocalDate(s_date);
        this.date = date;
    }

    public void setBegin(String begin) {
        LocalTime time = DateConverter.convertStringToLocalTime(begin);
        this.begin = time;
    }

    public void setEnd(String end) {
        LocalTime time = DateConverter.convertStringToLocalTime(end);
        this.end = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public boolean isLocked(){
        return locked;
    }

    public void setLocked(boolean locked){
        this.locked =locked;
    }

    public String toString() {
        return "\nBehandlung" + "\nTID: " + this.tid +
                "\nPID: " + this.pid +
                "\nCID: " + this.cid +
                "\nDate: " + this.date +
                "\nBegin: " + this.begin +
                "\nEnd: " + this.end +
                "\nDescription: " + this.description +
                "\nRemarks: " + this.remarks +
                "\nLocked: " + this.locked + "\n";    }
}