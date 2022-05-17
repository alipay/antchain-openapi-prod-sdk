// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class SetClustersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 生效域名
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 开启/关闭
    @NameInMap("enable")
    @Validation(required = true)
    public Boolean enable;

    // 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 作用 IP
    @NameInMap("service_ip")
    @Validation(required = true)
    public String serviceIp;

    // 网络类型，如果无特殊需求 CLASSIC
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // 产品名称
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    public static SetClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClustersRequest self = new SetClustersRequest();
        return TeaModel.build(map, self);
    }

    public SetClustersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetClustersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetClustersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetClustersRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public SetClustersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetClustersRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public SetClustersRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SetClustersRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
