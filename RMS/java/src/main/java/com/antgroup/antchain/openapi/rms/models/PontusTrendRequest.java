// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class PontusTrendRequest extends TeaModel {
    // token
    @NameInMap("token")
    public String token;

    // metric_table
    @NameInMap("metric_table")
    public String metricTable;

    // site_env
    @NameInMap("site_env")
    public String siteEnv;

    // view_id
    @NameInMap("view_id")
    public String viewId;

    // period_type
    @NameInMap("period_type")
    public String periodType;

    // extraDimNames
    @NameInMap("extra_dim_names")
    public java.util.List<String> extraDimNames;

    // metric_filter
    @NameInMap("metric_filter")
    public String metricFilter;

    // start
    @NameInMap("start")
    public Long start;

    // end
    @NameInMap("end")
    public Long end;

    // dim_conditions_list
    @NameInMap("dim_conditions_list")
    public java.util.List<KeySet> dimConditionsList;

    // dim_expression
    @NameInMap("dim_expression")
    public KeySet dimExpression;

    // dim_expression_list
    @NameInMap("dim_expression_list")
    public java.util.List<KeySet> dimExpressionList;

    public static PontusTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        PontusTrendRequest self = new PontusTrendRequest();
        return TeaModel.build(map, self);
    }

    public PontusTrendRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public PontusTrendRequest setMetricTable(String metricTable) {
        this.metricTable = metricTable;
        return this;
    }
    public String getMetricTable() {
        return this.metricTable;
    }

    public PontusTrendRequest setSiteEnv(String siteEnv) {
        this.siteEnv = siteEnv;
        return this;
    }
    public String getSiteEnv() {
        return this.siteEnv;
    }

    public PontusTrendRequest setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }
    public String getViewId() {
        return this.viewId;
    }

    public PontusTrendRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public PontusTrendRequest setExtraDimNames(java.util.List<String> extraDimNames) {
        this.extraDimNames = extraDimNames;
        return this;
    }
    public java.util.List<String> getExtraDimNames() {
        return this.extraDimNames;
    }

    public PontusTrendRequest setMetricFilter(String metricFilter) {
        this.metricFilter = metricFilter;
        return this;
    }
    public String getMetricFilter() {
        return this.metricFilter;
    }

    public PontusTrendRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public PontusTrendRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public PontusTrendRequest setDimConditionsList(java.util.List<KeySet> dimConditionsList) {
        this.dimConditionsList = dimConditionsList;
        return this;
    }
    public java.util.List<KeySet> getDimConditionsList() {
        return this.dimConditionsList;
    }

    public PontusTrendRequest setDimExpression(KeySet dimExpression) {
        this.dimExpression = dimExpression;
        return this;
    }
    public KeySet getDimExpression() {
        return this.dimExpression;
    }

    public PontusTrendRequest setDimExpressionList(java.util.List<KeySet> dimExpressionList) {
        this.dimExpressionList = dimExpressionList;
        return this;
    }
    public java.util.List<KeySet> getDimExpressionList() {
        return this.dimExpressionList;
    }

}
