// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetAuthCertInstancedataurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // oss服务地址
    @NameInMap("host")
    public String host;

    // 申请的证书领取人csv的名称，使用该key作为批量颁发证书的path参数
    @NameInMap("dir")
    public String dir;

    // ak
    @NameInMap("access_id")
    public String accessId;

    // Policy规定了请求表单域的合法性
    @NameInMap("policy")
    public String policy;

    // 签名
    @NameInMap("signature")
    public String signature;

    // 过期时间戳
    @NameInMap("expire")
    public String expire;

    // 加密回调信息
    @NameInMap("callback")
    public String callback;

    public static GetAuthCertInstancedataurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCertInstancedataurlResponse self = new GetAuthCertInstancedataurlResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthCertInstancedataurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAuthCertInstancedataurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAuthCertInstancedataurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAuthCertInstancedataurlResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetAuthCertInstancedataurlResponse setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public GetAuthCertInstancedataurlResponse setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public GetAuthCertInstancedataurlResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetAuthCertInstancedataurlResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetAuthCertInstancedataurlResponse setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetAuthCertInstancedataurlResponse setCallback(String callback) {
        this.callback = callback;
        return this;
    }
    public String getCallback() {
        return this.callback;
    }

}
