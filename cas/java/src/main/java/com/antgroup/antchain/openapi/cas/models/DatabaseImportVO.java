// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DatabaseImportVO extends TeaModel {
    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // description
    @NameInMap("description")
    public String description;

    // type
    @NameInMap("type")
    public String type;

    // status
    @NameInMap("status")
    public String status;

    // engine
    @NameInMap("engine")
    public String engine;

    // net_type
    @NameInMap("net_type")
    public String netType;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // importInfo
    @NameInMap("import_info")
    @Validation(required = true)
    public ImportVO importInfo;

    public static DatabaseImportVO build(java.util.Map<String, ?> map) throws Exception {
        DatabaseImportVO self = new DatabaseImportVO();
        return TeaModel.build(map, self);
    }

    public DatabaseImportVO setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DatabaseImportVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DatabaseImportVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DatabaseImportVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatabaseImportVO setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DatabaseImportVO setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DatabaseImportVO setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public DatabaseImportVO setImportInfo(ImportVO importInfo) {
        this.importInfo = importInfo;
        return this;
    }
    public ImportVO getImportInfo() {
        return this.importInfo;
    }

}
