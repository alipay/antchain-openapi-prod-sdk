// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class SubmitYunfengdieAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 接口调用参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // 请求头参数
        [NameInMap("headers")]
        [Validation(Required=true)]
        public string Headers { get; set; }

    }

}
