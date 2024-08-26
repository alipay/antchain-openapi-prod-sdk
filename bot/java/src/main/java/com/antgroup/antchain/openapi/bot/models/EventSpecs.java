// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class EventSpecs extends TeaModel {
    // 物模型事件ID
    @NameInMap("event_model_id")
    @Validation(required = true)
    public String eventModelId;

    // 是否返回上链HASH，缺省值按false处理
    @NameInMap("return_hash")
    public Boolean returnHash;

    // 业务数据标识
    @NameInMap("biz_type")
    public String bizType;

    // 提交日期
    @NameInMap("submit_date")
    public String submitDate;

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

    public EventSpecs setReturnHash(Boolean returnHash) {
        this.returnHash = returnHash;
        return this;
    }
    public Boolean getReturnHash() {
        return this.returnHash;
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

}
