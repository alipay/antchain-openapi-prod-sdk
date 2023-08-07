// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PullApiSimpleauthasyncpollingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租户号
    @NameInMap("inst_code")
    public String instCode;

    // 纳税人识别号
    @NameInMap("identity_id")
    public String identityId;

    // 和查询的biz_request_id相同
    @NameInMap("biz_request_id")
    public String bizRequestId;

    // 产品类型：发票指标-301，税务指标-302，发票加税务指标-303
    @NameInMap("auth_type")
    public String authType;

    // 行方生成的授权编号
    @NameInMap("auth_code")
    public String authCode;

    // 时间戳
    @NameInMap("timestamp")
    public String timestamp;

    // 极简授权文件地址列表
    @NameInMap("file_list")
    public java.util.List<String> fileList;

    // 秘钥
    @NameInMap("secret")
    public String secret;

    public static PullApiSimpleauthasyncpollingResponse build(java.util.Map<String, ?> map) throws Exception {
        PullApiSimpleauthasyncpollingResponse self = new PullApiSimpleauthasyncpollingResponse();
        return TeaModel.build(map, self);
    }

    public PullApiSimpleauthasyncpollingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullApiSimpleauthasyncpollingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullApiSimpleauthasyncpollingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullApiSimpleauthasyncpollingResponse setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public PullApiSimpleauthasyncpollingResponse setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public PullApiSimpleauthasyncpollingResponse setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public PullApiSimpleauthasyncpollingResponse setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public PullApiSimpleauthasyncpollingResponse setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public PullApiSimpleauthasyncpollingResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public PullApiSimpleauthasyncpollingResponse setFileList(java.util.List<String> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<String> getFileList() {
        return this.fileList;
    }

    public PullApiSimpleauthasyncpollingResponse setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

}
