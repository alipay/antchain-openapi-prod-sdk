// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class NotifyFundFlowRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单所属商户的统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户的订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 签署合同单号
        [NameInMap("sign_no")]
        [Validation(Required=true)]
        public string SignNo { get; set; }

        // 返回的文件fileItemNo编号
        [NameInMap("file_item_no")]
        [Validation(Required=true)]
        public string FileItemNo { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false)]
        public string FundId { get; set; }

    }

}
