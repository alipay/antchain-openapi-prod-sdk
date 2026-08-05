// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtacontinuouspushrulesenabledRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 规则所属产品可信标识
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // 待启停规则 ID
        [NameInMap("rule_id")]
        [Validation(Required=true)]
        public long? RuleId { get; set; }

        // 规则目标启用状态
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // 规则当前乐观锁版本
        [NameInMap("expected_lock_version")]
        [Validation(Required=true)]
        public long? ExpectedLockVersion { get; set; }

    }

}
