// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // ServiceInfoGroup
    public class ServiceInfoGroup : TeaModel {
        // 发布应用列表
        [NameInMap("service_info_list")]
        [Validation(Required=false)]
        public List<ServiceInfo> ServiceInfoList { get; set; }

    }

}
