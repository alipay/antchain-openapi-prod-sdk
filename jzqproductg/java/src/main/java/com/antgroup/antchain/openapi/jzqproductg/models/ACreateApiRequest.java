// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.jzqproductg.models;

import com.aliyun.tea.*;

public class ACreateApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 编号
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 请求时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 描述
    @NameInMap("desc")
    public String desc;

    // 请求人
    @NameInMap("operate")
    @Validation(required = true)
    public String operate;

    public static ACreateApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ACreateApiRequest self = new ACreateApiRequest();
        return TeaModel.build(map, self);
    }

    public ACreateApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ACreateApiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ACreateApiRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ACreateApiRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public ACreateApiRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ACreateApiRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

}
