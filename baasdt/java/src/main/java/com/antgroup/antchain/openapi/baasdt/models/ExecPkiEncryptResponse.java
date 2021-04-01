// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecPkiEncryptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 密文 base64编码 
    @NameInMap("encrypted_content")
    public String encryptedContent;

    public static ExecPkiEncryptResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecPkiEncryptResponse self = new ExecPkiEncryptResponse();
        return TeaModel.build(map, self);
    }

    public ExecPkiEncryptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecPkiEncryptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecPkiEncryptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecPkiEncryptResponse setEncryptedContent(String encryptedContent) {
        this.encryptedContent = encryptedContent;
        return this;
    }
    public String getEncryptedContent() {
        return this.encryptedContent;
    }

}
