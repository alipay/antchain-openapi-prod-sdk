// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class RemoveConsumecardCommissionperiodRequest : TeaModel {
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

        // 商品分类id（ffaaaaabbbbbb）
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        // 手续费归属的账户id,如果type为0 ，则该字段必须为空
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 一级分账方
        [NameInMap("rule_account_id")]
        [Validation(Required=true)]
        public string RuleAccountId { get; set; }

        // 手续费类型（0:全局，1:商户）
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 手续费开始时间,用于查找去除的手续费（无结束时间）
        [NameInMap("start_time_mills")]
        [Validation(Required=true)]
        public long? StartTimeMills { get; set; }

    }

}
