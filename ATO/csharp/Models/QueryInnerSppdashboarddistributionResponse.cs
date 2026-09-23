// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboarddistributionResponse : TeaModel {
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

        // 当日总进件量
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 商家承接量与占比
        [NameInMap("distribution")]
        [Validation(Required=false)]
        public string Distribution { get; set; }

        // 进件实时日志（当日最新 logLimit 条，按时间倒序）
        [NameInMap("logs")]
        [Validation(Required=false)]
        public string Logs { get; set; }

    }

}
