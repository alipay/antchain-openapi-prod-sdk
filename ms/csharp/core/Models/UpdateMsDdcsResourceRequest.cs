// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class UpdateMsDdcsResourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称，长度50以内
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 应用名称，长度50以内
        [NameInMap("new_app_name")]
        [Validation(Required=false)]
        public string NewAppName { get; set; }

        // 资源描述，长度150以内
        [NameInMap("new_name")]
        [Validation(Required=false)]
        public string NewName { get; set; }

        // 机构名称，长度20以内
        [NameInMap("new_region")]
        [Validation(Required=false)]
        public string NewRegion { get; set; }

        // 配置类名称，长度150以内
        [NameInMap("new_resource_id")]
        [Validation(Required=false)]
        public string NewResourceId { get; set; }

        // 机构名称，长度20以内
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 配置类名称，长度150以内
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
