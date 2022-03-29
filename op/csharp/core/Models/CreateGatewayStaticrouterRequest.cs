// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class CreateGatewayStaticrouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // 套件版本
        [NameInMap("suit_version")]
        [Validation(Required=true)]
        public string SuitVersion { get; set; }

        // 分组名称
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

        // accessKey
        [NameInMap("accesskey")]
        [Validation(Required=true)]
        public string Accesskey { get; set; }

        // 后端地址
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

    }

}
