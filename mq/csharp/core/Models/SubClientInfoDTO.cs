// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 客户端消费记录的明细列表
    public class SubClientInfoDTO : TeaModel {
        // 消费客户端的客户端地址
        [NameInMap("client_host")]
        [Validation(Required=true)]
        public string ClientHost { get; set; }

        // 本次消费耗时，单位毫秒
        [NameInMap("cost_time")]
        [Validation(Required=true)]
        public long? CostTime { get; set; }

        // 本次消费的投递轮次
        [NameInMap("reconsume_times")]
        [Validation(Required=true)]
        public long? ReconsumeTimes { get; set; }

        // 消费状态。取值说明如下：
        // 
        // CONSUME_FAILED：消费失败
        // CONSUME_SUCCESS：消费成功
        // CONSUME_NOT_RETURN：消费未返回结果
        // SEND_UNKNOWN：事务消息未提交
        // SEND_DELAY：定时(延时)消息定时中
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 该客户端所属的 Group ID
        [NameInMap("sub_group_name")]
        [Validation(Required=true)]
        public string SubGroupName { get; set; }

        // 消费开始时间戳
        [NameInMap("sub_time")]
        [Validation(Required=true)]
        public long? SubTime { get; set; }

    }

}
