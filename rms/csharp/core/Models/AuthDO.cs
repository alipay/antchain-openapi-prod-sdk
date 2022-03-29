// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 权限
    public class AuthDO : TeaModel {
        // ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 登录名
        [NameInMap("user_login_name")]
        [Validation(Required=true)]
        public string UserLoginName { get; set; }

        // 权限码
        [NameInMap("auth")]
        [Validation(Required=true)]
        public string Auth { get; set; }

        // 权限的资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 权限的资源ID (如果FOLDER或CUSTOM_PLUGIN，需要自行转成Number类型)
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

    }

}
