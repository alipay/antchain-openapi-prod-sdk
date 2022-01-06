// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class RetrySgAuthrulegroupsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 服务鉴权黑、白名单 id
        [NameInMap("auth_group_id")]
        [Validation(Required=true)]
        public long? AuthGroupId { get; set; }

        // 服务接口 id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
