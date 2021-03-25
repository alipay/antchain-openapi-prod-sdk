// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 阿里云资源结构体
    public class AliyunResource : TeaModel {
        // resource_type/resource_id
        [NameInMap("resource")]
        [Validation(Required=true)]
        public string Resource { get; set; }

        // 资源所属的租户
        [NameInMap("resource_tenant")]
        [Validation(Required=true)]
        public string ResourceTenant { get; set; }

    }

}
