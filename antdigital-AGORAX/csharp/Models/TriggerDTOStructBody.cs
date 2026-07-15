// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云数据导出服务TriggerDTO结构体
    public class TriggerDTOStructBody : TeaModel {
        // 名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>9481b612d6ca4cfdbecc5c5d395eda4237c749fa-97fc-4156-9c23-e21cd6060669</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;BLOCK&quot;</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 源
        /// <summary>
        /// <b>Example:</b>
        /// <para>“”</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>103422</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;error&quot;</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>“success”</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
        /// <summary>
        /// <b>Example:</b>
        /// <para>{a:&quot;123&quot;,  b:&quot;123&quot;}</para>
        /// </summary>
        [NameInMap("option")]
        [Validation(Required=false)]
        public string Option { get; set; }

        // checkpoint类
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("checkpoint")]
        [Validation(Required=false)]
        public CheckPointStructBody Checkpoint { get; set; }

        // 待处理的错误事件总数
        /// <summary>
        /// <b>Example:</b>
        /// <para>待处理的错误事件总数</para>
        /// </summary>
        [NameInMap("pending_error_logs")]
        [Validation(Required=false)]
        public string PendingErrorLogs { get; set; }

    }

}
