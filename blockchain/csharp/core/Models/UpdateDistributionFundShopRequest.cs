// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateDistributionFundShopRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审批中额度
        [NameInMap("approve_quota")]
        [Validation(Required=true)]
        public string ApproveQuota { get; set; }

        // 可提现余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 已到账额度
        [NameInMap("finish_quota")]
        [Validation(Required=true)]
        public string FinishQuota { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
