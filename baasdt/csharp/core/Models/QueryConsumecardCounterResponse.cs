// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardCounterResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 查询的类别（0 商家，1 商品）
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 查询的id（type：0 为accountId 1为goodsId）
        [NameInMap("query_id")]
        [Validation(Required=false)]
        public string QueryId { get; set; }

        // 日统计数据
        [NameInMap("day_counter")]
        [Validation(Required=false)]
        public CounterData DayCounter { get; set; }

        // 月统计数据
        [NameInMap("month_counter")]
        [Validation(Required=false)]
        public CounterData MonthCounter { get; set; }

        // 年统计数据
        [NameInMap("year_counter")]
        [Validation(Required=false)]
        public CounterData YearCounter { get; set; }

        // 季度统计数据
        [NameInMap("quarterly_counter")]
        [Validation(Required=false)]
        public CounterData QuarterlyCounter { get; set; }

    }

}
