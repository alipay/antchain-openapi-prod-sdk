// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qftest.models;

import com.aliyun.tea.*;

public class MetricData extends TeaModel {
    // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
    /**
     * <strong>example:</strong>
     * <p>OPERATING_INCOME</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 指标值
    /**
     * <strong>example:</strong>
     * <p>ds190c968e87a001b951spfinassetopprod</p>
     */
    @NameInMap("total")
    @Validation(required = true)
    public String total;

    // 子指标列表
    /**
     * <strong>example:</strong>
     * <p>[{&quot;date&quot;:&quot;2024-09-11&quot;,&quot;type&quot;:&quot;OPERATING_INCOME&quot;,&quot;value&quot;:&quot;634744.89&quot;},{&quot;date&quot;:&quot;2024-09-12&quot;,&quot;type&quot;:&quot;OPERATING_INCOME&quot;,&quot;value&quot;:&quot;891762.89&quot;}]</p>
     */
    @NameInMap("sub_list")
    @Validation(required = true)
    public java.util.List<SubMetricData> subList;

    public static MetricData build(java.util.Map<String, ?> map) throws Exception {
        MetricData self = new MetricData();
        return TeaModel.build(map, self);
    }

    public MetricData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MetricData setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public MetricData setSubList(java.util.List<SubMetricData> subList) {
        this.subList = subList;
        return this;
    }
    public java.util.List<SubMetricData> getSubList() {
        return this.subList;
    }

}
