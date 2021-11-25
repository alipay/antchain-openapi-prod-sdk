// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class WorkersBaseInfo extends TeaModel {
    // 姓名
    @NameInMap("full_name")
    @Validation(required = true)
    public String fullName;

    // 身份证号
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 身份证有效期起
    @NameInMap("id_card_start_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String idCardStartDate;

    // 身份证有效期止
    @NameInMap("id_card_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String idCardEndDate;

    // 农民工个人did（实名认证后才有工号id）
    @NameInMap("workers_did")
    public String workersDid;

    // 手机号
    @NameInMap("mobile_no")
    public String mobileNo;

    // 工种
    @NameInMap("work_type")
    @Validation(required = true)
    public java.util.List<String> workType;

    // 工作状态   [1.进场   2.退场]
    @NameInMap("work_state")
    public String workState;

    // 进场时间
    @NameInMap("enter_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String enterTime;

    // 退场时间
    @NameInMap("quit_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String quitTime;

    // 合同薪资（单位：元）
    @NameInMap("compensation")
    public String compensation;

    public static WorkersBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        WorkersBaseInfo self = new WorkersBaseInfo();
        return TeaModel.build(map, self);
    }

    public WorkersBaseInfo setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public WorkersBaseInfo setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public WorkersBaseInfo setIdCardStartDate(String idCardStartDate) {
        this.idCardStartDate = idCardStartDate;
        return this;
    }
    public String getIdCardStartDate() {
        return this.idCardStartDate;
    }

    public WorkersBaseInfo setIdCardEndDate(String idCardEndDate) {
        this.idCardEndDate = idCardEndDate;
        return this;
    }
    public String getIdCardEndDate() {
        return this.idCardEndDate;
    }

    public WorkersBaseInfo setWorkersDid(String workersDid) {
        this.workersDid = workersDid;
        return this;
    }
    public String getWorkersDid() {
        return this.workersDid;
    }

    public WorkersBaseInfo setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

    public WorkersBaseInfo setWorkType(java.util.List<String> workType) {
        this.workType = workType;
        return this;
    }
    public java.util.List<String> getWorkType() {
        return this.workType;
    }

    public WorkersBaseInfo setWorkState(String workState) {
        this.workState = workState;
        return this;
    }
    public String getWorkState() {
        return this.workState;
    }

    public WorkersBaseInfo setEnterTime(String enterTime) {
        this.enterTime = enterTime;
        return this;
    }
    public String getEnterTime() {
        return this.enterTime;
    }

    public WorkersBaseInfo setQuitTime(String quitTime) {
        this.quitTime = quitTime;
        return this;
    }
    public String getQuitTime() {
        return this.quitTime;
    }

    public WorkersBaseInfo setCompensation(String compensation) {
        this.compensation = compensation;
        return this;
    }
    public String getCompensation() {
        return this.compensation;
    }

}
