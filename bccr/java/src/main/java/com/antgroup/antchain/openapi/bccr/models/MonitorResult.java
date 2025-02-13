// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorResult extends TeaModel {
    // 监测任务ID
    // 
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 监测结果ID
    // 
    @NameInMap("monitor_result_id")
    @Validation(required = true)
    public String monitorResultId;

    // 侵权网址
    // 
    // 
    @NameInMap("infr_url")
    public String infrUrl;

    // 侵权主体
    // 
    // 
    @NameInMap("infr_host")
    public String infrHost;

    // 侵权标题
    // 
    // 
    @NameInMap("infr_title")
    public String infrTitle;

    // 侵权内容上传时间
    // 
    // 
    @NameInMap("infr_time")
    public Long infrTime;

    // 侵权详情
    // 
    @NameInMap("detail")
    public String detail;

    // 发布者
    @NameInMap("poster")
    public String poster;

    // 侵权内容发布时间
    @NameInMap("post_date")
    public Long postDate;

    // 侵权内容发现时间
    @NameInMap("find_date")
    public Long findDate;

    // 观看数
    @NameInMap("view_count")
    public Long viewCount;

    // 点赞数
    @NameInMap("like_count")
    public Long likeCount;

    // 评论数
    @NameInMap("comment_count")
    public Long commentCount;

    // 转发数
    @NameInMap("repost_count")
    public Long repostCount;

    // 侵权文件下载链接
    @NameInMap("download_url")
    public String downloadUrl;

    // 疑似侵权反馈时间
    @NameInMap("infr_feedback_time")
    public Long infrFeedbackTime;

    // 个人主页链接
    @NameInMap("poster_id_url")
    public String posterIdUrl;

    public static MonitorResult build(java.util.Map<String, ?> map) throws Exception {
        MonitorResult self = new MonitorResult();
        return TeaModel.build(map, self);
    }

    public MonitorResult setMonitorTaskId(String monitorTaskId) {
        this.monitorTaskId = monitorTaskId;
        return this;
    }
    public String getMonitorTaskId() {
        return this.monitorTaskId;
    }

    public MonitorResult setMonitorResultId(String monitorResultId) {
        this.monitorResultId = monitorResultId;
        return this;
    }
    public String getMonitorResultId() {
        return this.monitorResultId;
    }

    public MonitorResult setInfrUrl(String infrUrl) {
        this.infrUrl = infrUrl;
        return this;
    }
    public String getInfrUrl() {
        return this.infrUrl;
    }

    public MonitorResult setInfrHost(String infrHost) {
        this.infrHost = infrHost;
        return this;
    }
    public String getInfrHost() {
        return this.infrHost;
    }

    public MonitorResult setInfrTitle(String infrTitle) {
        this.infrTitle = infrTitle;
        return this;
    }
    public String getInfrTitle() {
        return this.infrTitle;
    }

    public MonitorResult setInfrTime(Long infrTime) {
        this.infrTime = infrTime;
        return this;
    }
    public Long getInfrTime() {
        return this.infrTime;
    }

    public MonitorResult setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public MonitorResult setPoster(String poster) {
        this.poster = poster;
        return this;
    }
    public String getPoster() {
        return this.poster;
    }

    public MonitorResult setPostDate(Long postDate) {
        this.postDate = postDate;
        return this;
    }
    public Long getPostDate() {
        return this.postDate;
    }

    public MonitorResult setFindDate(Long findDate) {
        this.findDate = findDate;
        return this;
    }
    public Long getFindDate() {
        return this.findDate;
    }

    public MonitorResult setViewCount(Long viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    public Long getViewCount() {
        return this.viewCount;
    }

    public MonitorResult setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
        return this;
    }
    public Long getLikeCount() {
        return this.likeCount;
    }

    public MonitorResult setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
        return this;
    }
    public Long getCommentCount() {
        return this.commentCount;
    }

    public MonitorResult setRepostCount(Long repostCount) {
        this.repostCount = repostCount;
        return this;
    }
    public Long getRepostCount() {
        return this.repostCount;
    }

    public MonitorResult setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public MonitorResult setInfrFeedbackTime(Long infrFeedbackTime) {
        this.infrFeedbackTime = infrFeedbackTime;
        return this;
    }
    public Long getInfrFeedbackTime() {
        return this.infrFeedbackTime;
    }

    public MonitorResult setPosterIdUrl(String posterIdUrl) {
        this.posterIdUrl = posterIdUrl;
        return this;
    }
    public String getPosterIdUrl() {
        return this.posterIdUrl;
    }

}
