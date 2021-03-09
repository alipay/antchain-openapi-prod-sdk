// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceComputerspecResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 符合筛选条件的机器规格
    @NameInMap("computer_specs")
    public java.util.List<ComputerSpec> computerSpecs;

    // 返回的数量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryResourceComputerspecResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceComputerspecResponse self = new QueryResourceComputerspecResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceComputerspecResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceComputerspecResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceComputerspecResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceComputerspecResponse setComputerSpecs(java.util.List<ComputerSpec> computerSpecs) {
        this.computerSpecs = computerSpecs;
        return this;
    }
    public java.util.List<ComputerSpec> getComputerSpecs() {
        return this.computerSpecs;
    }

    public QueryResourceComputerspecResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
