// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MasterClustersOfZone extends TeaModel {
    // master clusters of specific zone
    @NameInMap("clusters")
    @Validation(required = true)
    public java.util.List<MasterCluster> clusters;

    // zone name
    @NameInMap("zone_name")
    @Validation(required = true)
    public String zoneName;

    // if the az has imported cluster
    @NameInMap("has_imported")
    @Validation(required = true)
    public Boolean hasImported;

    public static MasterClustersOfZone build(java.util.Map<String, ?> map) throws Exception {
        MasterClustersOfZone self = new MasterClustersOfZone();
        return TeaModel.build(map, self);
    }

    public MasterClustersOfZone setClusters(java.util.List<MasterCluster> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<MasterCluster> getClusters() {
        return this.clusters;
    }

    public MasterClustersOfZone setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public MasterClustersOfZone setHasImported(Boolean hasImported) {
        this.hasImported = hasImported;
        return this;
    }
    public Boolean getHasImported() {
        return this.hasImported;
    }

}
