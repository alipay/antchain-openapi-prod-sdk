// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码配置的商品信息
    public class IPCodeGoodsInfo : TeaModel {
        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=false)]
        public string GoodsName { get; set; }

        // 商品链接
        [NameInMap("goods_url")]
        [Validation(Required=false)]
        public string GoodsUrl { get; set; }

        // 商品图片
        [NameInMap("goods_image")]
        [Validation(Required=false)]
        public string GoodsImage { get; set; }

        // 商品店铺名称
        [NameInMap("goods_store")]
        [Validation(Required=false)]
        public string GoodsStore { get; set; }

        // 店铺logo图片链接
        [NameInMap("goods_store_logo")]
        [Validation(Required=false)]
        public string GoodsStoreLogo { get; set; }

    }

}
