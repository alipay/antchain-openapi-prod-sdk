// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class QueryStaffAttendanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 员工工号
        [NameInMap("job_number")]
        [Validation(Required=true)]
        public string JobNumber { get; set; }

        // 考勤月份
        [NameInMap("score_dates")]
        [Validation(Required=true)]
        public List<string> ScoreDates { get; set; }

        // 供应商
        [NameInMap("sup_code")]
        [Validation(Required=true)]
        public string SupCode { get; set; }

    }

}
