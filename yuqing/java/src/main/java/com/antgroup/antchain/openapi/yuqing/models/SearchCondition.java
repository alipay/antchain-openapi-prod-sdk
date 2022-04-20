// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class SearchCondition extends TeaModel {
    // 搭配词
    @NameInMap("ass_keyword_list")
    public java.util.List<String> assKeywordList;

    // 被@的用户名称
    @NameInMap("at_author_name_list")
    public java.util.List<String> atAuthorNameList;

    // 作者名称
    @NameInMap("author_name_list")
    public java.util.List<String> authorNameList;

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
    @NameInMap("doc_id_list")
    public java.util.List<String> docIdList;

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
    @NameInMap("exclude_at_author_name_list")
    public java.util.List<String> excludeAtAuthorNameList;

    // 排除作者名称
    @NameInMap("exclude_author_name_list")
    public java.util.List<String> excludeAuthorNameList;

    // 排除网站域名
    @NameInMap("exclude_host_name_list")
    public java.util.List<String> excludeHostNameList;

    // 排除关键词标签Id列表
    @NameInMap("exclude_keyword_tag_ids")
    public java.util.List<Long> excludeKeywordTagIds;

    // 排除词
    @NameInMap("exclude_keyword_list")
    public java.util.List<String> excludeKeywordList;

    // 标题排除词
    @NameInMap("exclude_keyword_list_in_title")
    public java.util.List<String> excludeKeywordListInTitle;

    // 排除媒体库id列表
    @NameInMap("exclude_media_library_id_list")
    public java.util.List<Long> excludeMediaLibraryIdList;

    // 排除媒体名称
    @NameInMap("exclude_media_name_list")
    public java.util.List<String> excludeMediaNameList;

    // 排除媒体类型，枚举值
    @NameInMap("exclude_media_type_list")
    public java.util.List<String> excludeMediaTypeList;

    // 排除消息类型，枚举值
    @NameInMap("exclude_message_type_list")
    public java.util.List<String> excludeMessageTypeList;

    // 文章是否含有图片
    @NameInMap("has_image")
    public Boolean hasImage;

    // 是否含有视频
    @NameInMap("has_video")
    public Boolean hasVideo;

    // 网站域名
    @NameInMap("host_name_list")
    public java.util.List<String> hostNameList;

    // 关键词标签Id列表
    @NameInMap("keyword_tag_ids")
    public java.util.List<Long> keywordTagIds;

    // 点赞级别，1：100以内，2：100-1k，3：1k-1w以内，4：1w-10w，5，10w+
    @NameInMap("likes_level")
    public Long likesLevel;

    // 媒体库id列表
    @NameInMap("media_library_id_list")
    public java.util.List<Long> mediaLibraryIdList;

    // 媒体名称
    @NameInMap("media_name_list")
    public java.util.List<String> mediaNameList;

    // 体类型，枚举值
    @NameInMap("media_type_list")
    public java.util.List<String> mediaTypeList;

    // 消息类型，枚举值
    @NameInMap("message_type_list")
    public java.util.List<String> messageTypeList;

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
    @NameInMap("pos_keyword_list")
    public java.util.List<String> posKeywordList;

    // 标题关键词
    @NameInMap("pos_keyword_list_in_title")
    public java.util.List<String> posKeywordListInTitle;

    // 截止发布时间
    @NameInMap("publish_time_end")
    public Long publishTimeEnd;

    // 起始发布时间
    @NameInMap("publish_time_start")
    public Long publishTimeStart;

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
    @NameInMap("topic_list")
    public java.util.List<String> topicList;

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

    public SearchCondition setAssKeywordList(java.util.List<String> assKeywordList) {
        this.assKeywordList = assKeywordList;
        return this;
    }
    public java.util.List<String> getAssKeywordList() {
        return this.assKeywordList;
    }

    public SearchCondition setAtAuthorNameList(java.util.List<String> atAuthorNameList) {
        this.atAuthorNameList = atAuthorNameList;
        return this;
    }
    public java.util.List<String> getAtAuthorNameList() {
        return this.atAuthorNameList;
    }

    public SearchCondition setAuthorNameList(java.util.List<String> authorNameList) {
        this.authorNameList = authorNameList;
        return this;
    }
    public java.util.List<String> getAuthorNameList() {
        return this.authorNameList;
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

    public SearchCondition setDocIdList(java.util.List<String> docIdList) {
        this.docIdList = docIdList;
        return this;
    }
    public java.util.List<String> getDocIdList() {
        return this.docIdList;
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

    public SearchCondition setExcludeAtAuthorNameList(java.util.List<String> excludeAtAuthorNameList) {
        this.excludeAtAuthorNameList = excludeAtAuthorNameList;
        return this;
    }
    public java.util.List<String> getExcludeAtAuthorNameList() {
        return this.excludeAtAuthorNameList;
    }

    public SearchCondition setExcludeAuthorNameList(java.util.List<String> excludeAuthorNameList) {
        this.excludeAuthorNameList = excludeAuthorNameList;
        return this;
    }
    public java.util.List<String> getExcludeAuthorNameList() {
        return this.excludeAuthorNameList;
    }

    public SearchCondition setExcludeHostNameList(java.util.List<String> excludeHostNameList) {
        this.excludeHostNameList = excludeHostNameList;
        return this;
    }
    public java.util.List<String> getExcludeHostNameList() {
        return this.excludeHostNameList;
    }

    public SearchCondition setExcludeKeywordTagIds(java.util.List<Long> excludeKeywordTagIds) {
        this.excludeKeywordTagIds = excludeKeywordTagIds;
        return this;
    }
    public java.util.List<Long> getExcludeKeywordTagIds() {
        return this.excludeKeywordTagIds;
    }

    public SearchCondition setExcludeKeywordList(java.util.List<String> excludeKeywordList) {
        this.excludeKeywordList = excludeKeywordList;
        return this;
    }
    public java.util.List<String> getExcludeKeywordList() {
        return this.excludeKeywordList;
    }

    public SearchCondition setExcludeKeywordListInTitle(java.util.List<String> excludeKeywordListInTitle) {
        this.excludeKeywordListInTitle = excludeKeywordListInTitle;
        return this;
    }
    public java.util.List<String> getExcludeKeywordListInTitle() {
        return this.excludeKeywordListInTitle;
    }

    public SearchCondition setExcludeMediaLibraryIdList(java.util.List<Long> excludeMediaLibraryIdList) {
        this.excludeMediaLibraryIdList = excludeMediaLibraryIdList;
        return this;
    }
    public java.util.List<Long> getExcludeMediaLibraryIdList() {
        return this.excludeMediaLibraryIdList;
    }

    public SearchCondition setExcludeMediaNameList(java.util.List<String> excludeMediaNameList) {
        this.excludeMediaNameList = excludeMediaNameList;
        return this;
    }
    public java.util.List<String> getExcludeMediaNameList() {
        return this.excludeMediaNameList;
    }

    public SearchCondition setExcludeMediaTypeList(java.util.List<String> excludeMediaTypeList) {
        this.excludeMediaTypeList = excludeMediaTypeList;
        return this;
    }
    public java.util.List<String> getExcludeMediaTypeList() {
        return this.excludeMediaTypeList;
    }

    public SearchCondition setExcludeMessageTypeList(java.util.List<String> excludeMessageTypeList) {
        this.excludeMessageTypeList = excludeMessageTypeList;
        return this;
    }
    public java.util.List<String> getExcludeMessageTypeList() {
        return this.excludeMessageTypeList;
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

    public SearchCondition setHostNameList(java.util.List<String> hostNameList) {
        this.hostNameList = hostNameList;
        return this;
    }
    public java.util.List<String> getHostNameList() {
        return this.hostNameList;
    }

    public SearchCondition setKeywordTagIds(java.util.List<Long> keywordTagIds) {
        this.keywordTagIds = keywordTagIds;
        return this;
    }
    public java.util.List<Long> getKeywordTagIds() {
        return this.keywordTagIds;
    }

    public SearchCondition setLikesLevel(Long likesLevel) {
        this.likesLevel = likesLevel;
        return this;
    }
    public Long getLikesLevel() {
        return this.likesLevel;
    }

    public SearchCondition setMediaLibraryIdList(java.util.List<Long> mediaLibraryIdList) {
        this.mediaLibraryIdList = mediaLibraryIdList;
        return this;
    }
    public java.util.List<Long> getMediaLibraryIdList() {
        return this.mediaLibraryIdList;
    }

    public SearchCondition setMediaNameList(java.util.List<String> mediaNameList) {
        this.mediaNameList = mediaNameList;
        return this;
    }
    public java.util.List<String> getMediaNameList() {
        return this.mediaNameList;
    }

    public SearchCondition setMediaTypeList(java.util.List<String> mediaTypeList) {
        this.mediaTypeList = mediaTypeList;
        return this;
    }
    public java.util.List<String> getMediaTypeList() {
        return this.mediaTypeList;
    }

    public SearchCondition setMessageTypeList(java.util.List<String> messageTypeList) {
        this.messageTypeList = messageTypeList;
        return this;
    }
    public java.util.List<String> getMessageTypeList() {
        return this.messageTypeList;
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

    public SearchCondition setPosKeywordList(java.util.List<String> posKeywordList) {
        this.posKeywordList = posKeywordList;
        return this;
    }
    public java.util.List<String> getPosKeywordList() {
        return this.posKeywordList;
    }

    public SearchCondition setPosKeywordListInTitle(java.util.List<String> posKeywordListInTitle) {
        this.posKeywordListInTitle = posKeywordListInTitle;
        return this;
    }
    public java.util.List<String> getPosKeywordListInTitle() {
        return this.posKeywordListInTitle;
    }

    public SearchCondition setPublishTimeEnd(Long publishTimeEnd) {
        this.publishTimeEnd = publishTimeEnd;
        return this;
    }
    public Long getPublishTimeEnd() {
        return this.publishTimeEnd;
    }

    public SearchCondition setPublishTimeStart(Long publishTimeStart) {
        this.publishTimeStart = publishTimeStart;
        return this;
    }
    public Long getPublishTimeStart() {
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

    public SearchCondition setTopicList(java.util.List<String> topicList) {
        this.topicList = topicList;
        return this;
    }
    public java.util.List<String> getTopicList() {
        return this.topicList;
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
