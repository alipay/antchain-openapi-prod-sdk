// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class NotifyAutoinsuranceEventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 通知类型
        [NameInMap("notice_type")]
        [Validation(Required=true)]
        public string NoticeType { get; set; }

        // 投保类型
        [NameInMap("insure_type")]
        [Validation(Required=true)]
        public string InsureType { get; set; }

        // 发生时间yyyy-MM-dd HH:mm:ss
        [NameInMap("happen_time")]
        [Validation(Required=true)]
        public string HappenTime { get; set; }

        // 附加信息，{"samePerson":true}  将会是一个JSON对象，samePerson表示车牌人和投保人是否同一个人，后续可能还会加其它附加信息。
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
