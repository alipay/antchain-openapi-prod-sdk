// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class OutboundPhoneResponseData extends TeaModel {
    // 通话唯一ID
    @NameInMap("acid")
    public String acid;

    // 是否同步
    @NameInMap("asyn")
    public Boolean asyn;

    // 外呼ID
    @NameInMap("outcall_request_id")
    public String outcallRequestId;

    // 外呼DB的ID
    @NameInMap("asyn_db_id")
    public String asynDbId;

    public static OutboundPhoneResponseData build(java.util.Map<String, ?> map) throws Exception {
        OutboundPhoneResponseData self = new OutboundPhoneResponseData();
        return TeaModel.build(map, self);
    }

    public OutboundPhoneResponseData setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public OutboundPhoneResponseData setAsyn(Boolean asyn) {
        this.asyn = asyn;
        return this;
    }
    public Boolean getAsyn() {
        return this.asyn;
    }

    public OutboundPhoneResponseData setOutcallRequestId(String outcallRequestId) {
        this.outcallRequestId = outcallRequestId;
        return this;
    }
    public String getOutcallRequestId() {
        return this.outcallRequestId;
    }

    public OutboundPhoneResponseData setAsynDbId(String asynDbId) {
        this.asynDbId = asynDbId;
        return this;
    }
    public String getAsynDbId() {
        return this.asynDbId;
    }

}
