// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class SaveDataConversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 追踪ID，每次请求保持唯一
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 客户ID，广告主标识
        [NameInMap("sponsor_code")]
        [Validation(Required=true)]
        public string SponsorCode { get; set; }

        // 转化对应的产品id，由数科提供，建议填写
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 唯一标识当前转化事件id，用于转化事件的去重避免重复统计，建议填写，可以是订单ID等业务唯一ID。
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

        // 转化发生的unix事件戳,单位毫秒
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public long? EventTime { get; set; }

        // 转化事件类型
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // json字符串，转化附加参数
        [NameInMap("event_param")]
        [Validation(Required=false)]
        public string EventParam { get; set; }

        // 转化所属用户在客户系统中的用户id，如电话号码Md5 建议填写
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // json字段，格式： {"xxx": xxx, "yyyy":"yyyy"}， 
        // H5/小程序类：为投放前与蚂蚁数科约定的在落地页URL中的埋点参数，包含转化对应的媒体侧返回信息，如click_id, gdt_vid, request_id 跳转链接等务必全量提供
        // App类：设备ID（ Android ID、OAID、OAID_MD5、IDFA、IDFA_MD5、CAID），点击ID、请求ID等
        // 数科侧会依据该信息与自行收集到的点击进行匹配归因，务必详尽提供。
        // 此部分字段信息需在接入前双方确认，主要与媒体平台、投放载体（H5、微信小程序、手机App等）有关，需要客户支持采集(如H5 URL拼接埋点参数、小程序path埋点参数）
        // 具体请参考文档
        [NameInMap("trace_info")]
        [Validation(Required=true)]
        public string TraceInfo { get; set; }

        // json扩展字段。保险行业必填insurance_info，见文档
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
