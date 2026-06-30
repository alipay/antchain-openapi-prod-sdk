// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CarInfoVO extends TeaModel {
    // 车辆型号
    /**
     * <strong>example:</strong>
     * <p>E10R</p>
     */
    @NameInMap("car_model")
    @Validation(required = true)
    public String carModel;

    // 车辆颜色
    /**
     * <strong>example:</strong>
     * <p>红色</p>
     */
    @NameInMap("car_color")
    @Validation(required = true)
    public String carColor;

    // 车型编号
    /**
     * <strong>example:</strong>
     * <p>AAA470106</p>
     */
    @NameInMap("model_no")
    @Validation(required = true)
    public String modelNo;

    // 车架号
    /**
     * <strong>example:</strong>
     * <p>220922507905000</p>
     */
    @NameInMap("frame_no")
    @Validation(required = true)
    public String frameNo;

    // 设备ID
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF1020251009BE8B1B08855</p>
     */
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // tagId
    /**
     * <strong>example:</strong>
     * <p>4EA1FFFFFFFFFFFFFFFFFFFFE13D02862257</p>
     */
    @NameInMap("tag_id")
    @Validation(required = true)
    public String tagId;

    // 品牌ID
    /**
     * <strong>example:</strong>
     * <p>SAIGE</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 协议类型
    /**
     * <strong>example:</strong>
     * <p>ble</p>
     */
    @NameInMap("protocol_type")
    @Validation(required = true)
    public String protocolType;

    public static CarInfoVO build(java.util.Map<String, ?> map) throws Exception {
        CarInfoVO self = new CarInfoVO();
        return TeaModel.build(map, self);
    }

    public CarInfoVO setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }
    public String getCarModel() {
        return this.carModel;
    }

    public CarInfoVO setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }
    public String getCarColor() {
        return this.carColor;
    }

    public CarInfoVO setModelNo(String modelNo) {
        this.modelNo = modelNo;
        return this;
    }
    public String getModelNo() {
        return this.modelNo;
    }

    public CarInfoVO setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public CarInfoVO setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public CarInfoVO setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public CarInfoVO setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public CarInfoVO setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

}
