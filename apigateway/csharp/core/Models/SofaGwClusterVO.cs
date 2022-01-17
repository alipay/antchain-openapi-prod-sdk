// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 集群信息
    public class SofaGwClusterVO : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // hosts
        [NameInMap("hosts")]
        [Validation(Required=false)]
        public List<SofaGwHostVO> Hosts { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例标识
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 集群名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
