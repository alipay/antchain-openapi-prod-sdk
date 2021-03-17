// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseIotinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public Long code;

    // ""
    @NameInMap("err_message")
    public String errMessage;

    // 设备详情
    @NameInMap("lease_iot_item_info")
    public java.util.List<LeaseIotItemInfo> leaseIotItemInfo;

    public static QueryLeaseIotinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseIotinfoResponse self = new QueryLeaseIotinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseIotinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseIotinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseIotinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseIotinfoResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryLeaseIotinfoResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryLeaseIotinfoResponse setLeaseIotItemInfo(java.util.List<LeaseIotItemInfo> leaseIotItemInfo) {
        this.leaseIotItemInfo = leaseIotItemInfo;
        return this;
    }
    public java.util.List<LeaseIotItemInfo> getLeaseIotItemInfo() {
        return this.leaseIotItemInfo;
    }

}
