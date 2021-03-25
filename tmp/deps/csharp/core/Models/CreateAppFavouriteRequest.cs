// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateAppFavouriteRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户要收藏的应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 用户登录名
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

    }

}
