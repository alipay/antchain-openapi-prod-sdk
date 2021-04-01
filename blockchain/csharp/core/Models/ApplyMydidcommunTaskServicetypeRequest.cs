// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ApplyMydidcommunTaskServicetypeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需要被授权人的DID
        [NameInMap("target_did")]
        [Validation(Required=true)]
        public string TargetDid { get; set; }

        // 申请发起人的DID
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 需要被授权使用的服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
