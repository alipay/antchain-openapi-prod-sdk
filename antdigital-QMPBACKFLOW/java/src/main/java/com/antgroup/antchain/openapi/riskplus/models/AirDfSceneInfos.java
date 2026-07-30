// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class AirDfSceneInfos extends TeaModel {
    // 决策场景结果
    /**
     * <strong>example:</strong>
     * <p>review</p>
     */
    @NameInMap("scene_decision")
    public String sceneDecision;

    // 决策场景
    /**
     * <strong>example:</strong>
     * <p>air_scene</p>
     */
    @NameInMap("scene_code")
    public String sceneCode;

    // 决策域信息
    /**
     * <strong>example:</strong>
     * <p>[{&quot;decision_flows&quot;:[{&quot;decision&quot;:&quot;review&quot;,&quot;name&quot;:&quot;租赁测试策略&quot;}],&quot;domain_decision&quot;:&quot;review&quot;,&quot;domain_code&quot;:&quot;lease_domain&quot;}]</p>
     */
    @NameInMap("domain_infos")
    public java.util.List<AirDomainInfos> domainInfos;

    public static AirDfSceneInfos build(java.util.Map<String, ?> map) throws Exception {
        AirDfSceneInfos self = new AirDfSceneInfos();
        return TeaModel.build(map, self);
    }

    public AirDfSceneInfos setSceneDecision(String sceneDecision) {
        this.sceneDecision = sceneDecision;
        return this;
    }
    public String getSceneDecision() {
        return this.sceneDecision;
    }

    public AirDfSceneInfos setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public AirDfSceneInfos setDomainInfos(java.util.List<AirDomainInfos> domainInfos) {
        this.domainInfos = domainInfos;
        return this;
    }
    public java.util.List<AirDomainInfos> getDomainInfos() {
        return this.domainInfos;
    }

}
