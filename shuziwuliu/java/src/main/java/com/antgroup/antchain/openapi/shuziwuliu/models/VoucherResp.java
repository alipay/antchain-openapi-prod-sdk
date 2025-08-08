// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VoucherResp extends TeaModel {
    // 消息
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("msg")
    @Validation(required = true, maxLength = 10)
    public String msg;

    public static VoucherResp build(java.util.Map<String, ?> map) throws Exception {
        VoucherResp self = new VoucherResp();
        return TeaModel.build(map, self);
    }

    public VoucherResp setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
