// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class CreateNftIssuerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户发行NFT的唯一编号
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // NFT商品的名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
        [NameInMap("sku_type")]
        [Validation(Required=true)]
        public string SkuType { get; set; }

        // 铸造数量，100起
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // NFT创作者
        [NameInMap("author")]
        [Validation(Required=true)]
        public string Author { get; set; }

        // 发行方名称
        [NameInMap("issuer_name")]
        [Validation(Required=true)]
        public string IssuerName { get; set; }

        // NFT商品的描述
        [NameInMap("sku_descrption")]
        [Validation(Required=true)]
        public string SkuDescrption { get; set; }

        // 跳转链接
        [NameInMap("jump_url")]
        [Validation(Required=false)]
        public string JumpUrl { get; set; }

        // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 素材文件结构
        [NameInMap("files")]
        [Validation(Required=true)]
        public List<File> Files { get; set; }

    }

}
