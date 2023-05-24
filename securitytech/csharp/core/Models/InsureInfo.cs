// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 保单信息
    public class InsureInfo : TeaModel {
        // 保单时间
        [NameInMap("modify_time")]
        [Validation(Required=true)]
        public string ModifyTime { get; set; }

        // 蚂蚁L5产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 保险产品code
        [NameInMap("insure_product")]
        [Validation(Required=true)]
        public string InsureProduct { get; set; }

        // 保险产品价格
        [NameInMap("insure_price")]
        [Validation(Required=true)]
        public string InsurePrice { get; set; }

        // 保险品种
        [NameInMap("insure_type")]
        [Validation(Required=true)]
        public string InsureType { get; set; }

        // 付款方式
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 保险期数
        [NameInMap("insure_period")]
        [Validation(Required=true)]
        public string InsurePeriod { get; set; }

        // 保单状态
        [NameInMap("policy_status")]
        [Validation(Required=true)]
        public string PolicyStatus { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

        // 保司信用代码
        [NameInMap("insure_comp_credit_no")]
        [Validation(Required=true)]
        public string InsureCompCreditNo { get; set; }

    }

}
