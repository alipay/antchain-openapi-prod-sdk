// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractMerchantindirectzftResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误状态码，0表示成功
    @NameInMap("code")
    public Long code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

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

    // 支付宝返回的错误状态码
    @NameInMap("sub_code")
    public String subCode;

    // 支付宝返回的错误信息描述
    @NameInMap("sub_msg")
    public String subMsg;

    public static QueryContractMerchantindirectzftResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractMerchantindirectzftResponse self = new QueryContractMerchantindirectzftResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractMerchantindirectzftResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractMerchantindirectzftResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractMerchantindirectzftResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractMerchantindirectzftResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractMerchantindirectzftResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractMerchantindirectzftResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryContractMerchantindirectzftResponse setIpRoleId(java.util.List<String> ipRoleId) {
        this.ipRoleId = ipRoleId;
        return this;
    }
    public java.util.List<String> getIpRoleId() {
        return this.ipRoleId;
    }

    public QueryContractMerchantindirectzftResponse setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryContractMerchantindirectzftResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QueryContractMerchantindirectzftResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContractMerchantindirectzftResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryContractMerchantindirectzftResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

}
