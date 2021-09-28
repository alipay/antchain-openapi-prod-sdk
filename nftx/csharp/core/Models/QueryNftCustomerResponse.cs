// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryNftCustomerResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // NFT商品的商品编码
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public long? SkuId { get; set; }

        // NFT资产的唯一编码
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // NFT商品的名称
        [NameInMap("sku_name")]
        [Validation(Required=false)]
        public string SkuName { get; set; }

        // NFT的创作者名称
        [NameInMap("author_name")]
        [Validation(Required=false)]
        public string AuthorName { get; set; }

        // NFT的发行方名称
        [NameInMap("issuer_name")]
        [Validation(Required=false)]
        public string IssuerName { get; set; }

        // 缩略图url，带5分钟鉴权
        [NameInMap("mini_image_path")]
        [Validation(Required=false)]
        public string MiniImagePath { get; set; }

    }

}
