// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // YuqingMessage
    public class YuqingMessage : TeaModel {
        // 作者头像地址
        [NameInMap("author_avatar_url")]
        [Validation(Required=false)]
        public string AuthorAvatarUrl { get; set; }

        // 粉丝数
        [NameInMap("author_followers_count")]
        [Validation(Required=false)]
        public long? AuthorFollowersCount { get; set; }

        // 好友数
        [NameInMap("author_friends_count")]
        [Validation(Required=false)]
        public long? AuthorFriendsCount { get; set; }

        // 作者id
        [NameInMap("author_id")]
        [Validation(Required=false)]
        public string AuthorId { get; set; }

        // 作者名称
        [NameInMap("author_name")]
        [Validation(Required=false)]
        public string AuthorName { get; set; }

        // 发文数
        [NameInMap("author_statuses_count")]
        [Validation(Required=false)]
        public long? AuthorStatusesCount { get; set; }

        // 作者认证类型
        [NameInMap("author_verify_type")]
        [Validation(Required=false)]
        public string AuthorVerifyType { get; set; }

        // 舆情文章被抓取的时间戳
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 文章正文内容
        [NameInMap("doc_content")]
        [Validation(Required=false)]
        public string DocContent { get; set; }

        // 文章摘要
        [NameInMap("doc_content_brief")]
        [Validation(Required=false)]
        public string DocContentBrief { get; set; }

        // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
        [NameInMap("doc_content_sign")]
        [Validation(Required=false)]
        public string DocContentSign { get; set; }

        // 文章唯一docId
        [NameInMap("doc_id")]
        [Validation(Required=false)]
        public string DocId { get; set; }

        // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
        [NameInMap("doc_self_content_sign")]
        [Validation(Required=false)]
        public string DocSelfContentSign { get; set; }

        // 文章标题
        [NameInMap("doc_title")]
        [Validation(Required=false)]
        public string DocTitle { get; set; }

        // 原文地址
        [NameInMap("doc_url")]
        [Validation(Required=false)]
        public string DocUrl { get; set; }

        // 情感的正负面，-1代表负面，1代表非负面
        [NameInMap("emotion_type")]
        [Validation(Required=false)]
        public long? EmotionType { get; set; }

        // 命中的搜索词列表
        [NameInMap("highlight_keywords")]
        [Validation(Required=false)]
        public List<string> HighlightKeywords { get; set; }

        // 媒体类型，枚举值
        [NameInMap("media_type")]
        [Validation(Required=false)]
        public string MediaType { get; set; }

        // 舆情消息类型:转发,评论/回复, 原文,群聊等
        [NameInMap("message_type")]
        [Validation(Required=false)]
        public string MessageType { get; set; }

        // 文章的父docId，如被转发的文章docId
        [NameInMap("parent_doc_id")]
        [Validation(Required=false)]
        public string ParentDocId { get; set; }

        // 舆情文章的发布时间戳
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

        // 相关性得分
        [NameInMap("relevance_score")]
        [Validation(Required=false)]
        public long? RelevanceScore { get; set; }

        // 相似文章数
        [NameInMap("similar_number")]
        [Validation(Required=false)]
        public long? SimilarNumber { get; set; }

        // 微博评论id
        [NameInMap("weibo_comment_id")]
        [Validation(Required=false)]
        public string WeiboCommentId { get; set; }

        // 微博消息id
        [NameInMap("weibo_mid")]
        [Validation(Required=false)]
        public string WeiboMid { get; set; }

    }

}
