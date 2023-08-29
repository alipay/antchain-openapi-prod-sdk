// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5511b931fbd04feba92b64ebc082aac0.Models
{
    public class InitAntchainEkycSingleZimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境参数
        [NameInMap("meta_info")]
        [Validation(Required=true)]
        public string MetaInfo { get; set; }

        // 实人认证id
        [NameInMap("zim_id")]
        [Validation(Required=true)]
        public string ZimId { get; set; }

    }

}
