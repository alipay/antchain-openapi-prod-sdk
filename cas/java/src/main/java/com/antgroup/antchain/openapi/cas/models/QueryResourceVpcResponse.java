// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourceVpcResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 列表条目数
    @NameInMap("total_count")
    public Long totalCount;

    // VPC详细信息
    @NameInMap("vpcs")
    public java.util.List<VPC> vpcs;

    public static QueryResourceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceVpcResponse self = new QueryResourceVpcResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryResourceVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryResourceVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryResourceVpcResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryResourceVpcResponse setVpcs(java.util.List<VPC> vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public java.util.List<VPC> getVpcs() {
        return this.vpcs;
    }

}
