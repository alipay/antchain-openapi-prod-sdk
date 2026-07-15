// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 应用请求
    public class ApplicationQueryReq : TeaModel {
        // 应用程序ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>app20230725115808679d4f</para>
        /// </summary>
        [NameInMap("application_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ApplicationId { get; set; }

    }

}
