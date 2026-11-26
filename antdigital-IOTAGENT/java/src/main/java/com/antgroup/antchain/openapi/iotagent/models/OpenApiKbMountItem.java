// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class OpenApiKbMountItem extends TeaModel {
    // 知识库ID
    /**
     * <strong>example:</strong>
     * <p>7470569204104081408</p>
     */
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 映射kbName
    /**
     * <strong>example:</strong>
     * <p>产品使用手册</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 映射kbDescription
    /**
     * <strong>example:</strong>
     * <p>产品使用说明与FAQ</p>
     */
    @NameInMap("description")
    public String description;

    // 枚举:OFFICIAL,CUSTOM
    /**
     * <strong>example:</strong>
     * <p>OFFICIAL</p>
     */
    @NameInMap("provider")
    @Validation(required = true)
    public String provider;

    public static OpenApiKbMountItem build(java.util.Map<String, ?> map) throws Exception {
        OpenApiKbMountItem self = new OpenApiKbMountItem();
        return TeaModel.build(map, self);
    }

    public OpenApiKbMountItem setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public OpenApiKbMountItem setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiKbMountItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpenApiKbMountItem setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

}
