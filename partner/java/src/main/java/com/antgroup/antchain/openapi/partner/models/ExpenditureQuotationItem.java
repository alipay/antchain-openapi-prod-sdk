// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationItem extends TeaModel {
    // 外部唯一id，sku-id
    @NameInMap("out_unique_id")
    @Validation(required = true)
    public String outUniqueId;

    // 配置单商品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 支出配置单对象描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 预估交易金额（分）
    @NameInMap("predict_transaction_amount")
    @Validation(required = true)
    public Long predictTransactionAmount;

    public static ExpenditureQuotationItem build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationItem self = new ExpenditureQuotationItem();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationItem setOutUniqueId(String outUniqueId) {
        this.outUniqueId = outUniqueId;
        return this;
    }
    public String getOutUniqueId() {
        return this.outUniqueId;
    }

    public ExpenditureQuotationItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExpenditureQuotationItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExpenditureQuotationItem setPredictTransactionAmount(Long predictTransactionAmount) {
        this.predictTransactionAmount = predictTransactionAmount;
        return this;
    }
    public Long getPredictTransactionAmount() {
        return this.predictTransactionAmount;
    }

}
