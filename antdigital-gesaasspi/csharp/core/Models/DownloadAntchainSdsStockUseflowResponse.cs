// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAASSPI.Models
{
    public class DownloadAntchainSdsStockUseflowResponse : TeaModel {
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

        // 【下载链接】流水文件下载链接，30s内有效
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 【核销批次账单文件摘要】默认算法SHA1
        [NameInMap("stock_useflow_hash")]
        [Validation(Required=false)]
        public string StockUseflowHash { get; set; }

        // 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
        [NameInMap("stock_useflow_count")]
        [Validation(Required=false)]
        public long? StockUseflowCount { get; set; }

    }

}
