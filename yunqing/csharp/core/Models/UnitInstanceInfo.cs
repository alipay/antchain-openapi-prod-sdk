// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 部署单元实例信息
    public class UnitInstanceInfo : TeaModel {
        // 部署单元内服务实例列表
        [NameInMap("app_services")]
        [Validation(Required=true)]
        public List<AppServiceInfo> AppServices { get; set; }

    }

}
