// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryElectricCommondataResponse extends TeaModel {
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

    // 实际返回的实体结构版本
    @NameInMap("schema_version")
    public String schemaVersion;

    // JSON数组字符串；成功但无数据时为 []
    @NameInMap("data_json")
    public String dataJson;

    // 完整性、覆盖范围和来源等元数据
    @NameInMap("meta_json")
    public String metaJson;

    // 符合条件的总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页码
    @NameInMap("page_no")
    public Long pageNo;

    // 当前分页大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryElectricCommondataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectricCommondataResponse self = new QueryElectricCommondataResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectricCommondataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectricCommondataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectricCommondataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectricCommondataResponse setEntityCode(String entityCode) {
        this.entityCode = entityCode;
        return this;
    }
    public String getEntityCode() {
        return this.entityCode;
    }

    public QueryElectricCommondataResponse setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public QueryElectricCommondataResponse setDataJson(String dataJson) {
        this.dataJson = dataJson;
        return this;
    }
    public String getDataJson() {
        return this.dataJson;
    }

    public QueryElectricCommondataResponse setMetaJson(String metaJson) {
        this.metaJson = metaJson;
        return this;
    }
    public String getMetaJson() {
        return this.metaJson;
    }

    public QueryElectricCommondataResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryElectricCommondataResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryElectricCommondataResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
