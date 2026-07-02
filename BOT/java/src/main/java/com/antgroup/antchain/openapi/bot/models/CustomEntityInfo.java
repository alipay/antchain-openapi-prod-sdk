// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CustomEntityInfo extends TeaModel {
    // 客户自定义实体类型，默认为JSSDK_ACCOUNT
    /**
     * <strong>example:</strong>
     * <p>JSSDK_ACCOUNT</p>
     */
    @NameInMap("customer_entity_type")
    @Validation(required = true)
    public String customerEntityType;

    // 客户自定义实体内容
    /**
     * <strong>example:</strong>
     * <p>{...}</p>
     */
    @NameInMap("customer_entity_content")
    @Validation(required = true)
    public String customerEntityContent;

    public static CustomEntityInfo build(java.util.Map<String, ?> map) throws Exception {
        CustomEntityInfo self = new CustomEntityInfo();
        return TeaModel.build(map, self);
    }

    public CustomEntityInfo setCustomerEntityType(String customerEntityType) {
        this.customerEntityType = customerEntityType;
        return this;
    }
    public String getCustomerEntityType() {
        return this.customerEntityType;
    }

    public CustomEntityInfo setCustomerEntityContent(String customerEntityContent) {
        this.customerEntityContent = customerEntityContent;
        return this;
    }
    public String getCustomerEntityContent() {
        return this.customerEntityContent;
    }

}
