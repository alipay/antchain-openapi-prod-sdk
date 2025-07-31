// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerKnowledgecategorylibraryResponse extends TeaModel {
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
    // 
    @NameInMap("library_id")
    public String libraryId;

    // 123123
    @NameInMap("library_name")
    public String libraryName;

    // 类目id
    // 
    @NameInMap("category_id")
    public String categoryId;

    // 知识点总条数
    @NameInMap("total")
    public Long total;

    public static QueryInnerKnowledgecategorylibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerKnowledgecategorylibraryResponse self = new QueryInnerKnowledgecategorylibraryResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerKnowledgecategorylibraryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerKnowledgecategorylibraryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerKnowledgecategorylibraryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerKnowledgecategorylibraryResponse setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public QueryInnerKnowledgecategorylibraryResponse setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public QueryInnerKnowledgecategorylibraryResponse setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public QueryInnerKnowledgecategorylibraryResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
