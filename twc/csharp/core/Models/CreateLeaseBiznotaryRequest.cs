// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseBiznotaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 要存证的文件哈希
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 租赁机构社会统一信用码
        [NameInMap("lease_corp_id")]
        [Validation(Required=true)]
        public string LeaseCorpId { get; set; }

        // 租赁机构公司名称
        [NameInMap("lease_corp_name")]
        [Validation(Required=true)]
        public string LeaseCorpName { get; set; }

        // 租赁机构法人姓名
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=true)]
        public string LeaseCorpOwnerName { get; set; }

        // 被代理机构金融科技租户id
        [NameInMap("agent_lease_id")]
        [Validation(Required=false)]
        public string AgentLeaseId { get; set; }

        // 模式，代理模式为isvMode
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

    }

}
