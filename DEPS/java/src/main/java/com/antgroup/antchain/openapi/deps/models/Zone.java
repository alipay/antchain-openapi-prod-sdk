// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Zone extends TeaModel {
    // zone名称
    @NameInMap("id")
    public String id;

    // zone显示名称
    @NameInMap("name")
    public String name;

    // zone paas id
    @NameInMap("paas_id")
    public String paasId;

    // region identity
    @NameInMap("region_id")
    public String regionId;

    // zone state
    @NameInMap("state")
    public String state;

    // 机房iaas identity
    @NameInMap("iaas_id")
    public String iaasId;

    public static Zone build(java.util.Map<String, ?> map) throws Exception {
        Zone self = new Zone();
        return TeaModel.build(map, self);
    }

    public Zone setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Zone setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Zone setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public Zone setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Zone setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Zone setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

}
