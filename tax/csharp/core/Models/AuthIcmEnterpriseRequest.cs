// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class AuthIcmEnterpriseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份id，统一社会信用编码or其他
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 企业名称
        [NameInMap("identity_name")]
        [Validation(Required=false)]
        public string IdentityName { get; set; }

        // 授权类型，不动产100，电力200
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 授权订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 扩展信息	
        [NameInMap("extend_info")]
        [Validation(Required=true)]
        public StandardAuthExtendInfoRequest ExtendInfo { get; set; }

        // 法人姓名
        [NameInMap("cognizant_name")]
        [Validation(Required=false)]
        public string CognizantName { get; set; }

        // 法人手机号
        [NameInMap("cognizant_mobile")]
        [Validation(Required=false)]
        public string CognizantMobile { get; set; }

        // 法人身份证号
        [NameInMap("cognizant_id")]
        [Validation(Required=false)]
        public string CognizantId { get; set; }

    }

}
