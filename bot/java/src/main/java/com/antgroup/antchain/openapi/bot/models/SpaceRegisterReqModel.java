// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SpaceRegisterReqModel extends TeaModel {
    // 面积 平方米单位*1e4	
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("area")
    public Long area;

    // 自定义业务类型，例如选择：危险品/非危险品/食品
    /**
     * <strong>example:</strong>
     * <p>&quot;biz_type&quot;</p>
     */
    @NameInMap("biz_type")
    public String bizType;

    // 海拔 米单位*1e2
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("elevation")
    public Long elevation;

    // 高度 米单位*1e2	
    /**
     * <strong>example:</strong>
     * <p>123</p>
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

    // 自定义其他字段
    /**
     * <strong>example:</strong>
     * <p>&quot;自定义&quot;</p>
     */
    @NameInMap("other_info")
    public String otherInfo;

    // 父类型，在业务中自定义关联，例如仓位的父节点是仓库
    /**
     * <strong>example:</strong>
     * <p>“did:iot:xxxx”</p>
     */
    @NameInMap("parent_did")
    public String parentDid;

    // 可填入符合w3c did定义的服务节点
    /**
     * <strong>example:</strong>
     * <p>&quot;xxxx&quot;</p>
     */
    @NameInMap("service_endpoint")
    public String serviceEndpoint;

    // 空间状态，自定义	
    /**
     * <strong>example:</strong>
     * <p>&quot;IN_USE&quot;</p>
     */
    @NameInMap("status")
    public String status;

    // 空间类型，例如冷藏/冷冻/通道/平面/立体	
    /**
     * <strong>example:</strong>
     * <p>“平面“</p>
     */
    @NameInMap("type")
    public String type;

    public static SpaceRegisterReqModel build(java.util.Map<String, ?> map) throws Exception {
        SpaceRegisterReqModel self = new SpaceRegisterReqModel();
        return TeaModel.build(map, self);
    }

    public SpaceRegisterReqModel setArea(Long area) {
        this.area = area;
        return this;
    }
    public Long getArea() {
        return this.area;
    }

    public SpaceRegisterReqModel setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SpaceRegisterReqModel setElevation(Long elevation) {
        this.elevation = elevation;
        return this;
    }
    public Long getElevation() {
        return this.elevation;
    }

    public SpaceRegisterReqModel setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public SpaceRegisterReqModel setLatitude(Long latitude) {
        this.latitude = latitude;
        return this;
    }
    public Long getLatitude() {
        return this.latitude;
    }

    public SpaceRegisterReqModel setLongitude(Long longitude) {
        this.longitude = longitude;
        return this;
    }
    public Long getLongitude() {
        return this.longitude;
    }

    public SpaceRegisterReqModel setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
        return this;
    }
    public String getOtherInfo() {
        return this.otherInfo;
    }

    public SpaceRegisterReqModel setParentDid(String parentDid) {
        this.parentDid = parentDid;
        return this;
    }
    public String getParentDid() {
        return this.parentDid;
    }

    public SpaceRegisterReqModel setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    public SpaceRegisterReqModel setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SpaceRegisterReqModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
