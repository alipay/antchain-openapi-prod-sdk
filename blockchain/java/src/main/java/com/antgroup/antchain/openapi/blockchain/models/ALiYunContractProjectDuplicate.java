// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunContractProjectDuplicate extends TeaModel {
    // id
    /**
     * <strong>example:</strong>
     * <p>id</p>
     */
    @NameInMap("id")
    public String id;

    // consortium_id
    /**
     * <strong>example:</strong>
     * <p>consortium_id</p>
     */
    @NameInMap("consortium_id")
    public String consortiumId;

    // gmt_create
    /**
     * <strong>example:</strong>
     * <p>21312312312</p>
     */
    @NameInMap("gmt_create")
    public Long gmtCreate;

    // gmt_modified
    /**
     * <strong>example:</strong>
     * <p>123123212</p>
     */
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    // version
    /**
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("version")
    public String version;

    // description
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    public static ALiYunContractProjectDuplicate build(java.util.Map<String, ?> map) throws Exception {
        ALiYunContractProjectDuplicate self = new ALiYunContractProjectDuplicate();
        return TeaModel.build(map, self);
    }

    public ALiYunContractProjectDuplicate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ALiYunContractProjectDuplicate setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
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

    public ALiYunContractProjectDuplicate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
