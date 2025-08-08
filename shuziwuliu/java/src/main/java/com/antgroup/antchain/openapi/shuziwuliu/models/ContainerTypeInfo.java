// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ContainerTypeInfo extends TeaModel {
    // 箱型
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_type")
    public String containerType;

    // 箱量
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_volume")
    public String containerVolume;

    public static ContainerTypeInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerTypeInfo self = new ContainerTypeInfo();
        return TeaModel.build(map, self);
    }

    public ContainerTypeInfo setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

    public ContainerTypeInfo setContainerVolume(String containerVolume) {
        this.containerVolume = containerVolume;
        return this;
    }
    public String getContainerVolume() {
        return this.containerVolume;
    }

}
