// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // appkey
        [NameInMap("appkey")]
        [Validation(Required=false)]
        public string Appkey { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // cluster_type
        [NameInMap("cluster_type")]
        [Validation(Required=false)]
        public string ClusterType { get; set; }

        // 0:单机房,1:本地优先,2:交叉部署,3:独占LDC
        [NameInMap("deploy_mode")]
        [Validation(Required=false)]
        public string DeployMode { get; set; }

        // unshared: 独占
        // shared: 共享
        [NameInMap("ldc_mode")]
        [Validation(Required=false)]
        public string LdcMode { get; set; }

        // remark
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
