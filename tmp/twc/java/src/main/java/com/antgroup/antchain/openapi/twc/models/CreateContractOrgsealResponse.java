// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractOrgsealResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 印章fileKey
    @NameInMap("file_key")
    public String fileKey;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 印章ID
    @NameInMap("seal_id")
    public String sealId;

    // 印章下载地址, 有效时间1小时
    @NameInMap("url")
    public String url;

    public static CreateContractOrgsealResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractOrgsealResponse self = new CreateContractOrgsealResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractOrgsealResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractOrgsealResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractOrgsealResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractOrgsealResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateContractOrgsealResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateContractOrgsealResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContractOrgsealResponse setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public CreateContractOrgsealResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
