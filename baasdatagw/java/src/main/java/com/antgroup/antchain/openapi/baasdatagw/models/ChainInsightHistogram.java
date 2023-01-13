// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightHistogram extends TeaModel {
    // 横坐标名称
    @NameInMap("x_label")
    public String xLabel;

    // 纵坐标名称
    @NameInMap("y_label")
    public String yLabel;

    // 坐标集，按x增序
    @NameInMap("points")
    @Validation(required = true)
    public java.util.List<ChainInsightPoint> points;

    // 表格的名称或维度名称
    @NameInMap("name")
    public String name;

    public static ChainInsightHistogram build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightHistogram self = new ChainInsightHistogram();
        return TeaModel.build(map, self);
    }

    public ChainInsightHistogram setXLabel(String xLabel) {
        this.xLabel = xLabel;
        return this;
    }
    public String getXLabel() {
        return this.xLabel;
    }

    public ChainInsightHistogram setYLabel(String yLabel) {
        this.yLabel = yLabel;
        return this;
    }
    public String getYLabel() {
        return this.yLabel;
    }

    public ChainInsightHistogram setPoints(java.util.List<ChainInsightPoint> points) {
        this.points = points;
        return this;
    }
    public java.util.List<ChainInsightPoint> getPoints() {
        return this.points;
    }

    public ChainInsightHistogram setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
