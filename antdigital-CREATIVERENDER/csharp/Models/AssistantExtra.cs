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

    }

}
