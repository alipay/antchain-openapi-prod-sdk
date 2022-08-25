// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_6efc6591476e4813ac8f7c9b6359c0b7.Models
{
    // 大安全接口入参
    public class SecurityUniformRequest : TeaModel {
        // 123
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 123
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 132
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
