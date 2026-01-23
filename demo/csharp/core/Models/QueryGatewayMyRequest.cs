// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class QueryGatewayMyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 字符串类型入参
        [NameInMap("test_1")]
        [Validation(Required=true)]
        public string Test1 { get; set; }

        // 数字入参
        [NameInMap("test_2")]
        [Validation(Required=true)]
        public long? Test2 { get; set; }

        // 布尔值入参
        [NameInMap("test_3")]
        [Validation(Required=true)]
        public bool? Test3 { get; set; }

        // 日期类型入参
        [NameInMap("test_4")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Test4 { get; set; }

        // 数组类型入参（数组内元素为结构体类型）
        [NameInMap("test_5")]
        [Validation(Required=true)]
        public List<NumberTest> Test5 { get; set; }

        // 结构体入参
        [NameInMap("test_6")]
        [Validation(Required=true)]
        public NumberTest Test6 { get; set; }

    }

}
