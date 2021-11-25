// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class UpdateUserInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云蚂侧用户id
        // 
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 信息同步类型
        // 
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 用户邮箱
        // 
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 用户手机号码
        // 
        [NameInMap("telphone")]
        [Validation(Required=false)]
        public string Telphone { get; set; }

        // 个人认证状态
        // 
        [NameInMap("user_cert_status")]
        [Validation(Required=false)]
        public string UserCertStatus { get; set; }

        // 个人认证did
        // 
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public string UserDid { get; set; }

    }

}
