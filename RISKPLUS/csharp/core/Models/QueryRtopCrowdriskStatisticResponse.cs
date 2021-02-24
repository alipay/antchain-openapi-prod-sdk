// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCrowdriskStatisticResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        [NameInMap("level_distribution")]
        [Validation(Required=false)]
        public List<RtopLevelDistribution> LevelDistribution { get; set; }

        // 按地区统计
        [NameInMap("region_distribution")]
        [Validation(Required=false)]
        public List<RtopRegionalDistribution> RegionDistribution { get; set; }

        [NameInMap("type_distribution")]
        [Validation(Required=false)]
        public List<RtopTypeDistribution> TypeDistribution { get; set; }

    }

}
