// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class PushTdiaiworkshopcloudBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品码（事件码）
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 产品码
        [NameInMap("disp_model_code")]
        [Validation(Required=true)]
        public string DispModelCode { get; set; }

        // 业务码
        [NameInMap("business_type")]
        [Validation(Required=true)]
        public string BusinessType { get; set; }

        // 加密方式
        [NameInMap("hash_type")]
        [Validation(Required=true)]
        public string HashType { get; set; }

        // 请求唯一id，幂等设计
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 样本结构体
        [NameInMap("sample_list")]
        [Validation(Required=true)]
        public List<Item> SampleList { get; set; }

        // 回溯日期
        [NameInMap("back_date")]
        [Validation(Required=false)]
        public string BackDate { get; set; }

        // 回调地址
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

    }

}
