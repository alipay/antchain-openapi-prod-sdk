// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class RecallDataDetail extends TeaModel {
    // 文件名
    /**
     * <strong>example:</strong>
     * <p>浙江省电力交易细则</p>
     */
    @NameInMap("docname")
    public String docname;

    // 片段内容
    /**
     * <strong>example:</strong>
     * <p>浙江省交易细则</p>
     */
    @NameInMap("content")
    public String content;

    // 重排得分
    /**
     * <strong>example:</strong>
     * <p>1.2</p>
     */
    @NameInMap("rerankscore")
    public Long rerankscore;

    // 重排位次
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rerankrank")
    public Long rerankrank;

    // 综合得分
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("score")
    public Long score;

    // chunk标题
    /**
     * <strong>example:</strong>
     * <p>浙江省交易细则</p>
     */
    @NameInMap("title")
    public String title;

    // 知识库id
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("knowledgebaseids")
    public String knowledgebaseids;

    // official 官方知识库、custom个人知识库
    /**
     * <strong>example:</strong>
     * <p>official</p>
     */
    @NameInMap("knowledgebasetag")
    public String knowledgebasetag;

    public static RecallDataDetail build(java.util.Map<String, ?> map) throws Exception {
        RecallDataDetail self = new RecallDataDetail();
        return TeaModel.build(map, self);
    }

    public RecallDataDetail setDocname(String docname) {
        this.docname = docname;
        return this;
    }
    public String getDocname() {
        return this.docname;
    }

    public RecallDataDetail setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RecallDataDetail setRerankscore(Long rerankscore) {
        this.rerankscore = rerankscore;
        return this;
    }
    public Long getRerankscore() {
        return this.rerankscore;
    }

    public RecallDataDetail setRerankrank(Long rerankrank) {
        this.rerankrank = rerankrank;
        return this;
    }
    public Long getRerankrank() {
        return this.rerankrank;
    }

    public RecallDataDetail setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public RecallDataDetail setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RecallDataDetail setKnowledgebaseids(String knowledgebaseids) {
        this.knowledgebaseids = knowledgebaseids;
        return this;
    }
    public String getKnowledgebaseids() {
        return this.knowledgebaseids;
    }

    public RecallDataDetail setKnowledgebasetag(String knowledgebasetag) {
        this.knowledgebasetag = knowledgebasetag;
        return this;
    }
    public String getKnowledgebasetag() {
        return this.knowledgebasetag;
    }

}
