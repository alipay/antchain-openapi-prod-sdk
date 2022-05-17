// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class ScaleinClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据中心
    @NameInMap("data_center")
    @Validation(required = true)
    public String dataCenter;

    // 生效 domain
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 生效实例 ID，全部生效则为 ALL_INSTANCE_ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 网络类型，无特殊情况填写 CLASSIC
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // 产品名称
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 缩容 IP
    @NameInMap("service_ip")
    @Validation(required = true)
    public String serviceIp;

    // 生效端口
    @NameInMap("service_port")
    @Validation(required = true)
    public Long servicePort;

    public static ScaleinClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleinClusterRequest self = new ScaleinClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleinClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleinClusterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleinClusterRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ScaleinClusterRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ScaleinClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ScaleinClusterRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ScaleinClusterRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ScaleinClusterRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public ScaleinClusterRequest setServicePort(Long servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Long getServicePort() {
        return this.servicePort;
    }

}
