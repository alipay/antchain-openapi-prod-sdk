// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 政策信息
    public class Policy : TeaModel {
        // 政策id
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

        // 政策名称
        [NameInMap("policy_name")]
        [Validation(Required=true)]
        public string PolicyName { get; set; }

        // 政策类型
        [NameInMap("policy_type")]
        [Validation(Required=true)]
        public string PolicyType { get; set; }

        // 政策生效时间
        [NameInMap("start_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 政策失效时间
        [NameInMap("end_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 下架时间
        [NameInMap("offline_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OfflineTime { get; set; }

        // 政策状态
        [NameInMap("policy_status")]
        [Validation(Required=true)]
        public string PolicyStatus { get; set; }

        // 创建者
        [NameInMap("creator")]
        [Validation(Required=true)]
        public string Creator { get; set; }

        // 修改者
        [NameInMap("modifier")]
        [Validation(Required=true)]
        public string Modifier { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
