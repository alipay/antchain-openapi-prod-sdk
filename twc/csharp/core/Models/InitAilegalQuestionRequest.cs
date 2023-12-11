// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class InitAilegalQuestionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 提问问题
        [NameInMap("question")]
        [Validation(Required=true, MaxLength=1000)]
        public string Question { get; set; }

        // 是否开启新会话
        [NameInMap("first")]
        [Validation(Required=true)]
        public bool? First { get; set; }

        // 用户id，用户唯一标识
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户类型，参见枚举类UserTypeEnum
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // app类型，参见枚举类AppTypeEnum
        [NameInMap("app_type")]
        [Validation(Required=true)]
        public string AppType { get; set; }

    }

}
