// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    public class TypeMcpResponseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // string类型入参
        [NameInMap("string_parameter")]
        [Validation(Required=false)]
        public string StringParameter { get; set; }

        // number类型入参
        [NameInMap("number_parameter")]
        [Validation(Required=false)]
        public long? NumberParameter { get; set; }

        // boolean类型入参
        [NameInMap("boolean_parameter")]
        [Validation(Required=false)]
        public bool? BooleanParameter { get; set; }

        // date类型入参
        [NameInMap("date_parameter")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParameter { get; set; }

        // list_struct类型入参
        [NameInMap("list_parameter")]
        [Validation(Required=false)]
        public List<McpTestStruct> ListParameter { get; set; }

        // struct类型入参
        [NameInMap("struct_parameter")]
        [Validation(Required=false)]
        public McpTestStruct StructParameter { get; set; }

        // 超时时间
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

    }

}
