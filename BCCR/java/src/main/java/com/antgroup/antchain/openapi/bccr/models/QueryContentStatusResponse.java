// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryContentStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 视频内容id
    @NameInMap("content_id")
    public String contentId;

    // 视频状态
    @NameInMap("status")
    public String status;

    // 内容标题
    @NameInMap("title")
    public String title;

    // 内容类型
    @NameInMap("type")
    public String type;

    // 标签列表
    @NameInMap("keywords")
    public java.util.List<String> keywords;

    // 内容描述
    @NameInMap("description")
    public String description;

    // 内容封面文件地址
    @NameInMap("cover_url")
    public String coverUrl;

    // 存证id
    @NameInMap("register_id")
    public String registerId;

    // 内容授权合同文件地址
    @NameInMap("auth_pdf_url")
    public String authPdfUrl;

    // 播放列表名称
    @NameInMap("play_list_name")
    public String playListName;

    public static QueryContentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContentStatusResponse self = new QueryContentStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryContentStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContentStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContentStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContentStatusResponse setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public QueryContentStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContentStatusResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryContentStatusResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryContentStatusResponse setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public QueryContentStatusResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryContentStatusResponse setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
        return this;
    }
    public String getCoverUrl() {
        return this.coverUrl;
    }

    public QueryContentStatusResponse setRegisterId(String registerId) {
        this.registerId = registerId;
        return this;
    }
    public String getRegisterId() {
        return this.registerId;
    }

    public QueryContentStatusResponse setAuthPdfUrl(String authPdfUrl) {
        this.authPdfUrl = authPdfUrl;
        return this;
    }
    public String getAuthPdfUrl() {
        return this.authPdfUrl;
    }

    public QueryContentStatusResponse setPlayListName(String playListName) {
        this.playListName = playListName;
        return this;
    }
    public String getPlayListName() {
        return this.playListName;
    }

}
