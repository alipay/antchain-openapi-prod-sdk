// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // spanner集群单元信息
    public class SpannerClusterUnitInfo : TeaModel {
        // 单元IP地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 所属集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 容器id
        [NameInMap("container_id")]
        [Validation(Required=true)]
        public string ContainerId { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modify")]
        [Validation(Required=true)]
        public string GmtModify { get; set; }

        // 集群单元状态 ： 1-下线状态 2- 上线状态 3-删除状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 扩展信息，json字符串格式
        [NameInMap("extend_properties")]
        [Validation(Required=false)]
        public string ExtendProperties { get; set; }

    }

}
