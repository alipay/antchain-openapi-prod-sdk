// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class RouterRuleModel extends TeaModel {
    // [
    //                     {
    //                         "type":"system",
    //                         "field":"app.kubernetes.io/version",
    //                         "operation":"equal",
    //                         "value":[
    //                             "22"
    //                         ]
    //                     }
    //                 ]
    @NameInMap("conditions")
    public java.util.List<BaseConditionModel> conditions;

    // [
    //             {
    //                 "weight":100,
    //                 "destination":[
    //                     {
    //                         "type":"system",
    //                         "field":"app.kubernetes.io/version",
    //                         "operation":"equal",
    //                         "value":[
    //                             "22"
    //                         ]
    //                     }
    //                 ]
    //             }
    //         ]
    @NameInMap("destinations")
    public java.util.List<RouterDestinationModel> destinations;

    // 是否生效，1 生效，0 未生效。默认未生效
    @NameInMap("enabled")
    public Long enabled;

    // fallback
    @NameInMap("fallback")
    public Long fallback;

    // faultProtection
    @NameInMap("fault_protection")
    public Long faultProtection;

    // 更新时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // TreeSet<BaseConditionModel>
    @NameInMap("grays")
    public java.util.List<BaseConditionModel> grays;

    // 规则名
    @NameInMap("name")
    public String name;

    // 优先级
    @NameInMap("order_num")
    public Long orderNum;

    // 唯一UUID
    @NameInMap("id")
    public String id;

    public static RouterRuleModel build(java.util.Map<String, ?> map) throws Exception {
        RouterRuleModel self = new RouterRuleModel();
        return TeaModel.build(map, self);
    }

    public RouterRuleModel setConditions(java.util.List<BaseConditionModel> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<BaseConditionModel> getConditions() {
        return this.conditions;
    }

    public RouterRuleModel setDestinations(java.util.List<RouterDestinationModel> destinations) {
        this.destinations = destinations;
        return this;
    }
    public java.util.List<RouterDestinationModel> getDestinations() {
        return this.destinations;
    }

    public RouterRuleModel setEnabled(Long enabled) {
        this.enabled = enabled;
        return this;
    }
    public Long getEnabled() {
        return this.enabled;
    }

    public RouterRuleModel setFallback(Long fallback) {
        this.fallback = fallback;
        return this;
    }
    public Long getFallback() {
        return this.fallback;
    }

    public RouterRuleModel setFaultProtection(Long faultProtection) {
        this.faultProtection = faultProtection;
        return this;
    }
    public Long getFaultProtection() {
        return this.faultProtection;
    }

    public RouterRuleModel setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public RouterRuleModel setGrays(java.util.List<BaseConditionModel> grays) {
        this.grays = grays;
        return this;
    }
    public java.util.List<BaseConditionModel> getGrays() {
        return this.grays;
    }

    public RouterRuleModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RouterRuleModel setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public RouterRuleModel setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
