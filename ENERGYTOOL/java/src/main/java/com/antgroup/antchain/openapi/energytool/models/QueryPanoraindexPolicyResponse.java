// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryPanoraindexPolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 唯一主键
    @NameInMap("id")
    public Long id;

    // 标题
    @NameInMap("title")
    public String title;

    // 政策正文内容
    @NameInMap("content")
    public String content;

    // 附件list详情
    @NameInMap("attachmentdatalist")
    public java.util.List<EpiAdmEnergyPolicyAttachment> attachmentdatalist;

    // 原文链接
    @NameInMap("sourceurl")
    public String sourceurl;

    // 政策发布日期
    @NameInMap("releasedate")
    public String releasedate;

    // 披露主体
    @NameInMap("issuingbody")
    public String issuingbody;

    // 政策对应的区域
    @NameInMap("region")
    public String region;

    // 政策分类
    @NameInMap("category")
    public String category;

    // 政策文号
    @NameInMap("policynumber")
    public String policynumber;

    // 来源网站Code码
    @NameInMap("websitecode")
    public String websitecode;

    // 来源网站名称
    @NameInMap("websitename")
    public String websitename;

    public static QueryPanoraindexPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPanoraindexPolicyResponse self = new QueryPanoraindexPolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryPanoraindexPolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPanoraindexPolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPanoraindexPolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPanoraindexPolicyResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryPanoraindexPolicyResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryPanoraindexPolicyResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryPanoraindexPolicyResponse setAttachmentdatalist(java.util.List<EpiAdmEnergyPolicyAttachment> attachmentdatalist) {
        this.attachmentdatalist = attachmentdatalist;
        return this;
    }
    public java.util.List<EpiAdmEnergyPolicyAttachment> getAttachmentdatalist() {
        return this.attachmentdatalist;
    }

    public QueryPanoraindexPolicyResponse setSourceurl(String sourceurl) {
        this.sourceurl = sourceurl;
        return this;
    }
    public String getSourceurl() {
        return this.sourceurl;
    }

    public QueryPanoraindexPolicyResponse setReleasedate(String releasedate) {
        this.releasedate = releasedate;
        return this;
    }
    public String getReleasedate() {
        return this.releasedate;
    }

    public QueryPanoraindexPolicyResponse setIssuingbody(String issuingbody) {
        this.issuingbody = issuingbody;
        return this;
    }
    public String getIssuingbody() {
        return this.issuingbody;
    }

    public QueryPanoraindexPolicyResponse setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public QueryPanoraindexPolicyResponse setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public QueryPanoraindexPolicyResponse setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
        return this;
    }
    public String getPolicynumber() {
        return this.policynumber;
    }

    public QueryPanoraindexPolicyResponse setWebsitecode(String websitecode) {
        this.websitecode = websitecode;
        return this;
    }
    public String getWebsitecode() {
        return this.websitecode;
    }

    public QueryPanoraindexPolicyResponse setWebsitename(String websitename) {
        this.websitename = websitename;
        return this;
    }
    public String getWebsitename() {
        return this.websitename;
    }

}
