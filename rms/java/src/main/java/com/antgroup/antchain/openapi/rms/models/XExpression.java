// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XExpression extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    //  
    @NameInMap("description")
    public String description;

    //  
    @NameInMap("match_expression")
    public XMatchExpression matchExpression;

    //   
    @NameInMap("translate_expression")
    public XTranslate translateExpression;

    //  metric type
    @NameInMap("type")
    public String type;

    //  
    @NameInMap("unit")
    public String unit;

    //  
    @NameInMap("downsample_func")
    public String downsampleFunc;

    //  
    @NameInMap("aggregation_func")
    public String aggregationFunc;

    // prometheus tags
    @NameInMap("expression_tags")
    public java.util.List<XMetricInfo> expressionTags;

    // prometheus metric-tags 是否采集
    @NameInMap("enabled")
    public Boolean enabled;

    // line filter
    @NameInMap("values")
    public java.util.List<String> values;

    //  
    @NameInMap("display_name")
    public String displayName;

    //  
    @NameInMap("path_parameters")
    public java.util.List<XStringKeyValue> pathParameters;

    // x
    @NameInMap("calculation_expression")
    public XCalculationExpression calculationExpression;

    // 计算数据源使用的原始指标名称
    @NameInMap("source_name")
    public String sourceName;

    public static XExpression build(java.util.Map<String, ?> map) throws Exception {
        XExpression self = new XExpression();
        return TeaModel.build(map, self);
    }

    public XExpression setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XExpression setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public XExpression setMatchExpression(XMatchExpression matchExpression) {
        this.matchExpression = matchExpression;
        return this;
    }
    public XMatchExpression getMatchExpression() {
        return this.matchExpression;
    }

    public XExpression setTranslateExpression(XTranslate translateExpression) {
        this.translateExpression = translateExpression;
        return this;
    }
    public XTranslate getTranslateExpression() {
        return this.translateExpression;
    }

    public XExpression setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XExpression setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public XExpression setDownsampleFunc(String downsampleFunc) {
        this.downsampleFunc = downsampleFunc;
        return this;
    }
    public String getDownsampleFunc() {
        return this.downsampleFunc;
    }

    public XExpression setAggregationFunc(String aggregationFunc) {
        this.aggregationFunc = aggregationFunc;
        return this;
    }
    public String getAggregationFunc() {
        return this.aggregationFunc;
    }

    public XExpression setExpressionTags(java.util.List<XMetricInfo> expressionTags) {
        this.expressionTags = expressionTags;
        return this;
    }
    public java.util.List<XMetricInfo> getExpressionTags() {
        return this.expressionTags;
    }

    public XExpression setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public XExpression setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

    public XExpression setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public XExpression setPathParameters(java.util.List<XStringKeyValue> pathParameters) {
        this.pathParameters = pathParameters;
        return this;
    }
    public java.util.List<XStringKeyValue> getPathParameters() {
        return this.pathParameters;
    }

    public XExpression setCalculationExpression(XCalculationExpression calculationExpression) {
        this.calculationExpression = calculationExpression;
        return this;
    }
    public XCalculationExpression getCalculationExpression() {
        return this.calculationExpression;
    }

    public XExpression setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

}
