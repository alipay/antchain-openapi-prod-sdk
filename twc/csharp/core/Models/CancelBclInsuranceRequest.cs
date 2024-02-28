// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelBclInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租赁宝plus订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 保险单号
        [NameInMap("bcl_insurance_record_id")]
        [Validation(Required=true, MaxLength=64)]
        public string BclInsuranceRecordId { get; set; }

        // 人保退保时必填
        [NameInMap("renbao_ext_info")]
        [Validation(Required=false)]
        public RenbaoExtInfo RenbaoExtInfo { get; set; }

        // 保司code，枚举值 HZ_RENBAO: 杭州人保
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCode { get; set; }

    }

}
