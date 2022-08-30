// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2fdfc04b2afb4da9ac403531af8942a9.Models
{
    // 大安全接口返回
    public class SecurityUniformResponse : TeaModel {
        // 是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 123
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 123
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 123
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 123
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 123
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
