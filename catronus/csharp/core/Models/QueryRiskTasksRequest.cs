// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryRiskTasksRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 当前页数
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 风险ID
        [NameInMap("risk_task_id")]
        [Validation(Required=false)]
        public string RiskTaskId { get; set; }

        // 风险名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 风险等级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        // 风险类型
        [NameInMap("risk_type")]
        [Validation(Required=false)]
        public string RiskType { get; set; }

        // 风险状态
        [NameInMap("risk_task_state")]
        [Validation(Required=false)]
        public string RiskTaskState { get; set; }

        // FROM时间点， 按照时间范围搜索的开始时间点
        [NameInMap("creation_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTimeFrom { get; set; }

        // to时间点， 按照时间范围搜索的结束时间点	
        // 
        [NameInMap("creation_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTimeTo { get; set; }

    }

}
