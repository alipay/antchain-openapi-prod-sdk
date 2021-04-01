// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessContractGrantdidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户业务链地址biz_id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 授权的合约名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 用户did身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 授权截止日期
        [NameInMap("due_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DueTime { get; set; }

        // 被授权者身份
        [NameInMap("granted_did")]
        [Validation(Required=true)]
        public string GrantedDid { get; set; }

        // 授权的字段
        [NameInMap("item_ids")]
        [Validation(Required=true)]
        public List<string> ItemIds { get; set; }

    }

}
