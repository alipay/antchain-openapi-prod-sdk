// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceDriverRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 扩展字段
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 手机号码
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属平台did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

    }

}
