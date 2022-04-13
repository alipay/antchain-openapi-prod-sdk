// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class OpsContainerService extends TeaModel {
    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 容器服务名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 待操作目标pods列表
    @NameInMap("selected_pods")
    public java.util.List<CellPods> selectedPods;

    public static OpsContainerService build(java.util.Map<String, ?> map) throws Exception {
        OpsContainerService self = new OpsContainerService();
        return TeaModel.build(map, self);
    }

    public OpsContainerService setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public OpsContainerService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsContainerService setSelectedPods(java.util.List<CellPods> selectedPods) {
        this.selectedPods = selectedPods;
        return this;
    }
    public java.util.List<CellPods> getSelectedPods() {
        return this.selectedPods;
    }

}
