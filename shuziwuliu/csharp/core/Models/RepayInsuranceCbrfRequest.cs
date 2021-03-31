// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class RepayInsuranceCbrfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 物流公司业务线的简称
        [NameInMap("business_id")]
        [Validation(Required=false, MaxLength=50)]
        public string BusinessId { get; set; }

        // 保司编码
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=16)]
        public string InsuranceCode { get; set; }

        //  险种
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ProductCode { get; set; }

        // 客户的订单编号
        [NameInMap("related_order_no")]
        [Validation(Required=true, MaxLength=256)]
        public string RelatedOrderNo { get; set; }

        // 保单号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=50)]
        public string PolicyNo { get; set; }

        // 投保响应编码
        [NameInMap("insured_receipt_no")]
        [Validation(Required=true, MaxLength=40)]
        public string InsuredReceiptNo { get; set; }

        // 2位ISO国家编码
        [NameInMap("dest_country")]
        [Validation(Required=true, MaxLength=256)]
        public string DestCountry { get; set; }

        // 理赔时间
        [NameInMap("claim_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ClaimTime { get; set; }

        // 理赔金额，单位为元，依据实际情况计算的理赔金额，最多小数点后2位
        [NameInMap("claim_amount")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimAmount { get; set; }

        // 达到国内仓库时间
        [NameInMap("dwa_time")]
        [Validation(Required=false)]
        public string DwaTime { get; set; }

    }

}
