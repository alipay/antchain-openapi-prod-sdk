// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 审计日志
    public class AuditLogModel : TeaModel {
        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=false)]
        public string OperateType { get; set; }

        // sofa.ms.auditlogs.list
        [NameInMap("operate_interface")]
        [Validation(Required=false)]
        public string OperateInterface { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 请求参数
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 响应结果
        [NameInMap("response")]
        [Validation(Required=false)]
        public string Response { get; set; }

        // 0 失败 1 成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
