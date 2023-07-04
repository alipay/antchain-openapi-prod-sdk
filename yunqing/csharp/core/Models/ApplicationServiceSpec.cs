// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用服务规格配置
    public class ApplicationServiceSpec : TeaModel {
        // 服务域名
        [NameInMap("domain")]
        [Validation(Required=false)]
        public List<string> Domain { get; set; }

        // 服务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 服务端口
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        // 服务协议，http，tcp
        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

    }

}
