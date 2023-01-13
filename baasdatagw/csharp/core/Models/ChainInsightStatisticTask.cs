// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 数据洞察统计任务
    public class ChainInsightStatisticTask : TeaModel {
        // 统计任务ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 统计任务类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 所属链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 统计的链上合约地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 任务产出的指标信息
        [NameInMap("metrics")]
        [Validation(Required=true)]
        public List<ChainInsightStatisticMetricMeta> Metrics { get; set; }

        // 任务创建时间，毫秒时间戳
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 任务修改时间，毫秒时间戳
        [NameInMap("modify_time")]
        [Validation(Required=false)]
        public long? ModifyTime { get; set; }

        // 任务状态：Running： 运行中； Paused: 已暂停
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
