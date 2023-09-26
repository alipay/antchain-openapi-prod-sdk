// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class PullApiSimpleauthmarkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 拉取推送系统时间
    @NameInMap("timestamp")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String timestamp;

    // 请求id，幂等控制
    @NameInMap("biz_request_id")
    public String bizRequestId;

    // 调用的租户
    @NameInMap("inst_code")
    public String instCode;

    // oss文件的域名地址
    // 测试环境域名：http://invoice-oss-sit.oss-cn-hangzhou.aliyuncs.com
    // 生产环境域名：http://invoice-commercial-prod.oss-cn-hangzhou.aliyuncs.com
    // 端口是默认的80
    @NameInMap("result_list")
    public java.util.List<String> resultList;

    // 解密的秘钥
    @NameInMap("secret")
    public String secret;

    public static PullApiSimpleauthmarkResponse build(java.util.Map<String, ?> map) throws Exception {
        PullApiSimpleauthmarkResponse self = new PullApiSimpleauthmarkResponse();
        return TeaModel.build(map, self);
    }

    public PullApiSimpleauthmarkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PullApiSimpleauthmarkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PullApiSimpleauthmarkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PullApiSimpleauthmarkResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public PullApiSimpleauthmarkResponse setBizRequestId(String bizRequestId) {
        this.bizRequestId = bizRequestId;
        return this;
    }
    public String getBizRequestId() {
        return this.bizRequestId;
    }

    public PullApiSimpleauthmarkResponse setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public PullApiSimpleauthmarkResponse setResultList(java.util.List<String> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<String> getResultList() {
        return this.resultList;
    }

    public PullApiSimpleauthmarkResponse setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

}
