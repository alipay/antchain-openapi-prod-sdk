// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9468e09a21e84cc8b9a8d4a2de18c792.Models
{
    public class QueryBlockchainAppexAsynformStatusResponse : TeaModel {
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

        // 块高
        // 
        [NameInMap("block_height")]
        [Validation(Required=false)]
        public long? BlockHeight { get; set; }

        // 交易hash
        // 
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上传时间
        // 
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // SUCCESS:上链成功, FAILURE:上链失败，UPLOADING:上链中
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 交易时间戳，成功上链时间
        // 
        [NameInMap("tx_timestamp")]
        [Validation(Required=false)]
        public string TxTimestamp { get; set; }

    }

}
