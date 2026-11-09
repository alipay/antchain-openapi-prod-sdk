// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 任务详细结果包含任务的统计数据信息
    public class TaskDetailResult : TeaModel {
        // 总数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 成功数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 失败数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("fail_count")]
        [Validation(Required=false)]
        public long? FailCount { get; set; }

        // 处理中数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("processing_count")]
        [Validation(Required=false)]
        public long? ProcessingCount { get; set; }

        // 当状态为无效时，显示具体的错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("error_info")]
        [Validation(Required=false)]
        public string ErrorInfo { get; set; }

    }

}
