// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class AddConsumecardCommissionpartyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求对象
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 收费规则归属方
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 手续费规则
        [NameInMap("commission_rule")]
        [Validation(Required=true)]
        public CommissionRule CommissionRule { get; set; }

        // 手续费类型（0:全局，1:商户）
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 分类id（ffaaaaabbbbbb）
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

    }

}
