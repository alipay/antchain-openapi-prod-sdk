// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class IndustryDataItem extends TeaModel {
    // 行业数据标题
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("title")
    @Validation(required = true)
    public String title;

    // 行业数据类型及结构标识，用于确定 CardData 的字段结构
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 行业结构化数据，字段随 Type 定义
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    public static IndustryDataItem build(java.util.Map<String, ?> map) throws Exception {
        IndustryDataItem self = new IndustryDataItem();
        return TeaModel.build(map, self);
    }

    public IndustryDataItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public IndustryDataItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IndustryDataItem setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
