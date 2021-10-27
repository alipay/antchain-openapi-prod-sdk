// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class UpdatePrivatecontractUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 私有云实例id
        // 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 私有云生成的内部用户Id
        // 
        [NameInMap("user_inner_id")]
        [Validation(Required=true)]
        public string UserInnerId { get; set; }

        // 用户名称，个人用户为个人名称，企业为企业名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 企业用户必填，企业法人名称
        // 
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 法人证件类型
        // 
        [NameInMap("legal_cert_type")]
        [Validation(Required=false)]
        public string LegalCertType { get; set; }

        // 法人证件对应的证件号码
        // 
        [NameInMap("legal_cert_number")]
        [Validation(Required=false)]
        public string LegalCertNumber { get; set; }

    }

}
