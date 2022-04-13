// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ExecUnireleasespiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求方法
        [NameInMap("request_method")]
        [Validation(Required=true)]
        public string RequestMethod { get; set; }

        // 请求参数的 JSON 字符串
        [NameInMap("request_param")]
        [Validation(Required=true)]
        public string RequestParam { get; set; }

    }

}
