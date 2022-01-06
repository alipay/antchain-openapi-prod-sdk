// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QueryServiceSubscriberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // middleware instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // app name
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // num of page
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public int? PageNum { get; set; }

        // size of page
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

    }

}
