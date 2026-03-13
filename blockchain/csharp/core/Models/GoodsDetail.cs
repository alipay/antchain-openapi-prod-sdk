// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 商品信息
    public class GoodsDetail : TeaModel {
        // 商品编号
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public string Quantity { get; set; }

        // 商品单价
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 商品类目
        [NameInMap("goods_category")]
        [Validation(Required=false)]
        public string GoodsCategory { get; set; }

        // 商品类目树
        [NameInMap("categories_tree")]
        [Validation(Required=false)]
        public string CategoriesTree { get; set; }

        // 商品的展示地址
        [NameInMap("show_url")]
        [Validation(Required=false)]
        public string ShowUrl { get; set; }

        // 商品69条码
        [NameInMap("goods_ean_id")]
        [Validation(Required=false)]
        public string GoodsEanId { get; set; }

        // 商家侧小程序商品 ID
        [NameInMap("out_item_id")]
        [Validation(Required=false)]
        public string OutItemId { get; set; }

        // 商家侧小程序商品ID
        [NameInMap("out_sku_id")]
        [Validation(Required=false)]
        public string OutSkuId { get; set; }

    }

}
