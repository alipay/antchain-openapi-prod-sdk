// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 新车信息
    public class NewCarInfo : TeaModel {
        // 车系
        [NameInMap("car_series")]
        [Validation(Required=true)]
        public string CarSeries { get; set; }

        // 金融方案
        [NameInMap("finaical_plan")]
        [Validation(Required=false)]
        public string FinaicalPlan { get; set; }

        // 车系id
        [NameInMap("car_series_id")]
        [Validation(Required=false)]
        public string CarSeriesId { get; set; }

        // 请求提交唯一id
        [NameInMap("submit_id")]
        [Validation(Required=false)]
        public string SubmitId { get; set; }

        // 预计购买时间
        [NameInMap("purcharse_time")]
        [Validation(Required=false)]
        public string PurcharseTime { get; set; }

        // 用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public CarUserInfo UserInfo { get; set; }

    }

}
