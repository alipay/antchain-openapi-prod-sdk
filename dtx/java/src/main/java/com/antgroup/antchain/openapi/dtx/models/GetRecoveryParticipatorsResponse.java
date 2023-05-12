// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class GetRecoveryParticipatorsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // action_name
    @NameInMap("action_name")
    public String actionName;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    public String bizType;

    // 关联关系表的id，用于更新
    @NameInMap("biz_type_id")
    public Long bizTypeId;

    // class_name
    @NameInMap("class_name")
    public String className;

    // commit_method_name
    @NameInMap("commit_method_name")
    public String commitMethodName;

    // commit_method_params_type
    @NameInMap("commit_method_params_type")
    public Long commitMethodParamsType;

    // elastic_key
    @NameInMap("elastic_key")
    public String elasticKey;

    // elastic_route_rule
    @NameInMap("elastic_route_rule")
    public String elasticRouteRule;

    // id
    @NameInMap("id")
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    public String instanceId;

    // is_zone_route
    @NameInMap("is_zone_route")
    public Boolean isZoneRoute;

    // rollback_method_name
    @NameInMap("rollback_method_name")
    public String rollbackMethodName;

    // rollback_method_params_type
    @NameInMap("rollback_method_params_type")
    public Long rollbackMethodParamsType;

    // test_url
    @NameInMap("test_url")
    public String testUrl;

    // unique_id
    @NameInMap("unique_id")
    public String uniqueId;

    // ws_tr
    @NameInMap("ws_tr")
    public String wsTr;

    public static GetRecoveryParticipatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRecoveryParticipatorsResponse self = new GetRecoveryParticipatorsResponse();
        return TeaModel.build(map, self);
    }

    public GetRecoveryParticipatorsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRecoveryParticipatorsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRecoveryParticipatorsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRecoveryParticipatorsResponse setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public GetRecoveryParticipatorsResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetRecoveryParticipatorsResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetRecoveryParticipatorsResponse setBizTypeId(Long bizTypeId) {
        this.bizTypeId = bizTypeId;
        return this;
    }
    public Long getBizTypeId() {
        return this.bizTypeId;
    }

    public GetRecoveryParticipatorsResponse setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public GetRecoveryParticipatorsResponse setCommitMethodName(String commitMethodName) {
        this.commitMethodName = commitMethodName;
        return this;
    }
    public String getCommitMethodName() {
        return this.commitMethodName;
    }

    public GetRecoveryParticipatorsResponse setCommitMethodParamsType(Long commitMethodParamsType) {
        this.commitMethodParamsType = commitMethodParamsType;
        return this;
    }
    public Long getCommitMethodParamsType() {
        return this.commitMethodParamsType;
    }

    public GetRecoveryParticipatorsResponse setElasticKey(String elasticKey) {
        this.elasticKey = elasticKey;
        return this;
    }
    public String getElasticKey() {
        return this.elasticKey;
    }

    public GetRecoveryParticipatorsResponse setElasticRouteRule(String elasticRouteRule) {
        this.elasticRouteRule = elasticRouteRule;
        return this;
    }
    public String getElasticRouteRule() {
        return this.elasticRouteRule;
    }

    public GetRecoveryParticipatorsResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetRecoveryParticipatorsResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRecoveryParticipatorsResponse setIsZoneRoute(Boolean isZoneRoute) {
        this.isZoneRoute = isZoneRoute;
        return this;
    }
    public Boolean getIsZoneRoute() {
        return this.isZoneRoute;
    }

    public GetRecoveryParticipatorsResponse setRollbackMethodName(String rollbackMethodName) {
        this.rollbackMethodName = rollbackMethodName;
        return this;
    }
    public String getRollbackMethodName() {
        return this.rollbackMethodName;
    }

    public GetRecoveryParticipatorsResponse setRollbackMethodParamsType(Long rollbackMethodParamsType) {
        this.rollbackMethodParamsType = rollbackMethodParamsType;
        return this;
    }
    public Long getRollbackMethodParamsType() {
        return this.rollbackMethodParamsType;
    }

    public GetRecoveryParticipatorsResponse setTestUrl(String testUrl) {
        this.testUrl = testUrl;
        return this;
    }
    public String getTestUrl() {
        return this.testUrl;
    }

    public GetRecoveryParticipatorsResponse setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public GetRecoveryParticipatorsResponse setWsTr(String wsTr) {
        this.wsTr = wsTr;
        return this;
    }
    public String getWsTr() {
        return this.wsTr;
    }

}
