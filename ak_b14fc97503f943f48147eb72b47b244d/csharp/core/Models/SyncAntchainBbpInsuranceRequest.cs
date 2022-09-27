// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    public class SyncAntchainBbpInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保司编码
        [NameInMap("mechanism_code")]
        [Validation(Required=true)]
        public string MechanismCode { get; set; }

        // 理赔加密信息
        [NameInMap("policy_encryption_context")]
        [Validation(Required=true)]
        public string PolicyEncryptionContext { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true)]
        public string PolicyNo { get; set; }

        // 保险产品SKU
        [NameInMap("thirdpart_sku")]
        [Validation(Required=true)]
        public string ThirdpartSku { get; set; }

        // 保司名称
        [NameInMap("mechanism_name")]
        [Validation(Required=false)]
        public string MechanismName { get; set; }

        // 保单种类，险种
        [NameInMap("insurance_type")]
        [Validation(Required=false)]
        public string InsuranceType { get; set; }

        // 操作类型
        // 下单 支付 理赔 退单
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 赔付单号
        [NameInMap("claim_order_no")]
        [Validation(Required=true)]
        public string ClaimOrderNo { get; set; }

        // 理赔申请时间（毫秒值）
        [NameInMap("claim_apply_time")]
        [Validation(Required=true)]
        public long? ClaimApplyTime { get; set; }

        // 理赔赔付时间（毫秒值）
        [NameInMap("claim_pay_time")]
        [Validation(Required=true)]
        public string ClaimPayTime { get; set; }

        // 理赔申请金额，单位元，保留小数点两位BigDecimal
        [NameInMap("claim_apply_amount")]
        [Validation(Required=true)]
        public long? ClaimApplyAmount { get; set; }

        // 理赔金额
        [NameInMap("claim_amount")]
        [Validation(Required=true)]
        public long? ClaimAmount { get; set; }

        // 授权列表
        [NameInMap("authorize_records")]
        [Validation(Required=false)]
        public List<AuthorizeRecordsPairs> AuthorizeRecords { get; set; }

    }

}
