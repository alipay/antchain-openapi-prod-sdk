// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class RequestParams extends TeaModel {
    // req_type
    @NameInMap("req_type")
    @Validation(required = true)
    public String reqType;

    // condition
    @NameInMap("condition")
    @Validation(required = true)
    public Condition condition;

    // dimCondition
    @NameInMap("dim_condition")
    @Validation(required = true)
    public PontusTrendRequest dimCondition;

    // tenant
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // zones
    @NameInMap("zones")
    @Validation(required = true)
    public String zones;

    // from_front
    @NameInMap("from_front")
    @Validation(required = true)
    public Boolean fromFront;

    // fuzzy
    @NameInMap("fuzzy")
    @Validation(required = true)
    public Boolean fuzzy;

    // validKeyCount
    @NameInMap("valid_key_count")
    @Validation(required = true)
    public Long validKeyCount;

    // can_switch
    @NameInMap("can_switch")
    @Validation(required = true)
    public Boolean canSwitch;

    public static RequestParams build(java.util.Map<String, ?> map) throws Exception {
        RequestParams self = new RequestParams();
        return TeaModel.build(map, self);
    }

    public RequestParams setReqType(String reqType) {
        this.reqType = reqType;
        return this;
    }
    public String getReqType() {
        return this.reqType;
    }

    public RequestParams setCondition(Condition condition) {
        this.condition = condition;
        return this;
    }
    public Condition getCondition() {
        return this.condition;
    }

    public RequestParams setDimCondition(PontusTrendRequest dimCondition) {
        this.dimCondition = dimCondition;
        return this;
    }
    public PontusTrendRequest getDimCondition() {
        return this.dimCondition;
    }

    public RequestParams setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RequestParams setZones(String zones) {
        this.zones = zones;
        return this;
    }
    public String getZones() {
        return this.zones;
    }

    public RequestParams setFromFront(Boolean fromFront) {
        this.fromFront = fromFront;
        return this;
    }
    public Boolean getFromFront() {
        return this.fromFront;
    }

    public RequestParams setFuzzy(Boolean fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public Boolean getFuzzy() {
        return this.fuzzy;
    }

    public RequestParams setValidKeyCount(Long validKeyCount) {
        this.validKeyCount = validKeyCount;
        return this;
    }
    public Long getValidKeyCount() {
        return this.validKeyCount;
    }

    public RequestParams setCanSwitch(Boolean canSwitch) {
        this.canSwitch = canSwitch;
        return this;
    }
    public Boolean getCanSwitch() {
        return this.canSwitch;
    }

}
