// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeComparisonResponse extends TeaModel {
    // 返回的结果
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static BaiQrcodeComparisonResponse build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeComparisonResponse self = new BaiQrcodeComparisonResponse();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeComparisonResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
