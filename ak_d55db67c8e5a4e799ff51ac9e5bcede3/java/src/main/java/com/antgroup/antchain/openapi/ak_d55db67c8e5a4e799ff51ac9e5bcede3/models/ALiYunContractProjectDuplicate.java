// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d55db67c8e5a4e799ff51ac9e5bcede3.models;

import com.aliyun.tea.*;

public class ALiYunContractProjectDuplicate extends TeaModel {
    // consortium_id
    @NameInMap("consortium_id")
    public String consortiumId;

    // description
    @NameInMap("description")
    public String description;

    // gmt_create
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // version
    @NameInMap("version")
    public String version;

    public static ALiYunContractProjectDuplicate build(java.util.Map<String, ?> map) throws Exception {
        ALiYunContractProjectDuplicate self = new ALiYunContractProjectDuplicate();
        return TeaModel.build(map, self);
    }

    public ALiYunContractProjectDuplicate setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ALiYunContractProjectDuplicate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ALiYunContractProjectDuplicate setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ALiYunContractProjectDuplicate setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ALiYunContractProjectDuplicate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ALiYunContractProjectDuplicate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ALiYunContractProjectDuplicate setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
