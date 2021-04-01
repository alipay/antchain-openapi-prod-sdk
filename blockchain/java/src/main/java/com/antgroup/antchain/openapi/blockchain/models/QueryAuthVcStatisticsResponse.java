// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcStatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务场景值，与入参相同
    @NameInMap("biz_type")
    public String bizType;

    // 指定业务场景的数据量，在核酸检测场景，就是整体核酸检测数据的数量
    @NameInMap("total")
    public Long total;

    // 分布曲线描绘的一个点，day为单位的分布数据汇总情况。
    @NameInMap("list")
    public java.util.List<Curve> list;

    public static QueryAuthVcStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcStatisticsResponse self = new QueryAuthVcStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcStatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVcStatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVcStatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVcStatisticsResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVcStatisticsResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryAuthVcStatisticsResponse setList(java.util.List<Curve> list) {
        this.list = list;
        return this;
    }
    public java.util.List<Curve> getList() {
        return this.list;
    }

}
