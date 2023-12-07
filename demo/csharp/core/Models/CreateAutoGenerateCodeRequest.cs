// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class CreateAutoGenerateCodeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 必填参数
        [NameInMap("string_1")]
        [Validation(Required=true)]
        public string String1 { get; set; }

        // 非必填参数
        [NameInMap("string_2")]
        [Validation(Required=false)]
        public string String2 { get; set; }

        // 长度限制2~5位
        [NameInMap("string_3")]
        [Validation(Required=true, MaxLength=5)]
        public string String3 { get; set; }

        // 长度限制3~5位
        [NameInMap("string_4")]
        [Validation(Required=false, MaxLength=5)]
        public string String4 { get; set; }

        // 数值必填
        [NameInMap("number_1")]
        [Validation(Required=true)]
        public long? Number1 { get; set; }

        // 数值非必填
        [NameInMap("number_2")]
        [Validation(Required=false)]
        public long? Number2 { get; set; }

        // 最小2，最大10
        [NameInMap("number_3")]
        [Validation(Required=true)]
        public long? Number3 { get; set; }

        // 最小1，最大5
        [NameInMap("number_4")]
        [Validation(Required=false)]
        public long? Number4 { get; set; }

        // boolean必填
        [NameInMap("boolean_1")]
        [Validation(Required=true)]
        public bool? Boolean1 { get; set; }

        // boolean非必填
        [NameInMap("boolean_2")]
        [Validation(Required=false)]
        public bool? Boolean2 { get; set; }

        // 必填日期
        [NameInMap("date_1")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date1 { get; set; }

        // 非必填日期
        [NameInMap("date_2")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Date2 { get; set; }

        // 必填array
        [NameInMap("array_1")]
        [Validation(Required=true)]
        public List<long?> Array1 { get; set; }

        // 非必填array
        [NameInMap("array_2")]
        [Validation(Required=false)]
        public List<long?> Array2 { get; set; }

        // 必填struct
        [NameInMap("struct_1")]
        [Validation(Required=true)]
        public GroupAClass Struct1 { get; set; }

        // 非必填struct
        [NameInMap("struct_2")]
        [Validation(Required=true)]
        public GroupAClass Struct2 { get; set; }

    }

}
