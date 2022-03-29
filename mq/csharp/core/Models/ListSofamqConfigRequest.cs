// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class ListSofamqConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 页号
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // key
        [NameInMap("property")]
        [Validation(Required=false)]
        public string Property { get; set; }

        // target name
        [NameInMap("target_name")]
        [Validation(Required=false)]
        public string TargetName { get; set; }

        // cluster or broker type
        [NameInMap("target_type")]
        [Validation(Required=false)]
        public long? TargetType { get; set; }

    }

}
