// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateDataflowAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链上账号名称，真实名称会在前加租户ID
        [NameInMap("biz_chain_account")]
        [Validation(Required=true)]
        public string BizChainAccount { get; set; }

        // 账户密钥算法
        [NameInMap("key_algorithm")]
        [Validation(Required=false)]
        public string KeyAlgorithm { get; set; }

    }

}
