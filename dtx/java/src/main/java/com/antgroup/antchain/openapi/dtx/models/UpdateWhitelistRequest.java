// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class UpdateWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // instance_id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 0非弹机房，1弹性机房；
    @NameInMap("is_elastic")
    @Validation(required = true)
    public Long isElastic;

    // 0正常流量，1影子流量；
    @NameInMap("is_load_test")
    @Validation(required = true)
    public Long isLoadTest;

    // 数据源名称
    @NameInMap("logical_ds_name")
    @Validation(required = true)
    public String logicalDsName;

    // business_type
    @NameInMap("business_type")
    @Validation(required = true)
    public String businessType;

    public static UpdateWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhitelistRequest self = new UpdateWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateWhitelistRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateWhitelistRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWhitelistRequest setIsElastic(Long isElastic) {
        this.isElastic = isElastic;
        return this;
    }
    public Long getIsElastic() {
        return this.isElastic;
    }

    public UpdateWhitelistRequest setIsLoadTest(Long isLoadTest) {
        this.isLoadTest = isLoadTest;
        return this;
    }
    public Long getIsLoadTest() {
        return this.isLoadTest;
    }

    public UpdateWhitelistRequest setLogicalDsName(String logicalDsName) {
        this.logicalDsName = logicalDsName;
        return this;
    }
    public String getLogicalDsName() {
        return this.logicalDsName;
    }

    public UpdateWhitelistRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
