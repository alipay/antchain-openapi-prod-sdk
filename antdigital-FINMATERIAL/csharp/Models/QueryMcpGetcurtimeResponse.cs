// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryMcpGetcurtimeResponse : TeaModel {
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

        // 当前日期时间
        [NameInMap("datetime")]
        [Validation(Required=false)]
        public string Datetime { get; set; }

        // 周几
        [NameInMap("week_day")]
        [Validation(Required=false)]
        public string WeekDay { get; set; }

        // 是否交易日
        [NameInMap("if_trading_day")]
        [Validation(Required=false)]
        public string IfTradingDay { get; set; }

        // 是否周最后交易日
        [NameInMap("if_week_end")]
        [Validation(Required=false)]
        public string IfWeekEnd { get; set; }

        // 是否月最后交易日
        [NameInMap("if_month_end")]
        [Validation(Required=false)]
        public string IfMonthEnd { get; set; }

        // 是否季最后交易日
        [NameInMap("if_quarter_end")]
        [Validation(Required=false)]
        public string IfQuarterEnd { get; set; }

        // 是否年最后交易日
        [NameInMap("if_year_end")]
        [Validation(Required=false)]
        public string IfYearEnd { get; set; }

    }

}
