// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class Action extends TeaModel {
    // 权限点ID
    /**
     * <strong>example:</strong>
     * <p>A0000000001</p>
     */
    @NameInMap("id")
    public String id;

    // 权限点名称
    /**
     * <strong>example:</strong>
     * <p>antcloud.xxx.xxx.labelinfo.query</p>
     */
    @NameInMap("name")
    public String name;

    // 类型
    /**
     * <strong>example:</strong>
     * <p>INNER</p>
     */
    @NameInMap("type")
    public String type;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("status")
    public String status;

    // 描述
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("description")
    public String description;

    public static Action build(java.util.Map<String, ?> map) throws Exception {
        Action self = new Action();
        return TeaModel.build(map, self);
    }

    public Action setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Action setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Action setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Action setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Action setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
