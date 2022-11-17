// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 事由
    public class Reason : TeaModel {
        // 事由ID
        [NameInMap("reason_id")]
        [Validation(Required=true)]
        public string ReasonId { get; set; }

        // 事由名称
        [NameInMap("reason_name")]
        [Validation(Required=true)]
        public string ReasonName { get; set; }

        // 附件文字说明
        [NameInMap("comment")]
        [Validation(Required=true)]
        public string Comment { get; set; }

        // 排序
        [NameInMap("sort")]
        [Validation(Required=true)]
        public long? Sort { get; set; }

        // 是否必须上传附件
        [NameInMap("is_need_attachment")]
        [Validation(Required=true)]
        public bool? IsNeedAttachment { get; set; }

    }

}
