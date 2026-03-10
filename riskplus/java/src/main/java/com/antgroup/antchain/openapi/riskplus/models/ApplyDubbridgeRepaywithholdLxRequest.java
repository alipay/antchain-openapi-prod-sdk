// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgeRepaywithholdLxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 代扣请求流水号
    @NameInMap("withhold_serial_no")
    @Validation(required = true)
    public String withholdSerialNo;

    // 合作方代码
    @NameInMap("partner_code")
    public String partnerCode;

    // 用户绑卡信息 ，包含用户四要素：手机号、卡号、用户名、身份证等
    @NameInMap("bind_card_info")
    @Validation(required = true)
    public String bindCardInfo;

    // 通联需要的银行编码
    @NameInMap("bank_id")
    public String bankId;

    // 代扣总金额=用户代扣金额+补差金额（单位：分）
    @NameInMap("withhold_amt")
    @Validation(required = true)
    public Long withholdAmt;

    // 签约协议号，客户在支付机构的签约协议号(通联以身份证号唯一，宝付以四要素唯一)
    @NameInMap("sign_num")
    @Validation(required = true)
    public String signNum;

    // 支付模式，
    // 0:银行卡支付（默认）
    // 1:余额支付
    // 2:份额支付
    @NameInMap("pay_mode")
    @Validation(required = true)
    public Long payMode;

    // 在支付机构的商户号
    @NameInMap("sub_merchant_id")
    @Validation(required = true)
    public String subMerchantId;

    // 出账信息
    @NameInMap("sep_out_info")
    @Validation(required = true)
    public String sepOutInfo;

    // 分账信息，分账信息条数大于等于一条，当担保费为0时，担保费分账信息不会透传给资方，产品需提示资方做好适配
    // 
    @NameInMap("sep_in_info")
    @Validation(required = true)
    public String sepInInfo;

    // 加密报文，流量方对出入账信息加密报文，需资方透传给支付机构，与资方申请一致方可扣款成功
    @NameInMap("encrpyt_content")
    public String encrpytContent;

    // 代扣明细
    @NameInMap("withhold_detail")
    @Validation(required = true)
    public java.util.List<WithholdDetailItem> withholdDetail;

    public static ApplyDubbridgeRepaywithholdLxRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgeRepaywithholdLxRequest self = new ApplyDubbridgeRepaywithholdLxRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgeRepaywithholdLxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setWithholdSerialNo(String withholdSerialNo) {
        this.withholdSerialNo = withholdSerialNo;
        return this;
    }
    public String getWithholdSerialNo() {
        return this.withholdSerialNo;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setBindCardInfo(String bindCardInfo) {
        this.bindCardInfo = bindCardInfo;
        return this;
    }
    public String getBindCardInfo() {
        return this.bindCardInfo;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }
    public String getBankId() {
        return this.bankId;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setWithholdAmt(Long withholdAmt) {
        this.withholdAmt = withholdAmt;
        return this;
    }
    public Long getWithholdAmt() {
        return this.withholdAmt;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setSignNum(String signNum) {
        this.signNum = signNum;
        return this;
    }
    public String getSignNum() {
        return this.signNum;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setPayMode(Long payMode) {
        this.payMode = payMode;
        return this;
    }
    public Long getPayMode() {
        return this.payMode;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setSepOutInfo(String sepOutInfo) {
        this.sepOutInfo = sepOutInfo;
        return this;
    }
    public String getSepOutInfo() {
        return this.sepOutInfo;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setSepInInfo(String sepInInfo) {
        this.sepInInfo = sepInInfo;
        return this;
    }
    public String getSepInInfo() {
        return this.sepInInfo;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setEncrpytContent(String encrpytContent) {
        this.encrpytContent = encrpytContent;
        return this;
    }
    public String getEncrpytContent() {
        return this.encrpytContent;
    }

    public ApplyDubbridgeRepaywithholdLxRequest setWithholdDetail(java.util.List<WithholdDetailItem> withholdDetail) {
        this.withholdDetail = withholdDetail;
        return this;
    }
    public java.util.List<WithholdDetailItem> getWithholdDetail() {
        return this.withholdDetail;
    }

}
