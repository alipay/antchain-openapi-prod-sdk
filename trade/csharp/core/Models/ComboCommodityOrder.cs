// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 套餐内商品订单结构
    public class ComboCommodityOrder : TeaModel {
        // 商品编码
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 实例ID列表
        [NameInMap("instance_ids")]
        [Validation(Required=true)]
        public List<string> InstanceIds { get; set; }

    }

}
