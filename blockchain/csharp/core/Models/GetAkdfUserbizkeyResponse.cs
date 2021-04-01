// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetAkdfUserbizkeyResponse : TeaModel {
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

        // 区块链id
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // 4dY3DnjHPogYcsiVujkdhBRBceY8ZT5cUBP1zRBAZia7WZhJZyHmWbARBAWvy13aB7cNenbBg5D4CnM1gijv5YiSgBgHTC89sag9M7cxxdaRMrvFEA4YpcaunZdd4Q1APBynsDsqmVyzyGnZk5Kez9WBz5PZRyRC3gqCNXhHLLwuJmGCn8aEv3Ar9vsFUQa6qAgNtVVgiDxEYqBNNQc9K51ytdpBX81ph8nzy2ctUvLqi4G7iFU1wVsdd14XS7oz1v54M5Hb2CUTkv7ncXZSnNJYDsGyKAmHiriL2rargNzp6v2nUXhGSrkCVMDCVkZVcpeVFqSxKGatVdkGYUAswt3vtRVCcs
        [NameInMap("encrypted_private_key")]
        [Validation(Required=false)]
        public string EncryptedPrivateKey { get; set; }

    }

}
