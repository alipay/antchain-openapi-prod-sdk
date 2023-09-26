// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightStatistichistogramRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 自定义通知指标的ID
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 多个维度名称，空表示所有维度
        [NameInMap("dimensions")]
        [Validation(Required=false)]
        public List<string> Dimensions { get; set; }

        // 查询开始时间，毫秒时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 查询结束时间，毫秒时间戳
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
