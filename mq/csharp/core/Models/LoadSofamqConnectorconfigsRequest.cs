// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class LoadSofamqConnectorconfigsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源的类型，代表是来源还是去向，只有两种，对应的值是source 和 sink
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 具体的来源或者去向的类型
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
