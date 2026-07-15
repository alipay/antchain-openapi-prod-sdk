// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryElectricMarketpriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 市场码
        [NameInMap("market_code")]
        [Validation(Required=true)]
        public string MarketCode { get; set; }

        // 查询类型:DAY_AHEAD 日前预测 / REALTIME 实时,可单传或都传
        [NameInMap("query_type_list")]
        [Validation(Required=true)]
        public List<string> QueryTypeList { get; set; }

        // 查询日期起始,格式 yyyy-MM-dd,与 query_date_end 配套闭区间,最多7天,与 query_date_list 二选一
        [NameInMap("query_date_start")]
        [Validation(Required=false)]
        public string QueryDateStart { get; set; }

        // 查询日期结束,格式 yyyy-MM-dd,与 query_date_start 配套闭区间,最多7天,与 query_date_list 二选一
        [NameInMap("query_date_end")]
        [Validation(Required=false)]
        public string QueryDateEnd { get; set; }

        // 查询日期列表,格式 yyyy-MM-dd,与 start/end 二选一,最多7个
        [NameInMap("query_date_list")]
        [Validation(Required=false)]
        public List<string> QueryDateList { get; set; }

        // 时点起始,1~96 整数,不传默认1
        [NameInMap("period_start")]
        [Validation(Required=false)]
        public long? PeriodStart { get; set; }

        // 时点结束,1~96 整数,不传默认96
        [NameInMap("period_end")]
        [Validation(Required=false)]
        public long? PeriodEnd { get; set; }

    }

}
