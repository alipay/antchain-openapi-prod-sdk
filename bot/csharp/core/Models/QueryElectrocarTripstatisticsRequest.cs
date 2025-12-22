// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTripstatisticsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // tuid
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // String	MONTH（月）
        // WEEK（周）
        // DAY（日）
        [NameInMap("time_dimension")]
        [Validation(Required=true)]
        public string TimeDimension { get; set; }

        // 时间戳（每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
        [NameInMap("time_value")]
        [Validation(Required=true)]
        public long? TimeValue { get; set; }

        // 前 n 月/周/日， 包含当前月/周/日（默认9）
        [NameInMap("past_days")]
        [Validation(Required=true)]
        public long? PastDays { get; set; }

    }

}
