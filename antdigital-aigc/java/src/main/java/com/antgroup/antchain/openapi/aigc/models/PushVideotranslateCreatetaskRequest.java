// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class PushVideotranslateCreatetaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 视频URL
    @NameInMap("video_url")
    @Validation(required = true)
    public String videoUrl;

    // 视频名称
    @NameInMap("video_name")
    @Validation(required = true)
    public String videoName;

    // 翻译类型：VOICE(语音级翻译)、SUBTITLE(字幕级翻译)、FACE(面容级翻译)，二次翻译仅支持VOICE
    @NameInMap("translate_type")
    @Validation(required = true)
    public String translateType;

    // 字幕级翻译支持的源语言：zh(中文), en(英文)
    //   
    // 语音级翻译支持的源语言：zh(中文), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), it(意大利语), pt(葡萄牙语), ru(俄语), hi(印地语), id(印度尼西亚语), ms(马来语), 
    // nl(荷兰语), pl(波兰语), no(挪威语), da(丹麦语),hu(匈牙利语), cs(捷克语), ro(罗马尼亚语), bg(保加利亚语), sk(斯洛伐克语), sl(斯洛文尼亚语), lt(立陶宛语), lv(拉脱维亚语), et(爱沙尼亚语),
    // is(冰岛语), sq(阿尔巴尼亚语), az(阿塞拜疆语), be(白俄罗斯语), bs(波斯尼亚语), bn(孟加拉语),cy(威尔士语), fa(波斯语), hbs(克罗地亚语), mn(蒙古语), mr(马拉地语), mt(马耳他语), mi(毛利语),ne(尼泊尔语)
    // 
    // 面容级翻译支持的源语言：与 VOICE 源语言完全一致（42种）
    @NameInMap("source_language")
    @Validation(required = true)
    public String sourceLanguage;

    // 字幕级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), id(印度尼西亚语), es(西班牙语), pt(葡萄牙语), ar(阿拉伯语), fr(法语), tr(土耳其语), de(德语), ru(俄语), th(泰语), vi(越南语), ms(马来语), yue(粤语), sichuan(四川话),dongbei(东北话), henan(河南话), shanghai(上海话), tianjin(天津话), beijing(北京话), chongqing(重庆话), hunan(湖南话),taiwan(台湾话), shanxi(山西话), shaanxi(陕西话)
    // 
    // 语音级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), tr(土耳其语), ru(俄语), pt(葡萄牙语), vi(越南语), ms(马来语), th(泰语), id(印度尼西亚语), sichuan(四川话),
    //   tianjin(天津话)
    // 
    // 面容级翻译支持的目标语言：en(英语)
    @NameInMap("target_languages")
    @Validation(required = true)
    public String targetLanguages;

    // 字幕文件格式如下：
    // 1
    // 00:00:07,000 --> 00:00:08,300
    // 流产手术需要监护人
    // An abortion requires a guardian
    // 
    // 2
    // 00:00:08,300 --> 00:00:09,100
    // 签字才能做
    // to sign before it_s done
    // 
    // 3
    // 00:00:11,700 --> 00:00:12,800
    // 你看看咱们家
    // Look at our family
    // 
    // 4
    // 00:00:12,900 --> 00:00:13,700
    // 那么困难
    // we_re barely getting by
    // 
    // 5
    // 00:00:13,700 --> 00:00:14,700
    // 你爸又生病
    // Your father is sick again
    // 
    // 6
    // 00:00:14,700 --> 00:00:16,100
    // 我一把屎一把尿
    // I raised you from infancy
    // 
    // 7
    // 00:00:16,100 --> 00:00:16,700
    // 把你养大
    // got you this far
    // 
    // 8
    // 00:00:16,900 --> 00:00:17,800
    // 让你上学
    // and put you through school
    @NameInMap("subtitle_url")
    public String subtitleUrl;

    // 子任务ID，二次翻译时必填
    @NameInMap("sub_task_id")
    public Long subTaskId;

    // 是否擦除字幕
    @NameInMap("erase_subtitle")
    @Validation(required = true)
    public Boolean eraseSubtitle;

    // 是否嵌入字幕
    @NameInMap("embed_subtitle")
    @Validation(required = true)
    public Boolean embedSubtitle;

    public static PushVideotranslateCreatetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PushVideotranslateCreatetaskRequest self = new PushVideotranslateCreatetaskRequest();
        return TeaModel.build(map, self);
    }

    public PushVideotranslateCreatetaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushVideotranslateCreatetaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushVideotranslateCreatetaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public PushVideotranslateCreatetaskRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public PushVideotranslateCreatetaskRequest setTranslateType(String translateType) {
        this.translateType = translateType;
        return this;
    }
    public String getTranslateType() {
        return this.translateType;
    }

    public PushVideotranslateCreatetaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public PushVideotranslateCreatetaskRequest setTargetLanguages(String targetLanguages) {
        this.targetLanguages = targetLanguages;
        return this;
    }
    public String getTargetLanguages() {
        return this.targetLanguages;
    }

    public PushVideotranslateCreatetaskRequest setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
        return this;
    }
    public String getSubtitleUrl() {
        return this.subtitleUrl;
    }

    public PushVideotranslateCreatetaskRequest setSubTaskId(Long subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }
    public Long getSubTaskId() {
        return this.subTaskId;
    }

    public PushVideotranslateCreatetaskRequest setEraseSubtitle(Boolean eraseSubtitle) {
        this.eraseSubtitle = eraseSubtitle;
        return this;
    }
    public Boolean getEraseSubtitle() {
        return this.eraseSubtitle;
    }

    public PushVideotranslateCreatetaskRequest setEmbedSubtitle(Boolean embedSubtitle) {
        this.embedSubtitle = embedSubtitle;
        return this;
    }
    public Boolean getEmbedSubtitle() {
        return this.embedSubtitle;
    }

}
