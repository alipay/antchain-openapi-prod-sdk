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
        /// <summary>
        /// <b>Example:</b>
        /// <para>110000199001011234</para>
        /// </summary>
        [NameInMap("activity_id")]
        [Validation(Required=true)]
        public string ActivityId { get; set; }

        // 活动名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx面馆活动</para>
        /// </summary>
        [NameInMap("activity_name")]
        [Validation(Required=false)]
        public string ActivityName { get; set; }

        // 活动状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>CAMP_CREATED</para>
        /// </summary>
        [NameInMap("activity_status")]
        [Validation(Required=false)]
        public string ActivityStatus { get; set; }

        // 平台类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PLATFORM</para>
        /// </summary>
        [NameInMap("platform_type")]
        [Validation(Required=false)]
        public string PlatformType { get; set; }

        // 活动开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("publish_start_time")]
        [Validation(Required=false)]
        public string PublishStartTime { get; set; }

        // 活动结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("publish_end_time")]
        [Validation(Required=false)]
        public string PublishEndTime { get; set; }

    }

}
