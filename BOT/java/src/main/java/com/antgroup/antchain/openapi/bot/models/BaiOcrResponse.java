// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiOcrResponse extends TeaModel {
    // 返回的结果体
    /**
     * <strong>example:</strong>
     * <p>{&quot;backResult&quot;:{&quot;issue&quot;:&quot;XXXX&quot;,&quot;endDate&quot;:&quot;20231010&quot;,&quot;startDate&quot;:&quot;20131010&quot;}}</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static BaiOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        BaiOcrResponse self = new BaiOcrResponse();
        return TeaModel.build(map, self);
    }

    public BaiOcrResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
