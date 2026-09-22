// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class QueryKmKnowledgelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 知识库datalist
    @NameInMap("datalist")
    public TreeDetailResponse datalist;

    // 总数据量
    @NameInMap("totalrecords")
    public Long totalrecords;

    // 知识库树列表JSON数组(元素字段见语雀文档)
    @NameInMap("trees")
    public String trees;

    public static QueryKmKnowledgelistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryKmKnowledgelistResponse self = new QueryKmKnowledgelistResponse();
        return TeaModel.build(map, self);
    }

    public QueryKmKnowledgelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryKmKnowledgelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryKmKnowledgelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryKmKnowledgelistResponse setDatalist(TreeDetailResponse datalist) {
        this.datalist = datalist;
        return this;
    }
    public TreeDetailResponse getDatalist() {
        return this.datalist;
    }

    public QueryKmKnowledgelistResponse setTotalrecords(Long totalrecords) {
        this.totalrecords = totalrecords;
        return this;
    }
    public Long getTotalrecords() {
        return this.totalrecords;
    }

    public QueryKmKnowledgelistResponse setTrees(String trees) {
        this.trees = trees;
        return this;
    }
    public String getTrees() {
        return this.trees;
    }

}
