// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class AddEcarOffsettranslateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 转移业务流水单号
        [NameInMap("translation_item_no")]
        [Validation(Required=true)]
        public string TranslationItemNo { get; set; }

        // 碳补偿项目编号
        [NameInMap("project_no")]
        [Validation(Required=true)]
        public string ProjectNo { get; set; }

        // 出账账户DID
        [NameInMap("drawing_account_did")]
        [Validation(Required=true)]
        public string DrawingAccountDid { get; set; }

        // 转移入账账户DID
        [NameInMap("receipt_account_did")]
        [Validation(Required=true)]
        public string ReceiptAccountDid { get; set; }

        // 转移减碳量额度，最多六位小数
        [NameInMap("translation_ammount")]
        [Validation(Required=true)]
        public string TranslationAmmount { get; set; }

        // 业务类型包括，默认不需要传入，默认值为Translation
        [NameInMap("translation_type")]
        [Validation(Required=false)]
        public string TranslationType { get; set; }

        // 发生时间，格式为yyyy-MM-DD HH:MM:SS
        [NameInMap("occurrent_time")]
        [Validation(Required=true)]
        public string OccurrentTime { get; set; }

    }

}
