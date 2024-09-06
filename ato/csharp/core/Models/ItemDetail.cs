// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控-商品详情
    public class ItemDetail : TeaModel {
        // 租赁商品类目，可选项见 https://opendocs.alipay.com/open/10719
        [NameInMap("goods_category")]
        [Validation(Required=true, MaxLength=30)]
        public string GoodsCategory { get; set; }

        // 租赁商品名称
        [NameInMap("item_name")]
        [Validation(Required=true, MaxLength=64)]
        public string ItemName { get; set; }

        // 租赁商品数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

    }

}
