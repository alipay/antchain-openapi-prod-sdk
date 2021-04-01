// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartDidZkpverifiableclaimProofRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // vc对应的授予者
        [NameInMap("subject")]
        [Validation(Required=true)]
        public string Subject { get; set; }

        // vc原文
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

        // zkp证明生成信息
        [NameInMap("zkp_info")]
        [Validation(Required=true)]
        public List<DidZKPInfo> ZkpInfo { get; set; }

    }

}
