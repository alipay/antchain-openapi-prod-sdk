// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class CreateStructA extends TeaModel {
    // 超时时间
    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("timeouta")
    public String timeouta;

    public static CreateStructA build(java.util.Map<String, ?> map) throws Exception {
        CreateStructA self = new CreateStructA();
        return TeaModel.build(map, self);
    }

    public CreateStructA setTimeouta(String timeouta) {
        this.timeouta = timeouta;
        return this;
    }
    public String getTimeouta() {
        return this.timeouta;
    }

}
