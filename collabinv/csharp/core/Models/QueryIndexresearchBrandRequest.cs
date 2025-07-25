// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryIndexresearchBrandRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品牌编码
        [NameInMap("brand_code")]
        [Validation(Required=true)]
        public string BrandCode { get; set; }

        // 时间月份yyyyMM
        [NameInMap("month")]
        [Validation(Required=false)]
        public string Month { get; set; }

        // test-测试数据。prod-正式数据
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 时间频次 m-月/d-天
        [NameInMap("time_type")]
        [Validation(Required=true)]
        public string TimeType { get; set; }

    }

}
