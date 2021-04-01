// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthVcRealtimeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务类型场景码，与入参相同。
    @NameInMap("biz_type")
    public String bizType;

    // 实际返回的结果数目，如果真是数据量小于request中的size的情况下，total 不等于 size，否则 total 与size值相等。
    @NameInMap("total")
    public Long total;

    // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
    // 
    // {
    //   "key":"vc:mychain:01364d9acbda8d09d8c30d94987b40b28f2c28d4ff8f86dbe16197a8f2b0c031",
    //   "name": "张三",           //个人姓名
    //   "certNo": "210XXXXXX90", //个人证件号码
    //   "mobile": "138XXXXXX90", //个人手机号码
    //   "orgName": "XXX检测中心",      //检测机构名称
    //   "orgNo": "90XXXX00",    //检测机构编号 (可选)
    //   "type":"1",             //具体类型说明：1：核酸检测证明，2：疫苗接种证明，其他类型后续扩展
    //   "result":"阴性",
    //   "date":"2021-03-09",    //检测的日期，请统一使用此标准
    //   "timestamp":"检测准确时间戳"   //其它字段可以再补充
    // }
    @NameInMap("list")
    public java.util.List<String> list;

    public static QueryAuthVcRealtimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthVcRealtimeResponse self = new QueryAuthVcRealtimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthVcRealtimeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthVcRealtimeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthVcRealtimeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthVcRealtimeResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthVcRealtimeResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryAuthVcRealtimeResponse setList(java.util.List<String> list) {
        this.list = list;
        return this;
    }
    public java.util.List<String> getList() {
        return this.list;
    }

}
