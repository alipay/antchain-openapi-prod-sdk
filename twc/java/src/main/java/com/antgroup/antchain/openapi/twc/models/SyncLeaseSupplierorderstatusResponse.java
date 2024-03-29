// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncLeaseSupplierorderstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 状态码,0表示正常
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("err_message")
    public String errMessage;

    // CANCEL：可以取消  REFUSE：不能取消
    @NameInMap("status")
    public String status;

    public static SyncLeaseSupplierorderstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncLeaseSupplierorderstatusResponse self = new SyncLeaseSupplierorderstatusResponse();
        return TeaModel.build(map, self);
    }

    public SyncLeaseSupplierorderstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncLeaseSupplierorderstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncLeaseSupplierorderstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncLeaseSupplierorderstatusResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SyncLeaseSupplierorderstatusResponse setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public SyncLeaseSupplierorderstatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
