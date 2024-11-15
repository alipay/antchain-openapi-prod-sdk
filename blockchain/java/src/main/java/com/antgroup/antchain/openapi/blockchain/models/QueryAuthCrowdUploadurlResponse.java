// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCrowdUploadurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传地址
    @NameInMap("upload_url")
    public String uploadUrl;

    // policy
    @NameInMap("policy")
    public String policy;

    // 签名
    @NameInMap("signature")
    public String signature;

    // 文件目录
    @NameInMap("dir")
    public String dir;

    // oss地址
    @NameInMap("host")
    public String host;

    // 过期时间
    @NameInMap("expire")
    public String expire;

    public static QueryAuthCrowdUploadurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCrowdUploadurlResponse self = new QueryAuthCrowdUploadurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthCrowdUploadurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthCrowdUploadurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthCrowdUploadurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthCrowdUploadurlResponse setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public QueryAuthCrowdUploadurlResponse setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public QueryAuthCrowdUploadurlResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public QueryAuthCrowdUploadurlResponse setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public QueryAuthCrowdUploadurlResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public QueryAuthCrowdUploadurlResponse setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

}
