// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // OpsDataCheck
    public class OpsDataCheck : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 指标名称
        [NameInMap("target_name")]
        [Validation(Required=true)]
        public string TargetName { get; set; }

        // 指标类型
        [NameInMap("target_type")]
        [Validation(Required=true)]
        public string TargetType { get; set; }

        // 0：异常 1：正常
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // check_result
        [NameInMap("check_result")]
        [Validation(Required=true)]
        public string CheckResult { get; set; }

    }

}
