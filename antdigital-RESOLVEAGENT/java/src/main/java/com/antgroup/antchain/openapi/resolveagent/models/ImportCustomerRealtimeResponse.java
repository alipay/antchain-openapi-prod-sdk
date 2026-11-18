// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.resolveagent.models;

import com.aliyun.tea.*;

public class ImportCustomerRealtimeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原样回传请求中的 requestId
    @NameInMap("request_id")
    public String requestId;

    // 我方生成的批次流水号，用于对账与追踪
    @NameInMap("provider_batch_id")
    public String providerBatchId;

    // 名单行总数（= custInfo 行数）
    @NameInMap("total_count")
    public Long totalCount;

    // 受理成功、进入外呼队列的行数
    @NameInMap("accepted_count")
    public Long acceptedCount;

    // 校验未通过被拒绝的行数
    @NameInMap("rejected_count")
    public Long rejectedCount;

    // 受理成功的 serialNo 列表
    @NameInMap("accepted_serial_nos")
    public java.util.List<String> acceptedSerialNos;

    // 被拒绝的 serialNo → 拒绝原因
    @NameInMap("rejected_items")
    public String rejectedItems;

    public static ImportCustomerRealtimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomerRealtimeResponse self = new ImportCustomerRealtimeResponse();
        return TeaModel.build(map, self);
    }

    public ImportCustomerRealtimeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportCustomerRealtimeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportCustomerRealtimeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportCustomerRealtimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportCustomerRealtimeResponse setProviderBatchId(String providerBatchId) {
        this.providerBatchId = providerBatchId;
        return this;
    }
    public String getProviderBatchId() {
        return this.providerBatchId;
    }

    public ImportCustomerRealtimeResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ImportCustomerRealtimeResponse setAcceptedCount(Long acceptedCount) {
        this.acceptedCount = acceptedCount;
        return this;
    }
    public Long getAcceptedCount() {
        return this.acceptedCount;
    }

    public ImportCustomerRealtimeResponse setRejectedCount(Long rejectedCount) {
        this.rejectedCount = rejectedCount;
        return this;
    }
    public Long getRejectedCount() {
        return this.rejectedCount;
    }

    public ImportCustomerRealtimeResponse setAcceptedSerialNos(java.util.List<String> acceptedSerialNos) {
        this.acceptedSerialNos = acceptedSerialNos;
        return this;
    }
    public java.util.List<String> getAcceptedSerialNos() {
        return this.acceptedSerialNos;
    }

    public ImportCustomerRealtimeResponse setRejectedItems(String rejectedItems) {
        this.rejectedItems = rejectedItems;
        return this;
    }
    public String getRejectedItems() {
        return this.rejectedItems;
    }

}
