// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryUserTokenallocationdetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 粉丝粒操作流水
    @NameInMap("allocation_detail")
    public java.util.List<TokenOperationDetail> allocationDetail;

    public static QueryUserTokenallocationdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserTokenallocationdetailResponse self = new QueryUserTokenallocationdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserTokenallocationdetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserTokenallocationdetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserTokenallocationdetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserTokenallocationdetailResponse setAllocationDetail(java.util.List<TokenOperationDetail> allocationDetail) {
        this.allocationDetail = allocationDetail;
        return this;
    }
    public java.util.List<TokenOperationDetail> getAllocationDetail() {
        return this.allocationDetail;
    }

}
