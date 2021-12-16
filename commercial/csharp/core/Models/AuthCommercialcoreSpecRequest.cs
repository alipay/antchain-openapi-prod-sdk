// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class AuthCommercialcoreSpecRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 规格code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // 规格状态
        [NameInMap("spec_status")]
        [Validation(Required=true)]
        public string SpecStatus { get; set; }

    }

}
