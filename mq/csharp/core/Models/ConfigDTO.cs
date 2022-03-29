// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // config信息
    public class ConfigDTO : TeaModel {
        // create time
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // modify time
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // key
        [NameInMap("property")]
        [Validation(Required=true)]
        public string Property { get; set; }

        // 目标名
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // cluster type or broker type
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public long? TargetType { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 生效范围
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // 版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public long? Version { get; set; }

        // 删除标志
        [NameInMap("delete_mark")]
        [Validation(Required=true)]
        public string DeleteMark { get; set; }

    }

}
