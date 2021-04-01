// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAccountMappingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 映射账户详细信息
        [NameInMap("account")]
        [Validation(Required=true)]
        public AccountMap Account { get; set; }

        // 扩展信息
        [NameInMap("extension")]
        [Validation(Required=true)]
        public string Extension { get; set; }

    }

}
