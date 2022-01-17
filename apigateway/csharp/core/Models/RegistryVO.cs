// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // RegistryVO
    public class RegistryVO : TeaModel {
        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // protocol_support
        [NameInMap("protocol_support")]
        [Validation(Required=false)]
        public List<ProtocolVO> ProtocolSupport { get; set; }

        // 注册中心类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
