// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 网段配置
    public class TransparentProxyIpPair : TeaModel {
        // 是否是默认值
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public long? DefaultValue { get; set; }

        // 起始IP
        [NameInMap("start_ip")]
        [Validation(Required=true)]
        public string StartIp { get; set; }

        // 终止IP
        [NameInMap("end_ip")]
        [Validation(Required=true)]
        public string EndIp { get; set; }

    }

}
