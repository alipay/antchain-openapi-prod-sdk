// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 热搜结构体
    public class HotspotMessage : TeaModel {
        // 热搜/热榜/话题 对应用户id (可能为空)
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 在榜总时间
        [NameInMap("total_exist_timestamp")]
        [Validation(Required=true)]
        public long? TotalExistTimestamp { get; set; }

        // 下榜时间
        [NameInMap("last_exist_date_format")]
        [Validation(Required=true)]
        public string LastExistDateFormat { get; set; }

        // 爬虫爬取的时间
        [NameInMap("crawler_time_fmt")]
        [Validation(Required=true)]
        public string CrawlerTimeFmt { get; set; }

        // 第一次上榜的格式化时间
        [NameInMap("first_exist_date_format")]
        [Validation(Required=true)]
        public string FirstExistDateFormat { get; set; }

        // 最高排名的总时长
        [NameInMap("max_rank_total_timestamp")]
        [Validation(Required=true)]
        public long? MaxRankTotalTimestamp { get; set; }

        // 跟随量
        [NameInMap("followers_count")]
        [Validation(Required=true)]
        public long? FollowersCount { get; set; }

        // 在榜单中的最高排名
        [NameInMap("max_rank")]
        [Validation(Required=true)]
        public long? MaxRank { get; set; }

        // 阅读量
        [NameInMap("reads_count")]
        [Validation(Required=true)]
        public long? ReadsCount { get; set; }

        // 评论数
        [NameInMap("comments_count")]
        [Validation(Required=true)]
        public long? CommentsCount { get; set; }

        // 标题，例如话题的标题就是话题本身
        [NameInMap("doc_title")]
        [Validation(Required=true)]
        public string DocTitle { get; set; }

        // 首次上榜排名
        [NameInMap("first_rank")]
        [Validation(Required=true)]
        public long? FirstRank { get; set; }

        // 原创人数
        [NameInMap("original_count")]
        [Validation(Required=true)]
        public long? OriginalCount { get; set; }

        // 主持人
        [NameInMap("presenter_name")]
        [Validation(Required=true)]
        public string PresenterName { get; set; }

        // 热搜在热搜榜的位置
        [NameInMap("rank")]
        [Validation(Required=true)]
        public long? Rank { get; set; }

        // 热点媒体类型
        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

        // 文档id
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public string DocId { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 热度值
        [NameInMap("hot_value")]
        [Validation(Required=true)]
        public long? HotValue { get; set; }

        // 内容，热榜数据中存在着文章，热文就是有内容的
        [NameInMap("doc_content")]
        [Validation(Required=true)]
        public string DocContent { get; set; }

        // 热搜/热榜/话题 对应用户名称 (可能为空)
        [NameInMap("screen_name")]
        [Validation(Required=true)]
        public string ScreenName { get; set; }

        // 热点媒体子类型
        [NameInMap("media_sub_type")]
        [Validation(Required=true)]
        public string MediaSubType { get; set; }

        // 讨论量
        [NameInMap("discusses_count")]
        [Validation(Required=true)]
        public long? DiscussesCount { get; set; }

        // 分类
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 视频量
        [NameInMap("video_count")]
        [Validation(Required=true)]
        public long? VideoCount { get; set; }

        // 最高排名的格式化总时长
        [NameInMap("max_rank_total_time_format")]
        [Validation(Required=true)]
        public string MaxRankTotalTimeFormat { get; set; }

        // 省
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

        // 在榜格式化的总时间
        [NameInMap("total_exist_time_format")]
        [Validation(Required=true)]
        public string TotalExistTimeFormat { get; set; }

        // 第一次上最高排名的时间
        [NameInMap("first_top_exist_timestamp")]
        [Validation(Required=true)]
        public long? FirstTopExistTimestamp { get; set; }

        // 链接地址
        [NameInMap("doc_url")]
        [Validation(Required=false)]
        public string DocUrl { get; set; }

        // 最大的热度值
        [NameInMap("max_hot_value")]
        [Validation(Required=true)]
        public long? MaxHotValue { get; set; }

        // 市
        [NameInMap("city")]
        [Validation(Required=true)]
        public string City { get; set; }

        // 最后一次上榜的时间
        [NameInMap("last_exist_timestamp")]
        [Validation(Required=true)]
        public long? LastExistTimestamp { get; set; }

        // 第一次上最高排名的时间
        [NameInMap("first_top_exist_date_format")]
        [Validation(Required=true)]
        public string FirstTopExistDateFormat { get; set; }

        // 下榜排名
        [NameInMap("last_rank")]
        [Validation(Required=true)]
        public long? LastRank { get; set; }

        // 首次上榜热度
        [NameInMap("first_hot_value")]
        [Validation(Required=true)]
        public long? FirstHotValue { get; set; }

        // 热搜类型
        [NameInMap("hotspot_type")]
        [Validation(Required=true)]
        public string HotspotType { get; set; }

        // 第一次上榜的时间
        [NameInMap("first_xxist_timestamp")]
        [Validation(Required=true)]
        public long? FirstXxistTimestamp { get; set; }

        // 第一次上榜时间
        [NameInMap("first_exist_timestamp")]
        [Validation(Required=false)]
        public long? FirstExistTimestamp { get; set; }

    }

}
