// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 队列路由规则
    public class QueueRouteRulesDTO : TeaModel {
        // 应用
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 队列路由规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 方法
        [NameInMap("meth")]
        [Validation(Required=true)]
        public string Meth { get; set; }

        // 路由规则名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 队列id
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 分流开关
        [NameInMap("switch_status")]
        [Validation(Required=true)]
        public long? SwitchStatus { get; set; }

        // 路由类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
