// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DatabaseEngine extends TeaModel {
    // iaas_type
    @NameInMap("iaas_type")
    public String iaasType;

    // engine
    @NameInMap("engine")
    public String engine;

    // engine_versions
    @NameInMap("engine_versions")
    public java.util.List<String> engineVersions;

    public static DatabaseEngine build(java.util.Map<String, ?> map) throws Exception {
        DatabaseEngine self = new DatabaseEngine();
        return TeaModel.build(map, self);
    }

    public DatabaseEngine setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public DatabaseEngine setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DatabaseEngine setEngineVersions(java.util.List<String> engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }
    public java.util.List<String> getEngineVersions() {
        return this.engineVersions;
    }

}
