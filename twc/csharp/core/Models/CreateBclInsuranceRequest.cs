// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateBclInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // bcl订单id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderId { get; set; }

        // 保司code
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCode { get; set; }

        // 投保人信息
        [NameInMap("holder")]
        [Validation(Required=true)]
        public BclInsuranceUserInfo Holder { get; set; }

        // 被保人信息
        [NameInMap("insured")]
        [Validation(Required=true)]
        public BclInsuranceUserInfo Insured { get; set; }

    }

}
