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

        // 商品图片临时访问地址，可直接访问
        [NameInMap("goods_image_tmp")]
        [Validation(Required=false)]
        public string GoodsImageTmp { get; set; }

        // 商品店铺名称/商品出品方
        [NameInMap("goods_store")]
        [Validation(Required=false)]
        public string GoodsStore { get; set; }

        // 店铺logo图片链接
        [NameInMap("goods_store_logo")]
        [Validation(Required=false)]
        public string GoodsStoreLogo { get; set; }

        // 店铺logo临时访问地址
        [NameInMap("goods_store_logo_tmp")]
        [Validation(Required=false)]
        public string GoodsStoreLogoTmp { get; set; }

        // 商品描述
        [NameInMap("goods_description")]
        [Validation(Required=false)]
        public string GoodsDescription { get; set; }

        // 商品品牌
        [NameInMap("goods_brand")]
        [Validation(Required=false)]
        public string GoodsBrand { get; set; }

        // 授权过期类型，0：长久有效，1：有效日期内有效
        [NameInMap("authorization_expirated_type")]
        [Validation(Required=false)]
        public string AuthorizationExpiratedType { get; set; }

        // 授权截止日期
        [NameInMap("authorization_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AuthorizationEndTime { get; set; }

        // 发售渠道
        [NameInMap("goods_sale_channel")]
        [Validation(Required=false)]
        public string GoodsSaleChannel { get; set; }

        // 商品规格
        [NameInMap("goods_specifications")]
        [Validation(Required=false)]
        public List<ProductSpecification> GoodsSpecifications { get; set; }

        // 是否展示批次数据
        [NameInMap("is_display_batchdata")]
        [Validation(Required=false)]
        public bool? IsDisplayBatchdata { get; set; }

    }

}
