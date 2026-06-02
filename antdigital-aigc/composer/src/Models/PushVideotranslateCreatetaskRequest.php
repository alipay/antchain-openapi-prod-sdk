<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AIGC\Models;

use AlibabaCloud\Tea\Model;

class PushVideotranslateCreatetaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 视频URL
    /**
     * @var string
     */
    public $videoUrl;

    // 视频名称
    /**
     * @var string
     */
    public $videoName;

    // 翻译类型：VOICE(语音级翻译)、SUBTITLE(字幕级翻译)、FACE(面容级翻译)，二次翻译仅支持VOICE
    /**
     * @var string
     */
    public $translateType;

    // 字幕级翻译支持的源语言：zh(中文), en(英文)
    //
    // 语音级翻译支持的源语言：zh(中文), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), it(意大利语), pt(葡萄牙语), ru(俄语), hi(印地语), id(印度尼西亚语), ms(马来语),
    // nl(荷兰语), pl(波兰语), no(挪威语), da(丹麦语),hu(匈牙利语), cs(捷克语), ro(罗马尼亚语), bg(保加利亚语), sk(斯洛伐克语), sl(斯洛文尼亚语), lt(立陶宛语), lv(拉脱维亚语), et(爱沙尼亚语),
    // is(冰岛语), sq(阿尔巴尼亚语), az(阿塞拜疆语), be(白俄罗斯语), bs(波斯尼亚语), bn(孟加拉语),cy(威尔士语), fa(波斯语), hbs(克罗地亚语), mn(蒙古语), mr(马拉地语), mt(马耳他语), mi(毛利语),ne(尼泊尔语)
    //
    // 面容级翻译支持的源语言：与 VOICE 源语言完全一致（42种）
    /**
     * @var string
     */
    public $sourceLanguage;

    // 字幕级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), id(印度尼西亚语), es(西班牙语), pt(葡萄牙语), ar(阿拉伯语), fr(法语), tr(土耳其语), de(德语), ru(俄语), th(泰语), vi(越南语), ms(马来语), yue(粤语), sichuan(四川话),dongbei(东北话), henan(河南话), shanghai(上海话), tianjin(天津话), beijing(北京话), chongqing(重庆话), hunan(湖南话),taiwan(台湾话), shanxi(山西话), shaanxi(陕西话)
    //
    // 语音级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), tr(土耳其语), ru(俄语), pt(葡萄牙语), vi(越南语), ms(马来语), th(泰语), id(印度尼西亚语), sichuan(四川话),
    // tianjin(天津话)
    //
    // 面容级翻译支持的目标语言：en(英语)
    /**
     * @var string
     */
    public $targetLanguages;

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
    /**
     * @var string
     */
    public $subtitleUrl;

    // 子任务ID，二次翻译时必填
    /**
     * @var int
     */
    public $subTaskId;

    // 是否擦除字幕
    /**
     * @var bool
     */
    public $eraseSubtitle;

    // 是否嵌入字幕
    /**
     * @var bool
     */
    public $embedSubtitle;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'videoUrl'          => 'video_url',
        'videoName'         => 'video_name',
        'translateType'     => 'translate_type',
        'sourceLanguage'    => 'source_language',
        'targetLanguages'   => 'target_languages',
        'subtitleUrl'       => 'subtitle_url',
        'subTaskId'         => 'sub_task_id',
        'eraseSubtitle'     => 'erase_subtitle',
        'embedSubtitle'     => 'embed_subtitle',
    ];

    public function validate()
    {
        Model::validateRequired('videoUrl', $this->videoUrl, true);
        Model::validateRequired('videoName', $this->videoName, true);
        Model::validateRequired('translateType', $this->translateType, true);
        Model::validateRequired('sourceLanguage', $this->sourceLanguage, true);
        Model::validateRequired('targetLanguages', $this->targetLanguages, true);
        Model::validateRequired('eraseSubtitle', $this->eraseSubtitle, true);
        Model::validateRequired('embedSubtitle', $this->embedSubtitle, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->videoUrl) {
            $res['video_url'] = $this->videoUrl;
        }
        if (null !== $this->videoName) {
            $res['video_name'] = $this->videoName;
        }
        if (null !== $this->translateType) {
            $res['translate_type'] = $this->translateType;
        }
        if (null !== $this->sourceLanguage) {
            $res['source_language'] = $this->sourceLanguage;
        }
        if (null !== $this->targetLanguages) {
            $res['target_languages'] = $this->targetLanguages;
        }
        if (null !== $this->subtitleUrl) {
            $res['subtitle_url'] = $this->subtitleUrl;
        }
        if (null !== $this->subTaskId) {
            $res['sub_task_id'] = $this->subTaskId;
        }
        if (null !== $this->eraseSubtitle) {
            $res['erase_subtitle'] = $this->eraseSubtitle;
        }
        if (null !== $this->embedSubtitle) {
            $res['embed_subtitle'] = $this->embedSubtitle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushVideotranslateCreatetaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['video_url'])) {
            $model->videoUrl = $map['video_url'];
        }
        if (isset($map['video_name'])) {
            $model->videoName = $map['video_name'];
        }
        if (isset($map['translate_type'])) {
            $model->translateType = $map['translate_type'];
        }
        if (isset($map['source_language'])) {
            $model->sourceLanguage = $map['source_language'];
        }
        if (isset($map['target_languages'])) {
            $model->targetLanguages = $map['target_languages'];
        }
        if (isset($map['subtitle_url'])) {
            $model->subtitleUrl = $map['subtitle_url'];
        }
        if (isset($map['sub_task_id'])) {
            $model->subTaskId = $map['sub_task_id'];
        }
        if (isset($map['erase_subtitle'])) {
            $model->eraseSubtitle = $map['erase_subtitle'];
        }
        if (isset($map['embed_subtitle'])) {
            $model->embedSubtitle = $map['embed_subtitle'];
        }

        return $model;
    }
}
