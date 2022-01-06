// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddSgAuthrulesRequest : TeaModel {
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

        // 规则所属的白、黑名单id
        [NameInMap("auth_group_id")]
        [Validation(Required=true)]
        public long? AuthGroupId { get; set; }

        // 服务接口id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 待新增的鉴权规则，json 格式字符串
        [NameInMap("auth_rule")]
        [Validation(Required=true)]
        public string AuthRule { get; set; }

    }

}
