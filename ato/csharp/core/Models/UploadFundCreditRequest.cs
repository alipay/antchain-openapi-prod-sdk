// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UploadFundCreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号类型
        [NameInMap("order_no_type")]
        [Validation(Required=true)]
        public string OrderNoType { get; set; }

        // 订单号，或资产包号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 凭证类型
        [NameInMap("credit_type")]
        [Validation(Required=true)]
        public string CreditType { get; set; }

        // 凭证名称
        [NameInMap("credit_name")]
        [Validation(Required=false)]
        public string CreditName { get; set; }

        // 文本类型
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 文本下载链接，如果类型是FILE则必填
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

    }

}
