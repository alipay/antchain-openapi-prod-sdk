// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerFundassetpackageallocatedetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产包履约计划分配明细
    // 
    @NameInMap("data")
    public java.util.List<AssetPackagePlanAllocateDetail> data;

    public static QueryInnerFundassetpackageallocatedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerFundassetpackageallocatedetailResponse self = new QueryInnerFundassetpackageallocatedetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerFundassetpackageallocatedetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerFundassetpackageallocatedetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerFundassetpackageallocatedetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerFundassetpackageallocatedetailResponse setData(java.util.List<AssetPackagePlanAllocateDetail> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AssetPackagePlanAllocateDetail> getData() {
        return this.data;
    }

}
