// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    public class QueryStatisticsOrgoverviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 开始时间
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 结束日期
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 租户
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 请求唯一id
        [NameInMap("request_unique_id")]
        [Validation(Required=true)]
        public string RequestUniqueId { get; set; }

    }

}
