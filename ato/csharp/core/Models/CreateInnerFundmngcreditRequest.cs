// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInnerFundmngcreditRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 资方租户id
        [NameInMap("fund_tenant_id")]
        [Validation(Required=true)]
        public string FundTenantId { get; set; }

        // 资方统一社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 订单号类型，ORDER_NO(订单id)或PACKAGE_ID(资产包id)
        [NameInMap("order_no_type")]
        [Validation(Required=true)]
        public string OrderNoType { get; set; }

        // 订单id或资产包id
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 资产凭证名称
        [NameInMap("credit_name")]
        [Validation(Required=true)]
        public string CreditName { get; set; }

        // 上传文件返回的fileKey，当content_type=FILE时必填
        [NameInMap("credit_file_key")]
        [Validation(Required=false)]
        public string CreditFileKey { get; set; }

        // 文本内容，JSON_TEXT类型需传入JSON文本;TEXT类型则需传入普通文本
        [NameInMap("credit_content")]
        [Validation(Required=false)]
        public string CreditContent { get; set; }

    }

}
