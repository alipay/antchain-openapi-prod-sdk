// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 机构用数记录查询结果（公积金业务）
    public class CpfDataUsageLogVO : TeaModel {
        // 使用方名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 使用时间
        [NameInMap("usage_time")]
        [Validation(Required=true)]
        public string UsageTime { get; set; }

        // 数据项描述
        [NameInMap("data_desc")]
        [Validation(Required=true)]
        public string DataDesc { get; set; }

        // 用途
        [NameInMap("purpose")]
        [Validation(Required=true)]
        public string Purpose { get; set; }

        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

    }

}
