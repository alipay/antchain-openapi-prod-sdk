// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 产品级 OTA 连续推送策略响应
    public class ContinuousOtaOpenApiPolicyResponse : TeaModel {
        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>租户id</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 策略所属产品可信标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>A7njznJkBrCCDdeIKl</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品策略主键
        /// <summary>
        /// <b>Example:</b>
        /// <para>734794542196985856</para>
        /// </summary>
        [NameInMap("policy_id")]
        [Validation(Required=false)]
        public string PolicyId { get; set; }

        // 产品下规则集合版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品下规则集合版本</para>
        /// </summary>
        [NameInMap("rules_version")]
        [Validation(Required=false)]
        public string RulesVersion { get; set; }

        // 产品全局白名单版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品全局白名单版本</para>
        /// </summary>
        [NameInMap("whitelist_version")]
        [Validation(Required=false)]
        public string WhitelistVersion { get; set; }

        // 当前有效白名单成员数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>当前有效白名单成员数量</para>
        /// </summary>
        [NameInMap("whitelist_count")]
        [Validation(Required=false)]
        public string WhitelistCount { get; set; }

        // 当前产品配置是否允许整体删除
        /// <summary>
        /// <b>Example:</b>
        /// <para>false</para>
        /// </summary>
        [NameInMap("deletable")]
        [Validation(Required=false)]
        public bool? Deletable { get; set; }

        // 当前产品配置不可删除的稳定原因编码列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("delete_blocked_reasons")]
        [Validation(Required=false)]
        public List<string> DeleteBlockedReasons { get; set; }

        // 产品当前生效的连续推送规则列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<ContinuousOtaOpenApiRuleResponse> Rules { get; set; }

    }

}
