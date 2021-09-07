// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    // 商品信息
    public class GoodsDTO : TeaModel {
        // 商品id
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 商品内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 二维码地址
        [NameInMap("qr_code")]
        [Validation(Required=true)]
        public string QrCode { get; set; }

        // 区块链信息
        [NameInMap("blockchain_info")]
        [Validation(Required=true)]
        public BlockchainInfoDTO BlockchainInfo { get; set; }

    }

}
