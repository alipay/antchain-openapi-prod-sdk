// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用健康分查询
    public class AppPortraitAppHealthScoreQuery : TeaModel {
        // 应用id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // health_score
        [NameInMap("health_score")]
        [Validation(Required=false)]
        public long? HealthScore { get; set; }

        // 同比上升下降分数
        [NameInMap("y2y")]
        [Validation(Required=false)]
        public long? Y2y { get; set; }

        // 上升下降原因列表
        [NameInMap("reason_list")]
        [Validation(Required=false)]
        public List<string> ReasonList { get; set; }

    }

}
