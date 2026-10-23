// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAppmarketCommondataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实际返回的实体编码
    @NameInMap("entity_code")
    public String entityCode;

    // 实际返回的结构版本
    @NameInMap("schema_version")
    public String schemaVersion;

    // JSON 数组字符串；即使无数据也返回 []，不要配置成 ARRAY / OBJECT
    @NameInMap("data_json")
    public String dataJson;

    // JSON 对象字符串，放数据范围、口径、溯源等元信息
    @NameInMap("meta_json")
    public String metaJson;

    // 满足条件的总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 实际页码
    @NameInMap("page_no")
    public Long pageNo;

    // 实际每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryAppmarketCommondataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppmarketCommondataResponse self = new QueryAppmarketCommondataResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppmarketCommondataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppmarketCommondataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppmarketCommondataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppmarketCommondataResponse setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        return this;
    }
    public String getEntityCode() {
        return this.entityCode;
    }

    public QueryAppmarketCommondataResponse setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public QueryAppmarketCommondataResponse setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public QueryAppmarketCommondataResponse setMetaJson(String metaJson) {
        this.metaJson = metaJson;
        return this;
    }
    public String getMetaJson() {
        return this.metaJson;
    }

    public QueryAppmarketCommondataResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAppmarketCommondataResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAppmarketCommondataResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
