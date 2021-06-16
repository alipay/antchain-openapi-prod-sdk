// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class ExecNftTransferResponse : TeaModel {
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

        // NFT发行成功的商品，其中转给C端用户的特定一个token
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

    }

}
