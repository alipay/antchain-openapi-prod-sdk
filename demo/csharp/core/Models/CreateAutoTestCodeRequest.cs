// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class CreateAutoTestCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 111
        [NameInMap("string_param_1")]
        [Validation(Required=true)]
        public string StringParam1 { get; set; }

        // 222
        [NameInMap("string_param_2")]
        [Validation(Required=false)]
        public string StringParam2 { get; set; }

        // 111
        [NameInMap("number_param_1")]
        [Validation(Required=true)]
        public long? NumberParam1 { get; set; }

        // 222
        [NameInMap("number_param_2")]
        [Validation(Required=false)]
        public long? NumberParam2 { get; set; }

        // 111
        [NameInMap("bool_param_1")]
        [Validation(Required=true)]
        public bool? BoolParam1 { get; set; }

        // 222
        [NameInMap("bool_param_2")]
        [Validation(Required=false)]
        public bool? BoolParam2 { get; set; }

        // 111
        [NameInMap("date_param_1")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParam1 { get; set; }

        // 222
        [NameInMap("date_param_2")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DateParam2 { get; set; }

        // 111
        [NameInMap("array_param_1")]
        [Validation(Required=true)]
        public List<string> ArrayParam1 { get; set; }

        // 222
        [NameInMap("array_param_2")]
        [Validation(Required=false)]
        public List<string> ArrayParam2 { get; set; }

        // 111
        [NameInMap("struct_param_1")]
        [Validation(Required=true)]
        public AutoCodeModel StructParam1 { get; set; }

        // 222
        [NameInMap("struct_param_2")]
        [Validation(Required=false)]
        public AutoCodeModel StructParam2 { get; set; }

    }

}
