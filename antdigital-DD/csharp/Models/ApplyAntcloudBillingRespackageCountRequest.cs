// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class ApplyAntcloudBillingRespackageCountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 外部唯一单据号 不超过64位
        [NameInMap("out_biz_id")]
        [Validation(Required=true)]
        public string OutBizId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 指定实例ID
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 指定模板
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 业务发生时间
        [NameInMap("gmt_service")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtService { get; set; }

        // 是否部分抵扣
        [NameInMap("partial_deduct_flag")]
        [Validation(Required=false)]
        public bool? PartialDeductFlag { get; set; }

        // 是否通知用户
        [NameInMap("need_alert")]
        [Validation(Required=false)]
        public bool? NeedAlert { get; set; }

        // 抵扣量，后续废弃，新业务使用deduct_amount_str
        [NameInMap("deduct_amount")]
        [Validation(Required=false)]
        public long? DeductAmount { get; set; }

        // 来源系统
        [NameInMap("from_app")]
        [Validation(Required=true)]
        public string FromApp { get; set; }

        // json字符串
        [NameInMap("extend_info")]
        [Validation(Required=false)]
        public string ExtendInfo { get; set; }

        // 预占抵扣模式
        [NameInMap("hold")]
        [Validation(Required=false)]
        public bool? Hold { get; set; }

        // 预占时长
        [NameInMap("hold_time")]
        [Validation(Required=false)]
        public long? HoldTime { get; set; }

        // 高精度抵扣量，与deduct_amount互斥，传一个就可以，deduct_amount不支持小数，deduct_amount_str支持小数
        [NameInMap("deduct_amount_str")]
        [Validation(Required=false)]
        public string DeductAmountStr { get; set; }

    }

}
