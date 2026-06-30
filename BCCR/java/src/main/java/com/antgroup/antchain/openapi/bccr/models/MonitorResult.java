// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorResult extends TeaModel {
    // 监测任务ID
    // 
    /**
     * <strong>example:</strong>
     * <p>111111111111111111</p>
     */
    @NameInMap("monitor_task_id")
    @Validation(required = true)
    public String monitorTaskId;

    // 监测结果ID
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("monitor_result_id")
    @Validation(required = true)
    public String monitorResultId;

    // 侵权网址
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p><a href="http://a.b.c">http://a.b.c</a></p>
     */
    @NameInMap("infr_url")
    public String infrUrl;

    // 侵权主体
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>hhh</p>
     */
    @NameInMap("infr_host")
    public String infrHost;

    // 侵权标题
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>biaoti</p>
     */
    @NameInMap("infr_title")
    public String infrTitle;

    // 侵权内容上传时间
    // 
    // 
    /**
     * <strong>example:</strong>
     * <p>1592807928</p>
     */
    @NameInMap("infr_time")
    public Long infrTime;

    // 侵权详情
    // 
    /**
     * <strong>example:</strong>
     * <p>details</p>
     */
    @NameInMap("detail")
    public String detail;

    // 发布者
    /**
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("poster")
    public String poster;

    // 侵权内容发布时间
    /**
     * <strong>example:</strong>
     * <p>1626614711096</p>
     */
    @NameInMap("post_date")
    public Long postDate;

    // 侵权内容发现时间
    /**
     * <strong>example:</strong>
     * <p>1626614711096</p>
     */
    @NameInMap("find_date")
    public Long findDate;

    // 观看数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("view_count")
    public Long viewCount;

    // 点赞数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("like_count")
    public Long likeCount;

    // 评论数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("comment_count")
    public Long commentCount;

    // 转发数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repost_count")
    public Long repostCount;

    // 侵权文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("download_url")
    public String downloadUrl;

    // 疑似侵权反馈时间
    /**
     * <strong>example:</strong>
     * <p>1592807928</p>
     */
    @NameInMap("infr_feedback_time")
    public Long infrFeedbackTime;

    // 个人主页链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
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
