// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QuerySofamqGroupnameRequest : TeaModel {
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

        // 查询最大数量
        [NameInMap("num")]
        [Validation(Required=false)]
        public long? Num { get; set; }

        // 用于模糊搜索的 groupId 关键字
        [NameInMap("group_id")]
        [Validation(Required=false)]
        public string GroupId { get; set; }

    }

}
