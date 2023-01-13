// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1f51f68dfc5d438387dbbaa76f5997f4.Models
{
    public class QueryAntchainMytcMiniCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 溯源码
        [NameInMap("code")]
        [Validation(Required=true, MaxLength=160)]
        public string Code { get; set; }

        // 用户信息
        [NameInMap("user_info")]
        [Validation(Required=false)]
        public ScanUserInfo UserInfo { get; set; }

    }

}
