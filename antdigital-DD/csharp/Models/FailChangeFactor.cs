// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 校验失败的变更因子
    public class FailChangeFactor : TeaModel {
        // 失败的路径值
        /// <summary>
        /// <b>Example:</b>
        /// <para>base.domainCode</para>
        /// </summary>
        [NameInMap("fail_key")]
        [Validation(Required=true)]
        public string FailKey { get; set; }

        // 失败原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>失败原因</para>
        /// </summary>
        [NameInMap("fail_reason")]
        [Validation(Required=true)]
        public string FailReason { get; set; }

    }

}
