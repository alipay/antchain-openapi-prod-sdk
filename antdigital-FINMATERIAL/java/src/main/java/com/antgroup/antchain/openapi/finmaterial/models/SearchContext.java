// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class SearchContext extends TeaModel {
    // 原始搜索内容
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("origin_query")
    @Validation(required = true)
    public String originQuery;

    // 实际执行的搜索类型，当前为 web
    /**
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("search_type")
    @Validation(required = true)
    public String searchType;

    // 实际执行的 AI 上下文档位；当前为 auto，后续可返回 fast 或 pro
    /**
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("mode")
    @Validation(required = true)
    public String mode;

    public static SearchContext build(java.util.Map<String, ?> map) throws Exception {
        SearchContext self = new SearchContext();
        return TeaModel.build(map, self);
    }

    public SearchContext setOriginQuery(String originQuery) {
        this.originQuery = originQuery;
        return this;
    }
    public String getOriginQuery() {
        return this.originQuery;
    }

    public SearchContext setSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }
    public String getSearchType() {
        return this.searchType;
    }

    public SearchContext setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
