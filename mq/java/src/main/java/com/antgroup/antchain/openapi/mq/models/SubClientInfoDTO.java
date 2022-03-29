// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SubClientInfoDTO extends TeaModel {
    // 消费客户端的客户端地址
    @NameInMap("client_host")
    @Validation(required = true)
    public String clientHost;

    // 本次消费耗时，单位毫秒
    @NameInMap("cost_time")
    @Validation(required = true)
    public Long costTime;

    // 本次消费的投递轮次
    @NameInMap("reconsume_times")
    @Validation(required = true)
    public Long reconsumeTimes;

    // 消费状态。取值说明如下：
    // 
    // CONSUME_FAILED：消费失败
    // CONSUME_SUCCESS：消费成功
    // CONSUME_NOT_RETURN：消费未返回结果
    // SEND_UNKNOWN：事务消息未提交
    // SEND_DELAY：定时(延时)消息定时中
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 该客户端所属的 Group ID
    @NameInMap("sub_group_name")
    @Validation(required = true)
    public String subGroupName;

    // 消费开始时间戳
    @NameInMap("sub_time")
    @Validation(required = true)
    public Long subTime;

    public static SubClientInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        SubClientInfoDTO self = new SubClientInfoDTO();
        return TeaModel.build(map, self);
    }

    public SubClientInfoDTO setClientHost(String clientHost) {
        this.clientHost = clientHost;
        return this;
    }
    public String getClientHost() {
        return this.clientHost;
    }

    public SubClientInfoDTO setCostTime(Long costTime) {
        this.costTime = costTime;
        return this;
    }
    public Long getCostTime() {
        return this.costTime;
    }

    public SubClientInfoDTO setReconsumeTimes(Long reconsumeTimes) {
        this.reconsumeTimes = reconsumeTimes;
        return this;
    }
    public Long getReconsumeTimes() {
        return this.reconsumeTimes;
    }

    public SubClientInfoDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubClientInfoDTO setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
        return this;
    }
    public String getSubGroupName() {
        return this.subGroupName;
    }

    public SubClientInfoDTO setSubTime(Long subTime) {
        this.subTime = subTime;
        return this;
    }
    public Long getSubTime() {
        return this.subTime;
    }

}
