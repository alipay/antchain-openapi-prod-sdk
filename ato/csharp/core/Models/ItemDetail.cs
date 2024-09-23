// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 智租风控-商品详情
    public class ItemDetail : TeaModel {
        // 租赁商品类目，可选类型：
        // RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
        [NameInMap("goods_category")]
        [Validation(Required=false, MaxLength=30)]
        public string GoodsCategory { get; set; }

        // 租赁商品名称
        [NameInMap("item_name")]
        [Validation(Required=false, MaxLength=128)]
        public string ItemName { get; set; }

        // 租赁商品数量
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public long? Quantity { get; set; }

    }

}
