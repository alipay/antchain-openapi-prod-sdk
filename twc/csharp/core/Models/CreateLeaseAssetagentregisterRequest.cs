// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseAssetagentregisterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被代理机构的金融科技租户id
        [NameInMap("agent_lease_id")]
        [Validation(Required=true)]
        public string AgentLeaseId { get; set; }

        // 代理合同id，作为存证使用
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 被代理租赁机构统一社会信用码
        // 
        // 
        [NameInMap("lease_corp_id")]
        [Validation(Required=true)]
        public string LeaseCorpId { get; set; }

        // 被代理租赁机构名称
        [NameInMap("lease_corp_name")]
        [Validation(Required=true)]
        public string LeaseCorpName { get; set; }

        // 被代理租赁机构法人姓名
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=true)]
        public string LeaseCorpOwnerName { get; set; }

    }

}
