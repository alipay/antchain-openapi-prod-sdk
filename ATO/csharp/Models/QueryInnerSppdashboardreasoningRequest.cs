// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboardreasoningRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // traceid
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 数据日期 yyyyMMdd
        [NameInMap("date")]
        [Validation(Required=false)]
        public string Date { get; set; }

        // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
        [NameInMap("module")]
        [Validation(Required=true)]
        public string Module { get; set; }

        // 增量游标(毫秒)；<=0 返回最近 6 条
        [NameInMap("since_time")]
        [Validation(Required=false)]
        public string SinceTime { get; set; }

    }

}
