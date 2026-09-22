// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ListKgCompileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // 文档名称关键词
    @NameInMap("keyword")
    public String keyword;

    // 任务标签
    @NameInMap("task_tag")
    public String taskTag;

    // 页码(1起)
    @NameInMap("page")
    public Long page;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static ListKgCompileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKgCompileRequest self = new ListKgCompileRequest();
        return TeaModel.build(map, self);
    }

    public ListKgCompileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListKgCompileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListKgCompileRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public ListKgCompileRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListKgCompileRequest setTaskTag(String taskTag) {
        this.taskTag = taskTag;
        return this;
    }
    public String getTaskTag() {
        return this.taskTag;
    }

    public ListKgCompileRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListKgCompileRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
