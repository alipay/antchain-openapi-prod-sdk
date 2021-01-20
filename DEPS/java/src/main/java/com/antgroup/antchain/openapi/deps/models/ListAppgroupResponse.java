// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListAppgroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用名称列表
    @NameInMap("app_groups")
    public java.util.List<AppGroup> appGroups;

    // 当前页码
    @NameInMap("page_num")
    public Integer pageNum;

    // 分页大小
    @NameInMap("page_size")
    public Integer pageSize;

    // 应用总数
    @NameInMap("total_count")
    public Integer totalCount;

    public static ListAppgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppgroupResponse self = new ListAppgroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAppgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppgroupResponse setAppGroups(java.util.List<AppGroup> appGroups) {
        this.appGroups = appGroups;
        return this;
    }
    public java.util.List<AppGroup> getAppGroups() {
        return this.appGroups;
    }

    public ListAppgroupResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListAppgroupResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppgroupResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
