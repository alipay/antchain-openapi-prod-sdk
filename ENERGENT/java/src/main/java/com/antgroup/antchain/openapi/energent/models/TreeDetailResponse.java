// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class TreeDetailResponse extends TeaModel {
    // 知识库名称
    /**
     * <strong>example:</strong>
     * <p>知识库名称</p>
     */
    @NameInMap("name")
    public String name;

    // 知识库id
    /**
     * <strong>example:</strong>
     * <p>tree_1231</p>
     */
    @NameInMap("id")
    public String id;

    // 知识库描述
    /**
     * <strong>example:</strong>
     * <p>知识库描述</p>
     */
    @NameInMap("description")
    public String description;

    // 当前最新版本
    /**
     * <strong>example:</strong>
     * <p>V2026.08.1</p>
     */
    @NameInMap("version")
    public String version;

    // 当前激活的版本号，未激活任何版本时为 null
    /**
     * <strong>example:</strong>
     * <p>V2026.08.1</p>
     */
    @NameInMap("activeversion")
    public String activeversion;

    // 官方知识库数据为 "official",否则 null
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("tenanttag")
    public String tenanttag;

    public static TreeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        TreeDetailResponse self = new TreeDetailResponse();
        return TeaModel.build(map, self);
    }

    public TreeDetailResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TreeDetailResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TreeDetailResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TreeDetailResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public TreeDetailResponse setActiveversion(String activeversion) {
        this.activeversion = activeversion;
        return this;
    }
    public String getActiveversion() {
        return this.activeversion;
    }

    public TreeDetailResponse setTenanttag(String tenanttag) {
        this.tenanttag = tenanttag;
        return this;
    }
    public String getTenanttag() {
        return this.tenanttag;
    }

}
