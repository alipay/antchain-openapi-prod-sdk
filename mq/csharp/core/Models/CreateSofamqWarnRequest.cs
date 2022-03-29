// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqWarnRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 报警时间范围
        [NameInMap("alert_time")]
        [Validation(Required=true)]
        public string AlertTime { get; set; }

        // 报警通知人信息
        [NameInMap("contacts")]
        [Validation(Required=true)]
        public string Contacts { get; set; }

        // 延迟多少秒报报警
        [NameInMap("delay_time")]
        [Validation(Required=true)]
        public long? DelayTime { get; set; }

        // 报警频率
        [NameInMap("frequency")]
        [Validation(Required=true)]
        public long? Frequency { get; set; }

        // 查询指定 Group 时设置
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 堆积阈值
        [NameInMap("threshold")]
        [Validation(Required=true)]
        public long? Threshold { get; set; }

        // 查询指定 Topic 时设置
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

    }

}
