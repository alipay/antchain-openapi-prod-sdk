// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryNftAssetResponse : TeaModel {
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

        // 藏品ID
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // 藏品名称
        [NameInMap("sku_name")]
        [Validation(Required=false)]
        public string SkuName { get; set; }

        // 藏品SKU ID
        [NameInMap("sku_id")]
        [Validation(Required=false)]
        public long? SkuId { get; set; }

        // 此藏品对应的uniHash值
        [NameInMap("uni_hash")]
        [Validation(Required=false)]
        public string UniHash { get; set; }

        // 藏品铸造时间
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTime { get; set; }

    }

}
