// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class RetryDciPreregistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dci用户id
        [NameInMap("dci_user_id")]
        [Validation(Required=true)]
        public string DciUserId { get; set; }

        // dci内容id
        [NameInMap("dci_content_id")]
        [Validation(Required=true)]
        public string DciContentId { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=true)]
        public ProxyData ProxyData { get; set; }

        // 幂等信息
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
