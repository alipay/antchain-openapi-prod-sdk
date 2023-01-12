// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppVersionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用发布包详情
    @NameInMap("version")
    @Validation(required = true)
    public AppVersion version;

    public static QueryAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppVersionResponse self = new QueryAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppVersionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppVersionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppVersionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppVersionResponse setVersion(AppVersion version) {
        this.version = version;
        return this;
    }
    public AppVersion getVersion() {
        return this.version;
    }

}
