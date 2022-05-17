// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 中间件集群
    public class MiddlewareCluster : TeaModel {
        // 集群id 
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 集群名字
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // 支持的region 列表
        [NameInMap("enable_regions")]
        [Validation(Required=true)]
        public List<string> EnableRegions { get; set; }

        // 支持的dataCenter 列表
        [NameInMap("enable_data_centers")]
        [Validation(Required=false)]
        public List<string> EnableDataCenters { get; set; }

        // 支持的zone 列表
        [NameInMap("enable_zones")]
        [Validation(Required=false)]
        public List<string> EnableZones { get; set; }

        // acvip 地址
        [NameInMap("acvip_endpoint")]
        [Validation(Required=true)]
        public string AcvipEndpoint { get; set; }

    }

}
