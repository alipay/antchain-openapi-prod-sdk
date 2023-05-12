// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AddWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // app_name
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 0非弹机房，1弹性机房；
    @NameInMap("is_elastic")
    @Validation(required = true)
    public Long isElastic;

    // 数据源名称
    @NameInMap("logical_ds_name")
    @Validation(required = true)
    public String logicalDsName;

    // 业务类型
    @NameInMap("business_type")
    public String businessType;

    public static AddWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWhitelistRequest self = new AddWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddWhitelistRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddWhitelistRequest setIsElastic(Long isElastic) {
        this.isElastic = isElastic;
        return this;
    }
    public Long getIsElastic() {
        return this.isElastic;
    }

    public AddWhitelistRequest setLogicalDsName(String logicalDsName) {
        this.logicalDsName = logicalDsName;
        return this;
    }
    public String getLogicalDsName() {
        return this.logicalDsName;
    }

    public AddWhitelistRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
