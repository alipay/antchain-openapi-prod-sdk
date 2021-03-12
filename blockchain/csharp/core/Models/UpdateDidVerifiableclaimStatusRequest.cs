// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDidVerifiableclaimStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 希望可验证声明的状态， 0无效，1生效
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 可验证声明id
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 该VC的颁发者
        [NameInMap("issuer_did")]
        [Validation(Required=false)]
        public string IssuerDid { get; set; }

    }

}
