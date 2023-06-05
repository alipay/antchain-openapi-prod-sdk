// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.adom.models;

import com.aliyun.tea.*;

public class QueryAppmarketPrivacytestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件路径
    @NameInMap("path")
    public String path;

    public static QueryAppmarketPrivacytestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketPrivacytestResponse self = new QueryAppmarketPrivacytestResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketPrivacytestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppmarketPrivacytestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppmarketPrivacytestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppmarketPrivacytestResponse setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
