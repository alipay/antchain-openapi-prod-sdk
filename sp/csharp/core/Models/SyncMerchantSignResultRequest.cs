// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class SyncMerchantSignResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 本次关联注册失败错误原因。
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

        // 商家注册(进件)受理单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 商家注册（包括进件）结果。99:已完结;-1:失败;
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 二级商户id
        [NameInMap("smid")]
        [Validation(Required=true)]
        public string Smid { get; set; }

        // 商户租户id
        [NameInMap("merchant_user_id")]
        [Validation(Required=true)]
        public string MerchantUserId { get; set; }

        // 商户名称
        [NameInMap("merchant_name")]
        [Validation(Required=false)]
        public string MerchantName { get; set; }

        // 八位数的商户租户名称
        [NameInMap("merchant_user_name")]
        [Validation(Required=false)]
        public string MerchantUserName { get; set; }

    }

}
