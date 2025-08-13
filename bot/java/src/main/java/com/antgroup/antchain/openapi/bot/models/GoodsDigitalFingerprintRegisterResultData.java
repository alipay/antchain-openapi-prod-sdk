// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintRegisterResultData extends TeaModel {
    // 指纹图片入库是否成功
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 失败原因
    /**
     * <strong>example:</strong>
     * <p>describe</p>
     */
    @NameInMap("describe")
    public String describe;

    public static GoodsDigitalFingerprintRegisterResultData build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintRegisterResultData self = new GoodsDigitalFingerprintRegisterResultData();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintRegisterResultData setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GoodsDigitalFingerprintRegisterResultData setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

}
