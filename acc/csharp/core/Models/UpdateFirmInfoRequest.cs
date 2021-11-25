// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class UpdateFirmInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 云蚂侧用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public long? UserId { get; set; }

        // 信息同步类型
        [NameInMap("operation_type")]
        [Validation(Required=true)]
        public string OperationType { get; set; }

        // 云蚂侧企业id
        [NameInMap("firm_id")]
        [Validation(Required=true)]
        public long? FirmId { get; set; }

        // 企业名称
        [NameInMap("firm_name")]
        [Validation(Required=false)]
        public string FirmName { get; set; }

        // 企业认证状态
        [NameInMap("firm_cert_status")]
        [Validation(Required=false)]
        public string FirmCertStatus { get; set; }

        // 企业认证did
        [NameInMap("firm_did")]
        [Validation(Required=false)]
        public string FirmDid { get; set; }

        // 账户角色
        [NameInMap("refer_type")]
        [Validation(Required=false)]
        public string ReferType { get; set; }

        // 云蚂侧原管理员账户id
        [NameInMap("former_admin_id")]
        [Validation(Required=false)]
        public long? FormerAdminId { get; set; }

    }

}
