// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerFunddividerelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据总量
    @NameInMap("total_size")
    public Long totalSize;

    // 分账关系页对象列表
    @NameInMap("relations")
    public java.util.List<RelationPage> relations;

    public static PagequeryInnerFunddividerelationResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerFunddividerelationResponse self = new PagequeryInnerFunddividerelationResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerFunddividerelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerFunddividerelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerFunddividerelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerFunddividerelationResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PagequeryInnerFunddividerelationResponse setRelations(java.util.List<RelationPage> relations) {
        this.relations = relations;
        return this;
    }
    public java.util.List<RelationPage> getRelations() {
        return this.relations;
    }

}
