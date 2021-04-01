// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessAgreementRegisterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务链的bizId
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 回调合约方法
        [NameInMap("callback_method")]
        [Validation(Required=true)]
        public string CallbackMethod { get; set; }

        // 回调合约名称
        [NameInMap("contract_id")]
        [Validation(Required=true)]
        public string ContractId { get; set; }

        // 合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 用户身份的did
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 回调key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 合约模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

    }

}
