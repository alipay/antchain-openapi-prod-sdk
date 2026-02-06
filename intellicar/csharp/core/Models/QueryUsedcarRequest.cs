// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryUsedcarRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 二手车信息
        [NameInMap("used_car_info")]
        [Validation(Required=true)]
        public UsedCarInfo UsedCarInfo { get; set; }

        // 用户基本信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public CarOwnerUserInfo UserInfo { get; set; }

    }

}
