// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CheckLoginnameResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否存在
    @NameInMap("exist")
    public Boolean exist;

    // 所属租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    public static CheckLoginnameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLoginnameResponse self = new CheckLoginnameResponse();
        return TeaModel.build(map, self);
    }

    public CheckLoginnameResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckLoginnameResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLoginnameResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckLoginnameResponse setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public CheckLoginnameResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
