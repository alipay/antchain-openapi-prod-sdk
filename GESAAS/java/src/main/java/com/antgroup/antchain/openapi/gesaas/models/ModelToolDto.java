// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class ModelToolDto extends TeaModel {
    // 指定使用的工具类型。
    // 枚举值：
    // + web_search（联网搜索工具。开启联网搜索后，模型会根据用户的提示词自主判断是否搜索互联网内容（如商品、天气等）。可提升生成视频的时效性，但也会增加一定的时延）0
    /**
     * <strong>example:</strong>
     * <p>web_search</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static ModelToolDto build(java.util.Map<String, ?> map) throws Exception {
        ModelToolDto self = new ModelToolDto();
        return TeaModel.build(map, self);
    }

    public ModelToolDto setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
