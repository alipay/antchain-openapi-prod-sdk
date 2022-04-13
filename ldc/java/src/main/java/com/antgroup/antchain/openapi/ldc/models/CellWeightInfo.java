// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellWeightInfo extends TeaModel {
    // 部署单元所属工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 部署单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元所占单元组流量比重
    @NameInMap("weight")
    @Validation(required = true)
    public Long weight;

    public static CellWeightInfo build(java.util.Map<String, ?> map) throws Exception {
        CellWeightInfo self = new CellWeightInfo();
        return TeaModel.build(map, self);
    }

    public CellWeightInfo setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CellWeightInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellWeightInfo setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
