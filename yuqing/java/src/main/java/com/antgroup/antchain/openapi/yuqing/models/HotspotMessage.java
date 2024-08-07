// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class HotspotMessage extends TeaModel {
    // 热搜/热榜/话题 对应用户id (可能为空)
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 在榜总时间
    @NameInMap("total_exist_timestamp")
    @Validation(required = true)
    public Long totalExistTimestamp;

    // 下榜时间
    @NameInMap("last_exist_date_format")
    @Validation(required = true)
    public String lastExistDateFormat;

    // 爬虫爬取的时间
    @NameInMap("crawler_time_fmt")
    @Validation(required = true)
    public String crawlerTimeFmt;

    // 第一次上榜的格式化时间
    @NameInMap("first_exist_date_format")
    @Validation(required = true)
    public String firstExistDateFormat;

    // 最高排名的总时长
    @NameInMap("max_rank_total_timestamp")
    @Validation(required = true)
    public Long maxRankTotalTimestamp;

    // 跟随量
    @NameInMap("followers_count")
    @Validation(required = true)
    public Long followersCount;

    // 在榜单中的最高排名
    @NameInMap("max_rank")
    @Validation(required = true)
    public Long maxRank;

    // 阅读量
    @NameInMap("reads_count")
    @Validation(required = true)
    public Long readsCount;

    // 评论数
    @NameInMap("comments_count")
    @Validation(required = true)
    public Long commentsCount;

    // 标题，例如话题的标题就是话题本身
    @NameInMap("doc_title")
    @Validation(required = true)
    public String docTitle;

    // 首次上榜排名
    @NameInMap("first_rank")
    @Validation(required = true)
    public Long firstRank;

    // 原创人数
    @NameInMap("original_count")
    @Validation(required = true)
    public Long originalCount;

    // 主持人
    @NameInMap("presenter_name")
    @Validation(required = true)
    public String presenterName;

    // 热搜在热搜榜的位置
    @NameInMap("rank")
    @Validation(required = true)
    public Long rank;

    // 热点媒体类型
    @NameInMap("media_type")
    @Validation(required = true)
    public String mediaType;

    // 文档id
    @NameInMap("doc_id")
    @Validation(required = true)
    public String docId;

    // 类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 热度值
    @NameInMap("hot_value")
    @Validation(required = true)
    public Long hotValue;

    // 内容，热榜数据中存在着文章，热文就是有内容的
    @NameInMap("doc_content")
    @Validation(required = true)
    public String docContent;

    // 热搜/热榜/话题 对应用户名称 (可能为空)
    @NameInMap("screen_name")
    @Validation(required = true)
    public String screenName;

    // 热点媒体子类型
    @NameInMap("media_sub_type")
    @Validation(required = true)
    public String mediaSubType;

    // 讨论量
    @NameInMap("discusses_count")
    @Validation(required = true)
    public Long discussesCount;

    // 分类
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 视频量
    @NameInMap("video_count")
    @Validation(required = true)
    public Long videoCount;

    // 最高排名的格式化总时长
    @NameInMap("max_rank_total_time_format")
    @Validation(required = true)
    public String maxRankTotalTimeFormat;

    // 省
    @NameInMap("province")
    @Validation(required = true)
    public String province;

    // 在榜格式化的总时间
    @NameInMap("total_exist_time_format")
    @Validation(required = true)
    public String totalExistTimeFormat;

    // 第一次上最高排名的时间
    @NameInMap("first_top_exist_timestamp")
    @Validation(required = true)
    public Long firstTopExistTimestamp;

    // 链接地址
    @NameInMap("doc_url")
    public String docUrl;

    // 最大的热度值
    @NameInMap("max_hot_value")
    @Validation(required = true)
    public Long maxHotValue;

    // 市
    @NameInMap("city")
    @Validation(required = true)
    public String city;

    // 最后一次上榜的时间
    @NameInMap("last_exist_timestamp")
    @Validation(required = true)
    public Long lastExistTimestamp;

    // 第一次上最高排名的时间
    @NameInMap("first_top_exist_date_format")
    @Validation(required = true)
    public String firstTopExistDateFormat;

    // 下榜排名
    @NameInMap("last_rank")
    @Validation(required = true)
    public Long lastRank;

    // 首次上榜热度
    @NameInMap("first_hot_value")
    @Validation(required = true)
    public Long firstHotValue;

    // 热搜类型
    @NameInMap("hotspot_type")
    @Validation(required = true)
    public String hotspotType;

    // 第一次上榜的时间
    @NameInMap("first_xxist_timestamp")
    @Validation(required = true)
    public Long firstXxistTimestamp;

    // 第一次上榜时间
    @NameInMap("first_exist_timestamp")
    public Long firstExistTimestamp;

    public static HotspotMessage build(java.util.Map<String, ?> map) throws Exception {
        HotspotMessage self = new HotspotMessage();
        return TeaModel.build(map, self);
    }

    public HotspotMessage setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public HotspotMessage setTotalExistTimestamp(Long totalExistTimestamp) {
        this.totalExistTimestamp = totalExistTimestamp;
        return this;
    }
    public Long getTotalExistTimestamp() {
        return this.totalExistTimestamp;
    }

    public HotspotMessage setLastExistDateFormat(String lastExistDateFormat) {
        this.lastExistDateFormat = lastExistDateFormat;
        return this;
    }
    public String getLastExistDateFormat() {
        return this.lastExistDateFormat;
    }

    public HotspotMessage setCrawlerTimeFmt(String crawlerTimeFmt) {
        this.crawlerTimeFmt = crawlerTimeFmt;
        return this;
    }
    public String getCrawlerTimeFmt() {
        return this.crawlerTimeFmt;
    }

    public HotspotMessage setFirstExistDateFormat(String firstExistDateFormat) {
        this.firstExistDateFormat = firstExistDateFormat;
        return this;
    }
    public String getFirstExistDateFormat() {
        return this.firstExistDateFormat;
    }

    public HotspotMessage setMaxRankTotalTimestamp(Long maxRankTotalTimestamp) {
        this.maxRankTotalTimestamp = maxRankTotalTimestamp;
        return this;
    }
    public Long getMaxRankTotalTimestamp() {
        return this.maxRankTotalTimestamp;
    }

    public HotspotMessage setFollowersCount(Long followersCount) {
        this.followersCount = followersCount;
        return this;
    }
    public Long getFollowersCount() {
        return this.followersCount;
    }

    public HotspotMessage setMaxRank(Long maxRank) {
        this.maxRank = maxRank;
        return this;
    }
    public Long getMaxRank() {
        return this.maxRank;
    }

    public HotspotMessage setReadsCount(Long readsCount) {
        this.readsCount = readsCount;
        return this;
    }
    public Long getReadsCount() {
        return this.readsCount;
    }

    public HotspotMessage setCommentsCount(Long commentsCount) {
        this.commentsCount = commentsCount;
        return this;
    }
    public Long getCommentsCount() {
        return this.commentsCount;
    }

    public HotspotMessage setDocTitle(String docTitle) {
        this.docTitle = docTitle;
        return this;
    }
    public String getDocTitle() {
        return this.docTitle;
    }

    public HotspotMessage setFirstRank(Long firstRank) {
        this.firstRank = firstRank;
        return this;
    }
    public Long getFirstRank() {
        return this.firstRank;
    }

    public HotspotMessage setOriginalCount(Long originalCount) {
        this.originalCount = originalCount;
        return this;
    }
    public Long getOriginalCount() {
        return this.originalCount;
    }

    public HotspotMessage setPresenterName(String presenterName) {
        this.presenterName = presenterName;
        return this;
    }
    public String getPresenterName() {
        return this.presenterName;
    }

    public HotspotMessage setRank(Long rank) {
        this.rank = rank;
        return this;
    }
    public Long getRank() {
        return this.rank;
    }

    public HotspotMessage setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public HotspotMessage setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public HotspotMessage setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HotspotMessage setHotValue(Long hotValue) {
        this.hotValue = hotValue;
        return this;
    }
    public Long getHotValue() {
        return this.hotValue;
    }

    public HotspotMessage setDocContent(String docContent) {
        this.docContent = docContent;
        return this;
    }
    public String getDocContent() {
        return this.docContent;
    }

    public HotspotMessage setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }
    public String getScreenName() {
        return this.screenName;
    }

    public HotspotMessage setMediaSubType(String mediaSubType) {
        this.mediaSubType = mediaSubType;
        return this;
    }
    public String getMediaSubType() {
        return this.mediaSubType;
    }

    public HotspotMessage setDiscussesCount(Long discussesCount) {
        this.discussesCount = discussesCount;
        return this;
    }
    public Long getDiscussesCount() {
        return this.discussesCount;
    }

    public HotspotMessage setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public HotspotMessage setVideoCount(Long videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Long getVideoCount() {
        return this.videoCount;
    }

    public HotspotMessage setMaxRankTotalTimeFormat(String maxRankTotalTimeFormat) {
        this.maxRankTotalTimeFormat = maxRankTotalTimeFormat;
        return this;
    }
    public String getMaxRankTotalTimeFormat() {
        return this.maxRankTotalTimeFormat;
    }

    public HotspotMessage setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public HotspotMessage setTotalExistTimeFormat(String totalExistTimeFormat) {
        this.totalExistTimeFormat = totalExistTimeFormat;
        return this;
    }
    public String getTotalExistTimeFormat() {
        return this.totalExistTimeFormat;
    }

    public HotspotMessage setFirstTopExistTimestamp(Long firstTopExistTimestamp) {
        this.firstTopExistTimestamp = firstTopExistTimestamp;
        return this;
    }
    public Long getFirstTopExistTimestamp() {
        return this.firstTopExistTimestamp;
    }

    public HotspotMessage setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public HotspotMessage setMaxHotValue(Long maxHotValue) {
        this.maxHotValue = maxHotValue;
        return this;
    }
    public Long getMaxHotValue() {
        return this.maxHotValue;
    }

    public HotspotMessage setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public HotspotMessage setLastExistTimestamp(Long lastExistTimestamp) {
        this.lastExistTimestamp = lastExistTimestamp;
        return this;
    }
    public Long getLastExistTimestamp() {
        return this.lastExistTimestamp;
    }

    public HotspotMessage setFirstTopExistDateFormat(String firstTopExistDateFormat) {
        this.firstTopExistDateFormat = firstTopExistDateFormat;
        return this;
    }
    public String getFirstTopExistDateFormat() {
        return this.firstTopExistDateFormat;
    }

    public HotspotMessage setLastRank(Long lastRank) {
        this.lastRank = lastRank;
        return this;
    }
    public Long getLastRank() {
        return this.lastRank;
    }

    public HotspotMessage setFirstHotValue(Long firstHotValue) {
        this.firstHotValue = firstHotValue;
        return this;
    }
    public Long getFirstHotValue() {
        return this.firstHotValue;
    }

    public HotspotMessage setHotspotType(String hotspotType) {
        this.hotspotType = hotspotType;
        return this;
    }
    public String getHotspotType() {
        return this.hotspotType;
    }

    public HotspotMessage setFirstXxistTimestamp(Long firstXxistTimestamp) {
        this.firstXxistTimestamp = firstXxistTimestamp;
        return this;
    }
    public Long getFirstXxistTimestamp() {
        return this.firstXxistTimestamp;
    }

    public HotspotMessage setFirstExistTimestamp(Long firstExistTimestamp) {
        this.firstExistTimestamp = firstExistTimestamp;
        return this;
    }
    public Long getFirstExistTimestamp() {
        return this.firstExistTimestamp;
    }

}
