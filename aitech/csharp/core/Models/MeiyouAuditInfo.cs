// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 美柚审核信息
    public class MeiyouAuditInfo : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public long? AuditId { get; set; }

        // 主题ID
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // 内容文本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 发布时间戳
        [NameInMap("publish_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PublishTime { get; set; }

        // 图片URL数组(JSON字符串)
        [NameInMap("images")]
        [Validation(Required=false)]
        public string Images { get; set; }

        // 一级业务
        [NameInMap("primary_business")]
        [Validation(Required=false)]
        public string PrimaryBusiness { get; set; }

        // 二级业务
        [NameInMap("secondary_business")]
        [Validation(Required=false)]
        public string SecondaryBusiness { get; set; }

        // 用户昵称
        [NameInMap("user_nickname")]
        [Validation(Required=false)]
        public string UserNickname { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户类型
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 用户头像URL
        [NameInMap("user_avatar")]
        [Validation(Required=false)]
        public string UserAvatar { get; set; }

        // 审核结果
        [NameInMap("audit_result")]
        [Validation(Required=false)]
        public string AuditResult { get; set; }

        // 审核原因
        [NameInMap("audit_reason")]
        [Validation(Required=false)]
        public string AuditReason { get; set; }

        // 审核原因
        [NameInMap("audit_reason_msg")]
        [Validation(Required=false)]
        public string AuditReasonMsg { get; set; }

        // 操作人
        [NameInMap("audit_operator")]
        [Validation(Required=false)]
        public string AuditOperator { get; set; }

        // 操作时间戳
        [NameInMap("audit_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AuditTime { get; set; }

        // oss 转存后的图像地址
        [NameInMap("oss_images")]
        [Validation(Required=false)]
        public string OssImages { get; set; }

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
