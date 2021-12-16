// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 已购买的规格实例信息(用于控制台查询)
    public class PaidSpecInstance : TeaModel {
        // 规格实例id
        [NameInMap("spec_instance_id")]
        [Validation(Required=true)]
        public string SpecInstanceId { get; set; }

        // 规格名称
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

        // 规格配置(描述)
        [NameInMap("spec_conf")]
        [Validation(Required=false)]
        public string SpecConf { get; set; }

        // 实例开始时间
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 实例到期时间
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 规格实例的运行状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
