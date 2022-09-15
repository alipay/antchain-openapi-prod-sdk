// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class UpdateStagesRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分期id
    @NameInMap("id")
    @Validation(required = true, maxLength = 50)
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
    @Validation(maxLength = 1000)
    public String note;

    // 公开募捐编号
    @NameInMap("public_fundraising_no")
    @Validation(maxLength = 50)
    public String publicFundraisingNo;

    // 静态文件地址‘,’分割
    @NameInMap("cover_url")
    @Validation(maxLength = 450)
    public String coverUrl;

    // 管理费用金额(单位：分)
    @NameInMap("administrative_rate")
    public Long administrativeRate;

    // 项目状态，0进行中（默认），1已结项
    @NameInMap("state")
    public Long state;

    // 签约id,关联签约表
    @NameInMap("sign_id")
    @Validation(maxLength = 50)
    public String signId;

    public static UpdateStagesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStagesRequest self = new UpdateStagesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStagesRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateStagesRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateStagesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateStagesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public UpdateStagesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public UpdateStagesRequest setTargetMoney(Long targetMoney) {
        this.targetMoney = targetMoney;
        return this;
    }
    public Long getTargetMoney() {
        return this.targetMoney;
    }

    public UpdateStagesRequest setTargetNum(Long targetNum) {
        this.targetNum = targetNum;
        return this;
    }
    public Long getTargetNum() {
        return this.targetNum;
    }

    public UpdateStagesRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateStagesRequest setPublicFundraisingNo(String publicFundraisingNo) {
        this.publicFundraisingNo = publicFundraisingNo;
        return this;
    }
    public String getPublicFundraisingNo() {
        return this.publicFundraisingNo;
    }

    public UpdateStagesRequest setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public UpdateStagesRequest setAdministrativeRate(Long administrativeRate) {
        this.administrativeRate = administrativeRate;
        return this;
    }
    public Long getAdministrativeRate() {
        return this.administrativeRate;
    }

    public UpdateStagesRequest setState(Long state) {
        this.state = state;
        return this;
    }
    public Long getState() {
        return this.state;
    }

    public UpdateStagesRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

}
