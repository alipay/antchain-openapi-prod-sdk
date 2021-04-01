// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVerifyCarinspectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 年检有效期止。
    @NameInMap("inspection_date")
    public String inspectionDate;

    //  0：正常   1：逾期未检验  2：无法判断
    @NameInMap("status")
    public Long status;

    public static StartAuthVerifyCarinspectResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVerifyCarinspectResponse self = new StartAuthVerifyCarinspectResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthVerifyCarinspectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthVerifyCarinspectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthVerifyCarinspectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthVerifyCarinspectResponse setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
        return this;
    }
    public String getInspectionDate() {
        return this.inspectionDate;
    }

    public StartAuthVerifyCarinspectResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
