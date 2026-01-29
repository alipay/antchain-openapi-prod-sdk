// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantPayChannelInfo extends TeaModel {
    // ALIPAY 支付宝
    // JDPAY京东支付
    /**
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 绑定企业支付宝账号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123123122134@163.com">123123122134@163.com</a></p>
     */
    @NameInMap("bind_alipay_no")
    public String bindAlipayNo;

    // 结算企业支付宝账号
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:123123122134@163.com">123123122134@163.com</a></p>
     */
    @NameInMap("settle_alipay_no")
    public String settleAlipayNo;

    // 绑定支付宝uid
    /**
     * <strong>example:</strong>
     * <p>2088123456789</p>
     */
    @NameInMap("bind_alipay_uid")
    public String bindAlipayUid;

    // 结算银行卡账号
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("bank_num")
    public String bankNum;

    // 联行号
    /**
     * <strong>example:</strong>
     * <p>12345678912</p>
     */
    @NameInMap("bank_cnap")
    public String bankCnap;

    // 结算账户类型 
    // merchant_type=01企业时：ENTERPRISE
    // 03:民办非企业：ENTERPRISE
    // 07个体工商户时：PERSON或 ENTERPRISE
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("bank_account_type")
    public String bankAccountType;

    // 二级商户id
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("sub_merchant_id")
    public String subMerchantId;

    // 进件流水号
    /**
     * <strong>example:</strong>
     * <p>ATO_123456789</p>
     */
    @NameInMap("pay_expand_id")
    public String payExpandId;

    public static MerchantPayChannelInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantPayChannelInfo self = new MerchantPayChannelInfo();
        return TeaModel.build(map, self);
    }

    public MerchantPayChannelInfo setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public MerchantPayChannelInfo setBindAlipayNo(String bindAlipayNo) {
        this.bindAlipayNo = bindAlipayNo;
        return this;
    }
    public String getBindAlipayNo() {
        return this.bindAlipayNo;
    }

    public MerchantPayChannelInfo setSettleAlipayNo(String settleAlipayNo) {
        this.settleAlipayNo = settleAlipayNo;
        return this;
    }
    public String getSettleAlipayNo() {
        return this.settleAlipayNo;
    }

    public MerchantPayChannelInfo setBindAlipayUid(String bindAlipayUid) {
        this.bindAlipayUid = bindAlipayUid;
        return this;
    }
    public String getBindAlipayUid() {
        return this.bindAlipayUid;
    }

    public MerchantPayChannelInfo setBankNum(String bankNum) {
        this.bankNum = bankNum;
        return this;
    }
    public String getBankNum() {
        return this.bankNum;
    }

    public MerchantPayChannelInfo setBankCnap(String bankCnap) {
        this.bankCnap = bankCnap;
        return this;
    }
    public String getBankCnap() {
        return this.bankCnap;
    }

    public MerchantPayChannelInfo setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
        return this;
    }
    public String getBankAccountType() {
        return this.bankAccountType;
    }

    public MerchantPayChannelInfo setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
        return this;
    }
    public String getSubMerchantId() {
        return this.subMerchantId;
    }

    public MerchantPayChannelInfo setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

}
