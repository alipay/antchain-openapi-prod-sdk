// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 单元服务器(pod)信息
    public class CellServer : TeaModel {
        // 单元名字
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // server或pod组
        [NameInMap("servers")]
        [Validation(Required=false)]
        public List<string> Servers { get; set; }

        // cell中host的数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // servers列表对应的服务器/pod ip地址列表，目前仅在antcloud.ldc.opsplan.stages.export方法中返回
        [NameInMap("server_ips")]
        [Validation(Required=false)]
        public List<string> ServerIps { get; set; }

    }

}
