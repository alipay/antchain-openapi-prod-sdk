// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 告警信息
    public class WarnDTO : TeaModel {
        // 报警时间段
        [NameInMap("alert_time")]
        [Validation(Required=true)]
        public string AlertTime { get; set; }

        // 属性字符串
        [NameInMap("attribute")]
        [Validation(Required=true)]
        public string Attribute { get; set; }

        // 消息阻塞时间
        [NameInMap("block_time")]
        [Validation(Required=true)]
        public long? BlockTime { get; set; }

        // 联系人列表
        [NameInMap("contacts")]
        [Validation(Required=true)]
        public string Contacts { get; set; }

        // 延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=true)]
        public long? DelayTime { get; set; }

        // 报警频率，单位分钟
        [NameInMap("frequency")]
        [Validation(Required=true)]
        public long? Frequency { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 消费组 ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 报警 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 操作者
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 阈值
        [NameInMap("threshold")]
        [Validation(Required=true)]
        public long? Threshold { get; set; }

        // 报警的 Topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 报警级别
        [NameInMap("warn_level")]
        [Validation(Required=true)]
        public long? WarnLevel { get; set; }

        // 报警状态
        [NameInMap("warn_status")]
        [Validation(Required=true)]
        public long? WarnStatus { get; set; }

        // 报警类型
        [NameInMap("warn_type")]
        [Validation(Required=true)]
        public long? WarnType { get; set; }

    }

}
