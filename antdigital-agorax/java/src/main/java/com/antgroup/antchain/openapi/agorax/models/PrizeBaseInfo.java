// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class PrizeBaseInfo extends TeaModel {
    // 奖品ID
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("prize_id")
    public String prizeId;

    // 奖品名称
    /**
     * <strong>example:</strong>
     * <p>xx面馆</p>
     */
    @NameInMap("prize_name")
    public String prizeName;

    // 奖品类型
    /**
     * <strong>example:</strong>
     * <p>VIRTUAL_PRIZE</p>
     */
    @NameInMap("prize_type")
    public String prizeType;

    // 奖品状态
    /**
     * <strong>example:</strong>
     * <p>PRIZE_CREATED</p>
     */
    @NameInMap("prize_status")
    public String prizeStatus;

    // 预算金额
    /**
     * <strong>example:</strong>
     * <p>354.22</p>
     */
    @NameInMap("budget_amount")
    public Long budgetAmount;

    public static PrizeBaseInfo build(java.util.Map<String, ?> map) throws Exception {
        PrizeBaseInfo self = new PrizeBaseInfo();
        return TeaModel.build(map, self);
    }

    public PrizeBaseInfo setPrizeId(String prizeId) {
        this.prizeId = prizeId;
        return this;
    }
    public String getPrizeId() {
        return this.prizeId;
    }

    public PrizeBaseInfo setPrizeName(String prizeName) {
        this.prizeName = prizeName;
        return this;
    }
    public String getPrizeName() {
        return this.prizeName;
    }

    public PrizeBaseInfo setPrizeType(String prizeType) {
        this.prizeType = prizeType;
        return this;
    }
    public String getPrizeType() {
        return this.prizeType;
    }

    public PrizeBaseInfo setPrizeStatus(String prizeStatus) {
        this.prizeStatus = prizeStatus;
        return this;
    }
    public String getPrizeStatus() {
        return this.prizeStatus;
    }

    public PrizeBaseInfo setBudgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }
    public Long getBudgetAmount() {
        return this.budgetAmount;
    }

}
