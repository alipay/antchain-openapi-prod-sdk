// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ExportSofamqSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // sofamq instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // schema的唯一ID
        [NameInMap("schema_id")]
        [Validation(Required=true)]
        public string SchemaId { get; set; }

        // 实例代码的变成语言类型，空缺时使用Java
        [NameInMap("language")]
        [Validation(Required=false)]
        public string Language { get; set; }

    }

}
