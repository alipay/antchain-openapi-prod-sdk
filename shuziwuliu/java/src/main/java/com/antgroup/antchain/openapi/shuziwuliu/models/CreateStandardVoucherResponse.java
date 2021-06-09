// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateStandardVoucherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证返回值_voucherResp
    @NameInMap("voucher_resp")
    @Validation(required = true)
    public VoucherResp voucherResp;

    // 编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 凭证返回值_voucherRespList
    @NameInMap("voucher_resp_list")
    @Validation(required = true)
    public java.util.List<VoucherResp> voucherRespList;

    public static CreateStandardVoucherResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardVoucherResponse self = new CreateStandardVoucherResponse();
        return TeaModel.build(map, self);
    }

    public CreateStandardVoucherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateStandardVoucherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateStandardVoucherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateStandardVoucherResponse setVoucherResp(VoucherResp voucherResp) {
        this.voucherResp = voucherResp;
        return this;
    }
    public VoucherResp getVoucherResp() {
        return this.voucherResp;
    }

    public CreateStandardVoucherResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStandardVoucherResponse setVoucherRespList(java.util.List<VoucherResp> voucherRespList) {
        this.voucherRespList = voucherRespList;
        return this;
    }
    public java.util.List<VoucherResp> getVoucherRespList() {
        return this.voucherRespList;
    }

}
