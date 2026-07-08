// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEmissionTotalResponse : TeaModel {
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

        // 累计排放量
        [NameInMap("total_emission")]
        [Validation(Required=false)]
        public string TotalEmission { get; set; }

        // 今日新增碳排放量
        [NameInMap("total_emission_today")]
        [Validation(Required=false)]
        public string TotalEmissionToday { get; set; }

        // 累计减碳量
        [NameInMap("total_reduction")]
        [Validation(Required=false)]
        public string TotalReduction { get; set; }

        // 今日减碳量
        [NameInMap("total_reduction_today")]
        [Validation(Required=false)]
        public string TotalReductionToday { get; set; }

        // 累计抵消量
        [NameInMap("total_counteraction")]
        [Validation(Required=false)]
        public string TotalCounteraction { get; set; }

        // 今日抵消量
        [NameInMap("total_counteraction_today")]
        [Validation(Required=false)]
        public string TotalCounteractionToday { get; set; }

        // 排放数据单位
        [NameInMap("data_unit")]
        [Validation(Required=false)]
        public string DataUnit { get; set; }

    }

}
