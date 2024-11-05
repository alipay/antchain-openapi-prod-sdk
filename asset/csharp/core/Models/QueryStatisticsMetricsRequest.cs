// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ASSET.Models
{
    public class QueryStatisticsMetricsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 请求唯一id
        [NameInMap("request_unique_id")]
        [Validation(Required=false)]
        public string RequestUniqueId { get; set; }

        // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 查询开始时间: DAY:20240911; MONTH:202409
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 查询结束日期
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 日期单位: DAY,MONTH
        [NameInMap("date_unit")]
        [Validation(Required=true)]
        public string DateUnit { get; set; }

    }

}
