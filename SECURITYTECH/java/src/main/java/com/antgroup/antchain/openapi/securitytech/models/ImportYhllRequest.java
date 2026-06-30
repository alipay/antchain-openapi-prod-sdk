// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ImportYhllRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // shopUuid
    @NameInMap("shop_uuid")
    @Validation(required = true)
    public String shopUuid;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 任务类型
    @NameInMap("good_type")
    @Validation(required = true)
    public String goodType;

    // 模板名
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 行业
    @NameInMap("industry")
    @Validation(required = true)
    public String industry;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 城市代码
    @NameInMap("city_code")
    @Validation(required = true)
    public String cityCode;

    // 经度
    @NameInMap("longitude")
    public String longitude;

    // 纬度
    @NameInMap("latitude")
    public String latitude;

    // 坐标范围
    @NameInMap("coordinate_range")
    public String coordinateRange;

    // 总量
    @NameInMap("total")
    @Validation(required = true)
    public Long total;

    // 模板替换符
    @NameInMap("place_holder")
    public String placeHolder;

    // 补充信息
    @NameInMap("ext_info")
    public String extInfo;

    public static ImportYhllRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportYhllRequest self = new ImportYhllRequest();
        return TeaModel.build(map, self);
    }

    public ImportYhllRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportYhllRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportYhllRequest setShopUuid(String shopUuid) {
        this.shopUuid = shopUuid;
        return this;
    }
    public String getShopUuid() {
        return this.shopUuid;
    }

    public ImportYhllRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportYhllRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ImportYhllRequest setGoodType(String goodType) {
        this.goodType = goodType;
        return this;
    }
    public String getGoodType() {
        return this.goodType;
    }

    public ImportYhllRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ImportYhllRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public ImportYhllRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ImportYhllRequest setCityCode(String cityCode) {
        this.cityCode = cityCode;
        return this;
    }
    public String getCityCode() {
        return this.cityCode;
    }

    public ImportYhllRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public ImportYhllRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public ImportYhllRequest setCoordinateRange(String coordinateRange) {
        this.coordinateRange = coordinateRange;
        return this;
    }
    public String getCoordinateRange() {
        return this.coordinateRange;
    }

    public ImportYhllRequest setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ImportYhllRequest setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
        return this;
    }
    public String getPlaceHolder() {
        return this.placeHolder;
    }

    public ImportYhllRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
