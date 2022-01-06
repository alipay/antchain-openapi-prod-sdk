// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ListSgAuditlogsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 开始时间
        [NameInMap("begin_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BeginTime { get; set; }

        // 截止时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=false)]
        public string OperateType { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 起始页
        [NameInMap("start")]
        [Validation(Required=false)]
        public long? Start { get; set; }

        // 0 失败 1 成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 实体id
        [NameInMap("object_id")]
        [Validation(Required=false)]
        public string ObjectId { get; set; }

        // 实体类型
        [NameInMap("object_type")]
        [Validation(Required=false)]
        public string ObjectType { get; set; }

    }

}
