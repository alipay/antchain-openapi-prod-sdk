// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2d01ff274c3448c2b919937512c80f91.Models
{
    public class BindAntcloudCatHuanyuRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // huanyu
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
