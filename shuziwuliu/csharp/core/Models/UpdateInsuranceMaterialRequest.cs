// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateInsuranceMaterialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 交易流水号，调用方生成的唯一编码，格式
        // 为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 保司编码，PAIC---平安、CPIC---太保
        [NameInMap("external_channel_code")]
        [Validation(Required=true)]
        public string ExternalChannelCode { get; set; }

        // 险种编码：05-驿站宝
        [NameInMap("external_product_code")]
        [Validation(Required=true)]
        public string ExternalProductCode { get; set; }

        // 保司报案所返回的案件号
        [NameInMap("report_no")]
        [Validation(Required=true)]
        public string ReportNo { get; set; }

        // 案件所关联的保单号信息
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 客诉材料-更新状态集 UPDATE-更新/覆盖、INCREASE-增加
        [NameInMap("document_update_mode")]
        [Validation(Required=true)]
        public string DocumentUpdateMode { get; set; }

        // 案件材料
        [NameInMap("documents")]
        [Validation(Required=true)]
        public List<Document> Documents { get; set; }

        // 收款人账户信息
        [NameInMap("payment_info")]
        [Validation(Required=false)]
        public PaymentInfo PaymentInfo { get; set; }

    }

}
