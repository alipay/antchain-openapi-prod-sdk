// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回调通用返回体
    public class CommonNotyfyResult : TeaModel {
        // 请求id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123AA</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务响应Json
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;a&quot;:&quot;b&quot;} </para>
        /// </summary>
        [NameInMap("biz_response")]
        [Validation(Required=true)]
        public string BizResponse { get; set; }

    }

}
