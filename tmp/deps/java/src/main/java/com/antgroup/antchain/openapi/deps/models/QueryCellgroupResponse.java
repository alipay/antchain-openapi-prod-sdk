// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCellgroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 逻辑单元信息
    @NameInMap("data")
    public java.util.List<CellGroup> data;

    public static QueryCellgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCellgroupResponse self = new QueryCellgroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryCellgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCellgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCellgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCellgroupResponse setData(java.util.List<CellGroup> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CellGroup> getData() {
        return this.data;
    }

}
