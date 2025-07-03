// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RiskLabelInfo extends TeaModel {
    // 线索明细类型(字段停用)
    /**
     * <strong>example:</strong>
     * <p>s d d f d f</p>
     */
    @NameInMap("clue_detail_type")
    @Validation(required = true)
    public String clueDetailType;

    // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
    /**
     * <strong>example:</strong>
     * <p>20190823</p>
     */
    @NameInMap("dt")
    public String dt;

    // 数据产生时间
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd hh:mm:ss</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 记录唯一ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 0-正常 1-删除
    /**
     * <strong>example:</strong>
     * <p>is_deleted</p>
     */
    @NameInMap("is_deleted")
    @Validation(required = true)
    public Long isDeleted;

    // 企业ID
    /**
     * <strong>example:</strong>
     * <p>A123445</p>
     */
    @NameInMap("mct_one_id")
    @Validation(required = true)
    public String mctOneId;

    // 操作人ID
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 操作类型
    // add、delete、update
    /**
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("op_type")
    @Validation(required = true)
    public String opType;

    // 企业名称
    /**
     * <strong>example:</strong>
     * <p>东方财富公司</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 线索类型
    /**
     * <strong>example:</strong>
     * <p>列表</p>
     */
    @NameInMap("risk_detail_type")
    @Validation(required = true)
    public String riskDetailType;

    // 风险维度
    // 
    /**
     * <strong>example:</strong>
     * <p>风险维度</p>
     */
    @NameInMap("risk_dimension_type")
    @Validation(required = true)
    public String riskDimensionType;

    // 线索概览
    /**
     * <strong>example:</strong>
     * <p>s d f g</p>
     */
    @NameInMap("tag_clue")
    @Validation(required = true)
    public String tagClue;

    // 线索明细
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("tag_clue_detail")
    @Validation(required = true)
    public String tagClueDetail;

    // 标签ID
    /**
     * <strong>example:</strong>
     * <p>NM23</p>
     */
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    // 线索列表表头，英文逗号分隔
    // 
    /**
     * <strong>example:</strong>
     * <p>日期</p>
     */
    @NameInMap("tag_list_headers")
    @Validation(required = true)
    public String tagListHeaders;

    // 标签列表，排序字段
    /**
     * <strong>example:</strong>
     * <p>日期</p>
     */
    @NameInMap("tag_list_order_column")
    @Validation(required = true)
    public String tagListOrderColumn;

    // 标签列表排序方式
    /**
     * <strong>example:</strong>
     * <p>顺序</p>
     */
    @NameInMap("tag_list_order_type")
    @Validation(required = true)
    public String tagListOrderType;

    // 标签文本
    /**
     * <strong>example:</strong>
     * <p>1233</p>
     */
    @NameInMap("tag_text")
    @Validation(required = true)
    public String tagText;

    // 趋势图表名
    /**
     * <strong>example:</strong>
     * <p>XX趋势图 </p>
     */
    @NameInMap("tag_trend_chart_name")
    @Validation(required = true)
    public String tagTrendChartName;

    // 数据同步到公有云时间(业务上赋值当天)
    /**
     * <strong>example:</strong>
     * <p>20190823</p>
     */
    @NameInMap("update_date")
    @Validation(required = true)
    public String updateDate;

    public static RiskLabelInfo build(java.util.Map<String, ?> map) throws Exception {
        RiskLabelInfo self = new RiskLabelInfo();
        return TeaModel.build(map, self);
    }

    public RiskLabelInfo setClueDetailType(String clueDetailType) {
        this.clueDetailType = clueDetailType;
        return this;
    }
    public String getClueDetailType() {
        return this.clueDetailType;
    }

    public RiskLabelInfo setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

    public RiskLabelInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RiskLabelInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RiskLabelInfo setIsDeleted(Long isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }
    public Long getIsDeleted() {
        return this.isDeleted;
    }

    public RiskLabelInfo setMctOneId(String mctOneId) {
        this.mctOneId = mctOneId;
        return this;
    }
    public String getMctOneId() {
        return this.mctOneId;
    }

    public RiskLabelInfo setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public RiskLabelInfo setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public RiskLabelInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public RiskLabelInfo setRiskDetailType(String riskDetailType) {
        this.riskDetailType = riskDetailType;
        return this;
    }
    public String getRiskDetailType() {
        return this.riskDetailType;
    }

    public RiskLabelInfo setRiskDimensionType(String riskDimensionType) {
        this.riskDimensionType = riskDimensionType;
        return this;
    }
    public String getRiskDimensionType() {
        return this.riskDimensionType;
    }

    public RiskLabelInfo setTagClue(String tagClue) {
        this.tagClue = tagClue;
        return this;
    }
    public String getTagClue() {
        return this.tagClue;
    }

    public RiskLabelInfo setTagClueDetail(String tagClueDetail) {
        this.tagClueDetail = tagClueDetail;
        return this;
    }
    public String getTagClueDetail() {
        return this.tagClueDetail;
    }

    public RiskLabelInfo setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public RiskLabelInfo setTagListHeaders(String tagListHeaders) {
        this.tagListHeaders = tagListHeaders;
        return this;
    }
    public String getTagListHeaders() {
        return this.tagListHeaders;
    }

    public RiskLabelInfo setTagListOrderColumn(String tagListOrderColumn) {
        this.tagListOrderColumn = tagListOrderColumn;
        return this;
    }
    public String getTagListOrderColumn() {
        return this.tagListOrderColumn;
    }

    public RiskLabelInfo setTagListOrderType(String tagListOrderType) {
        this.tagListOrderType = tagListOrderType;
        return this;
    }
    public String getTagListOrderType() {
        return this.tagListOrderType;
    }

    public RiskLabelInfo setTagText(String tagText) {
        this.tagText = tagText;
        return this;
    }
    public String getTagText() {
        return this.tagText;
    }

    public RiskLabelInfo setTagTrendChartName(String tagTrendChartName) {
        this.tagTrendChartName = tagTrendChartName;
        return this;
    }
    public String getTagTrendChartName() {
        return this.tagTrendChartName;
    }

    public RiskLabelInfo setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }
    public String getUpdateDate() {
        return this.updateDate;
    }

}
