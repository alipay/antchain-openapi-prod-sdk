// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class ProudctInfo extends TeaModel {
    // 商品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品图片链接列表
    @NameInMap("proudct_images")
    public java.util.List<String> proudctImages;

    // 商品描述
    @NameInMap("product_desc")
    public String productDesc;

    public static ProudctInfo build(java.util.Map<String, ?> map) throws Exception {
        ProudctInfo self = new ProudctInfo();
        return TeaModel.build(map, self);
    }

    public ProudctInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ProudctInfo setProudctImages(java.util.List<String> proudctImages) {
        this.proudctImages = proudctImages;
        return this;
    }
    public java.util.List<String> getProudctImages() {
        return this.proudctImages;
    }

    public ProudctInfo setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

}
