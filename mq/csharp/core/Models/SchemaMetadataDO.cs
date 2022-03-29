// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // schema元数据对象
    public class SchemaMetadataDO : TeaModel {
        // app名称
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // 兼容性
        [NameInMap("compatibility")]
        [Validation(Required=true)]
        public string Compatibility { get; set; }

        // 坐标依赖
        [NameInMap("coordinate")]
        [Validation(Required=true)]
        public string Coordinate { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 同步站点
        [NameInMap("sync_sites")]
        [Validation(Required=true)]
        public string SyncSites { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // Schema指定的序列化方式
        [NameInMap("serialization")]
        [Validation(Required=true)]
        public string Serialization { get; set; }

    }

}
