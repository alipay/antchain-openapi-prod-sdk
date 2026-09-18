// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryTwevCartravelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 车辆中控id
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 统计时间维度 MONTH（月）/WEEK（周）/DAY（日）
        [NameInMap("time_dimension")]
        [Validation(Required=true)]
        public string TimeDimension { get; set; }

        // 时间戳（时间戳所在月/周/日内的数据，每月的第一天00:00， 每周的第一天00:00， 每日的00:00）
        [NameInMap("time_value")]
        [Validation(Required=true)]
        public long? TimeValue { get; set; }

        // 页数
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // 每页条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
