// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeInstitutionCreditResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 蚂蚁端返回申请单号
    @NameInMap("apply_no")
    public String applyNo;

    // 机构请求流水号，用于幂等
    @NameInMap("serial_no")
    public String serialNo;

    // 业务响应码
    @NameInMap("biz_code")
    public String bizCode;

    // 业务消息
    @NameInMap("biz_msg")
    public String bizMsg;

    public static UpdateDubbridgeInstitutionCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeInstitutionCreditResponse self = new UpdateDubbridgeInstitutionCreditResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeInstitutionCreditResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDubbridgeInstitutionCreditResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDubbridgeInstitutionCreditResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDubbridgeInstitutionCreditResponse setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public UpdateDubbridgeInstitutionCreditResponse setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

    public UpdateDubbridgeInstitutionCreditResponse setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public UpdateDubbridgeInstitutionCreditResponse setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
        return this;
    }
    public String getBizMsg() {
        return this.bizMsg;
    }

}
