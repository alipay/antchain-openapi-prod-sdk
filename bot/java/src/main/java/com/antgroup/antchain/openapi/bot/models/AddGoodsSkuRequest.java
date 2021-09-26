// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddGoodsSkuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // GoodsTypeEnum,商品一级类目
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 商品二级类目
    @NameInMap("second_type")
    @Validation(required = true)
    public String secondType;

    // 商品品牌
    @NameInMap("brand")
    @Validation(required = true)
    public String brand;

    // 商品名称，型号
    @NameInMap("model")
    @Validation(required = true)
    public String model;

    // 市场价
    @NameInMap("market_price")
    @Validation(required = true)
    public Long marketPrice;

    // 手机型号信息
    @NameInMap("phone_info")
    public PhoneInfo phoneInfo;

    // 电脑型号信息
    @NameInMap("computer_info")
    public ComputerInfo computerInfo;

    public static AddGoodsSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGoodsSkuRequest self = new AddGoodsSkuRequest();
        return TeaModel.build(map, self);
    }

    public AddGoodsSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddGoodsSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddGoodsSkuRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddGoodsSkuRequest setSecondType(String secondType) {
        this.secondType = secondType;
        return this;
    }
    public String getSecondType() {
        return this.secondType;
    }

    public AddGoodsSkuRequest setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    public String getBrand() {
        return this.brand;
    }

    public AddGoodsSkuRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AddGoodsSkuRequest setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }
    public Long getMarketPrice() {
        return this.marketPrice;
    }

    public AddGoodsSkuRequest setPhoneInfo(PhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
    public PhoneInfo getPhoneInfo() {
        return this.phoneInfo;
    }

    public AddGoodsSkuRequest setComputerInfo(ComputerInfo computerInfo) {
        this.computerInfo = computerInfo;
        return this;
    }
    public ComputerInfo getComputerInfo() {
        return this.computerInfo;
    }

}
