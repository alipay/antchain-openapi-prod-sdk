// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ApplyFundCreditutilizationResponse : TeaModel {
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

        // 用信Id
        [NameInMap("utilization_id")]
        [Validation(Required=false)]
        public string UtilizationId { get; set; }

        // 用信授权id
        [NameInMap("utilization_auth_id")]
        [Validation(Required=false)]
        public string UtilizationAuthId { get; set; }

        // 资产包id
        [NameInMap("asset_package_id")]
        [Validation(Required=false)]
        public string AssetPackageId { get; set; }

        // 商户授权链接
        [NameInMap("merchant_auth_url")]
        [Validation(Required=false)]
        public string MerchantAuthUrl { get; set; }

    }

}
