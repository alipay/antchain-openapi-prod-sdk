// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CollectLabelRawContent extends TeaModel {
    // 1.设备端上报数据内容 2.与设备上报的数据一致，服务端不可修改 3.解析后需与DataModel匹配 4.映射 Label 对象结构化存储 5.转为JSON后如果是JSONObject 映射单个 Label 6.转为JSON后如果是JSONArray 映射多个 Label
    /**
     * <strong>example:</strong>
     * <p>XXXXX</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 数据模型ID 
    /**
     * <strong>example:</strong>
     * <p>001202103171566166669</p>
     */
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    public static CollectLabelRawContent build(java.util.Map<String, ?> map) throws Exception {
        CollectLabelRawContent self = new CollectLabelRawContent();
        return TeaModel.build(map, self);
    }

    public CollectLabelRawContent setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CollectLabelRawContent setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
