// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class OperateInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保司编码
        [NameInMap("mechanism_code")]
        [Validation(Required=false)]
        public string MechanismCode { get; set; }

        // 保单加密信息
        [NameInMap("policy_encryption_context")]
        [Validation(Required=false)]
        public string PolicyEncryptionContext { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 保险产品SKU
        [NameInMap("third_part_sku")]
        [Validation(Required=false)]
        public string ThirdPartSku { get; set; }

        // 保险公司名称
        [NameInMap("mechanism_name")]
        [Validation(Required=false)]
        public string MechanismName { get; set; }

        // 保单种类，险种
        [NameInMap("insurance_type")]
        [Validation(Required=true)]
        public string InsuranceType { get; set; }

        // 来源uid，此处指天猫id
        [NameInMap("source_uid")]
        [Validation(Required=true)]
        public string SourceUid { get; set; }

        // 订单来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 投保人
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 投保人类型  自然人/公司
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 投保人电话号码
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

        // 投保人证件号
        [NameInMap("user_cert_no")]
        [Validation(Required=false)]
        public string UserCertNo { get; set; }

        // 拓展信息
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

        // 保单生效时间（毫秒值）
        [NameInMap("policy_effect_time")]
        [Validation(Required=false)]
        public long? PolicyEffectTime { get; set; }

        // 保单失效时间（毫秒值）
        [NameInMap("policy_invalid_time")]
        [Validation(Required=false)]
        public long? PolicyInvalidTime { get; set; }

        // 订单总金额 整型，以分为单位，50000分 = 500.00元
        [NameInMap("policy_total_amount")]
        [Validation(Required=false)]
        public long? PolicyTotalAmount { get; set; }

        // 订单总期数（一次性付款用1）
        [NameInMap("policy_total_stage")]
        [Validation(Required=false)]
        public long? PolicyTotalStage { get; set; }

        // 保费支付日期（毫秒值）
        [NameInMap("policy_pay_date")]
        [Validation(Required=false)]
        public long? PolicyPayDate { get; set; }

        // 已支付保费期数（1代表1期）
        [NameInMap("policy_paid_stage")]
        [Validation(Required=false)]
        public long? PolicyPaidStage { get; set; }

        // 每一期保费金额，整型，以分为单位，50000分 = 500.00元
        [NameInMap("policy_stage_aver_amount")]
        [Validation(Required=false)]
        public long? PolicyStageAverAmount { get; set; }

        // 订单时间（毫秒值）
        [NameInMap("order_time")]
        [Validation(Required=false)]
        public long? OrderTime { get; set; }

        // 操作类型
        // 下单 支付 理赔 退单
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 授权列表
        [NameInMap("authorize_records")]
        [Validation(Required=false)]
        public List<AuthorizeRecordsPairs> AuthorizeRecords { get; set; }

        // 活动码/赠险码
        [NameInMap("activity_code")]
        [Validation(Required=false)]
        public string ActivityCode { get; set; }

        // 授权类型 1-已授权 2-未授权
        [NameInMap("authorization_type")]
        [Validation(Required=true)]
        public long? AuthorizationType { get; set; }

    }

}
