// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboardsentinelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 数据日期 yyyyMMdd
        [NameInMap("date")]
        [Validation(Required=false)]
        public string Date { get; set; }

        // 预警分页页码
        [NameInMap("page")]
        [Validation(Required=false)]
        public long? Page { get; set; }

        // 预警每页条数，上限 50
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

    }

}
