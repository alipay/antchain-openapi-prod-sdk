// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PullApiHaiguanasyncpollingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户号/子租户号，如果为租户号获取，则为租户号，如果为子租户号获取，则传输子租户号
    @NameInMap("inst_code")
    public String instCode;

    // 请求id
    @NameInMap("biz_request_id")
    public String bizRequestId;

    // 身份id，企业税号
    @NameInMap("identity_id")
    public String identityId;

    // 数据文件地址集合，目前只会包含一个txt文件
    @NameInMap("file_list")
    public java.util.List<String> fileList;

    // 解密密钥信封
    @NameInMap("secret")
    public String secret;

    // 产品类型
    @NameInMap("auth_type")
    public String authType;

    // 行方生成的授权编号
    @NameInMap("auth_code")
    public String authCode;

    // 系统时间
    @NameInMap("timestamp")
    public String timestamp;

    public static PullApiHaiguanasyncpollingResponse build(java.util.Map<String, ?> map) throws Exception {
        PullApiHaiguanasyncpollingResponse self = new PullApiHaiguanasyncpollingResponse();
        return TeaModel.build(map, self);
    }

    public PullApiHaiguanasyncpollingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullApiHaiguanasyncpollingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullApiHaiguanasyncpollingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullApiHaiguanasyncpollingResponse setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public PullApiHaiguanasyncpollingResponse setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public PullApiHaiguanasyncpollingResponse setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public PullApiHaiguanasyncpollingResponse setFileList(java.util.List<String> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<String> getFileList() {
        return this.fileList;
    }

    public PullApiHaiguanasyncpollingResponse setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public PullApiHaiguanasyncpollingResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public PullApiHaiguanasyncpollingResponse setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public PullApiHaiguanasyncpollingResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
