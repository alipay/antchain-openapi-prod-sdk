// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboarddistributionRequest : TeaModel {
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

        // 进件日志增量游标（毫秒）；<=0 返回当日最新 logLimit 条
        [NameInMap("since_time")]
        [Validation(Required=false)]
        public long? SinceTime { get; set; }

        // 日志返回条数（最新 logLimit 条，按时间倒序），上限 50
        [NameInMap("log_limit")]
        [Validation(Required=false)]
        public long? LogLimit { get; set; }

    }

}
