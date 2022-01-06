// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddDrmDrmresourcetplinstancesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 资源信息列表
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

        // tpl id
        [NameInMap("tpl_id")]
        [Validation(Required=false)]
        public long? TplId { get; set; }

    }

}
