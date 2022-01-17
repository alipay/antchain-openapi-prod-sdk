// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RouterConfigVO extends TeaModel {
    // argKey
    @NameInMap("arg_key")
    public String argKey;

    // argValue
    @NameInMap("arg_value")
    public String argValue;

    // matchType
    @NameInMap("match_type")
    public String matchType;

    // param_location
    @NameInMap("param_location")
    public String paramLocation;

    // router_type
    @NameInMap("router_type")
    public String routerType;

    // systemCluster
    @NameInMap("system_cluster")
    public SystemClusterVO systemCluster;

    // sys_id
    @NameInMap("sys_id")
    public String sysId;

    // weight
    @NameInMap("weight")
    public Long weight;

    // interceptionRule
    @NameInMap("interception_rule")
    public String interceptionRule;

    public static RouterConfigVO build(java.util.Map<String, ?> map) throws Exception {
        RouterConfigVO self = new RouterConfigVO();
        return TeaModel.build(map, self);
    }

    public RouterConfigVO setArgKey(String argKey) {
        this.argKey = argKey;
        return this;
    }
    public String getArgKey() {
        return this.argKey;
    }

    public RouterConfigVO setArgValue(String argValue) {
        this.argValue = argValue;
        return this;
    }
    public String getArgValue() {
        return this.argValue;
    }

    public RouterConfigVO setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public RouterConfigVO setParamLocation(String paramLocation) {
        this.paramLocation = paramLocation;
        return this;
    }
    public String getParamLocation() {
        return this.paramLocation;
    }

    public RouterConfigVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public RouterConfigVO setSystemCluster(SystemClusterVO systemCluster) {
        this.systemCluster = systemCluster;
        return this;
    }
    public SystemClusterVO getSystemCluster() {
        return this.systemCluster;
    }

    public RouterConfigVO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public RouterConfigVO setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public RouterConfigVO setInterceptionRule(String interceptionRule) {
        this.interceptionRule = interceptionRule;
        return this;
    }
    public String getInterceptionRule() {
        return this.interceptionRule;
    }

}
