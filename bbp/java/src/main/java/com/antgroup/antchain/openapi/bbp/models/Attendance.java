// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class Attendance extends TeaModel {
    // 供应商编码
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 供应商A
    @NameInMap("sup_name")
    public String supName;

    // 员工编号
    @NameInMap("job_number")
    @Validation(required = true)
    public String jobNumber;

    // 名字
    @NameInMap("name")
    public String name;

    // 考勤信息
    @NameInMap("attendance_num")
    @Validation(required = true)
    public Long attendanceNum;

    // 级别
    @NameInMap("level")
    public String level;

    // 创建时间
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    // 创建者
    @NameInMap("creator")
    public String creator;

    // 时间
    @NameInMap("score_date")
    @Validation(required = true)
    public String scoreDate;

    // 结果状态
    @NameInMap("resultstate")
    public String resultstate;

    // 工作地点
    @NameInMap("workplace")
    public String workplace;

    // 结果时间
    @NameInMap("resultdate")
    public String resultdate;

    // 确认人
    @NameInMap("resultby")
    public String resultby;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static Attendance build(java.util.Map<String, ?> map) throws Exception {
        Attendance self = new Attendance();
        return TeaModel.build(map, self);
    }

    public Attendance setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public Attendance setSupName(String supName) {
        this.supName = supName;
        return this;
    }
    public String getSupName() {
        return this.supName;
    }

    public Attendance setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    public String getJobNumber() {
        return this.jobNumber;
    }

    public Attendance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Attendance setAttendanceNum(Long attendanceNum) {
        this.attendanceNum = attendanceNum;
        return this;
    }
    public Long getAttendanceNum() {
        return this.attendanceNum;
    }

    public Attendance setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public Attendance setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public Attendance setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Attendance setScoreDate(String scoreDate) {
        this.scoreDate = scoreDate;
        return this;
    }
    public String getScoreDate() {
        return this.scoreDate;
    }

    public Attendance setResultstate(String resultstate) {
        this.resultstate = resultstate;
        return this;
    }
    public String getResultstate() {
        return this.resultstate;
    }

    public Attendance setWorkplace(String workplace) {
        this.workplace = workplace;
        return this;
    }
    public String getWorkplace() {
        return this.workplace;
    }

    public Attendance setResultdate(String resultdate) {
        this.resultdate = resultdate;
        return this;
    }
    public String getResultdate() {
        return this.resultdate;
    }

    public Attendance setResultby(String resultby) {
        this.resultby = resultby;
        return this;
    }
    public String getResultby() {
        return this.resultby;
    }

    public Attendance setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
