// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class GetProdinstanceAppserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名。
    @NameInMap("app_name")
    public String appName;

    // 应用版本。
    @NameInMap("app_version")
    public String appVersion;

    // 单元ID
    @NameInMap("cell_id")
    public String cellId;

    // 容器列表。
    @NameInMap("containers")
    public java.util.List<Container> containers;

    // 部署单元。
    @NameInMap("deploy_unit")
    public String deployUnit;

    // 部署域。
    @NameInMap("deploy_zone")
    public String deployZone;

    // 环境唯一标识。
    @NameInMap("env_id")
    public String envId;

    // 负载均衡列表。
    @NameInMap("load_balancers")
    public java.util.List<LoadBalancer> loadBalancers;

    // 产品码。
    @NameInMap("product_code")
    public String productCode;

    // 数据库列表。
    @NameInMap("schemas")
    public java.util.List<Schema> schemas;

    // app service id，该openapi 的入参
    @NameInMap("id")
    public String id;

    public static GetProdinstanceAppserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProdinstanceAppserviceResponse self = new GetProdinstanceAppserviceResponse();
        return TeaModel.build(map, self);
    }

    public GetProdinstanceAppserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetProdinstanceAppserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetProdinstanceAppserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetProdinstanceAppserviceResponse setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetProdinstanceAppserviceResponse setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public GetProdinstanceAppserviceResponse setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public GetProdinstanceAppserviceResponse setContainers(java.util.List<Container> containers) {
        this.containers = containers;
        return this;
    }
    public java.util.List<Container> getContainers() {
        return this.containers;
    }

    public GetProdinstanceAppserviceResponse setDeployUnit(String deployUnit) {
        this.deployUnit = deployUnit;
        return this;
    }
    public String getDeployUnit() {
        return this.deployUnit;
    }

    public GetProdinstanceAppserviceResponse setDeployZone(String deployZone) {
        this.deployZone = deployZone;
        return this;
    }
    public String getDeployZone() {
        return this.deployZone;
    }

    public GetProdinstanceAppserviceResponse setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public GetProdinstanceAppserviceResponse setLoadBalancers(java.util.List<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<LoadBalancer> getLoadBalancers() {
        return this.loadBalancers;
    }

    public GetProdinstanceAppserviceResponse setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public GetProdinstanceAppserviceResponse setSchemas(java.util.List<Schema> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<Schema> getSchemas() {
        return this.schemas;
    }

    public GetProdinstanceAppserviceResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
