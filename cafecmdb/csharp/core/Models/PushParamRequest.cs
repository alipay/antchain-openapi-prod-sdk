// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    public class PushParamRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 更新的键值
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 由于OP不支持MAP，需要使用json字符串
        [NameInMap("value_json")]
        [Validation(Required=true)]
        public string ValueJson { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // value_type
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

        // 参数分组
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

    }

}
