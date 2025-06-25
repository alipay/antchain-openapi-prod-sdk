// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryIndexresearchConsumeindustryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 行业
        [NameInMap("industry")]
        [Validation(Required=false)]
        public string Industry { get; set; }

        // 是否线上线下 1:线下，0:线上，-1:全部
        [NameInMap("ofp_type")]
        [Validation(Required=false)]
        public string OfpType { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 分页信息
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageInfo PageInfo { get; set; }

        // 字段排序方式
        [NameInMap("sort")]
        [Validation(Required=false)]
        public List<string> Sort { get; set; }

    }

}
