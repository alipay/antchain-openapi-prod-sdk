// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIOSPRODUCT.Models
{
    public class QueryGwchildinsuranceProfiledetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前联调租户；必须精确命中 finaigateway 发布白名单
        [NameInMap("tenanat_id")]
        [Validation(Required=true)]
        public string TenanatId { get; set; }

        // 当前用户，最大 64 字符
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 当前会话，最大 64 字符
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

    }

}
