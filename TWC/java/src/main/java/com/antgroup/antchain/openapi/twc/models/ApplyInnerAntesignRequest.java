// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ApplyInnerAntesignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户信息
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 业务线
    @NameInMap("business_line_code")
    @Validation(required = true)
    public String businessLineCode;

    // 场景值
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 业务流水号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 业务名称
    @NameInMap("biz_name")
    @Validation(required = true)
    public String bizName;

    // 业务类型
    // 1.CONTRACT：合同（默认推荐）
    // 2.FILE：文件
    // 3.OTHER：其它
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 签署任务类型 默认传：MICKLE_SEAL_CA
    @NameInMap("esign_type")
    @Validation(required = true)
    public String esignType;

    // zappinfo应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 法务电子签签署任务信息
    @NameInMap("ant_sign_task_request_list")
    @Validation(required = true)
    public java.util.List<AntSignTaskRequest> antSignTaskRequestList;

    // 签署业务原地址跳转链接
    @NameInMap("source_url")
    public String sourceUrl;

    // 业务描述
    @NameInMap("biz_desc")
    public String bizDesc;

    // 回调通知地址 默认不填
    @NameInMap("callback_url")
    public String callbackUrl;

    // 默认不填
    @NameInMap("expire_date")
    public String expireDate;

    public static ApplyInnerAntesignRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyInnerAntesignRequest self = new ApplyInnerAntesignRequest();
        return TeaModel.build(map, self);
    }

    public ApplyInnerAntesignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyInnerAntesignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyInnerAntesignRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ApplyInnerAntesignRequest setBusinessLineCode(String businessLineCode) {
        this.businessLineCode = businessLineCode;
        return this;
    }
    public String getBusinessLineCode() {
        return this.businessLineCode;
    }

    public ApplyInnerAntesignRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ApplyInnerAntesignRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ApplyInnerAntesignRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ApplyInnerAntesignRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ApplyInnerAntesignRequest setEsignType(String esignType) {
        this.esignType = esignType;
        return this;
    }
    public String getEsignType() {
        return this.esignType;
    }

    public ApplyInnerAntesignRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ApplyInnerAntesignRequest setAntSignTaskRequestList(java.util.List<AntSignTaskRequest> antSignTaskRequestList) {
        this.antSignTaskRequestList = antSignTaskRequestList;
        return this;
    }
    public java.util.List<AntSignTaskRequest> getAntSignTaskRequestList() {
        return this.antSignTaskRequestList;
    }

    public ApplyInnerAntesignRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public ApplyInnerAntesignRequest setBizDesc(String bizDesc) {
        this.bizDesc = bizDesc;
        return this;
    }
    public String getBizDesc() {
        return this.bizDesc;
    }

    public ApplyInnerAntesignRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public ApplyInnerAntesignRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

}
