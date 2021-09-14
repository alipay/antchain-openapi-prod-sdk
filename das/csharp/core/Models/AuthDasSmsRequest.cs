// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class AuthDasSmsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 手机验证码
        [NameInMap("verification_code")]
        [Validation(Required=true)]
        public string VerificationCode { get; set; }

        // 授权实例biz_uuid
        [NameInMap("auth_instance_biz_uuid")]
        [Validation(Required=true)]
        public string AuthInstanceBizUuid { get; set; }

        // 授权企业信息
        [NameInMap("auth_person_enterprise_info")]
        [Validation(Required=false)]
        public AuthPersonEnterpriseInfo AuthPersonEnterpriseInfo { get; set; }

        // 授权人个人信息
        [NameInMap("auth_person_individual_info")]
        [Validation(Required=false)]
        public AuthPersonIndividualInfo AuthPersonIndividualInfo { get; set; }

    }

}
