package com.sanish.timeclock.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Punch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer punchId;
    @Column(name = "punch_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate punchDate;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
//    @DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss a")
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime punchTime;

    private String punchType;
    private String employeeId;
    private Integer storeId;
    private String deviceId;

    public Punch() {
        super();
    }

    /**
     * Creates a new instance of Punch for the current date and time
     */
    public Punch(LocalDate punchDate, LocalDateTime punchTime) {
        this.punchDate = punchDate;
        this.punchTime = punchTime;
    }

    public Integer getPunchId() {
        return punchId;
    }

    public void setPunchId(Integer punchId) {
        this.punchId = punchId;
    }

    public LocalDate getPunchDate() {
        return punchDate;
    }

    public void setPunchDate(LocalDate punchDate) {
        this.punchDate = punchDate;
    }

    public LocalDateTime getPunchTime() {
        return punchTime;
    }

    public void setPunchTime(LocalDateTime punchTime) {
        this.punchTime = punchTime;
    }

    public String getPunchType() {
        return punchType;
    }

    public void setPunchType(String punchType) {
        this.punchType = punchType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
