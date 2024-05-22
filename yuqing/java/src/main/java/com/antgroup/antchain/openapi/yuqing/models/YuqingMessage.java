// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class YuqingMessage extends TeaModel {
    // 作者头像地址
    @NameInMap("author_avatar_url")
    public String authorAvatarUrl;

    // 粉丝数
    @NameInMap("author_followers_count")
    public Long authorFollowersCount;

    // 好友数
    @NameInMap("author_friends_count")
    public Long authorFriendsCount;

    // 作者id
    @NameInMap("author_id")
    public String authorId;

    // 作者名称
    @NameInMap("author_name")
    public String authorName;

    // 发文数
    @NameInMap("author_statuses_count")
    public Long authorStatusesCount;

    // 作者认证类型
    @NameInMap("author_verify_type")
    public String authorVerifyType;

    // 舆情文章被抓取的时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 文章正文内容
    @NameInMap("doc_content")
    public String docContent;

    // 文章摘要
    @NameInMap("doc_content_brief")
    public String docContentBrief;

    // 文章内容签名，如果是转发微博或者其他有父内容的doc，计算的是父文章的得分。一般用于去重，相同的doc_content_sign说明内容相同
    @NameInMap("doc_content_sign")
    public String docContentSign;

    // 文章唯一docId
    @NameInMap("doc_id")
    public String docId;

    // 文章自身的内容签名，转发微博计算的是转发内容的contentSign，与父微博无关
    @NameInMap("doc_self_content_sign")
    public String docSelfContentSign;

    // 文章标题
    @NameInMap("doc_title")
    public String docTitle;

    // 原文地址
    @NameInMap("doc_url")
    public String docUrl;

    // 情感的正负面，-1代表负面，1代表非负面
    @NameInMap("emotion_type")
    public Long emotionType;

    // 命中的搜索词列表
    @NameInMap("highlight_keywords")
    public java.util.List<String> highlightKeywords;

    // 媒体类型，枚举值
    @NameInMap("media_type")
    public String mediaType;

    // 舆情消息类型:转发,评论/回复, 原文,群聊等
    @NameInMap("message_type")
    public String messageType;

    // 文章的父docId，如被转发的文章docId
    @NameInMap("parent_doc_id")
    public String parentDocId;

    // 舆情文章的发布时间戳
    @NameInMap("publish_time")
    public Long publishTime;

    // 相关性得分
    @NameInMap("relevance_score")
    public String relevanceScore;

    // 相似文章数
    @NameInMap("similar_number")
    public Long similarNumber;

    // 微博评论id
    @NameInMap("weibo_comment_id")
    public String weiboCommentId;

    // 微博消息id
    @NameInMap("weibo_mid")
    public String weiboMid;

    // 传播得分，0-10
    @NameInMap("propagation_score")
    public String propagationScore;

    // 情感得分
    @NameInMap("emotion_score")
    public String emotionScore;

    // 影响力得分
    @NameInMap("influence_score")
    public String influenceScore;

    // 提级地域列表
    @NameInMap("doc_areas")
    public java.util.List<String> docAreas;

    // 媒体名称
    @NameInMap("media_name")
    public String mediaName;

    // 扩展信息
    @NameInMap("ext_info")
    public YuqingMessageExtInfo extInfo;

    // 文章转载自
    @NameInMap("doc_reprint_name")
    public String docReprintName;

    // 视频列表地址
    @NameInMap("content_video_urls")
    public String contentVideoUrls;

    // 图片列表地址
    @NameInMap("content_image_urls")
    public String contentImageUrls;

    // 图片识别出来的文本
    @NameInMap("content_image_text")
    public String contentImageText;

    // 音频列表地址
    @NameInMap("content_audio_urls")
    public String contentAudioUrls;

    // 音频识别出来的文本
    @NameInMap("content_audio_text")
    public String contentAudioText;

    // 视频识别出来的文本
    @NameInMap("content_video_text")
    public String contentVideoText;

    // 文章转发数
    @NameInMap("doc_reposts_count")
    public Long docRepostsCount;

    // 文章评论数
    @NameInMap("doc_comments_count")
    public Long docCommentsCount;

    // 文章点赞数
    @NameInMap("doc_likes_count")
    public Long docLikesCount;

    // 文章阅读数
    @NameInMap("doc_reads_count")
    public Long docReadsCount;

    // 回答数
    @NameInMap("doc_answers_count")
    public Long docAnswersCount;

    public static YuqingMessage build(java.util.Map<String, ?> map) throws Exception {
        YuqingMessage self = new YuqingMessage();
        return TeaModel.build(map, self);
    }

    public YuqingMessage setAuthorAvatarUrl(String authorAvatarUrl) {
        this.authorAvatarUrl = authorAvatarUrl;
        return this;
    }
    public String getAuthorAvatarUrl() {
        return this.authorAvatarUrl;
    }

    public YuqingMessage setAuthorFollowersCount(Long authorFollowersCount) {
        this.authorFollowersCount = authorFollowersCount;
        return this;
    }
    public Long getAuthorFollowersCount() {
        return this.authorFollowersCount;
    }

    public YuqingMessage setAuthorFriendsCount(Long authorFriendsCount) {
        this.authorFriendsCount = authorFriendsCount;
        return this;
    }
    public Long getAuthorFriendsCount() {
        return this.authorFriendsCount;
    }

    public YuqingMessage setAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }
    public String getAuthorId() {
        return this.authorId;
    }

    public YuqingMessage setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public YuqingMessage setAuthorStatusesCount(Long authorStatusesCount) {
        this.authorStatusesCount = authorStatusesCount;
        return this;
    }
    public Long getAuthorStatusesCount() {
        return this.authorStatusesCount;
    }

    public YuqingMessage setAuthorVerifyType(String authorVerifyType) {
        this.authorVerifyType = authorVerifyType;
        return this;
    }
    public String getAuthorVerifyType() {
        return this.authorVerifyType;
    }

    public YuqingMessage setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public YuqingMessage setDocContent(String docContent) {
        this.docContent = docContent;
        return this;
    }
    public String getDocContent() {
        return this.docContent;
    }

    public YuqingMessage setDocContentBrief(String docContentBrief) {
        this.docContentBrief = docContentBrief;
        return this;
    }
    public String getDocContentBrief() {
        return this.docContentBrief;
    }

    public YuqingMessage setDocContentSign(String docContentSign) {
        this.docContentSign = docContentSign;
        return this;
    }
    public String getDocContentSign() {
        return this.docContentSign;
    }

    public YuqingMessage setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public YuqingMessage setDocSelfContentSign(String docSelfContentSign) {
        this.docSelfContentSign = docSelfContentSign;
        return this;
    }
    public String getDocSelfContentSign() {
        return this.docSelfContentSign;
    }

    public YuqingMessage setDocTitle(String docTitle) {
        this.docTitle = docTitle;
        return this;
    }
    public String getDocTitle() {
        return this.docTitle;
    }

    public YuqingMessage setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public YuqingMessage setEmotionType(Long emotionType) {
        this.emotionType = emotionType;
        return this;
    }
    public Long getEmotionType() {
        return this.emotionType;
    }

    public YuqingMessage setHighlightKeywords(java.util.List<String> highlightKeywords) {
        this.highlightKeywords = highlightKeywords;
        return this;
    }
    public java.util.List<String> getHighlightKeywords() {
        return this.highlightKeywords;
    }

    public YuqingMessage setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public YuqingMessage setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public YuqingMessage setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
        return this;
    }
    public String getParentDocId() {
        return this.parentDocId;
    }

    public YuqingMessage setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public YuqingMessage setRelevanceScore(String relevanceScore) {
        this.relevanceScore = relevanceScore;
        return this;
    }
    public String getRelevanceScore() {
        return this.relevanceScore;
    }

    public YuqingMessage setSimilarNumber(Long similarNumber) {
        this.similarNumber = similarNumber;
        return this;
    }
    public Long getSimilarNumber() {
        return this.similarNumber;
    }

    public YuqingMessage setWeiboCommentId(String weiboCommentId) {
        this.weiboCommentId = weiboCommentId;
        return this;
    }
    public String getWeiboCommentId() {
        return this.weiboCommentId;
    }

    public YuqingMessage setWeiboMid(String weiboMid) {
        this.weiboMid = weiboMid;
        return this;
    }
    public String getWeiboMid() {
        return this.weiboMid;
    }

    public YuqingMessage setPropagationScore(String propagationScore) {
        this.propagationScore = propagationScore;
        return this;
    }
    public String getPropagationScore() {
        return this.propagationScore;
    }

    public YuqingMessage setEmotionScore(String emotionScore) {
        this.emotionScore = emotionScore;
        return this;
    }
    public String getEmotionScore() {
        return this.emotionScore;
    }

    public YuqingMessage setInfluenceScore(String influenceScore) {
        this.influenceScore = influenceScore;
        return this;
    }
    public String getInfluenceScore() {
        return this.influenceScore;
    }

    public YuqingMessage setDocAreas(java.util.List<String> docAreas) {
        this.docAreas = docAreas;
        return this;
    }
    public java.util.List<String> getDocAreas() {
        return this.docAreas;
    }

    public YuqingMessage setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public YuqingMessage setExtInfo(YuqingMessageExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public YuqingMessageExtInfo getExtInfo() {
        return this.extInfo;
    }

    public YuqingMessage setDocReprintName(String docReprintName) {
        this.docReprintName = docReprintName;
        return this;
    }
    public String getDocReprintName() {
        return this.docReprintName;
    }

    public YuqingMessage setContentVideoUrls(String contentVideoUrls) {
        this.contentVideoUrls = contentVideoUrls;
        return this;
    }
    public String getContentVideoUrls() {
        return this.contentVideoUrls;
    }

    public YuqingMessage setContentImageUrls(String contentImageUrls) {
        this.contentImageUrls = contentImageUrls;
        return this;
    }
    public String getContentImageUrls() {
        return this.contentImageUrls;
    }

    public YuqingMessage setContentImageText(String contentImageText) {
        this.contentImageText = contentImageText;
        return this;
    }
    public String getContentImageText() {
        return this.contentImageText;
    }

    public YuqingMessage setContentAudioUrls(String contentAudioUrls) {
        this.contentAudioUrls = contentAudioUrls;
        return this;
    }
    public String getContentAudioUrls() {
        return this.contentAudioUrls;
    }

    public YuqingMessage setContentAudioText(String contentAudioText) {
        this.contentAudioText = contentAudioText;
        return this;
    }
    public String getContentAudioText() {
        return this.contentAudioText;
    }

    public YuqingMessage setContentVideoText(String contentVideoText) {
        this.contentVideoText = contentVideoText;
        return this;
    }
    public String getContentVideoText() {
        return this.contentVideoText;
    }

    public YuqingMessage setDocRepostsCount(Long docRepostsCount) {
        this.docRepostsCount = docRepostsCount;
        return this;
    }
    public Long getDocRepostsCount() {
        return this.docRepostsCount;
    }

    public YuqingMessage setDocCommentsCount(Long docCommentsCount) {
        this.docCommentsCount = docCommentsCount;
        return this;
    }
    public Long getDocCommentsCount() {
        return this.docCommentsCount;
    }

    public YuqingMessage setDocLikesCount(Long docLikesCount) {
        this.docLikesCount = docLikesCount;
        return this;
    }
    public Long getDocLikesCount() {
        return this.docLikesCount;
    }

    public YuqingMessage setDocReadsCount(Long docReadsCount) {
        this.docReadsCount = docReadsCount;
        return this;
    }
    public Long getDocReadsCount() {
        return this.docReadsCount;
    }

    public YuqingMessage setDocAnswersCount(Long docAnswersCount) {
        this.docAnswersCount = docAnswersCount;
        return this;
    }
    public Long getDocAnswersCount() {
        return this.docAnswersCount;
    }

}
