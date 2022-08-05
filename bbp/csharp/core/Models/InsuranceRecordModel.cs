// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    // 用户宠物保单信息模型
    public class InsuranceRecordModel : TeaModel {
        // 保司编码
        [NameInMap("mechanism_code")]
        [Validation(Required=true)]
        public string MechanismCode { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保险产品SKU
        [NameInMap("third_part_sku")]
        [Validation(Required=false)]
        public string ThirdPartSku { get; set; }

        // 保司机构名称
        [NameInMap("mechanism_name")]
        [Validation(Required=false)]
        public string MechanismName { get; set; }

        // 保险类型
        [NameInMap("insurance_type")]
        [Validation(Required=true)]
        public string InsuranceType { get; set; }

        // 用户ID，天猫uid
        [NameInMap("source_uid")]
        [Validation(Required=true)]
        public string SourceUid { get; set; }

        // 渠道来源 TIANMAO（天猫）
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 用户类型 PERSON
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 扩展信息 （保单附件路径）
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

        // 保单生效时间
        [NameInMap("policy_effect_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PolicyEffectTime { get; set; }

        // 保单失效时间
        [NameInMap("policy_invalid_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PolicyInvalidTime { get; set; }

        // 订单总金额 单位为分
        [NameInMap("policy_total_amount")]
        [Validation(Required=true)]
        public long? PolicyTotalAmount { get; set; }

        // 保费支付日期
        [NameInMap("policy_pay_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PolicyPayDate { get; set; }

        // 保单支付总期数
        [NameInMap("policy_total_stage")]
        [Validation(Required=true)]
        public long? PolicyTotalStage { get; set; }

        // 每期支付金额
        [NameInMap("policy_stage_aver_amount")]
        [Validation(Required=false)]
        public long? PolicyStageAverAmount { get; set; }

        // 保单已支付期数
        [NameInMap("policy_paid_stage")]
        [Validation(Required=false)]
        public long? PolicyPaidStage { get; set; }

        // 订单时间
        [NameInMap("order_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderTime { get; set; }

        // 活动码 赠险/商业险
        [NameInMap("activity_code")]
        [Validation(Required=false)]
        public string ActivityCode { get; set; }

        // 授权类型 0 非授权 1 授权
        [NameInMap("authorization_type")]
        [Validation(Required=true)]
        public long? AuthorizationType { get; set; }

    }

}
