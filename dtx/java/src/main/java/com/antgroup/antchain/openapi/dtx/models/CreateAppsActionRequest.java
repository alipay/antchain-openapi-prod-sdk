// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CreateAppsActionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与者名称
    // 
    @NameInMap("action_name")
    @Validation(required = true)
    public String actionName;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 类全名，包括完整包名
    // 
    @NameInMap("class_name")
    @Validation(required = true)
    public String className;

    // 提交方法名称
    // 
    @NameInMap("commit_method_name")
    @Validation(required = true)
    public String commitMethodName;

    // 提交方法参数
    // 
    @NameInMap("commit_method_params_type")
    @Validation(required = true)
    public Long commitMethodParamsType;

    // 弹性key
    // 
    @NameInMap("elastic_key")
    public String elasticKey;

    // 弹性路由规则（Groovy脚本）
    // 
    @NameInMap("elastic_route_rule")
    public String elasticRouteRule;

    // 更新时需要
    @NameInMap("id")
    public Long id;

    // 00001
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // rpc是否ldc调用
    // 
    @NameInMap("is_zone_route")
    @Validation(required = true)
    public Boolean isZoneRoute;

    // 回滚方法名称
    // 
    @NameInMap("rollback_method_name")
    @Validation(required = true)
    public String rollbackMethodName;

    // 回滚方法的参数类型
    // 
    @NameInMap("rollback_method_params_type")
    @Validation(required = true)
    public Long rollbackMethodParamsType;

    // rpc接口测试地址
    // 
    @NameInMap("test_url")
    public String testUrl;

    // rpc uniqueId
    // 
    @NameInMap("unique_id")
    public String uniqueId;

    // rpc协议，ws或tr
    // 
    @NameInMap("ws_tr")
    @Validation(required = true)
    public String wsTr;

    public static CreateAppsActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppsActionRequest self = new CreateAppsActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppsActionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppsActionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAppsActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public CreateAppsActionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppsActionRequest setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public CreateAppsActionRequest setCommitMethodName(String commitMethodName) {
        this.commitMethodName = commitMethodName;
        return this;
    }
    public String getCommitMethodName() {
        return this.commitMethodName;
    }

    public CreateAppsActionRequest setCommitMethodParamsType(Long commitMethodParamsType) {
        this.commitMethodParamsType = commitMethodParamsType;
        return this;
    }
    public Long getCommitMethodParamsType() {
        return this.commitMethodParamsType;
    }

    public CreateAppsActionRequest setElasticKey(String elasticKey) {
        this.elasticKey = elasticKey;
        return this;
    }
    public String getElasticKey() {
        return this.elasticKey;
    }

    public CreateAppsActionRequest setElasticRouteRule(String elasticRouteRule) {
        this.elasticRouteRule = elasticRouteRule;
        return this;
    }
    public String getElasticRouteRule() {
        return this.elasticRouteRule;
    }

    public CreateAppsActionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateAppsActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAppsActionRequest setIsZoneRoute(Boolean isZoneRoute) {
        this.isZoneRoute = isZoneRoute;
        return this;
    }
    public Boolean getIsZoneRoute() {
        return this.isZoneRoute;
    }

    public CreateAppsActionRequest setRollbackMethodName(String rollbackMethodName) {
        this.rollbackMethodName = rollbackMethodName;
        return this;
    }
    public String getRollbackMethodName() {
        return this.rollbackMethodName;
    }

    public CreateAppsActionRequest setRollbackMethodParamsType(Long rollbackMethodParamsType) {
        this.rollbackMethodParamsType = rollbackMethodParamsType;
        return this;
    }
    public Long getRollbackMethodParamsType() {
        return this.rollbackMethodParamsType;
    }

    public CreateAppsActionRequest setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public CreateAppsActionRequest setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public CreateAppsActionRequest setWsTr(String wsTr) {
        this.wsTr = wsTr;
        return this;
    }
    public String getWsTr() {
        return this.wsTr;
    }

}
