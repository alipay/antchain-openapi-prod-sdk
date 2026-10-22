// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 主题信息
    public class MeiyouTopicWebInfo : TeaModel {
        // 内容文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>内容文本</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 当前楼层
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_floor")]
        [Validation(Required=false)]
        public long? CurrentFloor { get; set; }

        // 回复楼层
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("call_back_floor")]
        [Validation(Required=false)]
        public long? CallBackFloor { get; set; }

        // 发布时间戳(毫秒)
        // 
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

        // 用户昵称
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("user_nickname")]
        [Validation(Required=false)]
        public string UserNickname { get; set; }

        // 用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户类型
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>q</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 用户头像URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://test">http://test</a></para>
        /// </summary>
        [NameInMap("user_avatar")]
        [Validation(Required=false)]
        public string UserAvatar { get; set; }

        // 主题ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("topic_id")]
        [Validation(Required=false)]
        public long? TopicId { get; set; }

        // 回复楼信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("call_back_floor_content")]
        [Validation(Required=false)]
        public string CallBackFloorContent { get; set; }

        // oss存储地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("oss_images")]
        [Validation(Required=false)]
        public string OssImages { get; set; }

    }

}
