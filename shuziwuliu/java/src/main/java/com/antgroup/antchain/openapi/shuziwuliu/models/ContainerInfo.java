// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ContainerInfo extends TeaModel {
    // 订舱单唯一标识
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    public String bookingNo;

    // 集装箱唯一标识
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

    // 箱型
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_type")
    public String containerType;

    public static ContainerInfo build(java.util.Map<String, ?> map) throws Exception {
        ContainerInfo self = new ContainerInfo();
        return TeaModel.build(map, self);
    }

    public ContainerInfo setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public ContainerInfo setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public ContainerInfo setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public ContainerInfo setContainerType(String containerType) {
        this.containerType = containerType;
        return this;
    }
    public String getContainerType() {
        return this.containerType;
    }

}
