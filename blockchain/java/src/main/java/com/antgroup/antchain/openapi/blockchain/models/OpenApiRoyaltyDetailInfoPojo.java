// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class OpenApiRoyaltyDetailInfoPojo extends TeaModel {
    // 分账比例
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("percentage")
    public String percentage;

    // 分账金额
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("amount")
    public String amount;

    // 分账类型
    /**
     * <strong>example:</strong>
     * <p>transfer</p>
     */
    @NameInMap("royalty_type")
    public String royaltyType;

    // 支出方账户类型
    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("trans_out_type")
    public String transOutType;

    // 支出方账户
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_out")
    public String transOut;

    // 收入方账户类型
    /**
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("trans_in_type")
    public String transInType;

    // 收入方账户
    /**
     * <strong>example:</strong>
     * <p>2088101126708402</p>
     */
    @NameInMap("trans_in")
    public String transIn;

    // 分账描述
    /**
     * <strong>example:</strong>
     * <p>分账给2088101126708402</p>
     */
    @NameInMap("desc")
    public String desc;

    public static OpenApiRoyaltyDetailInfoPojo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiRoyaltyDetailInfoPojo self = new OpenApiRoyaltyDetailInfoPojo();
        return TeaModel.build(map, self);
    }

    public OpenApiRoyaltyDetailInfoPojo setPercentage(String percentage) {
        this.percentage = percentage;
        return this;
    }
    public String getPercentage() {
        return this.percentage;
    }

    public OpenApiRoyaltyDetailInfoPojo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public OpenApiRoyaltyDetailInfoPojo setRoyaltyType(String royaltyType) {
        this.royaltyType = royaltyType;
        return this;
    }
    public String getRoyaltyType() {
        return this.royaltyType;
    }

    public OpenApiRoyaltyDetailInfoPojo setTransOutType(String transOutType) {
        this.transOutType = transOutType;
        return this;
    }
    public String getTransOutType() {
        return this.transOutType;
    }

    public OpenApiRoyaltyDetailInfoPojo setTransOut(String transOut) {
        this.transOut = transOut;
        return this;
    }
    public String getTransOut() {
        return this.transOut;
    }

    public OpenApiRoyaltyDetailInfoPojo setTransInType(String transInType) {
        this.transInType = transInType;
        return this;
    }
    public String getTransInType() {
        return this.transInType;
    }

    public OpenApiRoyaltyDetailInfoPojo setTransIn(String transIn) {
        this.transIn = transIn;
        return this;
    }
    public String getTransIn() {
        return this.transIn;
    }

    public OpenApiRoyaltyDetailInfoPojo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
