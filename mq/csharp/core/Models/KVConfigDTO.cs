// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // kv配置
    public class KVConfigDTO : TeaModel {
        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // key
        [NameInMap("uniform_key")]
        [Validation(Required=true)]
        public string UniformKey { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // value
        [NameInMap("uniform_value")]
        [Validation(Required=true)]
        public string UniformValue { get; set; }

    }

}
