// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerSppdashboardsummaryRequest : TeaModel {
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

        // 目标领域：SCREENING 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
        [NameInMap("module")]
        [Validation(Required=true)]
        public string Module { get; set; }

        // 待总结的输入内容（该领域的指标/观察文本）
        [NameInMap("input")]
        [Validation(Required=true)]
        public string Input { get; set; }

        // 原始数据（补充上下文，可选）
        [NameInMap("raw_data")]
        [Validation(Required=false)]
        public string RawData { get; set; }

        // 数据日期 yyyyMMdd，仅作上下文/记录
        [NameInMap("date")]
        [Validation(Required=false)]
        public string Date { get; set; }

    }

}
