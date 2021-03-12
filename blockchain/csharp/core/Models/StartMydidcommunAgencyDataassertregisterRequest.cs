// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyDataassertregisterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审批流程节点
        [NameInMap("approvers")]
        [Validation(Required=true)]
        public List<string> Approvers { get; set; }

        // 数据资产的Owner
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 数据资产id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

    }

}
