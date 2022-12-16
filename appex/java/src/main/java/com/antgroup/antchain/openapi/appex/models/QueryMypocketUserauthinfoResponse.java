// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketUserauthinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权信息详情
    @NameInMap("authorization_info")
    public java.util.List<NameValuePair> authorizationInfo;

    public static QueryMypocketUserauthinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketUserauthinfoResponse self = new QueryMypocketUserauthinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMypocketUserauthinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMypocketUserauthinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMypocketUserauthinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMypocketUserauthinfoResponse setAuthorizationInfo(java.util.List<NameValuePair> authorizationInfo) {
        this.authorizationInfo = authorizationInfo;
        return this;
    }
    public java.util.List<NameValuePair> getAuthorizationInfo() {
        return this.authorizationInfo;
    }

}
