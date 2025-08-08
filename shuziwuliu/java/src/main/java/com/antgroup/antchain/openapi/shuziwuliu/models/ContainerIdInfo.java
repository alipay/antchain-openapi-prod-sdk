// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ContainerIdInfo extends TeaModel {
    // 箱子唯一标识
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_id")
    public String containerId;

    // 箱号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_no")
    public String containerNo;

    public static ContainerIdInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerIdInfo self = new ContainerIdInfo();
        return TeaModel.build(map, self);
    }

    public ContainerIdInfo setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ContainerIdInfo setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

}
