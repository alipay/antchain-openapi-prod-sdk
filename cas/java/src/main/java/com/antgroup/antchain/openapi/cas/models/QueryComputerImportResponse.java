// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryComputerImportResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // computer import infos
    @NameInMap("data")
    public java.util.List<ComputerImportVO> data;

    // total count
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryComputerImportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComputerImportResponse self = new QueryComputerImportResponse();
        return TeaModel.build(map, self);
    }

    public QueryComputerImportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComputerImportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComputerImportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComputerImportResponse setData(java.util.List<ComputerImportVO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ComputerImportVO> getData() {
        return this.data;
    }

    public QueryComputerImportResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
