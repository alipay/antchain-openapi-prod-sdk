// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class RegisterCarownerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 唯一场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 用户基本信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public CarOwnerUserInfo UserInfo { get; set; }

        // 车辆信息
        [NameInMap("car_info")]
        [Validation(Required=true)]
        public CarInfo CarInfo { get; set; }

    }

}
