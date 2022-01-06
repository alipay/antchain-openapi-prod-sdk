// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 透明劫持配置之端口段
    public class TransparentProxyPortPair : TeaModel {
        // 是否是默认值
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public long? DefaultValue { get; set; }

        // 端口
        [NameInMap("end_port")]
        [Validation(Required=true)]
        public long? EndPort { get; set; }

        // 起始端口
        [NameInMap("start_port")]
        [Validation(Required=true)]
        public long? StartPort { get; set; }

    }

}
