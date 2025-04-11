// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class QueryIndexresearchBrandindexResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // index_data
    @NameInMap("index_data")
    public java.util.List<IndexData> indexData;

    public static QueryIndexresearchBrandindexResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndexresearchBrandindexResponse self = new QueryIndexresearchBrandindexResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndexresearchBrandindexResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndexresearchBrandindexResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndexresearchBrandindexResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndexresearchBrandindexResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public QueryIndexresearchBrandindexResponse setIndexData(java.util.List<IndexData> indexData) {
        this.indexData = indexData;
        return this;
    }
    public java.util.List<IndexData> getIndexData() {
        return this.indexData;
    }

}
