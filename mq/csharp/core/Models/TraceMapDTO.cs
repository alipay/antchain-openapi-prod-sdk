// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 该查询任务的匹配轨迹列表
    public class TraceMapDTO : TeaModel {
        // 消息发送方的客户端地址
        [NameInMap("born_host")]
        [Validation(Required=true)]
        public string BornHost { get; set; }

        // 生产端的cell name
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 发送耗时，单位毫秒
        [NameInMap("cost_time")]
        [Validation(Required=true)]
        public long? CostTime { get; set; }

        // 消息的 ID，即 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        //  消息的 Key ，即 Message Key
        [NameInMap("msg_key")]
        [Validation(Required=true)]
        public string MsgKey { get; set; }

        // 发送方客户端配置的 Group ID
        [NameInMap("pub_group_name")]
        [Validation(Required=true)]
        public string PubGroupName { get; set; }

        // 消息发送时间
        [NameInMap("pub_time")]
        [Validation(Required=true)]
        public long? PubTime { get; set; }

        // 发送状态。取值说明如下：
        // 
        // SEND_SUCCESS：发送成功
        // SEND_FAILED：发送失败
        // SEND_ROLLBACK：事务消息回滚
        // SEND_UNKNOWN：事务消息未提交
        // SEND_DELAY：定时(延时)消息定时中
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 消息的消费轨迹列表
        [NameInMap("sub_list")]
        [Validation(Required=true)]
        public List<SubMapDTO> SubList { get; set; }

        // 消息的 Tag，即 Message Tag
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

        // 消息的 Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
