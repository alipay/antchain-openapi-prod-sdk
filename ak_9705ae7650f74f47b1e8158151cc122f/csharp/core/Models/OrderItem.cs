// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    // 订单明细
    public class OrderItem : TeaModel {
        // 项目ID
        [NameInMap("item_id")]
        [Validation(Required=true)]
        public string ItemId { get; set; }

        // 项目类型（数登申请）
        [NameInMap("item_type")]
        [Validation(Required=true)]
        public string ItemType { get; set; }

    }

}
