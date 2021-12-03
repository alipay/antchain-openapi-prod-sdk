// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    // 用户资产
    public class UserAsset : TeaModel {
        // NFT商品的商品编码
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public long? SkuId { get; set; }

        // NFT资产的唯一编码
        [NameInMap("nft_id")]
        [Validation(Required=true)]
        public string NftId { get; set; }

        // NFT商品的名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // NFT的创作者名称
        [NameInMap("author_name")]
        [Validation(Required=true)]
        public string AuthorName { get; set; }

        // NFT的发行方名称
        [NameInMap("issuer_name")]
        [Validation(Required=true)]
        public string IssuerName { get; set; }

        // 缩略图url，带5分钟鉴权
        [NameInMap("mini_image_path")]
        [Validation(Required=true)]
        public string MiniImagePath { get; set; }

    }

}
