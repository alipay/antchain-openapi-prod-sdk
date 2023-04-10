// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class StaticDsl extends TeaModel {
    //  
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    //  
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    //  
    @NameInMap("consent_on")
    @Validation(required = true)
    public Boolean consentOn;

    //  
    @NameInMap("parameters")
    @Validation(required = true)
    public String parameters;

    public static StaticDsl build(java.util.Map<String, ?> map) throws Exception {
        StaticDsl self = new StaticDsl();
        return TeaModel.build(map, self);
    }

    public StaticDsl setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public StaticDsl setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public StaticDsl setConsentOn(Boolean consentOn) {
        this.consentOn = consentOn;
        return this;
    }
    public Boolean getConsentOn() {
        return this.consentOn;
    }

    public StaticDsl setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
