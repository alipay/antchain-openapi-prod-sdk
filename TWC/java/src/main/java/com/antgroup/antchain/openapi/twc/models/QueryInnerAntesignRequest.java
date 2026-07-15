// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryInnerAntesignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户信息
    @NameInMap("tenant_name")
    public String tenantName;

    // 业务线
    @NameInMap("business_line_code")
    public String businessLineCode;

    // 场景值
    @NameInMap("scene_code")
    public String sceneCode;

    // 签署合同id 传值默认查询签署流程下全部任务状态
    @NameInMap("sign_flow_id")
    @Validation(required = true)
    public String signFlowId;

    // 签署任务创建id 默认查signTaskId 单任务状态
    @NameInMap("sign_task_id")
    public String signTaskId;

    // 应用方来源信息
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 业务流水号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    public static QueryInnerAntesignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerAntesignRequest self = new QueryInnerAntesignRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerAntesignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerAntesignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerAntesignRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public QueryInnerAntesignRequest setBusinessLineCode(String businessLineCode) {
        this.businessLineCode = businessLineCode;
        return this;
    }
    public String getBusinessLineCode() {
        return this.businessLineCode;
    }

    public QueryInnerAntesignRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryInnerAntesignRequest setSignFlowId(String signFlowId) {
        this.signFlowId = signFlowId;
        return this;
    }
    public String getSignFlowId() {
        return this.signFlowId;
    }

    public QueryInnerAntesignRequest setSignTaskId(String signTaskId) {
        this.signTaskId = signTaskId;
        return this;
    }
    public String getSignTaskId() {
        return this.signTaskId;
    }

    public QueryInnerAntesignRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryInnerAntesignRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

}
