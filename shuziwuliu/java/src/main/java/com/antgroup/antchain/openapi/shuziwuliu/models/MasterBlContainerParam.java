// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class MasterBlContainerParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 集装箱ID
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // 箱号
    @NameInMap("container_no")
    public String containerNo;

    public static MasterBlContainerParam build(java.util.Map<String, ?> map) throws Exception {
        MasterBlContainerParam self = new MasterBlContainerParam();
        return TeaModel.build(map, self);
    }

    public MasterBlContainerParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public MasterBlContainerParam setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public MasterBlContainerParam setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

}
