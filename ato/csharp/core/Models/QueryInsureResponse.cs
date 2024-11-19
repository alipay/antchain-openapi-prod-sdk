// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInsureResponse : TeaModel {
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

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 保单号
        [NameInMap("insure_id")]
        [Validation(Required=false)]
        public string InsureId { get; set; }

        // 保险订单状态。TOBE_INSURE：待发起投保 ；INSUR_PRE_SUCC：投保成功。WITHHOLD_DEDUCTING：代扣中；WITHHOLD_SUCC：代扣成功。WITHHOLD_FAIL：代扣失败。INSUR_SUCC：承保成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 2024-09-24 20:04:35
        [NameInMap("insure_start_time")]
        [Validation(Required=false)]
        public string InsureStartTime { get; set; }

        // 2024-12-24 20:04:35
        [NameInMap("insure_end_time")]
        [Validation(Required=false)]
        public string InsureEndTime { get; set; }

        // 投保金额（保额），单位分。100代表1元
        [NameInMap("insure_amount")]
        [Validation(Required=false)]
        public string InsureAmount { get; set; }

        // 投保费用（保费），单位分。100代表1元
        [NameInMap("insure_premium")]
        [Validation(Required=false)]
        public string InsurePremium { get; set; }

        // 电子保单下载链接
        [NameInMap("policy_url")]
        [Validation(Required=false)]
        public string PolicyUrl { get; set; }

        // 验真码
        [NameInMap("validate_code")]
        [Validation(Required=false)]
        public string ValidateCode { get; set; }

    }

}
