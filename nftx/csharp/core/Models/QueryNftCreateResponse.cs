// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryNftCreateResponse : TeaModel {
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

        // NFT发行成功的商品id
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public long? SkuId { get; set; }

        // INIT("INIT", "初始化"),
        // PROCESSING("PROCESSING", "资产创建中"),
        // FINISH("FINISH", "资产初始化完毕"),
        // ;
        [NameInMap("sku_status")]
        [Validation(Required=false)]
        public string SkuStatus { get; set; }

        // NFT商品的名称
        [NameInMap("sku_name")]
        [Validation(Required=false)]
        public string SkuName { get; set; }

        // 作者的名称
        [NameInMap("author_name")]
        [Validation(Required=false)]
        public string AuthorName { get; set; }

        // 发行方的名称
        [NameInMap("issuer_name")]
        [Validation(Required=false)]
        public string IssuerName { get; set; }

        // 缩略图展示路径
        [NameInMap("mini_image_path")]
        [Validation(Required=false)]
        public string MiniImagePath { get; set; }

    }

}
