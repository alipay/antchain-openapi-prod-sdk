// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QueryMeiyouAuditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 审核记录ID
        [NameInMap("audit_ids")]
        [Validation(Required=false)]
        public List<long?> AuditIds { get; set; }

        // 美柚itag关联状态
        [NameInMap("audit_state")]
        [Validation(Required=true)]
        public string AuditState { get; set; }

        // 开始时间
        [NameInMap("gmt_create_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreateStart { get; set; }

        // 结束时间
        [NameInMap("gmt_create_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreateEnd { get; set; }

        // 最大条数
        [NameInMap("max_num")]
        [Validation(Required=false)]
        public long? MaxNum { get; set; }

        // 数据来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

    }

}
