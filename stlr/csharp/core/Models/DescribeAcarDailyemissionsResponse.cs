// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DescribeAcarDailyemissionsResponse : TeaModel {
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

        // 净排放量
        [NameInMap("net_emissions")]
        [Validation(Required=false)]
        public long? NetEmissions { get; set; }

        // 累计到当前时间的总碳排放量
        [NameInMap("total_emissions")]
        [Validation(Required=false)]
        public long? TotalEmissions { get; set; }

        // 排放量单位
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        //  当前计算完成时间
        [NameInMap("finish_timestamp")]
        [Validation(Required=false)]
        public string FinishTimestamp { get; set; }

        // 活动期间每日累计的总碳排放量
        [NameInMap("daily_emissions_list")]
        [Validation(Required=false)]
        public List<DailyEmissions> DailyEmissionsList { get; set; }

    }

}
