// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreatePrivatecontractUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 私有云实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 私有云系统内部生成的id
        [NameInMap("user_inner_id")]
        [Validation(Required=true)]
        public string UserInnerId { get; set; }

        // 用户类型,个人PERSON，企业ORG
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户名称, 个人为个人名称，企业为企业名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户证件类型，默认个人,身份证CRED_PSN_CH_IDCARD；
        // 企业,统一社会信用代码,CRED_ORG_USCC
        [NameInMap("user_cert_type")]
        [Validation(Required=true)]
        public string UserCertType { get; set; }

        // 证件号码
        [NameInMap("user_cert_number")]
        [Validation(Required=true)]
        public string UserCertNumber { get; set; }

    }

}
