// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ConfirmContractMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 额外信息，包含smid
    @NameInMap("ext_info")
    public String extInfo;

    // 支付宝的ipRoleId
    @NameInMap("ip_role_id")
    public java.util.List<String> ipRoleId;

    // 申请时间
    @NameInMap("apply_id")
    public String applyId;

    // 商户名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 直付通商户进件的状态
    @NameInMap("status")
    public String status;

    public static ConfirmContractMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmContractMerchantResponse self = new ConfirmContractMerchantResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmContractMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmContractMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmContractMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmContractMerchantResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public ConfirmContractMerchantResponse setIpRoleId(java.util.List<String> ipRoleId) {
        this.ipRoleId = ipRoleId;
        return this;
    }
    public java.util.List<String> getIpRoleId() {
        return this.ipRoleId;
    }

    public ConfirmContractMerchantResponse setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public ConfirmContractMerchantResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ConfirmContractMerchantResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
