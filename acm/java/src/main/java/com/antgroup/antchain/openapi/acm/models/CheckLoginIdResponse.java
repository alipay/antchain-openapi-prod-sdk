// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CheckLoginIdResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否存在
    @NameInMap("exist")
    public Boolean exist;

    // 所属的租户id
    @NameInMap("tenant_id")
    public String tenantId;

    public static CheckLoginIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLoginIdResponse self = new CheckLoginIdResponse();
        return TeaModel.build(map, self);
    }

    public CheckLoginIdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckLoginIdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLoginIdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckLoginIdResponse setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public CheckLoginIdResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
