// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class Assessment extends TeaModel {
    // 供应商
    @NameInMap("sup_code")
    @Validation(required = true)
    public String supCode;

    // 供应商B
    @NameInMap("sup_name")
    @Validation(required = true)
    public String supName;

    // 员工号
    @NameInMap("job_number")
    @Validation(required = true)
    public String jobNumber;

    // 员工姓名
    @NameInMap("name")
    public String name;

    // 考核分数
    @NameInMap("assessment_num")
    @Validation(required = true)
    public Long assessmentNum;

    // 级别
    @NameInMap("level")
    @Validation(required = true)
    public String level;

    // 创建时间
    @NameInMap("create_date")
    @Validation(required = true)
    public String createDate;

    // 管理员
    @NameInMap("creator")
    public String creator;

    // 202103
    @NameInMap("score_date")
    @Validation(required = true)
    public String scoreDate;

    // 结果状态
    @NameInMap("resultstate")
    @Validation(required = true)
    public String resultstate;

    // 工作地点
    @NameInMap("workplace")
    public String workplace;

    // 状态更新时间
    @NameInMap("resultdate")
    @Validation(required = true)
    public String resultdate;

    // 确认人
    @NameInMap("resultby")
    @Validation(required = true)
    public String resultby;

    // 备注
    @NameInMap("remark")
    public String remark;

    public static Assessment build(java.util.Map<String, ?> map) throws Exception {
        Assessment self = new Assessment();
        return TeaModel.build(map, self);
    }

    public Assessment setSupCode(String supCode) {
        this.supCode = supCode;
        return this;
    }
    public String getSupCode() {
        return this.supCode;
    }

    public Assessment setSupName(String supName) {
        this.supName = supName;
        return this;
    }
    public String getSupName() {
        return this.supName;
    }

    public Assessment setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
        return this;
    }
    public String getJobNumber() {
        return this.jobNumber;
    }

    public Assessment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Assessment setAssessmentNum(Long assessmentNum) {
        this.assessmentNum = assessmentNum;
        return this;
    }
    public Long getAssessmentNum() {
        return this.assessmentNum;
    }

    public Assessment setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public Assessment setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public Assessment setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Assessment setScoreDate(String scoreDate) {
        this.scoreDate = scoreDate;
        return this;
    }
    public String getScoreDate() {
        return this.scoreDate;
    }

    public Assessment setResultstate(String resultstate) {
        this.resultstate = resultstate;
        return this;
    }
    public String getResultstate() {
        return this.resultstate;
    }

    public Assessment setWorkplace(String workplace) {
        this.workplace = workplace;
        return this;
    }
    public String getWorkplace() {
        return this.workplace;
    }

    public Assessment setResultdate(String resultdate) {
        this.resultdate = resultdate;
        return this;
    }
    public String getResultdate() {
        return this.resultdate;
    }

    public Assessment setResultby(String resultby) {
        this.resultby = resultby;
        return this;
    }
    public String getResultby() {
        return this.resultby;
    }

    public Assessment setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
