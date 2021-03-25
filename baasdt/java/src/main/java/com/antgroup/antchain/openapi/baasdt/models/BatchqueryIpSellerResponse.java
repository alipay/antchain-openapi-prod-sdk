// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpSellerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 结果总数，不是列表值，用于分页
    // 
    @NameInMap("all_count")
    public Long allCount;

    // 版权方申请列表
    @NameInMap("apply_list")
    public java.util.List<IPApplyInfo> applyList;

    public static BatchqueryIpSellerResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpSellerResponse self = new BatchqueryIpSellerResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpSellerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryIpSellerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryIpSellerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryIpSellerResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

    public BatchqueryIpSellerResponse setApplyList(java.util.List<IPApplyInfo> applyList) {
        this.applyList = applyList;
        return this;
    }
    public java.util.List<IPApplyInfo> getApplyList() {
        return this.applyList;
    }

}
