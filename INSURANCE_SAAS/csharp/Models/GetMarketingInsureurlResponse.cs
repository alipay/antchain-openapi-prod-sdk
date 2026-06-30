// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class GetMarketingInsureurlResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 请求 id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 一级渠道编码
        [NameInMap("first_channel")]
        [Validation(Required=false)]
        public string FirstChannel { get; set; }

        // 二级渠道编码
        [NameInMap("second_channel")]
        [Validation(Required=false)]
        public string SecondChannel { get; set; }

        // 三级渠道/广告版位
        [NameInMap("advertising_position")]
        [Validation(Required=false)]
        public string AdvertisingPosition { get; set; }

        // 订单号
        [NameInMap("scene_order_no")]
        [Validation(Required=false)]
        public string SceneOrderNo { get; set; }

        // 特征编码
        [NameInMap("click_id")]
        [Validation(Required=false)]
        public string ClickId { get; set; }

        // 投保页面URL
        [NameInMap("insure_url")]
        [Validation(Required=false)]
        public string InsureUrl { get; set; }

    }

}
