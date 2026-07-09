// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 批量定时控车 批次详情
    public class BatchJobDetail : TeaModel {
        // 批次Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 批次名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("batch_name")]
        [Validation(Required=false)]
        public string BatchName { get; set; }

        // 批次状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 租户Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public long? TenantId { get; set; }

        // 触发模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("trigger_mode")]
        [Validation(Required=false)]
        public string TriggerMode { get; set; }

        // 定时执行时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1765794345159</para>
        /// </summary>
        [NameInMap("scheduled_time")]
        [Validation(Required=false)]
        public long? ScheduledTime { get; set; }

        // 实际开始时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1765794345159</para>
        /// </summary>
        [NameInMap("actual_start_time")]
        [Validation(Required=false)]
        public long? ActualStartTime { get; set; }

        // 实际结束时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1765794345159</para>
        /// </summary>
        [NameInMap("actual_end_time")]
        [Validation(Required=false)]
        public long? ActualEndTime { get; set; }

        // 总设备数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

        // 成功数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 失败数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("failed_count")]
        [Validation(Required=false)]
        public long? FailedCount { get; set; }

        // 操作人
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
