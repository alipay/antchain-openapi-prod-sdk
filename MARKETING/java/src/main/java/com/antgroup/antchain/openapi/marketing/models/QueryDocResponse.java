// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class QueryDocResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 内部id
    @NameInMap("id")
    public Long id;

    // 文档id
    @NameInMap("doc_id")
    public String docId;

    // 文档标题
    @NameInMap("title")
    public String title;

    // 站点
    @NameInMap("site")
    public String site;

    // 语言code
    @NameInMap("language")
    public String language;

    // 内容
    @NameInMap("content")
    public String content;

    // 类型
    @NameInMap("source_type")
    public Long sourceType;

    // 最后修改时间
    @NameInMap("ext_modified_time")
    public Long extModifiedTime;

    // 关键字
    @NameInMap("key_words")
    public String keyWords;

    // 显示类型
    @NameInMap("show_type")
    public Long showType;

    // 页面上下文
    @NameInMap("page_context")
    public java.util.List<PageContext> pageContext;

    // 内容对象
    // 
    // 
    @NameInMap("content_obj")
    public java.util.List<ContentObjVO> contentObj;

    public static QueryDocResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDocResponse self = new QueryDocResponse();
        return TeaModel.build(map, self);
    }

    public QueryDocResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDocResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDocResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDocResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryDocResponse setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public QueryDocResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryDocResponse setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

    public QueryDocResponse setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public QueryDocResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryDocResponse setSourceType(Long sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Long getSourceType() {
        return this.sourceType;
    }

    public QueryDocResponse setExtModifiedTime(Long extModifiedTime) {
        this.extModifiedTime = extModifiedTime;
        return this;
    }
    public Long getExtModifiedTime() {
        return this.extModifiedTime;
    }

    public QueryDocResponse setKeyWords(String keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public String getKeyWords() {
        return this.keyWords;
    }

    public QueryDocResponse setShowType(Long showType) {
        this.showType = showType;
        return this;
    }
    public Long getShowType() {
        return this.showType;
    }

    public QueryDocResponse setPageContext(java.util.List<PageContext> pageContext) {
        this.pageContext = pageContext;
        return this;
    }
    public java.util.List<PageContext> getPageContext() {
        return this.pageContext;
    }

    public QueryDocResponse setContentObj(java.util.List<ContentObjVO> contentObj) {
        this.contentObj = contentObj;
        return this;
    }
    public java.util.List<ContentObjVO> getContentObj() {
        return this.contentObj;
    }

}
