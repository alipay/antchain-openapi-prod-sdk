// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetOperatorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作员登录名
        [NameInMap("login_name")]
        [Validation(Required=false)]
        public string LoginName { get; set; }

        // 金融云操作员id
        [NameInMap("operator_id")]
        [Validation(Required=false)]
        public string OperatorId { get; set; }

    }

}
