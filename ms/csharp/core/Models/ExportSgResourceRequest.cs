// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ExportSgResourceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // guardian 导出使用
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 租户id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // drm还是guardian资源
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
