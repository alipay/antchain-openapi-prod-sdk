// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SearchCondition extends TeaModel {
    // 搭配词
    @NameInMap("ass_keywords")
    public String assKeywords;

    // 被@的用户名称
    @NameInMap("at_author_name")
    public String atAuthorName;

    // 作者名称
    @NameInMap("author_name")
    public String authorName;

    // 评论级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("comments_level")
    public Long commentsLevel;

    // 内容长度级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("content_len_level")
    public String contentLenLevel;

    // 抓取截止时间
    @NameInMap("create_time_end")
    public Long createTimeEnd;

    // 抓取起始时间
    @NameInMap("create_time_start")
    public Long createTimeStart;

    // 文章签名
    @NameInMap("doc_content_sign")
    public String docContentSign;

    // 舆情文章唯一docId
    @NameInMap("doc_id")
    public String docId;

    // 是否去重
    @NameInMap("duplicate_removal")
    public Boolean duplicateRemoval;

    // 情感类型，1非负，-1负面
    @NameInMap("emotion_type")
    public Long emotionType;

    // 是否高亮关键词
    @NameInMap("enable_keyword_highlight")
    public Boolean enableKeywordHighlight;

    // 排除被@的用户名称
    @NameInMap("exclude_at_author_name")
    public String excludeAtAuthorName;

    // 排除作者名称
    @NameInMap("exclude_author_name")
    public String excludeAuthorName;

    // 排除网站域名
    @NameInMap("exclude_host_name")
    public String excludeHostName;

    // 排除关键词标签Id列表
    @NameInMap("exclude_keyword_tag_ids")
    public String excludeKeywordTagIds;

    // 排除词
    @NameInMap("exclude_keywords")
    public String excludeKeywords;

    // 标题排除词
    @NameInMap("exclude_keywords_in_title")
    public String excludeKeywordsInTitle;

    // 排除媒体库id列表
    @NameInMap("exclude_media_library_ids")
    public String excludeMediaLibraryIds;

    // 排除媒体名称
    @NameInMap("exclude_media_name")
    public String excludeMediaName;

    // 排除媒体类型，枚举值
    @NameInMap("exclude_media_type")
    public String excludeMediaType;

    // 排除消息类型，枚举值
    @NameInMap("exclude_message_type")
    public String excludeMessageType;

    // 其他过滤条件
    @NameInMap("field_conditions")
    public String fieldConditions;

    // 文章是否含有图片
    @NameInMap("has_image")
    public Boolean hasImage;

    // 是否含有视频
    @NameInMap("has_video")
    public Boolean hasVideo;

    // 网站域名
    @NameInMap("host_name")
    public String hostName;

    // 关键词标签Id列表
    @NameInMap("keyword_tag_ids")
    public String keywordTagIds;

    // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("likes_level")
    public Long likesLevel;

    // 媒体库id列表
    @NameInMap("media_library_ids")
    public String mediaLibraryIds;

    // 媒体名称
    @NameInMap("media_name")
    public String mediaName;

    // 体类型，枚举值
    @NameInMap("media_type")
    public String mediaType;

    // 消息类型，枚举值
    @NameInMap("message_type")
    public String messageType;

    // 当前页
    @NameInMap("page_now")
    public Long pageNow;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 舆情父文章的docId，一般用于查看某篇文章的评论
    @NameInMap("parent_doc_id")
    public String parentDocId;

    // 关键词
    @NameInMap("pos_key_words")
    public String posKeyWords;

    // 标题关键词
    @NameInMap("pos_keywords_in_title")
    public String posKeywordsInTitle;

    // 截止发布时间
    @NameInMap("publish_time_end")
    public Long publishTimeEnd;

    // 起始发布时间
    @NameInMap("publish_time_start")
    public String publishTimeStart;

    // 阅读级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("reads_level")
    public Long readsLevel;

    // 相关性等级，1：低，2：中，3：高，4：低级别以上
    @NameInMap("relevance_level")
    public Long relevanceLevel;

    // 转发级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("repost_level")
    public Long repostLevel;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 指定正反向排序
    @NameInMap("sort_by_direction")
    public String sortByDirection;

    // #话题
    @NameInMap("topics")
    public String topics;

    // 舆情文章截止更新时间
    @NameInMap("update_time_end")
    public Long updateTimeEnd;

    // 舆情文章起始更新时间
    @NameInMap("update_time_start")
    public Long updateTimeStart;

    public static SearchCondition build(java.util.Map<String, ?> map) throws Exception {
        SearchCondition self = new SearchCondition();
        return TeaModel.build(map, self);
    }

    public SearchCondition setAssKeywords(String assKeywords) {
        this.assKeywords = assKeywords;
        return this;
    }
    public String getAssKeywords() {
        return this.assKeywords;
    }

    public SearchCondition setAtAuthorName(String atAuthorName) {
        this.atAuthorName = atAuthorName;
        return this;
    }
    public String getAtAuthorName() {
        return this.atAuthorName;
    }

    public SearchCondition setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public SearchCondition setCommentsLevel(Long commentsLevel) {
        this.commentsLevel = commentsLevel;
        return this;
    }
    public Long getCommentsLevel() {
        return this.commentsLevel;
    }

    public SearchCondition setContentLenLevel(String contentLenLevel) {
        this.contentLenLevel = contentLenLevel;
        return this;
    }
    public String getContentLenLevel() {
        return this.contentLenLevel;
    }

    public SearchCondition setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public SearchCondition setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public SearchCondition setDocContentSign(String docContentSign) {
        this.docContentSign = docContentSign;
        return this;
    }
    public String getDocContentSign() {
        return this.docContentSign;
    }

    public SearchCondition setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public SearchCondition setDuplicateRemoval(Boolean duplicateRemoval) {
        this.duplicateRemoval = duplicateRemoval;
        return this;
    }
    public Boolean getDuplicateRemoval() {
        return this.duplicateRemoval;
    }

    public SearchCondition setEmotionType(Long emotionType) {
        this.emotionType = emotionType;
        return this;
    }
    public Long getEmotionType() {
        return this.emotionType;
    }

    public SearchCondition setEnableKeywordHighlight(Boolean enableKeywordHighlight) {
        this.enableKeywordHighlight = enableKeywordHighlight;
        return this;
    }
    public Boolean getEnableKeywordHighlight() {
        return this.enableKeywordHighlight;
    }

    public SearchCondition setExcludeAtAuthorName(String excludeAtAuthorName) {
        this.excludeAtAuthorName = excludeAtAuthorName;
        return this;
    }
    public String getExcludeAtAuthorName() {
        return this.excludeAtAuthorName;
    }

    public SearchCondition setExcludeAuthorName(String excludeAuthorName) {
        this.excludeAuthorName = excludeAuthorName;
        return this;
    }
    public String getExcludeAuthorName() {
        return this.excludeAuthorName;
    }

    public SearchCondition setExcludeHostName(String excludeHostName) {
        this.excludeHostName = excludeHostName;
        return this;
    }
    public String getExcludeHostName() {
        return this.excludeHostName;
    }

    public SearchCondition setExcludeKeywordTagIds(String excludeKeywordTagIds) {
        this.excludeKeywordTagIds = excludeKeywordTagIds;
        return this;
    }
    public String getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
    }

    public SearchCondition setExcludeKeywords(String excludeKeywords) {
        this.excludeKeywords = excludeKeywords;
        return this;
    }
    public String getExcludeKeywords() {
        return this.excludeKeywords;
    }

    public SearchCondition setExcludeKeywordsInTitle(String excludeKeywordsInTitle) {
        this.excludeKeywordsInTitle = excludeKeywordsInTitle;
        return this;
    }
    public String getExcludeKeywordsInTitle() {
        return this.excludeKeywordsInTitle;
    }

    public SearchCondition setExcludeMediaLibraryIds(String excludeMediaLibraryIds) {
        this.excludeMediaLibraryIds = excludeMediaLibraryIds;
        return this;
    }
    public String getExcludeMediaLibraryIds() {
        return this.excludeMediaLibraryIds;
    }

    public SearchCondition setExcludeMediaName(String excludeMediaName) {
        this.excludeMediaName = excludeMediaName;
        return this;
    }
    public String getExcludeMediaName() {
        return this.excludeMediaName;
    }

    public SearchCondition setExcludeMediaType(String excludeMediaType) {
        this.excludeMediaType = excludeMediaType;
        return this;
    }
    public String getExcludeMediaType() {
        return this.excludeMediaType;
    }

    public SearchCondition setExcludeMessageType(String excludeMessageType) {
        this.excludeMessageType = excludeMessageType;
        return this;
    }
    public String getExcludeMessageType() {
        return this.excludeMessageType;
    }

    public SearchCondition setFieldConditions(String fieldConditions) {
        this.fieldConditions = fieldConditions;
        return this;
    }
    public String getFieldConditions() {
        return this.fieldConditions;
    }

    public SearchCondition setHasImage(Boolean hasImage) {
        this.hasImage = hasImage;
        return this;
    }
    public Boolean getHasImage() {
        return this.hasImage;
    }

    public SearchCondition setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
        return this;
    }
    public Boolean getHasVideo() {
        return this.hasVideo;
    }

    public SearchCondition setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SearchCondition setKeywordTagIds(String keywordTagIds) {
        this.keywordTagIds = keywordTagIds;
        return this;
    }
    public String getKeywordTagIds() {
        return this.keywordTagIds;
    }

    public SearchCondition setLikesLevel(Long likesLevel) {
        this.likesLevel = likesLevel;
        return this;
    }
    public Long getLikesLevel() {
        return this.likesLevel;
    }

    public SearchCondition setMediaLibraryIds(String mediaLibraryIds) {
        this.mediaLibraryIds = mediaLibraryIds;
        return this;
    }
    public String getMediaLibraryIds() {
        return this.mediaLibraryIds;
    }

    public SearchCondition setMediaName(String mediaName) {
        this.mediaName = mediaName;
        return this;
    }
    public String getMediaName() {
        return this.mediaName;
    }

    public SearchCondition setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchCondition setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SearchCondition setPageNow(Long pageNow) {
        this.pageNow = pageNow;
        return this;
    }
    public Long getPageNow() {
        return this.pageNow;
    }

    public SearchCondition setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchCondition setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
        return this;
    }
    public String getParentDocId() {
        return this.parentDocId;
    }

    public SearchCondition setPosKeyWords(String posKeyWords) {
        this.posKeyWords = posKeyWords;
        return this;
    }
    public String getPosKeyWords() {
        return this.posKeyWords;
    }

    public SearchCondition setPosKeywordsInTitle(String posKeywordsInTitle) {
        this.posKeywordsInTitle = posKeywordsInTitle;
        return this;
    }
    public String getPosKeywordsInTitle() {
        return this.posKeywordsInTitle;
    }

    public SearchCondition setPublishTimeEnd(Long publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }
    public Long getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    public SearchCondition setPublishTimeStart(String publishTimeStart) {
        this.publishTimeStart = publishTimeStart;
        return this;
    }
    public String getPublishTimeStart() {
        return this.publishTimeStart;
    }

    public SearchCondition setReadsLevel(Long readsLevel) {
        this.readsLevel = readsLevel;
        return this;
    }
    public Long getReadsLevel() {
        return this.readsLevel;
    }

    public SearchCondition setRelevanceLevel(Long relevanceLevel) {
        this.relevanceLevel = relevanceLevel;
        return this;
    }
    public Long getRelevanceLevel() {
        return this.relevanceLevel;
    }

    public SearchCondition setRepostLevel(Long repostLevel) {
        this.repostLevel = repostLevel;
        return this;
    }
    public Long getRepostLevel() {
        return this.repostLevel;
    }

    public SearchCondition setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchCondition setSortByDirection(String sortByDirection) {
        this.sortByDirection = sortByDirection;
        return this;
    }
    public String getSortByDirection() {
        return this.sortByDirection;
    }

    public SearchCondition setTopics(String topics) {
        this.topics = topics;
        return this;
    }
    public String getTopics() {
        return this.topics;
    }

    public SearchCondition setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
        return this;
    }
    public Long getUpdateTimeEnd() {
        return this.updateTimeEnd;
    }

    public SearchCondition setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
        return this;
    }
    public Long getUpdateTimeStart() {
        return this.updateTimeStart;
    }

}
