// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseSecurityipResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // security_ips
    @NameInMap("data")
    public java.util.List<DatabaseSecurityIp> data;

    public static AllDatabaseSecurityipResponse build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseSecurityipResponse self = new AllDatabaseSecurityipResponse();
        return TeaModel.build(map, self);
    }

    public AllDatabaseSecurityipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllDatabaseSecurityipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllDatabaseSecurityipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllDatabaseSecurityipResponse setData(java.util.List<DatabaseSecurityIp> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DatabaseSecurityIp> getData() {
        return this.data;
    }

}
