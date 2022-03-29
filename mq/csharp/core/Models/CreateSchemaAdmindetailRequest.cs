// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSchemaAdmindetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // SOFAMQ的实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 值校验
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

        // 租户
        [NameInMap("schema_tenant")]
        [Validation(Required=false)]
        public string SchemaTenant { get; set; }

        // 序列化方式
        [NameInMap("serialization")]
        [Validation(Required=true)]
        public string Serialization { get; set; }

        // 类型
        [NameInMap("schema_type")]
        [Validation(Required=true)]
        public string SchemaType { get; set; }

    }

}
