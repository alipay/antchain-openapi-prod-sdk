// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CheckDidSignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要验签的字符串
        [NameInMap("check_data")]
        [Validation(Required=true)]
        public string CheckData { get; set; }

        // 对字符串签名的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 签名后的字符串
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
