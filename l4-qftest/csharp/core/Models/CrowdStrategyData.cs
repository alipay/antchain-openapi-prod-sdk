// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 人群信息
    public class CrowdStrategyData : TeaModel {
        // 人群编码
        [NameInMap("strategy_code")]
        [Validation(Required=true)]
        public string StrategyCode { get; set; }

        // 人群名称
        [NameInMap("strategy_name")]
        [Validation(Required=true)]
        public string StrategyName { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 人群数量
        [NameInMap("strategy_count")]
        [Validation(Required=true)]
        public long? StrategyCount { get; set; }

        // 用户数量
        [NameInMap("user_count")]
        [Validation(Required=true)]
        public long? UserCount { get; set; }

        // 机构名称
        [NameInMap("inst_name")]
        [Validation(Required=false)]
        public string InstName { get; set; }

        // 日期
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

    }

}
