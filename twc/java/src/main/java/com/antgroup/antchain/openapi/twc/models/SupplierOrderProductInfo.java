// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierOrderProductInfo extends TeaModel {
    // 商品id
    /**
     * <strong>example:</strong>
     * <p>product_id_123</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商品采购单价，单位：毫厘
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 商品的sn信息
    /**
     * <strong>example:</strong>
     * <p>[&quot;sn1&quot;,&quot;sn2&quot;]</p>
     */
    @NameInMap("sn_list")
    @Validation(required = true)
    public java.util.List<String> snList;

    public static SupplierOrderProductInfo build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderProductInfo self = new SupplierOrderProductInfo();
        return TeaModel.build(map, self);
    }

    public SupplierOrderProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SupplierOrderProductInfo setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public SupplierOrderProductInfo setSnList(java.util.List<String> snList) {
        this.snList = snList;
        return this;
    }
    public java.util.List<String> getSnList() {
        return this.snList;
    }

}
