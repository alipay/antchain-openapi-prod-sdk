// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class GetImageRiskdetailurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

    }

}
