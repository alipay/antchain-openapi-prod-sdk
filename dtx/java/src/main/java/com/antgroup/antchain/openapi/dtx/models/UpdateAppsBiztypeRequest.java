// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class UpdateAppsBiztypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // biz_type
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // client_version
    @NameInMap("client_version")
    @Validation(required = true)
    public String clientVersion;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // is_asyn
    @NameInMap("is_asyn")
    @Validation(required = true)
    public Boolean isAsyn;

    // is_load_test
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Boolean isLoadTest;

    // is_mix
    @NameInMap("is_mix")
    @Validation(required = true)
    public Boolean isMix;

    // participators
    @NameInMap("participators")
    @Validation(required = true)
    public java.util.List<Participator> participators;

    // recovery_datasources
    @NameInMap("recovery_datasources")
    @Validation(required = true)
    public java.util.List<InitiatorDatasource> recoveryDatasources;

    // recovery_limit
    @NameInMap("recovery_limit")
    @Validation(required = true)
    public Long recoveryLimit;

    // recovery_thread_num
    @NameInMap("recovery_thread_num")
    @Validation(required = true)
    public Long recoveryThreadNum;

    public static UpdateAppsBiztypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppsBiztypeRequest self = new UpdateAppsBiztypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppsBiztypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppsBiztypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAppsBiztypeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAppsBiztypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateAppsBiztypeRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public UpdateAppsBiztypeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAppsBiztypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAppsBiztypeRequest setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }
    public Boolean getIsAsyn() {
        return this.isAsyn;
    }

    public UpdateAppsBiztypeRequest setIsLoadTest(Boolean isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Boolean getIsLoadTest() {
        return this.isLoadTest;
    }

    public UpdateAppsBiztypeRequest setIsMix(Boolean isMix) {
        this.isMix = isMix;
        return this;
    }
    public Boolean getIsMix() {
        return this.isMix;
    }

    public UpdateAppsBiztypeRequest setParticipators(java.util.List<Participator> participators) {
        this.participators = participators;
        return this;
    }
    public java.util.List<Participator> getParticipators() {
        return this.participators;
    }

    public UpdateAppsBiztypeRequest setRecoveryDatasources(java.util.List<InitiatorDatasource> recoveryDatasources) {
        this.recoveryDatasources = recoveryDatasources;
        return this;
    }
    public java.util.List<InitiatorDatasource> getRecoveryDatasources() {
        return this.recoveryDatasources;
    }

    public UpdateAppsBiztypeRequest setRecoveryLimit(Long recoveryLimit) {
        this.recoveryLimit = recoveryLimit;
        return this;
    }
    public Long getRecoveryLimit() {
        return this.recoveryLimit;
    }

    public UpdateAppsBiztypeRequest setRecoveryThreadNum(Long recoveryThreadNum) {
        this.recoveryThreadNum = recoveryThreadNum;
        return this;
    }
    public Long getRecoveryThreadNum() {
        return this.recoveryThreadNum;
    }

}
