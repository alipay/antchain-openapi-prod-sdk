// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VehicleContainerParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("action")
    public String action;

    // 集装箱ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_id")
    @Validation(required = true)
    public String containerId;

    // 箱号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_no")
    public String containerNo;

    // 封号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("seal_no")
    public String sealNo;

    public static VehicleContainerParam build(java.util.Map<String, ?> map) throws Exception {
        VehicleContainerParam self = new VehicleContainerParam();
        return TeaModel.build(map, self);
    }

    public VehicleContainerParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public VehicleContainerParam setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public VehicleContainerParam setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public VehicleContainerParam setSealNo(String sealNo) {
        this.sealNo = sealNo;
        return this;
    }
    public String getSealNo() {
        return this.sealNo;
    }

}
