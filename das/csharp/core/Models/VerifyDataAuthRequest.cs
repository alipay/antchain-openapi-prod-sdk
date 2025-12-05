// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class VerifyDataAuthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户表示类型
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 数据源连接器空间id
        [NameInMap("source_space_id")]
        [Validation(Required=true)]
        public string SourceSpaceId { get; set; }

        // 企业信用代码
        [NameInMap("enterprise_code")]
        [Validation(Required=true)]
        public string EnterpriseCode { get; set; }

        // 授权token
        [NameInMap("authorized_token")]
        [Validation(Required=true)]
        public string AuthorizedToken { get; set; }

    }

}
