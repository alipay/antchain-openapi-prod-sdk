// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderProductInfo extends TeaModel {
    // 商品编码
    /**
     * <strong>example:</strong>
     * <p>123456789012446</p>
     */
    @NameInMap("product_id")
    public String productId;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>苹果手机</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("product_number")
    public Long productNumber;

    public static OrderProductInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderProductInfo self = new OrderProductInfo();
        return TeaModel.build(map, self);
    }

    public OrderProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public OrderProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public OrderProductInfo setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
        return this;
    }
    public Long getProductNumber() {
        return this.productNumber;
    }

}
