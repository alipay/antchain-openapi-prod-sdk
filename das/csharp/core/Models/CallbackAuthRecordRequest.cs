// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class CallbackAuthRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 蚂蚁统一会员ID
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

        // 授权场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 授权的用户信息JSON字符串，根据场景码配置的用户类型传不同的JSON字符串，二要素传{"name":"张三","certNo":"1101111111"}，证件号类型传{"certNo":"1101111111"}
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

    }

}
