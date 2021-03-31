// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class AuthSysForwarderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户端id
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 密钥
        [NameInMap("client_secret")]
        [Validation(Required=true)]
        public string ClientSecret { get; set; }

        // 货代did
        [NameInMap("int_ref_id")]
        [Validation(Required=true)]
        public string IntRefId { get; set; }

        // For HOME application internal
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 渠道source
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

    }

}
