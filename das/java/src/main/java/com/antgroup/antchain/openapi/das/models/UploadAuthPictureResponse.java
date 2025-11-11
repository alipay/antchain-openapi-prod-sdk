// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadAuthPictureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 访问id
    @NameInMap("access_id")
    public String accessId;

    // 策略
    @NameInMap("policy")
    public String policy;

    // 签名
    @NameInMap("signature")
    public String signature;

    // 目录
    @NameInMap("dir")
    public String dir;

    // 主机
    @NameInMap("host")
    public String host;

    // 过期时间
    @NameInMap("expire")
    public String expire;

    // 回调地址
    @NameInMap("callback")
    public String callback;

    public static UploadAuthPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAuthPictureResponse self = new UploadAuthPictureResponse();
        return TeaModel.build(map, self);
    }

    public UploadAuthPictureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadAuthPictureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadAuthPictureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadAuthPictureResponse setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public UploadAuthPictureResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public UploadAuthPictureResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public UploadAuthPictureResponse setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public UploadAuthPictureResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UploadAuthPictureResponse setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public UploadAuthPictureResponse setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

}
