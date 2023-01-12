// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryMetaCellResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表
    @NameInMap("cells")
    public java.util.List<String> cells;

    public static QueryMetaCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetaCellResponse self = new QueryMetaCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetaCellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetaCellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetaCellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetaCellResponse setCells(java.util.List<String> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<String> getCells() {
        return this.cells;
    }

}
