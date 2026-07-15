// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 实例最近调用记录
    public class InstanceRecordInfo : TeaModel {
        // 应用标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>app20230725115808679d4f</para>
        /// </summary>
        [NameInMap("application")]
        [Validation(Required=false)]
        public string Application { get; set; }

        // 执行结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 操作时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1690166971465</para>
        /// </summary>
        [NameInMap("operating_time")]
        [Validation(Required=false)]
        public string OperatingTime { get; set; }

    }

}
