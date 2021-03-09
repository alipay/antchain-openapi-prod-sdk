// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseMasterzoneResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // master_zones
    @NameInMap("master_zones")
    public java.util.List<String> masterZones;

    public static AllDatabaseMasterzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseMasterzoneResponse self = new AllDatabaseMasterzoneResponse();
        return TeaModel.build(map, self);
    }

    public AllDatabaseMasterzoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDatabaseMasterzoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDatabaseMasterzoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDatabaseMasterzoneResponse setMasterZones(java.util.List<String> masterZones) {
        this.masterZones = masterZones;
        return this;
    }
    public java.util.List<String> getMasterZones() {
        return this.masterZones;
    }

}
