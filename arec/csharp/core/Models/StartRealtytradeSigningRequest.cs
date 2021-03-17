// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRealtytradeSigningRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构账号 ID
        [NameInMap("org_id")]
        [Validation(Required=true)]
        public string OrgId { get; set; }

        // 业务描述,描述本次合同文档加载业务
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 合同及签署信息列表
        [NameInMap("contract_list")]
        [Validation(Required=true)]
        public List<ContractSigning> ContractList { get; set; }

    }

}
