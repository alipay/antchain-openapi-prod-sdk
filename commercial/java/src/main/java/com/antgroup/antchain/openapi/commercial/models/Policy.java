// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class Policy extends TeaModel {
    // 政策id
    @NameInMap("policy_id")
    @Validation(required = true)
    public String policyId;

    // 政策名称
    @NameInMap("policy_name")
    @Validation(required = true)
    public String policyName;

    // 政策类型
    @NameInMap("policy_type")
    @Validation(required = true)
    public String policyType;

    // 政策生效时间
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 政策失效时间
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 下架时间
    @NameInMap("offline_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String offlineTime;

    // 政策状态
    @NameInMap("policy_status")
    @Validation(required = true)
    public String policyStatus;

    // 创建者
    @NameInMap("creator")
    @Validation(required = true)
    public String creator;

    // 修改者
    @NameInMap("modifier")
    @Validation(required = true)
    public String modifier;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static Policy build(java.util.Map<String, ?> map) throws Exception {
        Policy self = new Policy();
        return TeaModel.build(map, self);
    }

    public Policy setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public Policy setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public Policy setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public Policy setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Policy setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public Policy setOfflineTime(String offlineTime) {
        this.offlineTime = offlineTime;
        return this;
    }
    public String getOfflineTime() {
        return this.offlineTime;
    }

    public Policy setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
        return this;
    }
    public String getPolicyStatus() {
        return this.policyStatus;
    }

    public Policy setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Policy setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public Policy setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Policy setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
