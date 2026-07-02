// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class WarehouseReqModel extends TeaModel {
    // 详细地址
    /**
     * <strong>example:</strong>
     * <p>北京海淀区</p>
     */
    @NameInMap("address")
    public String address;

    // 面积 平方米单位*1e4
    /**
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("area")
    public Long area;

    // 海拔 米单位*1e2
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("elevation")
    public Long elevation;

    // 仓库高度 米单位*1e2
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("height")
    public Long height;

    // 纬度 度数单位*1e9
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("latitude")
    public Long latitude;

    // 经度 度数单位*1e9
    /**
     * <strong>example:</strong>
     * <p>35000000000</p>
     */
    @NameInMap("longitude")
    public Long longitude;

    // 所在国家，中国
    /**
     * <strong>example:</strong>
     * <p>中国</p>
     */
    @NameInMap("nation")
    public String nation;

    // 其他信息
    /**
     * <strong>example:</strong>
     * <p>&quot;自定义&quot;</p>
     */
    @NameInMap("other_info")
    public String otherInfo;

    // 仓库状态, AVAILABLE, IN_USE, DELETED, 自定义
    /**
     * <strong>example:</strong>
     * <p>&quot;AVAILABLE&quot;</p>
     */
    @NameInMap("status")
    public String status;

    // 仓库类型
    /**
     * <strong>example:</strong>
     * <p>&quot;自定义&quot;</p>
     */
    @NameInMap("type")
    public String type;

    public static WarehouseReqModel build(java.util.Map<String, ?> map) throws Exception {
        WarehouseReqModel self = new WarehouseReqModel();
        return TeaModel.build(map, self);
    }

    public WarehouseReqModel setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public WarehouseReqModel setArea(Long area) {
        this.area = area;
        return this;
    }
    public Long getArea() {
        return this.area;
    }

    public WarehouseReqModel setElevation(Long elevation) {
        this.elevation = elevation;
        return this;
    }
    public Long getElevation() {
        return this.elevation;
    }

    public WarehouseReqModel setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public WarehouseReqModel setLatitude(Long latitude) {
        this.latitude = latitude;
        return this;
    }
    public Long getLatitude() {
        return this.latitude;
    }

    public WarehouseReqModel setLongitude(Long longitude) {
        this.longitude = longitude;
        return this;
    }
    public Long getLongitude() {
        return this.longitude;
    }

    public WarehouseReqModel setNation(String nation) {
        this.nation = nation;
        return this;
    }
    public String getNation() {
        return this.nation;
    }

    public WarehouseReqModel setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
        return this;
    }
    public String getOtherInfo() {
        return this.otherInfo;
    }

    public WarehouseReqModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WarehouseReqModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
