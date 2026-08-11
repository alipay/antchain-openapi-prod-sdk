// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryReportAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 报表类型
    @NameInMap("type")
    public String type;

    // dataList使用的 JSON 结构版本
    @NameInMap("schema_version")
    public String schemaVersion;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 是否存在下一页
    @NameInMap("has_next")
    public Boolean hasNext;

    // JSON 数据列表；每一项为一个合法 JSON 对象的序列化字符串；无数据时返回空列表
    @NameInMap("data_list")
    public String dataList;

    public static QueryReportAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReportAppResponse self = new QueryReportAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryReportAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryReportAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryReportAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryReportAppResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryReportAppResponse setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public QueryReportAppResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryReportAppResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryReportAppResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryReportAppResponse setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public QueryReportAppResponse setDataList(String dataList) {
        this.dataList = dataList;
        return this;
    }
    public String getDataList() {
        return this.dataList;
    }

}
