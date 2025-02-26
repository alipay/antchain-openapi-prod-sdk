// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class RetryBlockchainBccrDciRegistrationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待补正数登申请id
        [NameInMap("digital_register_id")]
        [Validation(Required=true)]
        public string DigitalRegisterId { get; set; }

        // 替换dci申领id
        [NameInMap("dci_content_id")]
        [Validation(Required=false)]
        public string DciContentId { get; set; }

        // 数登申请声明
        [NameInMap("explanation_info")]
        [Validation(Required=true)]
        public DciExplanationInfo ExplanationInfo { get; set; }

        // 补充文件信息
        [NameInMap("additional_file_info")]
        [Validation(Required=false)]
        public AdditionalFileInfo AdditionalFileInfo { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 权利描述
        [NameInMap("right_scope_desc")]
        [Validation(Required=false)]
        public string RightScopeDesc { get; set; }

        // 申领人联系信息
        [NameInMap("applyer_contact_info")]
        [Validation(Required=false)]
        public ContactInfo ApplyerContactInfo { get; set; }

        // 代理人联系信息
        [NameInMap("platform_contact_info")]
        [Validation(Required=false)]
        public ContactInfo PlatformContactInfo { get; set; }

    }

}
