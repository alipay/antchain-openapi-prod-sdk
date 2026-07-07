// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class TransportActiveData extends TeaModel {
    // 运输方式编码
    /**
     * <strong>example:</strong>
     * <p>5201000000</p>
     */
    @NameInMap("transport_code")
    @Validation(required = true)
    public String transportCode;

    // 运输设备
    /**
     * <strong>example:</strong>
     * <p>KCTC</p>
     */
    @NameInMap("equipment")
    @Validation(required = true)
    public String equipment;

    // 运输里程
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("distance")
    @Validation(required = true)
    public String distance;

    // 是否空载
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_empty_load")
    public Boolean isEmptyLoad;

    public static TransportActiveData build(java.util.Map<String, ?> map) throws Exception {
        TransportActiveData self = new TransportActiveData();
        return TeaModel.build(map, self);
    }

    public TransportActiveData setTransportCode(String transportCode) {
        this.transportCode = transportCode;
        return this;
    }
    public String getTransportCode() {
        return this.transportCode;
    }

    public TransportActiveData setEquipment(String equipment) {
        this.equipment = equipment;
        return this;
    }
    public String getEquipment() {
        return this.equipment;
    }

    public TransportActiveData setDistance(String distance) {
        this.distance = distance;
        return this;
    }
    public String getDistance() {
        return this.distance;
    }

    public TransportActiveData setIsEmptyLoad(Boolean isEmptyLoad) {
        this.isEmptyLoad = isEmptyLoad;
        return this;
    }
    public Boolean getIsEmptyLoad() {
        return this.isEmptyLoad;
    }

}
