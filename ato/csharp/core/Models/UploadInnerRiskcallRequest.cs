// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UploadInnerRiskcallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 幂等id
        [NameInMap("idempotent_id")]
        [Validation(Required=true, MaxLength=32)]
        public string IdempotentId { get; set; }

        // 商户的支付宝唯一id
        [NameInMap("pid")]
        [Validation(Required=true, MaxLength=32)]
        public string Pid { get; set; }

        // 计量值
        [NameInMap("service_amount")]
        [Validation(Required=true)]
        public long? ServiceAmount { get; set; }

        // 上报的数据开始时间，格式 yyyy-MM-dd HH:mm:ss
        [NameInMap("start_time")]
        [Validation(Required=true, MaxLength=32)]
        public string StartTime { get; set; }

        // 上报的数据结束时间，格式 yyyy-MM-dd HH:mm:ss
        [NameInMap("end_time")]
        [Validation(Required=true, MaxLength=32)]
        public string EndTime { get; set; }

        // 支付宝开放平台购买的实例 id
        [NameInMap("alipay_instance_id")]
        [Validation(Required=true, MaxLength=64)]
        public string AlipayInstanceId { get; set; }

        // 扩展参数
        // jsonString
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
