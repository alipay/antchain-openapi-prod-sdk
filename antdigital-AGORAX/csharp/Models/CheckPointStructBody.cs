// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云数据导出任务checkpoint类
    public class CheckPointStructBody : TeaModel {
        // 高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 序号
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;Block&quot;</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // last_error
        /// <summary>
        /// <b>Example:</b>
        /// <para>“”</para>
        /// </summary>
        [NameInMap("last_error")]
        [Validation(Required=false)]
        public string LastError { get; set; }

        // 错误统计
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public string ErrorCount { get; set; }

        // 统计
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public string TotalCount { get; set; }

    }

}
