// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // ASSISTANT 消息特有信息
    public class AssistantExtra : TeaModel {
        // 任务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>M_d3f7859e845a4ed58bedc446fec32427</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 生图状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>PROCESSING</para>
        /// </summary>
        [NameInMap("render_status")]
        [Validation(Required=false)]
        public string RenderStatus { get; set; }

        // 生图结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("result_url")]
        [Validation(Required=false)]
        public List<string> ResultUrl { get; set; }

        // 基金长图子图列表，仅在 return_sub_images 为 true 且长图生成完成时返回。
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("sub_images")]
        [Validation(Required=false)]
        public List<LongImageSegment> SubImages { get; set; }

    }

}
