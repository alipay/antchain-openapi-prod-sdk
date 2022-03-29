// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class SaveTenantconfigSpiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // configKey参数名称
        [NameInMap("entity_name")]
        [Validation(Required=true)]
        public string EntityName { get; set; }

        // end_point
        [NameInMap("end_point")]
        [Validation(Required=true)]
        public string EndPoint { get; set; }

        // 默认为CamelCase
        [NameInMap("field_naming_strategy")]
        [Validation(Required=false)]
        public string FieldNamingStrategy { get; set; }

        // 云厂商类型
        [NameInMap("cloud_vendor_type")]
        [Validation(Required=false)]
        public string CloudVendorType { get; set; }

    }

}
