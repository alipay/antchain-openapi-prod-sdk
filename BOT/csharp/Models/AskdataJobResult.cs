// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 智能问数据返回
    public class AskdataJobResult : TeaModel {
        // 任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>97F385D2D8595AA4DC262C72965507</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // 唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>97F385D2D8595AA4DC262C72965507</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
