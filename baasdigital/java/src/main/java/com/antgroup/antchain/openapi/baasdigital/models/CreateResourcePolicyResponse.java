// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateResourcePolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最终上传至服务端的实际文件名称
    @NameInMap("name")
    public String name;

    // 用户请求的AccessKey ID
    @NameInMap("accessid")
    public String accessid;

    // 用户发送上传请求的域名。
    @NameInMap("host")
    public String host;

    // 用户表单上传的策略（Policy），Policy为经过Ba...
    @NameInMap("policy")
    public String policy;

    // 对Policy签名后的字符串
    @NameInMap("signature")
    public String signature;

    // 由服务器端指定的Policy过期时间，格式为Unix时间戳
    @NameInMap("expire")
    public String expire;

    // 文件类型
    @NameInMap("mime_type")
    public String mimeType;

    // 	
    // 限制上传的文件名称
    @NameInMap("dir")
    public String dir;

    public static CreateResourcePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePolicyResponse self = new CreateResourcePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourcePolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateResourcePolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateResourcePolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateResourcePolicyResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourcePolicyResponse setAccessid(String accessid) {
        this.accessid = accessid;
        return this;
    }
    public String getAccessid() {
        return this.accessid;
    }

    public CreateResourcePolicyResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateResourcePolicyResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateResourcePolicyResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateResourcePolicyResponse setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public CreateResourcePolicyResponse setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
    public String getMimeType() {
        return this.mimeType;
    }

    public CreateResourcePolicyResponse setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

}
