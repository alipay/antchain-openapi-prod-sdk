// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 项目
    public class Project : TeaModel {
        // 项目对应的合约 ID
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 项目结束时间，精确到毫秒，FILM类型订单必填
        [NameInMap("project_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ProjectEndTime { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=false)]
        public string ProjectName { get; set; }

        // 项目开始时间，精确到毫秒，FILM类型订单必填
        [NameInMap("project_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ProjectStartTime { get; set; }

        // 项目类型，目前支持FILM：电影，CAR：汽车
        [NameInMap("project_type")]
        [Validation(Required=true)]
        public string ProjectType { get; set; }

    }

}
