// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightPrivatechaintxhistogramRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟ID
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 链ID列表
        [NameInMap("biz_ids")]
        [Validation(Required=true)]
        public List<string> BizIds { get; set; }

        // 开始时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 统计间隔
        [NameInMap("interval")]
        [Validation(Required=false)]
        public long? Interval { get; set; }

        // 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
        [NameInMap("interval_unit")]
        [Validation(Required=false)]
        public string IntervalUnit { get; set; }

    }

}
