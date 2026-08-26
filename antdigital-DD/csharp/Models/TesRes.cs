// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 测试返回类
    public class TesRes : TeaModel {
        // 证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("idcard")]
        [Validation(Required=true)]
        public string Idcard { get; set; }

    }

}
