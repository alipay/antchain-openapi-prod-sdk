// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAlarmDingdingrobotResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 钉钉机器人列表
    @NameInMap("robots")
    public java.util.List<DingDingRobot> robots;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryAlarmDingdingrobotResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmDingdingrobotResponse self = new QueryAlarmDingdingrobotResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlarmDingdingrobotResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAlarmDingdingrobotResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAlarmDingdingrobotResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAlarmDingdingrobotResponse setRobots(java.util.List<DingDingRobot> robots) {
        this.robots = robots;
        return this;
    }
    public java.util.List<DingDingRobot> getRobots() {
        return this.robots;
    }

    public QueryAlarmDingdingrobotResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAlarmDingdingrobotResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlarmDingdingrobotResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
