// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CheckMypocketQrcoderequestaccountsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 小程序码唯一标识
    @NameInMap("biz_no")
    public String bizNo;

    // 外部业务号
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 小程序码状态，枚举，IDLE|SCANNED|CONFIRMED|CANCELLED|UNKNOWN
    @NameInMap("status")
    public String status;

    // 账户列表
    @NameInMap("accounts")
    public java.util.List<ChainAccountEX> accounts;

    public static CheckMypocketQrcoderequestaccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMypocketQrcoderequestaccountsResponse self = new CheckMypocketQrcoderequestaccountsResponse();
        return TeaModel.build(map, self);
    }

    public CheckMypocketQrcoderequestaccountsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckMypocketQrcoderequestaccountsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckMypocketQrcoderequestaccountsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckMypocketQrcoderequestaccountsResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CheckMypocketQrcoderequestaccountsResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CheckMypocketQrcoderequestaccountsResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CheckMypocketQrcoderequestaccountsResponse setAccounts(java.util.List<ChainAccountEX> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<ChainAccountEX> getAccounts() {
        return this.accounts;
    }

}
