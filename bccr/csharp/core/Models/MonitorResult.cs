// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 监测任务结果
    public class MonitorResult : TeaModel {
        // 监测任务ID
        // 
        [NameInMap("monitor_task_id")]
        [Validation(Required=true)]
        public string MonitorTaskId { get; set; }

        // 监测结果ID
        // 
        [NameInMap("monitor_result_id")]
        [Validation(Required=true)]
        public string MonitorResultId { get; set; }

        // 侵权网址
        // 
        // 
        [NameInMap("infr_url")]
        [Validation(Required=false)]
        public string InfrUrl { get; set; }

        // 侵权主体
        // 
        // 
        [NameInMap("infr_host")]
        [Validation(Required=false)]
        public string InfrHost { get; set; }

        // 侵权标题
        // 
        // 
        [NameInMap("infr_title")]
        [Validation(Required=false)]
        public string InfrTitle { get; set; }

        // 侵权内容上传时间
        // 
        // 
        [NameInMap("infr_time")]
        [Validation(Required=false)]
        public long? InfrTime { get; set; }

        // 侵权详情
        // 
        [NameInMap("detail")]
        [Validation(Required=false)]
        public string Detail { get; set; }

        // 发布者
        [NameInMap("poster")]
        [Validation(Required=false)]
        public string Poster { get; set; }

        // 侵权内容发布时间
        [NameInMap("post_date")]
        [Validation(Required=false)]
        public long? PostDate { get; set; }

        // 侵权内容发现时间
        [NameInMap("find_date")]
        [Validation(Required=false)]
        public long? FindDate { get; set; }

        // 观看数
        [NameInMap("view_count")]
        [Validation(Required=false)]
        public long? ViewCount { get; set; }

        // 点赞数
        [NameInMap("like_count")]
        [Validation(Required=false)]
        public long? LikeCount { get; set; }

        // 评论数
        [NameInMap("comment_count")]
        [Validation(Required=false)]
        public long? CommentCount { get; set; }

        // 转发数
        [NameInMap("repost_count")]
        [Validation(Required=false)]
        public long? RepostCount { get; set; }

        // 侵权文件下载链接
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 疑似侵权反馈时间
        [NameInMap("infr_feedback_time")]
        [Validation(Required=false)]
        public long? InfrFeedbackTime { get; set; }

        // 个人主页链接
        [NameInMap("poster_id_url")]
        [Validation(Required=false)]
        public string PosterIdUrl { get; set; }

    }

}
