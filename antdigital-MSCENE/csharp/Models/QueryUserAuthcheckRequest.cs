// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MSCENE.Models
{
    public class QueryUserAuthcheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 小游戏ID
        [NameInMap("mini_program_id")]
        [Validation(Required=true)]
        public string MiniProgramId { get; set; }

        // 平台ID
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 用户身份认证令牌
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 开放用户ID
        [NameInMap("open_uid")]
        [Validation(Required=true)]
        public string OpenUid { get; set; }

    }

}
