// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class MonthDataDetail extends TeaModel {
    // 发生月份，格式 yyyy-MM
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("occur_date")
    @Validation(required = true)
    public String occurDate;

    // 产量数据
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 产量单位
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("dosage_unit")
    @Validation(required = true)
    public String dosageUnit;

    public static MonthDataDetail build(java.util.Map<String, ?> map) throws Exception {
        MonthDataDetail self = new MonthDataDetail();
        return TeaModel.build(map, self);
    }

    public MonthDataDetail setOccurDate(String occurDate) {
        this.occurDate = occurDate;
        return this;
    }
    public String getOccurDate() {
        return this.occurDate;
    }

    public MonthDataDetail setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public MonthDataDetail setDosageUnit(String dosageUnit) {
        this.dosageUnit = dosageUnit;
        return this;
    }
    public String getDosageUnit() {
        return this.dosageUnit;
    }

}
