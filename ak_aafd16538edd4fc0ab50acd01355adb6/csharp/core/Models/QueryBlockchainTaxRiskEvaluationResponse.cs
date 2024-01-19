// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_aafd16538edd4fc0ab50acd01355adb6.Models
{
    public class QueryBlockchainTaxRiskEvaluationResponse : TeaModel {
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

        // unix秒时间戳,查询时间，用来对账使用
        [NameInMap("query_time")]
        [Validation(Required=false)]
        public string QueryTime { get; set; }

        // 是否查的，空数据标识
        [NameInMap("null_data_flag")]
        [Validation(Required=false)]
        public bool? NullDataFlag { get; set; }

    }

}
