// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GrayRuleConfigVO extends TeaModel {
    // lable
    @NameInMap("lable")
    public String lable;

    // weight
    @NameInMap("weight")
    public Long weight;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // arg_key
    @NameInMap("arg_key")
    public String argKey;

    // match_type
    @NameInMap("match_type")
    public String matchType;

    // arg_value
    @NameInMap("arg_value")
    public String argValue;

    public static GrayRuleConfigVO build(java.util.Map<String, ?> map) throws Exception {
        GrayRuleConfigVO self = new GrayRuleConfigVO();
        return TeaModel.build(map, self);
    }

    public GrayRuleConfigVO setLable(String lable) {
        this.lable = lable;
        return this;
    }
    public String getLable() {
        return this.lable;
    }

    public GrayRuleConfigVO setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public GrayRuleConfigVO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GrayRuleConfigVO setArgKey(String argKey) {
        this.argKey = argKey;
        return this;
    }
    public String getArgKey() {
        return this.argKey;
    }

    public GrayRuleConfigVO setMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }
    public String getMatchType() {
        return this.matchType;
    }

    public GrayRuleConfigVO setArgValue(String argValue) {
        this.argValue = argValue;
        return this;
    }
    public String getArgValue() {
        return this.argValue;
    }

}
