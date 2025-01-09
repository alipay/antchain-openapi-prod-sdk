// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class EventSpecs extends TeaModel {
    // 物模型事件ID
    @NameInMap("event_model_id")
    @Validation(required = true)
    public String eventModelId;

    // 业务数据标识
    @NameInMap("biz_type")
    public String bizType;

    // 
    // submit_date	STRING	否	2024-08-15		
    // 
    @NameInMap("submit_date")
    public String submitDate;

    // 冗余字段，请忽略
    @NameInMap("return_hash")
    public Boolean returnHash;

    public static EventSpecs build(java.util.Map<String, ?> map) throws Exception {
        EventSpecs self = new EventSpecs();
        return TeaModel.build(map, self);
    }

    public EventSpecs setEventModelId(String eventModelId) {
        this.eventModelId = eventModelId;
        return this;
    }
    public String getEventModelId() {
        return this.eventModelId;
    }

    public EventSpecs setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public EventSpecs setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
        return this;
    }
    public String getSubmitDate() {
        return this.submitDate;
    }

    public EventSpecs setReturnHash(Boolean returnHash) {
        this.returnHash = returnHash;
        return this;
    }
    public Boolean getReturnHash() {
        return this.returnHash;
    }

}
