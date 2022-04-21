// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class AuthIcmRealpersonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础授权请求
        [NameInMap("request")]
        [Validation(Required=true)]
        public BaseAuthRequest Request { get; set; }

        // 个人证件号
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 名字
        [NameInMap("identity_name")]
        [Validation(Required=true)]
        public string IdentityName { get; set; }

    }

}
