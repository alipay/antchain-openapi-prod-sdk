// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表
    @NameInMap("cells")
    public java.util.List<Cell> cells;

    public static QueryCellResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCellResponse self = new QueryCellResponse();
        return TeaModel.build(map, self);
    }

    public QueryCellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCellResponse setCells(java.util.List<Cell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

}
