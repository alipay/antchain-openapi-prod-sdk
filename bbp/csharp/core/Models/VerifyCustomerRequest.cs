// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class VerifyCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 支付宝uid
        [NameInMap("alipay_uid")]
        [Validation(Required=true)]
        public string AlipayUid { get; set; }

        // 个人名称
        [NameInMap("person_name")]
        [Validation(Required=false)]
        public string PersonName { get; set; }

        // 个人联系电话
        [NameInMap("person_phone")]
        [Validation(Required=false)]
        public string PersonPhone { get; set; }

        // 核验证件号
        [NameInMap("person_cert_no")]
        [Validation(Required=false)]
        public string PersonCertNo { get; set; }

        // 个人身份类型  RESIDENT（身份证）
        [NameInMap("person_cert_type")]
        [Validation(Required=false)]
        public string PersonCertType { get; set; }

    }

}
