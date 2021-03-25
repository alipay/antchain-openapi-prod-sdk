// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeploymentCell extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元 id
    @NameInMap("cell_ids")
    @Validation(required = true)
    public java.util.List<String> cellIds;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static DeploymentCell build(java.util.Map<String, ?> map) throws Exception {
        DeploymentCell self = new DeploymentCell();
        return TeaModel.build(map, self);
    }

    public DeploymentCell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploymentCell setCellIds(java.util.List<String> cellIds) {
        this.cellIds = cellIds;
        return this;
    }
    public java.util.List<String> getCellIds() {
        return this.cellIds;
    }

    public DeploymentCell setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploymentCell setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
