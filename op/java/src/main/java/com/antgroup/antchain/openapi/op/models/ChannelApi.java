// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ChannelApi extends TeaModel {
    // 渠道名称
    @NameInMap("channel_name")
    @Validation(required = true)
    public String channelName;

    // 外部产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 外部服务码
    @NameInMap("service_code")
    public String serviceCode;

    // 外部API名称
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // 外部API版本
    @NameInMap("api_version")
    @Validation(required = true)
    public String apiVersion;

    // 鉴权模式
    @NameInMap("auth_type")
    public String authType;

    // 鉴权资源表达式
    @NameInMap("auth_expression")
    public String authExpression;

    // 内部产品码
    @NameInMap("inner_provider_name")
    @Validation(required = true)
    public String innerProviderName;

    // 内部API名称
    @NameInMap("inner_api_name")
    public String innerApiName;

    // 内部API版本
    @NameInMap("inner_api_version")
    public String innerApiVersion;

    public static ChannelApi build(java.util.Map<String, ?> map) throws Exception {
        ChannelApi self = new ChannelApi();
        return TeaModel.build(map, self);
    }

    public ChannelApi setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public ChannelApi setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ChannelApi setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public ChannelApi setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ChannelApi setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ChannelApi setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public ChannelApi setAuthExpression(String authExpression) {
        this.authExpression = authExpression;
        return this;
    }
    public String getAuthExpression() {
        return this.authExpression;
    }

    public ChannelApi setInnerProviderName(String innerProviderName) {
        this.innerProviderName = innerProviderName;
        return this;
    }
    public String getInnerProviderName() {
        return this.innerProviderName;
    }

    public ChannelApi setInnerApiName(String innerApiName) {
        this.innerApiName = innerApiName;
        return this;
    }
    public String getInnerApiName() {
        return this.innerApiName;
    }

    public ChannelApi setInnerApiVersion(String innerApiVersion) {
        this.innerApiVersion = innerApiVersion;
        return this;
    }
    public String getInnerApiVersion() {
        return this.innerApiVersion;
    }

}
