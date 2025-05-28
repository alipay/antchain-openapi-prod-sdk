// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class SubmitAuthNewcarRequest : TeaModel {
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

        // 用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public CarUserInfo UserInfo { get; set; }

        // 车系
        [NameInMap("car_series")]
        [Validation(Required=true)]
        public string CarSeries { get; set; }

        // 金融方案
        [NameInMap("finaical_plan")]
        [Validation(Required=false)]
        public string FinaicalPlan { get; set; }

        // 预计购买时间
        [NameInMap("purcharse_time")]
        [Validation(Required=false)]
        public string PurcharseTime { get; set; }

    }

}
