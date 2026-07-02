// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryLabelTraceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第几页，默认值为1
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页记录数，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 场景码 , 使用asset_id 查询时，scene也必须传入
    @NameInMap("scene")
    public String scene;

    // 标签Id
    @NameInMap("label_id")
    public String labelId;

    // 标签状态
    @NameInMap("label_status")
    public String labelStatus;

    // 资产Id
    @NameInMap("asset_id")
    public String assetId;

    // 操作员
    @NameInMap("operator")
    public String operator;

    // 标签拥有者
    @NameInMap("owner")
    public String owner;

    // 标签所处流程
    @NameInMap("process")
    public String process;

    // 标签操作
    @NameInMap("action")
    public String action;

    // 开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    public static QueryLabelTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLabelTraceRequest self = new QueryLabelTraceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLabelTraceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLabelTraceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLabelTraceRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryLabelTraceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLabelTraceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryLabelTraceRequest setLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }
    public String getLabelId() {
        return this.labelId;
    }

    public QueryLabelTraceRequest setLabelStatus(String labelStatus) {
        this.labelStatus = labelStatus;
        return this;
    }
    public String getLabelStatus() {
        return this.labelStatus;
    }

    public QueryLabelTraceRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryLabelTraceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryLabelTraceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public QueryLabelTraceRequest setProcess(String process) {
        this.process = process;
        return this;
    }
    public String getProcess() {
        return this.process;
    }

    public QueryLabelTraceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public QueryLabelTraceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryLabelTraceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
