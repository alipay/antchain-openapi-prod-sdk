// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 链路查询结果的关键字段取值集
    public class TraceQuerySummary : TeaModel {
        // local endpoint ip
        [NameInMap("local_ip")]
        [Validation(Required=false)]
        public List<string> LocalIp { get; set; }

        // local endpoint service name
        [NameInMap("local_service_name")]
        [Validation(Required=false)]
        public List<string> LocalServiceName { get; set; }

        // remote endpoint ip
        [NameInMap("remote_ip")]
        [Validation(Required=false)]
        public List<string> RemoteIp { get; set; }

        // remote endpoint service name
        [NameInMap("remote_service_name")]
        [Validation(Required=false)]
        public List<string> RemoteServiceName { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public List<string> Status { get; set; }

    }

}
