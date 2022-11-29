// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class CountEcarActivedataResponse : TeaModel {
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

        // 指定时间区间内的活动数据笔数
        [NameInMap("data_entry_count")]
        [Validation(Required=false)]
        public long? DataEntryCount { get; set; }

        // 总碳排放量
        [NameInMap("total_emissions")]
        [Validation(Required=false)]
        public string TotalEmissions { get; set; }

        // 各活动数据用量累计
        [NameInMap("active_data_amount_list")]
        [Validation(Required=false)]
        public List<AnyStatisticalItem> ActiveDataAmountList { get; set; }

        // 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
        [NameInMap("emissions_intensity")]
        [Validation(Required=false)]
        public string EmissionsIntensity { get; set; }

        // 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
        [NameInMap("each_month_emissions")]
        [Validation(Required=false)]
        public string EachMonthEmissions { get; set; }

        // 额外统计数据统计结果
        [NameInMap("extra_statistic_datum_list")]
        [Validation(Required=false)]
        public List<AnyAmountItem> ExtraStatisticDatumList { get; set; }

    }

}
