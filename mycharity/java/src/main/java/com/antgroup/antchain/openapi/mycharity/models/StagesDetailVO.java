// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class StagesDetailVO extends TeaModel {
    // 分期id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 计划开始时间
    @NameInMap("start_time")
    public Long startTime;

    // 计划结束时间
    @NameInMap("end_time")
    public Long endTime;

    // 目标捐赠金额
    @NameInMap("target_money")
    public Long targetMoney;

    // 目标捐赠人数
    @NameInMap("target_num")
    public Long targetNum;

    // 说明
    @NameInMap("note")
    public String note;

    // 公开募捐编号
    @NameInMap("public_fundraising_no")
    public String publicFundraisingNo;

    // 静态文件地址‘,’分割
    @NameInMap("cover_url")
    public String coverUrl;

    // 管理费用金额(单位：分)
    @NameInMap("administrative_rate")
    public Long administrativeRate;

    // 项目状态，0进行中（默认），1已结项
    @NameInMap("state")
    public Long state;

    // 签约id,关联签约表
    @NameInMap("sign_id")
    public String signId;

    public static StagesDetailVO build(java.util.Map<String, ?> map) throws Exception {
        StagesDetailVO self = new StagesDetailVO();
        return TeaModel.build(map, self);
    }

    public StagesDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StagesDetailVO setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StagesDetailVO setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StagesDetailVO setTargetMoney(Long targetMoney) {
        this.targetMoney = targetMoney;
        return this;
    }
    public Long getTargetMoney() {
        return this.targetMoney;
    }

    public StagesDetailVO setTargetNum(Long targetNum) {
        this.targetNum = targetNum;
        return this;
    }
    public Long getTargetNum() {
        return this.targetNum;
    }

    public StagesDetailVO setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public StagesDetailVO setPublicFundraisingNo(String publicFundraisingNo) {
        this.publicFundraisingNo = publicFundraisingNo;
        return this;
    }
    public String getPublicFundraisingNo() {
        return this.publicFundraisingNo;
    }

    public StagesDetailVO setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public StagesDetailVO setAdministrativeRate(Long administrativeRate) {
        this.administrativeRate = administrativeRate;
        return this;
    }
    public Long getAdministrativeRate() {
        return this.administrativeRate;
    }

    public StagesDetailVO setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public StagesDetailVO setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

}
