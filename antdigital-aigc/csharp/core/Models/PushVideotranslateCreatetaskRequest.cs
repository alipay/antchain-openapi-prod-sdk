// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class PushVideotranslateCreatetaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 视频URL
        [NameInMap("video_url")]
        [Validation(Required=true)]
        public string VideoUrl { get; set; }

        // 视频名称
        [NameInMap("video_name")]
        [Validation(Required=true)]
        public string VideoName { get; set; }

        // 翻译类型：VOICE(语音级翻译)、SUBTITLE(字幕级翻译)、FACE(面容级翻译)，二次翻译仅支持VOICE
        [NameInMap("translate_type")]
        [Validation(Required=true)]
        public string TranslateType { get; set; }

        // 字幕级翻译支持的源语言：zh(中文), en(英文)
        //   
        // 语音级翻译支持的源语言：zh(中文), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), it(意大利语), pt(葡萄牙语), ru(俄语), hi(印地语), id(印度尼西亚语), ms(马来语), 
        // nl(荷兰语), pl(波兰语), no(挪威语), da(丹麦语),hu(匈牙利语), cs(捷克语), ro(罗马尼亚语), bg(保加利亚语), sk(斯洛伐克语), sl(斯洛文尼亚语), lt(立陶宛语), lv(拉脱维亚语), et(爱沙尼亚语),
        // is(冰岛语), sq(阿尔巴尼亚语), az(阿塞拜疆语), be(白俄罗斯语), bs(波斯尼亚语), bn(孟加拉语),cy(威尔士语), fa(波斯语), hbs(克罗地亚语), mn(蒙古语), mr(马拉地语), mt(马耳他语), mi(毛利语),ne(尼泊尔语)
        // 
        // 面容级翻译支持的源语言：与 VOICE 源语言完全一致（42种）
        [NameInMap("source_language")]
        [Validation(Required=true)]
        public string SourceLanguage { get; set; }

        // 字幕级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), id(印度尼西亚语), es(西班牙语), pt(葡萄牙语), ar(阿拉伯语), fr(法语), tr(土耳其语), de(德语), ru(俄语), th(泰语), vi(越南语), ms(马来语), yue(粤语), sichuan(四川话),dongbei(东北话), henan(河南话), shanghai(上海话), tianjin(天津话), beijing(北京话), chongqing(重庆话), hunan(湖南话),taiwan(台湾话), shanxi(山西话), shaanxi(陕西话)
        // 
        // 语音级翻译支持的目标语言：zh(中文), zh-tw(中文-繁体), en(英语), ja(日语), ko(韩语), yue(粤语), de(德语), fr(法语), es(西班牙语), ar(阿拉伯语), tr(土耳其语), ru(俄语), pt(葡萄牙语), vi(越南语), ms(马来语), th(泰语), id(印度尼西亚语), sichuan(四川话),
        //   tianjin(天津话)
        // 
        // 面容级翻译支持的目标语言：en(英语)
        [NameInMap("target_languages")]
        [Validation(Required=true)]
        public string TargetLanguages { get; set; }

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
        [NameInMap("subtitle_url")]
        [Validation(Required=false)]
        public string SubtitleUrl { get; set; }

        // 子任务ID，二次翻译时必填
        [NameInMap("sub_task_id")]
        [Validation(Required=false)]
        public long? SubTaskId { get; set; }

        // 是否擦除字幕
        [NameInMap("erase_subtitle")]
        [Validation(Required=true)]
        public bool? EraseSubtitle { get; set; }

        // 是否嵌入字幕
        [NameInMap("embed_subtitle")]
        [Validation(Required=true)]
        public bool? EmbedSubtitle { get; set; }

    }

}
