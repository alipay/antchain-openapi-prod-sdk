// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 查询手续费结果信息
    public class CommissionResult : TeaModel {
        // 手续费生效时间
        [NameInMap("begin_time")]
        [Validation(Required=true)]
        public long? BeginTime { get; set; }

        // 手续费
        [NameInMap("commission")]
        [Validation(Required=true)]
        public string Commission { get; set; }

        // 手续费信息ID
        [NameInMap("commission_id")]
        [Validation(Required=true)]
        public string CommissionId { get; set; }

        // 手续费状态（0可用，1停用，2禁用）
        [NameInMap("commission_status")]
        [Validation(Required=true)]
        public long? CommissionStatus { get; set; }

        // 手续费失效时间
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

        // 商品类型
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public long? EquityType { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 手续费信息ID
        [NameInMap("commission_sub_id")]
        [Validation(Required=true)]
        public string CommissionSubId { get; set; }

    }

}
