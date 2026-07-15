// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class SettleDetailInfo extends TeaModel {
    // 结算收款方账户类型
    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("trans_in_type")
    @Validation(required = true)
    public String transInType;

    // 结算收款方
    /**
     * <strong>example:</strong>
     * <p>1100001990</p>
     */
    @NameInMap("trans_in")
    @Validation(required = true)
    public String transIn;

    // 结算汇总维度
    /**
     * <strong>example:</strong>
     * <p>A0001</p>
     */
    @NameInMap("summary_dimension")
    public String summaryDimension;

    // 结算主体类型
    /**
     * <strong>example:</strong>
     * <p>SecondMerchant</p>
     */
    @NameInMap("settle_entity_type")
    public String settleEntityType;

    // 结算主体标识
    /**
     * <strong>example:</strong>
     * <p>2088xxxxx</p>
     */
    @NameInMap("settle_entity_id")
    public String settleEntityId;

    public static SettleDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        SettleDetailInfo self = new SettleDetailInfo();
        return TeaModel.build(map, self);
    }

    public SettleDetailInfo setTransInType(String transInType) {
        this.transInType = transInType;
        return this;
    }
    public String getTransInType() {
        return this.transInType;
    }

    public SettleDetailInfo setTransIn(String transIn) {
        this.transIn = transIn;
        return this;
    }
    public String getTransIn() {
        return this.transIn;
    }

    public SettleDetailInfo setSummaryDimension(String summaryDimension) {
        this.summaryDimension = summaryDimension;
        return this;
    }
    public String getSummaryDimension() {
        return this.summaryDimension;
    }

    public SettleDetailInfo setSettleEntityType(String settleEntityType) {
        this.settleEntityType = settleEntityType;
        return this;
    }
    public String getSettleEntityType() {
        return this.settleEntityType;
    }

    public SettleDetailInfo setSettleEntityId(String settleEntityId) {
        this.settleEntityId = settleEntityId;
        return this;
    }
    public String getSettleEntityId() {
        return this.settleEntityId;
    }

}
