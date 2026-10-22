// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 美柚审核信息存储
    public class MeiyouAuditSaveWebInfo : TeaModel {
        // 主题ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // 审核记录ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("audit_id")]
        [Validation(Required=true)]
        public long? AuditId { get; set; }

        // 内容文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>小蜜</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 发布时间戳(毫秒)
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

        // 图片URL数组(JSON字符串)
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("images")]
        [Validation(Required=false)]
        public string Images { get; set; }

        // 一级业务
        /// <summary>
        /// <b>Example:</b>
        /// <para>一级业务</para>
        /// </summary>
        [NameInMap("primary_business")]
        [Validation(Required=false)]
        public string PrimaryBusiness { get; set; }

        // 二级业务
        /// <summary>
        /// <b>Example:</b>
        /// <para>二级业务</para>
        /// </summary>
        [NameInMap("secondary_business")]
        [Validation(Required=false)]
        public string SecondaryBusiness { get; set; }

        // 用户昵称
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户昵称</para>
        /// </summary>
        [NameInMap("user_nickname")]
        [Validation(Required=false)]
        public string UserNickname { get; set; }

        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户ID</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户类型
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>用户类型</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 用户头像URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>http://</para>
        /// </summary>
        [NameInMap("user_avatar")]
        [Validation(Required=false)]
        public string UserAvatar { get; set; }

        //  主题信息
        /// <summary>
        /// <b>Example:</b>
        /// <para> 主题信息</para>
        /// </summary>
        [NameInMap("topic_infos")]
        [Validation(Required=false)]
        public MeiyouTopicWebInfo TopicInfos { get; set; }

    }

}
