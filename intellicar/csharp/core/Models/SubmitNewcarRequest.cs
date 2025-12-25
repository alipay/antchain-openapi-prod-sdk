// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class SubmitNewcarRequest : TeaModel {
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

        // 	
        // 预计购买时间
        [NameInMap("purcharse_time")]
        [Validation(Required=false)]
        public string PurcharseTime { get; set; }

        // xxxx
        [NameInMap("car_series_id")]
        [Validation(Required=false)]
        public string CarSeriesId { get; set; }

        // 提交线索的唯一id
        [NameInMap("submit_id")]
        [Validation(Required=false)]
        public string SubmitId { get; set; }

        // 汽车之家车系id
        [NameInMap("qc_car_series_id")]
        [Validation(Required=false)]
        public string QcCarSeriesId { get; set; }

        // 匹配源
        [NameInMap("match_source")]
        [Validation(Required=false)]
        public string MatchSource { get; set; }

    }

}
