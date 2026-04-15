// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class GroupAClass extends TeaModel {
    // -
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 防伪码类型
    /**
     * <strong>example:</strong>
     * <p>103001</p>
     */
    @NameInMap("code_type")
    @Validation(required = true)
    public String codeType;

    // 防伪码码值
    /**
     * <strong>example:</strong>
     * <p>600011111</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    public static GroupAClass build(java.util.Map<String, ?> map) throws Exception {
        GroupAClass self = new GroupAClass();
        return TeaModel.build(map, self);
    }

    public GroupAClass setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GroupAClass setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public GroupAClass setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
