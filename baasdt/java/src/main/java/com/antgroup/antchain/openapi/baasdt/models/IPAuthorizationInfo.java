// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPAuthorizationInfo extends TeaModel {
    // 授权模式,0普通授权/1独家授权
    @NameInMap("authorization_model")
    public java.util.List<Long> authorizationModel;

    // 授权类型，衍生品授权，营销授权，商标授权，数字虚拟授权，其他
    @NameInMap("authorization_type")
    public java.util.List<String> authorizationType;

    // 授权范围
    @NameInMap("authorization_scope")
    public String authorizationScope;

    // 授权要求
    @NameInMap("authorization_requirement")
    public String authorizationRequirement;

    public static IPAuthorizationInfo build(java.util.Map<String, ?> map) throws Exception {
        IPAuthorizationInfo self = new IPAuthorizationInfo();
        return TeaModel.build(map, self);
    }

    public IPAuthorizationInfo setAuthorizationModel(java.util.List<Long> authorizationModel) {
        this.authorizationModel = authorizationModel;
        return this;
    }
    public java.util.List<Long> getAuthorizationModel() {
        return this.authorizationModel;
    }

    public IPAuthorizationInfo setAuthorizationType(java.util.List<String> authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public java.util.List<String> getAuthorizationType() {
        return this.authorizationType;
    }

    public IPAuthorizationInfo setAuthorizationScope(String authorizationScope) {
        this.authorizationScope = authorizationScope;
        return this;
    }
    public String getAuthorizationScope() {
        return this.authorizationScope;
    }

    public IPAuthorizationInfo setAuthorizationRequirement(String authorizationRequirement) {
        this.authorizationRequirement = authorizationRequirement;
        return this;
    }
    public String getAuthorizationRequirement() {
        return this.authorizationRequirement;
    }

}
