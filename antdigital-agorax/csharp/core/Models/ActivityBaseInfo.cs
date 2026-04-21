// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 活动基本信息
    public class ActivityBaseInfo : TeaModel {
        // 活动ID
        [NameInMap("activity_id")]
        [Validation(Required=true)]
        public string ActivityId { get; set; }

        // 活动名称
        [NameInMap("activity_name")]
        [Validation(Required=false)]
        public string ActivityName { get; set; }

        // 活动状态
        [NameInMap("activity_status")]
        [Validation(Required=false)]
        public string ActivityStatus { get; set; }

        // 平台类型
        [NameInMap("platform_type")]
        [Validation(Required=false)]
        public string PlatformType { get; set; }

        // 活动开始时间
        [NameInMap("publish_start_time")]
        [Validation(Required=false)]
        public string PublishStartTime { get; set; }

        // 活动结束时间
        [NameInMap("publish_end_time")]
        [Validation(Required=false)]
        public string PublishEndTime { get; set; }

    }

}
