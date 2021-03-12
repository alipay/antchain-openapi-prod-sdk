// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 营销分销平台返佣信息
    public class RakeBackInfo : TeaModel {
        // 推广层级
        [NameInMap("level")]
        [Validation(Required=true)]
        public long? Level { get; set; }

        // 上级推广订单id
        [NameInMap("parent_id")]
        [Validation(Required=true)]
        public string ParentId { get; set; }

        // 推广人id
        [NameInMap("promoter_id")]
        [Validation(Required=true)]
        public string PromoterId { get; set; }

        // 返佣额度
        [NameInMap("quota")]
        [Validation(Required=true)]
        public string Quota { get; set; }

        // 返佣比例 10表示10%
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

    }

}
