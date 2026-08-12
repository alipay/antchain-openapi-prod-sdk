// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 租户级 OTA 连续推送完整配置响应
    public class ContinuousOtaConfigResponse : TeaModel {
        // 当前配置所属租户 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>XQBKTRQV</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户名称；跨租户管理视图中可能为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>租户名称</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 租户级连续推送总开关
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // 同设备同固件的去重窗口，单位分钟
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("dedup_expire_minutes")]
        [Validation(Required=false)]
        public long? DedupExpireMinutes { get; set; }

        // 租户级设置锁版本，以字符串返回，更新设置时作为 expectedLockVersion 回传
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lock_version")]
        [Validation(Required=false)]
        public string LockVersion { get; set; }

        // 产品策略列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("product_configs")]
        [Validation(Required=false)]
        public List<ContinuousOtaOpenApiPolicyResponse> ProductConfigs { get; set; }

    }

}
