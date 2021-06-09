// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateReceivableBillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 测试
        [NameInMap("test")]
        [Validation(Required=false)]
        public AuthParty Test { get; set; }

        // 的撒
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
