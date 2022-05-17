// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.osp.models;

import com.aliyun.tea.*;

public class ScaleoutClustersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据中心
    @NameInMap("data_center")
    @Validation(required = true)
    public String dataCenter;

    // 生效 Domain
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 生效 instanceId，如果是需要全局生效使用 ALL_INSTANCE_ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 网络类型，无特殊需求填写 CLASSIC
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // 产品名称
    @NameInMap("product")
    @Validation(required = true)
    public String product;

    // 扩容 IP
    @NameInMap("service_ip")
    @Validation(required = true)
    public String serviceIp;

    // 生效端口
    @NameInMap("service_port")
    @Validation(required = true)
    public Long servicePort;

    public static ScaleoutClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleoutClustersRequest self = new ScaleoutClustersRequest();
        return TeaModel.build(map, self);
    }

    public ScaleoutClustersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleoutClustersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ScaleoutClustersRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public ScaleoutClustersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ScaleoutClustersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ScaleoutClustersRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ScaleoutClustersRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ScaleoutClustersRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public ScaleoutClustersRequest setServicePort(Long servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public Long getServicePort() {
        return this.servicePort;
    }

}
