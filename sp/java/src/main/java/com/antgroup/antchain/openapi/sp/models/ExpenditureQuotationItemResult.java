// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class ExpenditureQuotationItemResult extends TeaModel {
    // 支出配置单商品维度的外部唯一id
    @NameInMap("out_unique_id")
    @Validation(required = true)
    public String outUniqueId;

    // 支出配置单商品合约号
    @NameInMap("arrangement_no")
    @Validation(required = true)
    public String arrangementNo;

    public static ExpenditureQuotationItemResult build(java.util.Map<String, ?> map) throws Exception {
        ExpenditureQuotationItemResult self = new ExpenditureQuotationItemResult();
        return TeaModel.build(map, self);
    }

    public ExpenditureQuotationItemResult setOutUniqueId(String outUniqueId) {
        this.outUniqueId = outUniqueId;
        return this;
    }
    public String getOutUniqueId() {
        return this.outUniqueId;
    }

    public ExpenditureQuotationItemResult setArrangementNo(String arrangementNo) {
        this.arrangementNo = arrangementNo;
        return this;
    }
    public String getArrangementNo() {
        return this.arrangementNo;
    }

}
