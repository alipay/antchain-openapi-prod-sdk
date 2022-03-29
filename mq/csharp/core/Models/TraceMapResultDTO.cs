// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // trace result返回值
    public class TraceMapResultDTO : TeaModel {
        // 该查询任务的创建时间
        // 
        // 
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        //  实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 该查询任务对应的 Message ID
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 该查询任务对应的 Message Key
        [NameInMap("msg_key")]
        [Validation(Required=true)]
        public string MsgKey { get; set; }

        // 查询任务 ID
        [NameInMap("query_id")]
        [Validation(Required=true)]
        public string QueryId { get; set; }

        // 该查询任务的结果。取值说明如下：finish：查询完成；working：查询中；removed：任务已删除。
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 该查询任务的 Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 该查询任务的匹配轨迹列表
        // 
        [NameInMap("trace_list")]
        [Validation(Required=true)]
        public List<TraceMapDTO> TraceList { get; set; }

        // 该查询任务的最后更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        //  查询用户 ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
