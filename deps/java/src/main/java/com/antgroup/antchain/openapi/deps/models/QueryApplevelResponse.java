// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryApplevelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用等级列表
    @NameInMap("app_levels")
    @Validation(required = true)
    public java.util.List<AppLevel> appLevels;

    // 当前页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Integer pageSize;

    // 资源总数
    @NameInMap("total_count")
    @Validation(required = true)
    public Integer totalCount;

    public static QueryApplevelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApplevelResponse self = new QueryApplevelResponse();
        return TeaModel.build(map, self);
    }

    public QueryApplevelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApplevelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApplevelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApplevelResponse setAppLevels(java.util.List<AppLevel> appLevels) {
        this.appLevels = appLevels;
        return this;
    }
    public java.util.List<AppLevel> getAppLevels() {
        return this.appLevels;
    }

    public QueryApplevelResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryApplevelResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryApplevelResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
