// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 附加信息
    public class ExtraInfo : TeaModel {
        // 原厂任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx-xxx-xxx</para>
        /// </summary>
        [NameInMap("original_task_id")]
        [Validation(Required=false)]
        public string OriginalTaskId { get; set; }

        // 原厂视频输出URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxx">https://xxx</a></para>
        /// </summary>
        [NameInMap("original_video_url")]
        [Validation(Required=false)]
        public string OriginalVideoUrl { get; set; }

        // 原厂响应体快照
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;{&quot;task_id&quot;:&quot;csg-xxx-xx&quot;...}&quot;</para>
        /// </summary>
        [NameInMap("original_response_snapshot")]
        [Validation(Required=false)]
        public string OriginalResponseSnapshot { get; set; }

    }

}
