// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardBillingcontractResponse : TeaModel {
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

        // 基础响应对象
        [NameInMap("base_response")]
        [Validation(Required=false)]
        public BaseResponseData BaseResponse { get; set; }

        // 商家名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 商家链上账户ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 认证平台ID 例如：支付宝用户ID
        [NameInMap("certification_id")]
        [Validation(Required=false)]
        public string CertificationId { get; set; }

        // 场景码(需要申请)
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 签约时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 解约时间
        [NameInMap("invalid_time")]
        [Validation(Required=false)]
        public string InvalidTime { get; set; }

        // 签约链接
        [NameInMap("arrangement_url")]
        [Validation(Required=false)]
        public string ArrangementUrl { get; set; }

        // 签约状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
