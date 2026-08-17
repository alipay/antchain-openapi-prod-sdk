// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class ToolUsage extends TeaModel {
    // 联网搜索调用次数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("web_search")
    @Validation(required = true)
    public Long webSearch;

    public static ToolUsage build(java.util.Map<String, ?> map) throws Exception {
        ToolUsage self = new ToolUsage();
        return TeaModel.build(map, self);
    }

    public ToolUsage setWebSearch(Long webSearch) {
        this.webSearch = webSearch;
        return this;
    }
    public Long getWebSearch() {
        return this.webSearch;
    }

}
