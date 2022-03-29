// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class TrendTpsDTO extends TeaModel {
    // 数据集合
    @NameInMap("records")
    @Validation(required = true)
    public java.util.List<StatsDataDTO> records;

    // Table 的名称
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 时间戳，单位毫秒
    @NameInMap("x_unit")
    @Validation(required = true)
    public String xUnit;

    // 纵轴单位
    // 
    @NameInMap("y_unit")
    @Validation(required = true)
    public String yUnit;

    public static TrendTpsDTO build(java.util.Map<String, ?> map) throws Exception {
        TrendTpsDTO self = new TrendTpsDTO();
        return TeaModel.build(map, self);
    }

    public TrendTpsDTO setRecords(java.util.List<StatsDataDTO> records) {
        this.records = records;
        return this;
    }
    public java.util.List<StatsDataDTO> getRecords() {
        return this.records;
    }

    public TrendTpsDTO setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public TrendTpsDTO setXUnit(String xUnit) {
        this.xUnit = xUnit;
        return this;
    }
    public String getXUnit() {
        return this.xUnit;
    }

    public TrendTpsDTO setYUnit(String yUnit) {
        this.yUnit = yUnit;
        return this;
    }
    public String getYUnit() {
        return this.yUnit;
    }

}
