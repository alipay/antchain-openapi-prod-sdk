// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 统一告警传输对象
    public class UnifiedAlarmSubDTO : TeaModel {
        // 订阅者id
        [NameInMap("subscriber")]
        [Validation(Required=true)]
        public string Subscriber { get; set; }

        // 订阅者类型
        [NameInMap("subscriber_type")]
        [Validation(Required=true)]
        public string SubscriberType { get; set; }

        // 订阅者来源
        [NameInMap("subscriber_source")]
        [Validation(Required=true)]
        public string SubscriberSource { get; set; }

        // 告警对象的名称
        [NameInMap("subscriber_name")]
        [Validation(Required=true)]
        public string SubscriberName { get; set; }

    }

}
