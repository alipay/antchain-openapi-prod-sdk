// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateMypocketQrcoderequestaccountsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务号，小程序码唯一标识
    @NameInMap("biz_no")
    public String bizNo;

    // 外部业务号，透传返回
    @NameInMap("out_biz_no")
    public String outBizNo;

    // 小程序码地址
    @NameInMap("qr_code_url")
    public String qrCodeUrl;

    public static CreateMypocketQrcoderequestaccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMypocketQrcoderequestaccountsResponse self = new CreateMypocketQrcoderequestaccountsResponse();
        return TeaModel.build(map, self);
    }

    public CreateMypocketQrcoderequestaccountsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateMypocketQrcoderequestaccountsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMypocketQrcoderequestaccountsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateMypocketQrcoderequestaccountsResponse setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CreateMypocketQrcoderequestaccountsResponse setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateMypocketQrcoderequestaccountsResponse setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
        return this;
    }
    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

}
