// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MSCENE.Models
{
    // 用户校验响应结果
    public class MpaasUserAuthCheckResponse : TeaModel {
        // 用户身份是否匹配
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("matched")]
        [Validation(Required=false)]
        public bool? Matched { get; set; }

    }

}
