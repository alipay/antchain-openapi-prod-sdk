// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantPerformanceRepaySupportInfo extends TeaModel {
    // 是否支持还款取消
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("support_repay")
    public Boolean supportRepay;

    // 商户履约期数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("term_index")
    public Long termIndex;

    public static MerchantPerformanceRepaySupportInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantPerformanceRepaySupportInfo self = new MerchantPerformanceRepaySupportInfo();
        return TeaModel.build(map, self);
    }

    public MerchantPerformanceRepaySupportInfo setSupportRepay(Boolean supportRepay) {
        this.supportRepay = supportRepay;
        return this;
    }
    public Boolean getSupportRepay() {
        return this.supportRepay;
    }

    public MerchantPerformanceRepaySupportInfo setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

}
