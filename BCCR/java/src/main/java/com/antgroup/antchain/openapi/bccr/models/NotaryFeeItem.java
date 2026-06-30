// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class NotaryFeeItem extends TeaModel {
    // 费用分项描述
    /**
     * <strong>example:</strong>
     * <p>起步费用</p>
     */
    @NameInMap("fee_item_desc")
    @Validation(required = true)
    public String feeItemDesc;

    // 费用分项金额(分)
    /**
     * <strong>example:</strong>
     * <p>200000</p>
     */
    @NameInMap("fee_item_amount_rmb_fen")
    @Validation(required = true)
    public Long feeItemAmountRmbFen;

    // 费用分项详情列表
    @NameInMap("fee_detail_list")
    @Validation(required = true)
    public java.util.List<FeeDetail> feeDetailList;

    public static NotaryFeeItem build(java.util.Map<String, ?> map) throws Exception {
        NotaryFeeItem self = new NotaryFeeItem();
        return TeaModel.build(map, self);
    }

    public NotaryFeeItem setFeeItemDesc(String feeItemDesc) {
        this.feeItemDesc = feeItemDesc;
        return this;
    }
    public String getFeeItemDesc() {
        return this.feeItemDesc;
    }

    public NotaryFeeItem setFeeItemAmountRmbFen(Long feeItemAmountRmbFen) {
        this.feeItemAmountRmbFen = feeItemAmountRmbFen;
        return this;
    }
    public Long getFeeItemAmountRmbFen() {
        return this.feeItemAmountRmbFen;
    }

    public NotaryFeeItem setFeeDetailList(java.util.List<FeeDetail> feeDetailList) {
        this.feeDetailList = feeDetailList;
        return this;
    }
    public java.util.List<FeeDetail> getFeeDetailList() {
        return this.feeDetailList;
    }

}
