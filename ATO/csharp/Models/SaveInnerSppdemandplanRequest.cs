// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SaveInnerSppdemandplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商家租户ID，须校验调用方对该租户的访问授权
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链路追踪ID，1~64字符；写操作同时作为幂等号
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 空为新增，非空为编辑
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public string PlanId { get; set; }

        // APP / WECHAT
        [NameInMap("product_form")]
        [Validation(Required=true)]
        public string ProductForm { get; set; }

        // 正整数，≤metadata.maxVolume
        [NameInMap("target_volume")]
        [Validation(Required=true)]
        public long? TargetVolume { get; set; }

        // 正整数，≤target_volume
        [NameInMap("min_volume")]
        [Validation(Required=false)]
        public long? MinVolume { get; set; }

        // 正整数，≥target_volume，≤metadata.maxVolume
        [NameInMap("max_volume")]
        [Validation(Required=false)]
        public long? MaxVolume { get; set; }

        // JSON数组，code数组，只允许元数据中的指标；不传或[]清空，重复元素拒绝
        [NameInMap("focus_metrics")]
        [Validation(Required=false)]
        public string FocusMetrics { get; set; }

        // HH:mm:ss，与结束时间同时传或同时不传
        [NameInMap("daily_start_time")]
        [Validation(Required=false)]
        public string DailyStartTime { get; set; }

        // HH:mm:ss，须晚于开始时间；不传两者为全天，一期不支持跨日
        [NameInMap("daily_end_time")]
        [Validation(Required=false)]
        public string DailyEndTime { get; set; }

        // 元/成交，非负十进制，最多2位小数
        [NameInMap("target_cost")]
        [Validation(Required=false)]
        public string TargetCost { get; set; }

        // 0~1，最多4位小数
        [NameInMap("expected_risk_pass_rate")]
        [Validation(Required=false)]
        public string ExpectedRiskPassRate { get; set; }

        // 0~1，最多4位小数
        [NameInMap("expected_deal_rate")]
        [Validation(Required=false)]
        public string ExpectedDealRate { get; set; }

        // 0~1，最多4位小数
        [NameInMap("expected_order_rate")]
        [Validation(Required=false)]
        public string ExpectedOrderRate { get; set; }

        // ≤100字符，不传清空
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 默认false保存草稿；true同时提交审核
        [NameInMap("submit_audit")]
        [Validation(Required=false)]
        public bool? SubmitAudit { get; set; }

    }

}
