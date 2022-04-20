// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 查询结构体
    public class SearchCondition : TeaModel {
        // 搭配词
        [NameInMap("ass_keyword_list")]
        [Validation(Required=false)]
        public List<string> AssKeywordList { get; set; }

        // 被@的用户名称
        [NameInMap("at_author_name_list")]
        [Validation(Required=false)]
        public List<string> AtAuthorNameList { get; set; }

        // 作者名称
        [NameInMap("author_name_list")]
        [Validation(Required=false)]
        public List<string> AuthorNameList { get; set; }

        // 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
        [NameInMap("comments_level")]
        [Validation(Required=false)]
        public long? CommentsLevel { get; set; }

        // 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
        [NameInMap("content_len_level")]
        [Validation(Required=false)]
        public string ContentLenLevel { get; set; }

        // 抓取截止时间
        [NameInMap("create_time_end")]
        [Validation(Required=false)]
        public long? CreateTimeEnd { get; set; }

        // 抓取起始时间
        [NameInMap("create_time_start")]
        [Validation(Required=false)]
        public long? CreateTimeStart { get; set; }

        // 文章签名
        [NameInMap("doc_content_sign")]
        [Validation(Required=false)]
        public string DocContentSign { get; set; }

        // 舆情文章唯一docId
        [NameInMap("doc_id_list")]
        [Validation(Required=false)]
        public List<string> DocIdList { get; set; }

        // 是否去重
        [NameInMap("duplicate_removal")]
        [Validation(Required=false)]
        public bool? DuplicateRemoval { get; set; }

        // 情感类型，1非负，-1负面
        [NameInMap("emotion_type")]
        [Validation(Required=false)]
        public long? EmotionType { get; set; }

        // 是否高亮关键词
        [NameInMap("enable_keyword_highlight")]
        [Validation(Required=false)]
        public bool? EnableKeywordHighlight { get; set; }

        // 排除被@的用户名称
        [NameInMap("exclude_at_author_name_list")]
        [Validation(Required=false)]
        public List<string> ExcludeAtAuthorNameList { get; set; }

        // 排除作者名称
        [NameInMap("exclude_author_name_list")]
        [Validation(Required=false)]
        public List<string> ExcludeAuthorNameList { get; set; }

        // 排除网站域名
        [NameInMap("exclude_host_name_list")]
        [Validation(Required=false)]
        public List<string> ExcludeHostNameList { get; set; }

        // 排除关键词标签Id列表
        [NameInMap("exclude_keyword_tag_ids")]
        [Validation(Required=false)]
        public List<long?> ExcludeKeywordTagIds { get; set; }

        // 排除词
        [NameInMap("exclude_keyword_list")]
        [Validation(Required=false)]
        public List<string> ExcludeKeywordList { get; set; }

        // 标题排除词
        [NameInMap("exclude_keyword_list_in_title")]
        [Validation(Required=false)]
        public List<string> ExcludeKeywordListInTitle { get; set; }

        // 排除媒体库id列表
        [NameInMap("exclude_media_library_id_list")]
        [Validation(Required=false)]
        public List<long?> ExcludeMediaLibraryIdList { get; set; }

        // 排除媒体名称
        [NameInMap("exclude_media_name_list")]
        [Validation(Required=false)]
        public List<string> ExcludeMediaNameList { get; set; }

        // 排除媒体类型，枚举值
        [NameInMap("exclude_media_type_list")]
        [Validation(Required=false)]
        public List<string> ExcludeMediaTypeList { get; set; }

        // 排除消息类型，枚举值
        [NameInMap("exclude_message_type_list")]
        [Validation(Required=false)]
        public List<string> ExcludeMessageTypeList { get; set; }

        // 文章是否含有图片
        [NameInMap("has_image")]
        [Validation(Required=false)]
        public bool? HasImage { get; set; }

        // 是否含有视频
        [NameInMap("has_video")]
        [Validation(Required=false)]
        public bool? HasVideo { get; set; }

        // 网站域名
        [NameInMap("host_name_list")]
        [Validation(Required=false)]
        public List<string> HostNameList { get; set; }

        // 关键词标签Id列表
        [NameInMap("keyword_tag_ids")]
        [Validation(Required=false)]
        public List<long?> KeywordTagIds { get; set; }

        // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
        [NameInMap("likes_level")]
        [Validation(Required=false)]
        public long? LikesLevel { get; set; }

        // 媒体库id列表
        [NameInMap("media_library_id_list")]
        [Validation(Required=false)]
        public List<long?> MediaLibraryIdList { get; set; }

        // 媒体名称
        [NameInMap("media_name_list")]
        [Validation(Required=false)]
        public List<string> MediaNameList { get; set; }

        // 体类型，枚举值
        [NameInMap("media_type_list")]
        [Validation(Required=false)]
        public List<string> MediaTypeList { get; set; }

        // 消息类型，枚举值
        [NameInMap("message_type_list")]
        [Validation(Required=false)]
        public List<string> MessageTypeList { get; set; }

        // 当前页
        [NameInMap("page_now")]
        [Validation(Required=false)]
        public long? PageNow { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 舆情父文章的docId，一般用于查看某篇文章的评论
        [NameInMap("parent_doc_id")]
        [Validation(Required=false)]
        public string ParentDocId { get; set; }

        // 关键词
        [NameInMap("pos_keyword_list")]
        [Validation(Required=false)]
        public List<string> PosKeywordList { get; set; }

        // 标题关键词
        [NameInMap("pos_keyword_list_in_title")]
        [Validation(Required=false)]
        public List<string> PosKeywordListInTitle { get; set; }

        // 截止发布时间
        [NameInMap("publish_time_end")]
        [Validation(Required=false)]
        public long? PublishTimeEnd { get; set; }

        // 起始发布时间
        [NameInMap("publish_time_start")]
        [Validation(Required=false)]
        public long? PublishTimeStart { get; set; }

        // 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
        [NameInMap("reads_level")]
        [Validation(Required=false)]
        public long? ReadsLevel { get; set; }

        // 相关性等级，1：低，2：中，3：高，4：低级别以上
        [NameInMap("relevance_level")]
        [Validation(Required=false)]
        public long? RelevanceLevel { get; set; }

        // 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
        [NameInMap("repost_level")]
        [Validation(Required=false)]
        public long? RepostLevel { get; set; }

        // 排序字段
        [NameInMap("sort_by")]
        [Validation(Required=false)]
        public string SortBy { get; set; }

        // 指定正反向排序
        [NameInMap("sort_by_direction")]
        [Validation(Required=false)]
        public string SortByDirection { get; set; }

        // #话题
        [NameInMap("topic_list")]
        [Validation(Required=false)]
        public List<string> TopicList { get; set; }

        // 舆情文章截止更新时间
        [NameInMap("update_time_end")]
        [Validation(Required=false)]
        public long? UpdateTimeEnd { get; set; }

        // 舆情文章起始更新时间
        [NameInMap("update_time_start")]
        [Validation(Required=false)]
        public long? UpdateTimeStart { get; set; }

    }

}
