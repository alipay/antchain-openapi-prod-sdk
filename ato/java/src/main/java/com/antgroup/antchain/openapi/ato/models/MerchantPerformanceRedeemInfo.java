// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantPerformanceRedeemInfo extends TeaModel {
    // 是否展示“剩余账期提前回购”
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("support_redeem")
    public Boolean supportRedeem;

    // 可选回购类型
    // TRANSFER("TRANSFER", "转账代偿"),
    // WITHHOLD("WITHHOLD", "代扣代偿"),
    /**
     * <strong>example:</strong>
     * <p>[TRANSFER,WITHHOLD]</p>
     */
    @NameInMap("support_redeem_type_list")
    public java.util.List<String> supportRedeemTypeList;

    // 商户履约赎回结果信息
    @NameInMap("merchant_performance_redeem_result_info")
    public MerchantPerformanceRedeemResultInfo merchantPerformanceRedeemResultInfo;

    public static MerchantPerformanceRedeemInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantPerformanceRedeemInfo self = new MerchantPerformanceRedeemInfo();
        return TeaModel.build(map, self);
    }

    public MerchantPerformanceRedeemInfo setSupportRedeem(Boolean supportRedeem) {
        this.supportRedeem = supportRedeem;
        return this;
    }
    public Boolean getSupportRedeem() {
        return this.supportRedeem;
    }

    public MerchantPerformanceRedeemInfo setSupportRedeemTypeList(java.util.List<String> supportRedeemTypeList) {
        this.supportRedeemTypeList = supportRedeemTypeList;
        return this;
    }
    public java.util.List<String> getSupportRedeemTypeList() {
        return this.supportRedeemTypeList;
    }

    public MerchantPerformanceRedeemInfo setMerchantPerformanceRedeemResultInfo(MerchantPerformanceRedeemResultInfo merchantPerformanceRedeemResultInfo) {
        this.merchantPerformanceRedeemResultInfo = merchantPerformanceRedeemResultInfo;
        return this;
    }
    public MerchantPerformanceRedeemResultInfo getMerchantPerformanceRedeemResultInfo() {
        return this.merchantPerformanceRedeemResultInfo;
    }

}
