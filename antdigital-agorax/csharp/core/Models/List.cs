// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 发券记录列表
    public class List : TeaModel {
        // 记录ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 活动ID
        [NameInMap("activity_id")]
        [Validation(Required=false)]
        public string ActivityId { get; set; }

        // 活动名称
        [NameInMap("activity_name")]
        [Validation(Required=false)]
        public string ActivityName { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 业务ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
        [NameInMap("record_source")]
        [Validation(Required=false)]
        public string RecordSource { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

    }

}
