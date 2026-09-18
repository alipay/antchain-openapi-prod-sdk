// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // ekyt响应头
    public class ResponseHead : TeaModel {
        // 请求唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>91440300892305861T</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

    }

}
