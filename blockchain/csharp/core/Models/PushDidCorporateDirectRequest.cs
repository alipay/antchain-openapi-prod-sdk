// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PushDidCorporateDirectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // did doc json string
        [NameInMap("doc")]
        [Validation(Required=true)]
        public string Doc { get; set; }

        // 对hash进行签名后接字符串
        [NameInMap("sign_data")]
        [Validation(Required=true)]
        public string SignData { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
