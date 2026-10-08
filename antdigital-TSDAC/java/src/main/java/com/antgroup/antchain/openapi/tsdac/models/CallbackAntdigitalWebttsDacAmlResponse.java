// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CallbackAntdigitalWebttsDacAmlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // DATA_PK
    @NameInMap("data_pk")
    public String dataPk;

    // SCS_IND 0成功，1 失败
    @NameInMap("scs_ind")
    public String scsInd;

    public static CallbackAntdigitalWebttsDacAmlResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntdigitalWebttsDacAmlResponse self = new CallbackAntdigitalWebttsDacAmlResponse();
        return TeaModel.build(map, self);
    }

    public CallbackAntdigitalWebttsDacAmlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackAntdigitalWebttsDacAmlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackAntdigitalWebttsDacAmlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackAntdigitalWebttsDacAmlResponse setDataPk(String dataPk) {
        this.dataPk = dataPk;
        return this;
    }
    public String getDataPk() {
        return this.dataPk;
    }

    public CallbackAntdigitalWebttsDacAmlResponse setScsInd(String scsInd) {
        this.scsInd = scsInd;
        return this;
    }
    public String getScsInd() {
        return this.scsInd;
    }

}
