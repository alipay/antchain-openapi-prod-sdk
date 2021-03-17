// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractAccountsealimageResponse extends TeaModel {
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

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 印章fileKey
    @NameInMap("file_key")
    public String fileKey;

    // 印章id
    @NameInMap("seal_id")
    public String sealId;

    // 印章下载地址, 有效时间1小时
    @NameInMap("url")
    public String url;

    // 印章高度
    @NameInMap("height")
    public Long height;

    // 印章宽度
    @NameInMap("width")
    public Long width;

    public static CreateContractAccountsealimageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContractAccountsealimageResponse self = new CreateContractAccountsealimageResponse();
        return TeaModel.build(map, self);
    }

    public CreateContractAccountsealimageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateContractAccountsealimageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateContractAccountsealimageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateContractAccountsealimageResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateContractAccountsealimageResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateContractAccountsealimageResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public CreateContractAccountsealimageResponse setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public CreateContractAccountsealimageResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateContractAccountsealimageResponse setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public CreateContractAccountsealimageResponse setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
