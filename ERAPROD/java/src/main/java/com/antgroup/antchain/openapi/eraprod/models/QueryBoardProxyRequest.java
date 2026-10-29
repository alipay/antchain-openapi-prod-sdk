// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class QueryBoardProxyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 关键字
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // boardId
    @NameInMap("board_id")
    @Validation(required = true)
    public String boardId;

    // 返回条数
    @NameInMap("top_n")
    public Long topN;

    public static QueryBoardProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBoardProxyRequest self = new QueryBoardProxyRequest();
        return TeaModel.build(map, self);
    }

    public QueryBoardProxyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBoardProxyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBoardProxyRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryBoardProxyRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

    public QueryBoardProxyRequest setTopN(Long topN) {
        this.topN = topN;
        return this;
    }
    public Long getTopN() {
        return this.topN;
    }

}
