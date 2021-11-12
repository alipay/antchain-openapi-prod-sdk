// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class EnableDynamicslbRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // envid
    @NameInMap("envid")
    @Validation(required = true)
    public String envid;

    // 部署单元id
    @NameInMap("unitinstanceid")
    @Validation(required = true)
    public String unitinstanceid;

    // prodCode
    @NameInMap("prodcode")
    @Validation(required = true)
    public String prodcode;

    // appname
    @NameInMap("appname")
    @Validation(required = true)
    public String appname;

    // protocol
    @NameInMap("protocol")
    @Validation(required = true)
    public String protocol;

    // 端口号
    @NameInMap("port")
    @Validation(required = true)
    public Long port;

    // 目标端口号
    @NameInMap("targetport")
    @Validation(required = true)
    public Long targetport;

    // 区间[-1 , 5120]
    @NameInMap("bandwidth")
    @Validation(required = true)
    public Long bandwidth;

    // SLB名称
    @NameInMap("loadbalancername")
    @Validation(required = true)
    public String loadbalancername;

    public static EnableDynamicslbRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDynamicslbRequest self = new EnableDynamicslbRequest();
        return TeaModel.build(map, self);
    }

    public EnableDynamicslbRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableDynamicslbRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public EnableDynamicslbRequest setEnvid(String envid) {
        this.envid = envid;
        return this;
    }
    public String getEnvid() {
        return this.envid;
    }

    public EnableDynamicslbRequest setUnitinstanceid(String unitinstanceid) {
        this.unitinstanceid = unitinstanceid;
        return this;
    }
    public String getUnitinstanceid() {
        return this.unitinstanceid;
    }

    public EnableDynamicslbRequest setProdcode(String prodcode) {
        this.prodcode = prodcode;
        return this;
    }
    public String getProdcode() {
        return this.prodcode;
    }

    public EnableDynamicslbRequest setAppname(String appname) {
        this.appname = appname;
        return this;
    }
    public String getAppname() {
        return this.appname;
    }

    public EnableDynamicslbRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public EnableDynamicslbRequest setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public EnableDynamicslbRequest setTargetport(Long targetport) {
        this.targetport = targetport;
        return this;
    }
    public Long getTargetport() {
        return this.targetport;
    }

    public EnableDynamicslbRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public EnableDynamicslbRequest setLoadbalancername(String loadbalancername) {
        this.loadbalancername = loadbalancername;
        return this;
    }
    public String getLoadbalancername() {
        return this.loadbalancername;
    }

}
