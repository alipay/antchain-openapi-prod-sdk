// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryKnowledgeCategorylibraryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库id
    @NameInMap("library_id")
    public String libraryId;

    // 知识库名称
    @NameInMap("library_name")
    public String libraryName;

    // 类目id
    @NameInMap("category_id")
    public String categoryId;

    public static QueryKnowledgeCategorylibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeCategorylibraryResponse self = new QueryKnowledgeCategorylibraryResponse();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeCategorylibraryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryKnowledgeCategorylibraryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryKnowledgeCategorylibraryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryKnowledgeCategorylibraryResponse setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public QueryKnowledgeCategorylibraryResponse setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public QueryKnowledgeCategorylibraryResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

}
