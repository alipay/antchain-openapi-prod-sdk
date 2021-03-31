// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UploadCreditConfirmRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货主云资金商户id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 确认时间
        [NameInMap("confirm_date")]
        [Validation(Required=true)]
        public string ConfirmDate { get; set; }

        // 应收转让通知编号
        [NameInMap("confirm_no")]
        [Validation(Required=true)]
        public string ConfirmNo { get; set; }

        // 签署货主did
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 签署的货主平台账号
        [NameInMap("consignor_platform_account")]
        [Validation(Required=true)]
        public string ConsignorPlatformAccount { get; set; }

        // 协议到期日
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 签署子公司did
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 协议名称
        [NameInMap("protocol_name")]
        [Validation(Required=true)]
        public string ProtocolName { get; set; }

        // 协议PDF文件, 多个文件可用逗号分隔, 最多10个
        [NameInMap("protocol_pdf_id")]
        [Validation(Required=true)]
        public string ProtocolPdfId { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
