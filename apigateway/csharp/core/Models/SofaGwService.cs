// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // Api信息
    public class SofaGwService : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // cluster name
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // controls
        [NameInMap("controls")]
        [Validation(Required=false)]
        public List<SofaGwControlVO> Controls { get; set; }

        // downstream
        [NameInMap("downstream")]
        [Validation(Required=false)]
        public SofaGwDownstream Downstream { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例标识
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // service name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // service_version
        [NameInMap("service_version")]
        [Validation(Required=false)]
        public string ServiceVersion { get; set; }

        // 上线:online, 下线:offline
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // upstream
        [NameInMap("upstream")]
        [Validation(Required=false)]
        public SofaGwUpstreamVO Upstream { get; set; }

    }

}
