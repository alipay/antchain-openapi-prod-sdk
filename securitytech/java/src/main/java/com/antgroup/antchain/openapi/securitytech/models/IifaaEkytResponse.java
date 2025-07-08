// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class IifaaEkytResponse extends TeaModel {
    // 响应头
    @NameInMap("head")
    @Validation(required = true)
    public ResponseHead head;

    // 业务响应结果
    /**
     * <strong>example:</strong>
     * <p>126dncnceicncwuiooo</p>
     */
    @NameInMap("biz_res")
    @Validation(required = true)
    public String bizRes;

    public static IifaaEkytResponse build(java.util.Map<String, ?> map) throws Exception {
        IifaaEkytResponse self = new IifaaEkytResponse();
        return TeaModel.build(map, self);
    }

    public IifaaEkytResponse setHead(ResponseHead head) {
        this.head = head;
        return this;
    }
    public ResponseHead getHead() {
        return this.head;
    }

    public IifaaEkytResponse setBizRes(String bizRes) {
        this.bizRes = bizRes;
        return this;
    }
    public String getBizRes() {
        return this.bizRes;
    }

}
