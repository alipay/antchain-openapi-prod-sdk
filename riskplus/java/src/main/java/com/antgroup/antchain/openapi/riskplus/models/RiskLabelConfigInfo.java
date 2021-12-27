// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskLabelConfigInfo extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 线索ID
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    // 标签文本
    @NameInMap("tag_text")
    @Validation(required = true)
    public String tagText;

    // 风险维度
    @NameInMap("risk_dimension_type")
    @Validation(required = true)
    public String riskDimensionType;

    // 线索类型
    @NameInMap("risk_detail_type")
    @Validation(required = true)
    public String riskDetailType;

    // 趋势图表名
    @NameInMap("tag_trend_chart_name")
    @Validation(required = true)
    public String tagTrendChartName;

    // 线索列表表头，英文逗号分隔
    @NameInMap("tag_list_headers")
    @Validation(required = true)
    public String tagListHeaders;

    // 标签列表，排序字段
    @NameInMap("tag_list_order_column")
    @Validation(required = true)
    public String tagListOrderColumn;

    // 标签列表排序方式
    @NameInMap("tag_list_order_type")
    @Validation(required = true)
    public String tagListOrderType;

    // 标记删除
    @NameInMap("is_delete")
    @Validation(required = true)
    public Long isDelete;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 操作人ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static RiskLabelConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskLabelConfigInfo self = new RiskLabelConfigInfo();
        return TeaModel.build(map, self);
    }

    public RiskLabelConfigInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RiskLabelConfigInfo setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public RiskLabelConfigInfo setTagText(String tagText) {
        this.tagText = tagText;
        return this;
    }
    public String getTagText() {
        return this.tagText;
    }

    public RiskLabelConfigInfo setRiskDimensionType(String riskDimensionType) {
        this.riskDimensionType = riskDimensionType;
        return this;
    }
    public String getRiskDimensionType() {
        return this.riskDimensionType;
    }

    public RiskLabelConfigInfo setRiskDetailType(String riskDetailType) {
        this.riskDetailType = riskDetailType;
        return this;
    }
    public String getRiskDetailType() {
        return this.riskDetailType;
    }

    public RiskLabelConfigInfo setTagTrendChartName(String tagTrendChartName) {
        this.tagTrendChartName = tagTrendChartName;
        return this;
    }
    public String getTagTrendChartName() {
        return this.tagTrendChartName;
    }

    public RiskLabelConfigInfo setTagListHeaders(String tagListHeaders) {
        this.tagListHeaders = tagListHeaders;
        return this;
    }
    public String getTagListHeaders() {
        return this.tagListHeaders;
    }

    public RiskLabelConfigInfo setTagListOrderColumn(String tagListOrderColumn) {
        this.tagListOrderColumn = tagListOrderColumn;
        return this;
    }
    public String getTagListOrderColumn() {
        return this.tagListOrderColumn;
    }

    public RiskLabelConfigInfo setTagListOrderType(String tagListOrderType) {
        this.tagListOrderType = tagListOrderType;
        return this;
    }
    public String getTagListOrderType() {
        return this.tagListOrderType;
    }

    public RiskLabelConfigInfo setIsDelete(Long isDelete) {
        this.isDelete = isDelete;
        return this;
    }
    public Long getIsDelete() {
        return this.isDelete;
    }

    public RiskLabelConfigInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RiskLabelConfigInfo setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RiskLabelConfigInfo setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
