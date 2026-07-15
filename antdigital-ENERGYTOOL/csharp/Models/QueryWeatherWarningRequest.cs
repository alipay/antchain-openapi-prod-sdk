// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryWeatherWarningRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 省份行政编码
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 查询日期，格式：yyyy-MM-dd
        [NameInMap("query_date")]
        [Validation(Required=false)]
        public string QueryDate { get; set; }

        // 城市行政编码
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

    }

}
