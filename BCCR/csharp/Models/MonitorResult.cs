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
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111111</para>
        /// </summary>
        [NameInMap("monitor_task_id")]
        [Validation(Required=true)]
        public string MonitorTaskId { get; set; }

        // 监测结果ID
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("monitor_result_id")]
        [Validation(Required=true)]
        public string MonitorResultId { get; set; }

        // 侵权网址
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://a.b.c">http://a.b.c</a></para>
        /// </summary>
        [NameInMap("infr_url")]
        [Validation(Required=false)]
        public string InfrUrl { get; set; }

        // 侵权主体
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>hhh</para>
        /// </summary>
        [NameInMap("infr_host")]
        [Validation(Required=false)]
        public string InfrHost { get; set; }

        // 侵权标题
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>biaoti</para>
        /// </summary>
        [NameInMap("infr_title")]
        [Validation(Required=false)]
        public string InfrTitle { get; set; }

        // 侵权内容上传时间
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592807928</para>
        /// </summary>
        [NameInMap("infr_time")]
        [Validation(Required=false)]
        public long? InfrTime { get; set; }

        // 侵权详情
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>details</para>
        /// </summary>
        [NameInMap("detail")]
        [Validation(Required=false)]
        public string Detail { get; set; }

        // 发布者
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("poster")]
        [Validation(Required=false)]
        public string Poster { get; set; }

        // 侵权内容发布时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1626614711096</para>
        /// </summary>
        [NameInMap("post_date")]
        [Validation(Required=false)]
        public long? PostDate { get; set; }

        // 侵权内容发现时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1626614711096</para>
        /// </summary>
        [NameInMap("find_date")]
        [Validation(Required=false)]
        public long? FindDate { get; set; }

        // 观看数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("view_count")]
        [Validation(Required=false)]
        public long? ViewCount { get; set; }

        // 点赞数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("like_count")]
        [Validation(Required=false)]
        public long? LikeCount { get; set; }

        // 评论数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("comment_count")]
        [Validation(Required=false)]
        public long? CommentCount { get; set; }

        // 转发数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("repost_count")]
        [Validation(Required=false)]
        public long? RepostCount { get; set; }

        // 侵权文件下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 疑似侵权反馈时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1592807928</para>
        /// </summary>
        [NameInMap("infr_feedback_time")]
        [Validation(Required=false)]
        public long? InfrFeedbackTime { get; set; }

        // 个人主页链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("poster_id_url")]
        [Validation(Required=false)]
        public string PosterIdUrl { get; set; }

    }

}
