// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryEnergyknowledgeRagrecallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件名
    @NameInMap("docname")
    public String docname;

    // 片段内容
    @NameInMap("content")
    public String content;

    // 重排得分
    @NameInMap("rerankscore")
    public Long rerankscore;

    // 重排位次
    @NameInMap("rerankrank")
    public Long rerankrank;

    // 综合得分
    @NameInMap("score")
    public Long score;

    // chunk标题
    @NameInMap("title")
    public String title;

    // 知识库id
    @NameInMap("knowledgebaseids")
    public String knowledgebaseids;

    // official 官方知识库、custom个人知识库
    @NameInMap("knowledgebasetag")
    public String knowledgebasetag;

    public static QueryEnergyknowledgeRagrecallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnergyknowledgeRagrecallResponse self = new QueryEnergyknowledgeRagrecallResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnergyknowledgeRagrecallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnergyknowledgeRagrecallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnergyknowledgeRagrecallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnergyknowledgeRagrecallResponse setDocname(String docname) {
        this.docname = docname;
        return this;
    }
    public String getDocname() {
        return this.docname;
    }

    public QueryEnergyknowledgeRagrecallResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryEnergyknowledgeRagrecallResponse setRerankscore(Long rerankscore) {
        this.rerankscore = rerankscore;
        return this;
    }
    public Long getRerankscore() {
        return this.rerankscore;
    }

    public QueryEnergyknowledgeRagrecallResponse setRerankrank(Long rerankrank) {
        this.rerankrank = rerankrank;
        return this;
    }
    public Long getRerankrank() {
        return this.rerankrank;
    }

    public QueryEnergyknowledgeRagrecallResponse setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public QueryEnergyknowledgeRagrecallResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryEnergyknowledgeRagrecallResponse setKnowledgebaseids(String knowledgebaseids) {
        this.knowledgebaseids = knowledgebaseids;
        return this;
    }
    public String getKnowledgebaseids() {
        return this.knowledgebaseids;
    }

    public QueryEnergyknowledgeRagrecallResponse setKnowledgebasetag(String knowledgebasetag) {
        this.knowledgebasetag = knowledgebasetag;
        return this;
    }
    public String getKnowledgebasetag() {
        return this.knowledgebasetag;
    }

}
