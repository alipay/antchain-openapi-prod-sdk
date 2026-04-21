// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 发券记录列表
    public class OrderList : TeaModel {
        // 活动ID
        [NameInMap("activity_id")]
        [Validation(Required=false)]
        public string ActivityId { get; set; }

        // 记录ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 奖品id
        [NameInMap("prize_id")]
        [Validation(Required=false)]
        public string PrizeId { get; set; }

    }

}
