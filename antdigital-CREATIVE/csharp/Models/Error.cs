// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 处理失败时返回，包含 code / message
    public class Error : TeaModel {
        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>INVALID_PARAMETER</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数无效</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
