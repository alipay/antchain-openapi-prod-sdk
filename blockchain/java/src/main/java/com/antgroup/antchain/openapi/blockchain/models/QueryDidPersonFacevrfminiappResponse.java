// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidPersonFacevrfminiappResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 认证是否通过。
    @NameInMap("passed")
    public String passed;

    // 长度不超过128字符的分布式数字身份DID
    @NameInMap("did")
    public String did;

    public static QueryDidPersonFacevrfminiappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidPersonFacevrfminiappResponse self = new QueryDidPersonFacevrfminiappResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidPersonFacevrfminiappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidPersonFacevrfminiappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidPersonFacevrfminiappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidPersonFacevrfminiappResponse setPassed(String passed) {
        this.passed = passed;
        return this;
    }
    public String getPassed() {
        return this.passed;
    }

    public QueryDidPersonFacevrfminiappResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
