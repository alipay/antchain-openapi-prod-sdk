// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class AuthItagAntitagAcmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 第三方平台用户ID
        [NameInMap("accountno")]
        [Validation(Required=true)]
        public string Accountno { get; set; }

        // 用户来源
        [NameInMap("accountsource")]
        [Validation(Required=true)]
        public string Accountsource { get; set; }

    }

}
