// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsPointCheckRespData extends TeaModel {
    // 图片是否有效，无效则需要提示重拍
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("valid")
    @Validation(required = true)
    public Boolean valid;

    public static BaiGoodsPointCheckRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsPointCheckRespData self = new BaiGoodsPointCheckRespData();
        return TeaModel.build(map, self);
    }

    public BaiGoodsPointCheckRespData setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

}
