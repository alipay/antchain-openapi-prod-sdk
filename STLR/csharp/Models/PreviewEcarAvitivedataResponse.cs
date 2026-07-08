// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class PreviewEcarAvitivedataResponse : TeaModel {
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

        // 总排放量，最多保留6位小数
        [NameInMap("total_emissions")]
        [Validation(Required=false)]
        public string TotalEmissions { get; set; }

        // 核减减排量，最多保留6位小数
        [NameInMap("subtract_reductions")]
        [Validation(Required=false)]
        public string SubtractReductions { get; set; }

        // 净排放量，核减后的碳排放量
        [NameInMap("net_reductions")]
        [Validation(Required=false)]
        public string NetReductions { get; set; }

        // 年同比
        [NameInMap("year_compare_last_per")]
        [Validation(Required=false)]
        public string YearCompareLastPer { get; set; }

        // 碳排放量单位
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 碳排放量单位显示标签
        [NameInMap("unit_label")]
        [Validation(Required=false)]
        public string UnitLabel { get; set; }

        // 各月份排放数据列表
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<AnnualMonthEmissionDatum> List { get; set; }

    }

}
