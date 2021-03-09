// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DiskComputer extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // id
    @NameInMap("id")
    public String id;

    // iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // status
    @NameInMap("status")
    public String status;

    public static DiskComputer build(java.util.Map<String, ?> map) throws Exception {
        DiskComputer self = new DiskComputer();
        return TeaModel.build(map, self);
    }

    public DiskComputer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DiskComputer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DiskComputer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DiskComputer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
