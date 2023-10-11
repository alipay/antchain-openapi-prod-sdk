// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class OrderGoodsModel extends TeaModel {
    // 商品 id
    @NameInMap("product_id")
    @Validation(required = true, maxLength = 50)
    public String productId;

    // 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
    @NameInMap("product_version")
    @Validation(required = true)
    public Long productVersion;

    // 商品名称
    @NameInMap("product_name")
    @Validation(required = true, maxLength = 50)
    public String productName;

    // 商品价格,精确到分，即 1234 表示 12.34 元
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 商品(3C产品)的设备 id
    @NameInMap("product_imei_id")
    @Validation(required = true, maxLength = 200)
    public String productImeiId;

    // 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
    @NameInMap("supplier_id")
    @Validation(required = true, maxLength = 50)
    public String supplierId;

    // 商品数量，不能为空，且大于 0
    @NameInMap("product_number")
    @Validation(required = true)
    public Long productNumber;

    public static OrderGoodsModel build(java.util.Map<String, ?> map) throws Exception {
        OrderGoodsModel self = new OrderGoodsModel();
        return TeaModel.build(map, self);
    }

    public OrderGoodsModel setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderGoodsModel setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public Long getProductVersion() {
        return this.productVersion;
    }

    public OrderGoodsModel setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public OrderGoodsModel setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public OrderGoodsModel setProductImeiId(String productImeiId) {
        this.productImeiId = productImeiId;
        return this;
    }
    public String getProductImeiId() {
        return this.productImeiId;
    }

    public OrderGoodsModel setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public OrderGoodsModel setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
        return this;
    }
    public Long getProductNumber() {
        return this.productNumber;
    }

}
