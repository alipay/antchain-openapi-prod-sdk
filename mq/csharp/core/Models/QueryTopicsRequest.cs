// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryTopicsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // eventcode
        [NameInMap("eventcode")]
        [Validation(Required=true)]
        public string Eventcode { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // page num
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public int? PageNum { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public int? PageSize { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
