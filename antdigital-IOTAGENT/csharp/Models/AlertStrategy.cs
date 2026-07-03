// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 告警策略
    public class AlertStrategy : TeaModel {
        // 主键ID 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10T10:10:00Z</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 场景码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay-0101</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=false)]
        public string Scene { get; set; }

        // 策略类型：DEBUG（技术联调）；MONITOR（生产监控）
        /// <summary>
        /// <b>Example:</b>
        /// <para>MONITOR</para>
        /// </summary>
        [NameInMap("strategy_type")]
        [Validation(Required=true)]
        public string StrategyType { get; set; }

        // 策略详情，json格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{  &quot;alert_method&quot;: &quot;DING_TALK&quot;,   &quot;addresses&quot;: &quot;&quot;,  &quot;alert_strategy&quot;: &quot;&quot;,   &quot;params&quot;: {     &quot;fail_days&quot; : 10   } }, {  &quot;alert_method&quot;: &quot;EMAIL&quot;,   &quot;addresses&quot;: &quot;&quot;,  &quot;alert_strategy&quot;: &quot;&quot;,  &quot;params&quot;: {       } }]</para>
        /// </summary>
        [NameInMap("strategy_detail")]
        [Validation(Required=true)]
        public string StrategyDetail { get; set; }

        // 是否启用，默认false
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // 备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一条测试数据</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

    }

}
