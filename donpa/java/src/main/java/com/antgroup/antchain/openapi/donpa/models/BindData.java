// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class BindData extends TeaModel {
    // 虚拟小号（实际拨打以返回的 telX 为主）
    @NameInMap("tel_x")
    @Validation(required = true)
    public String telX;

    // 该次绑定唯一 id
    @NameInMap("bind_id")
    @Validation(required = true)
    public String bindId;

    public static BindData build(java.util.Map<String, ?> map) throws Exception {
        BindData self = new BindData();
        return TeaModel.build(map, self);
    }

    public BindData setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindData setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

}
