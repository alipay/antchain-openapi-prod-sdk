// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtacontinuouspushrulesenabledResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 策略所属产品可信标识
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品策略主键，以字符串返回，避免前端整数精度丢失
        [NameInMap("policy_id")]
        [Validation(Required=false)]
        public string PolicyId { get; set; }

        // 产品下规则集合版本，以字符串返回；任一规则变更时递增并用于运行快照失效。
        [NameInMap("rules_version")]
        [Validation(Required=false)]
        public string RulesVersion { get; set; }

        // 产品全局白名单版本，以字符串返回，白名单变更时递增。
        [NameInMap("whitelist_version")]
        [Validation(Required=false)]
        public string WhitelistVersion { get; set; }

        // 当前有效白名单成员数量，以字符串返回。
        [NameInMap("whitelist_count")]
        [Validation(Required=false)]
        public string WhitelistCount { get; set; }

        // 当前产品配置是否允许整体删除；服务端执行删除时仍会重新校验。
        [NameInMap("deletable")]
        [Validation(Required=false)]
        public bool? Deletable { get; set; }

        // 当前产品配置不可删除的稳定原因编码集合。
        [NameInMap("delete_blocked_reasons")]
        [Validation(Required=false)]
        public List<string> DeleteBlockedReasons { get; set; }

        // 产品当前生效的连续推送规则集合
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<ContinuousOtaRuleResponse> Rules { get; set; }

    }

}
