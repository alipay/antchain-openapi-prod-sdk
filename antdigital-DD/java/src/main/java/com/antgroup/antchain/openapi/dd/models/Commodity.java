// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class Commodity extends TeaModel {
    // 商品编码
    /**
     * <strong>example:</strong>
     * <p>KKAASP00000001</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品状态
    /**
     * <strong>example:</strong>
     * <p>ONLINE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static Commodity build(java.util.Map<String, ?> map) throws Exception {
        Commodity self = new Commodity();
        return TeaModel.build(map, self);
    }

    public Commodity setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Commodity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Commodity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
