// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // schema详情
    public class SchemaDetailDO : TeaModel {
        // 注释
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // schema内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 值校验规则
        [NameInMap("field_validate_rule")]
        [Validation(Required=false)]
        public string FieldValidateRule { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 序列化类型
        [NameInMap("serialization")]
        [Validation(Required=true)]
        public string Serialization { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // schema类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 唯一ID
        [NameInMap("uniq_id")]
        [Validation(Required=false)]
        public string UniqId { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

    }

}
