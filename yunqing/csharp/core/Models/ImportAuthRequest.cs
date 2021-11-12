// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ImportAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权的条件
        [NameInMap("condition")]
        [Validation(Required=true)]
        public string Condition { get; set; }

        // 授权的KEY, 目前Local只有YUNYOU_LOCAL_AUTH_KEY
        [NameInMap("condition_key")]
        [Validation(Required=true)]
        public string ConditionKey { get; set; }

        // 是否被删除授权
        [NameInMap("deleted")]
        [Validation(Required=true)]
        public bool? Deleted { get; set; }

        // 授权的MD5
        [NameInMap("md5")]
        [Validation(Required=true)]
        public string Md5 { get; set; }

        // 昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 是否为负责人
        [NameInMap("primary")]
        [Validation(Required=true)]
        public bool? Primary { get; set; }

        // 用户真名
        [NameInMap("real_name")]
        [Validation(Required=true)]
        public string RealName { get; set; }

        // 角色
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

        // 用户的域账号
        [NameInMap("source_id")]
        [Validation(Required=true)]
        public string SourceId { get; set; }

        // 工号
        [NameInMap("work_no")]
        [Validation(Required=false)]
        public string WorkNo { get; set; }

    }

}
