// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListCellResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 部署单元列表。
    @NameInMap("cells")
    public java.util.List<Cell> cells;

    public static ListCellResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCellResponse self = new ListCellResponse();
        return TeaModel.build(map, self);
    }

    public ListCellResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCellResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCellResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCellResponse setCells(java.util.List<Cell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

}
