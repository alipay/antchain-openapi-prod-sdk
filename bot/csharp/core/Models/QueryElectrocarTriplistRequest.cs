// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarTriplistRequest : TeaModel {
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

        // MONTH（月）
        // WEEK（周）
        // DAY（日）
        [NameInMap("time_dimension")]
        [Validation(Required=true)]
        public string TimeDimension { get; set; }

        // Long	时间戳（每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
        [NameInMap("time_value")]
        [Validation(Required=true)]
        public long? TimeValue { get; set; }

        // 分页
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 分页
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
