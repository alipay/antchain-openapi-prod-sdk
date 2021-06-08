// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryLabelTraceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 标签Id
    @NameInMap("label_id")
    public String labelId;

    // 标签状态
    @NameInMap("label_status")
    @Validation(required = true)
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

    // 操作时间
    @NameInMap("operate_time")
    public Long operateTime;

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

    public QueryLabelTraceRequest setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

}
