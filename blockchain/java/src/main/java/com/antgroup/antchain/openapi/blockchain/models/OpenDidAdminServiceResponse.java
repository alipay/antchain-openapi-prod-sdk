// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OpenDidAdminServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 分配给该租户的访问密钥
    @NameInMap("dis_access_key")
    public String disAccessKey;

    public static OpenDidAdminServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDidAdminServiceResponse self = new OpenDidAdminServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenDidAdminServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OpenDidAdminServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OpenDidAdminServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OpenDidAdminServiceResponse setDisAccessKey(String disAccessKey) {
        this.disAccessKey = disAccessKey;
        return this;
    }
    public String getDisAccessKey() {
        return this.disAccessKey;
    }

}
