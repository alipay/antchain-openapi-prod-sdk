// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class SetGeneralDivideRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 自定义分账规则唯一ID
        [NameInMap("rule_id")]
        [Validation(Required=true, MaxLength=64)]
        public string RuleId { get; set; }

        // 分账方，分账方不能重复配置
        [NameInMap("rule_item_list")]
        [Validation(Required=true)]
        public List<RuleItem> RuleItemList { get; set; }

    }

}
