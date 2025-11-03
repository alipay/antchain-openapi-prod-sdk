// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 美柚审核信息存储请求
    public class MeiyouAuditSaveWebRequest : TeaModel {
        // 审核记录ID
        [NameInMap("audit_id")]
        [Validation(Required=false)]
        public long? AuditId { get; set; }

        // 主题ID
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // 内容文本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 发布时间戳(毫秒)
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

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

        // 操作人
        [NameInMap("audit_operator")]
        [Validation(Required=false)]
        public string AuditOperator { get; set; }

        // 审核楼
        [NameInMap("audit_floor")]
        [Validation(Required=false)]
        public long? AuditFloor { get; set; }

        // 版本
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // 主题信息
        [NameInMap("topic_infos")]
        [Validation(Required=false)]
        public List<MeiyouTopicWebInfo> TopicInfos { get; set; }

    }

}
