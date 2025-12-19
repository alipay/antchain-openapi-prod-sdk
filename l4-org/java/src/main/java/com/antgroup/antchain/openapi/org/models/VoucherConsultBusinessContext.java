// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class VoucherConsultBusinessContext extends TeaModel {
    // 指定资产编码列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;COUPON&quot;]</p>
     */
    @NameInMap("asset_type_code_list")
    @Validation(required = true)
    public java.util.List<String> assetTypeCodeList;

    // 订单金额
    /**
     * <strong>example:</strong>
     * <p>120.05</p>
     */
    @NameInMap("order_amount")
    @Validation(required = true)
    public String orderAmount;

    // 收款账号
    /**
     * <strong>example:</strong>
     * <p>2088502492801939</p>
     */
    @NameInMap("payee_user_id")
    @Validation(required = true)
    public String payeeUserId;

    // 业务上下文信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;tinyAppId&quot;:&quot;2088&quot;,&quot;orgBenefitRepayBJBankTick&quot;:&quot;Y&quot;}</p>
     */
    @NameInMap("biz_context")
    @Validation(required = true)
    public String bizContext;

    public static VoucherConsultBusinessContext build(java.util.Map<String, ?> map) throws Exception {
        VoucherConsultBusinessContext self = new VoucherConsultBusinessContext();
        return TeaModel.build(map, self);
    }

    public VoucherConsultBusinessContext setAssetTypeCodeList(java.util.List<String> assetTypeCodeList) {
        this.assetTypeCodeList = assetTypeCodeList;
        return this;
    }
    public java.util.List<String> getAssetTypeCodeList() {
        return this.assetTypeCodeList;
    }

    public VoucherConsultBusinessContext setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    public String getOrderAmount() {
        return this.orderAmount;
    }

    public VoucherConsultBusinessContext setPayeeUserId(String payeeUserId) {
        this.payeeUserId = payeeUserId;
        return this;
    }
    public String getPayeeUserId() {
        return this.payeeUserId;
    }

    public VoucherConsultBusinessContext setBizContext(String bizContext) {
        this.bizContext = bizContext;
        return this;
    }
    public String getBizContext() {
        return this.bizContext;
    }

}
