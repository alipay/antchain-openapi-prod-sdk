// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class QueryAntsaasStaffingcInsurePriceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=true)]
        public string EnterpriseName { get; set; }

        // 统一社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 产品ID
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 职业编码: 
        // default-1-一类职业;
        // default-2-二类职业;
        // default-3-三类职业;
        // default-4-四类职业;
        [NameInMap("job_code")]
        [Validation(Required=true)]
        public string JobCode { get; set; }

        // 周期：
        // 1D、
        // 30D、
        // 360D
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

    }

}
