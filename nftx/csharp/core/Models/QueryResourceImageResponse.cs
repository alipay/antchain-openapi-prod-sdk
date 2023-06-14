// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    public class QueryResourceImageResponse : TeaModel {
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

        // nftID 藏品素材nftId，type为NFT时有值
        [NameInMap("nft_id")]
        [Validation(Required=false)]
        public string NftId { get; set; }

        // 具体藏品名称，type为NFT时有值
        [NameInMap("sku_name")]
        [Validation(Required=false)]
        public string SkuName { get; set; }

        // nftId 的 算法计算的hash，该藏品唯一标识，type为NFT时有值
        [NameInMap("uni_hash")]
        [Validation(Required=false)]
        public string UniHash { get; set; }

        // Date	藏品铸造上链生成时间，例如2021.09.22 20:22:19，type为NFT时有值
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTime { get; set; }

        // url列表
        [NameInMap("img_urls")]
        [Validation(Required=false)]
        public List<CToMResourceImg> ImgUrls { get; set; }

        // int	高清图状态
        // 0 需要等待
        // 1 已完成
        [NameInMap("high_definition_status")]
        [Validation(Required=false)]
        public long? HighDefinitionStatus { get; set; }

    }

}
