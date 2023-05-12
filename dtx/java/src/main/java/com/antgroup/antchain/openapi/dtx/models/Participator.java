// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class Participator extends TeaModel {
    // 参与者名称
    @NameInMap("action_name")
    public String actionName;

    // 应用名
    @NameInMap("app_name")
    public String appName;

    // 类全名，包括完整包名
    @NameInMap("class_name")
    public String className;

    // 提交方法名称
    @NameInMap("commit_method_name")
    public String commitMethodName;

    // 提交方法参数
    @NameInMap("commit_method_params_type")
    public Long commitMethodParamsType;

    // 弹性key
    @NameInMap("elastic_key")
    public String elasticKey;

    // 弹性路由规则（Groovy脚本）
    @NameInMap("elastic_route_rule")
    public String elasticRouteRule;

    // 记录id，更新必传
    @NameInMap("id")
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // rpc是否ldc调用
    @NameInMap("is_zone_route")
    public Boolean isZoneRoute;

    // 回滚方法名称
    @NameInMap("rollback_method_name")
    public String rollbackMethodName;

    // 回滚方法的参数类型
    @NameInMap("rollback_method_params_type")
    public Long rollbackMethodParamsType;

    // rpc接口测试地址
    @NameInMap("test_url")
    public String testUrl;

    // rpc uniqueId
    @NameInMap("unique_id")
    public String uniqueId;

    // 是否被使用
    @NameInMap("used")
    public Boolean used;

    // rpc协议，ws或tr
    @NameInMap("ws_tr")
    public String wsTr;

    public static Participator build(java.util.Map<String, ?> map) throws Exception {
        Participator self = new Participator();
        return TeaModel.build(map, self);
    }

    public Participator setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public Participator setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public Participator setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public Participator setCommitMethodName(String commitMethodName) {
        this.commitMethodName = commitMethodName;
        return this;
    }
    public String getCommitMethodName() {
        return this.commitMethodName;
    }

    public Participator setCommitMethodParamsType(Long commitMethodParamsType) {
        this.commitMethodParamsType = commitMethodParamsType;
        return this;
    }
    public Long getCommitMethodParamsType() {
        return this.commitMethodParamsType;
    }

    public Participator setElasticKey(String elasticKey) {
        this.elasticKey = elasticKey;
        return this;
    }
    public String getElasticKey() {
        return this.elasticKey;
    }

    public Participator setElasticRouteRule(String elasticRouteRule) {
        this.elasticRouteRule = elasticRouteRule;
        return this;
    }
    public String getElasticRouteRule() {
        return this.elasticRouteRule;
    }

    public Participator setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Participator setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Participator setIsZoneRoute(Boolean isZoneRoute) {
        this.isZoneRoute = isZoneRoute;
        return this;
    }
    public Boolean getIsZoneRoute() {
        return this.isZoneRoute;
    }

    public Participator setRollbackMethodName(String rollbackMethodName) {
        this.rollbackMethodName = rollbackMethodName;
        return this;
    }
    public String getRollbackMethodName() {
        return this.rollbackMethodName;
    }

    public Participator setRollbackMethodParamsType(Long rollbackMethodParamsType) {
        this.rollbackMethodParamsType = rollbackMethodParamsType;
        return this;
    }
    public Long getRollbackMethodParamsType() {
        return this.rollbackMethodParamsType;
    }

    public Participator setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public Participator setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public Participator setUsed(Boolean used) {
        this.used = used;
        return this;
    }
    public Boolean getUsed() {
        return this.used;
    }

    public Participator setWsTr(String wsTr) {
        this.wsTr = wsTr;
        return this;
    }
    public String getWsTr() {
        return this.wsTr;
    }

}
