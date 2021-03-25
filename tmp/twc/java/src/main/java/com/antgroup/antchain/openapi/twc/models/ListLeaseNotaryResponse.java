// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListLeaseNotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 存证记录列表
    @NameInMap("records")
    public java.util.List<LeaseNotaryRecord> records;

    public static ListLeaseNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLeaseNotaryResponse self = new ListLeaseNotaryResponse();
        return TeaModel.build(map, self);
    }

    public ListLeaseNotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListLeaseNotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLeaseNotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListLeaseNotaryResponse setRecords(java.util.List<LeaseNotaryRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<LeaseNotaryRecord> getRecords() {
        return this.records;
    }

}
