// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // cluster
    public class ClusterDO : TeaModel {
        // appkey
        [NameInMap("appkey")]
        [Validation(Required=false)]
        public string Appkey { get; set; }

        // cluster
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // cluster cluster
        [NameInMap("cluster_type")]
        [Validation(Required=false)]
        public string ClusterType { get; set; }

        // 0:单机房
        [NameInMap("deploy_mode")]
        [Validation(Required=false)]
        public string DeployMode { get; set; }

        // ldc模式
        [NameInMap("ldc_mode")]
        [Validation(Required=false)]
        public string LdcMode { get; set; }

        // remark
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
