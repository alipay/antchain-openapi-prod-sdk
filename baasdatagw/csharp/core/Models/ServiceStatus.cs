// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 服务状态
    public class ServiceStatus : TeaModel {
        // 服务名称
        [NameInMap("service")]
        [Validation(Required=true)]
        public string Service { get; set; }

        // 服务的开通与关闭状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

    }

}
