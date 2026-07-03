// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企管盾票税决策服务
    public class RdaasTaxDecsionService : TeaModel {
        // 决策服务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 产品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>13</para>
        /// </summary>
        [NameInMap("service_name")]
        [Validation(Required=true)]
        public string ServiceName { get; set; }

        // 区域编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SJ_ALL</para>
        /// </summary>
        [NameInMap("service_zone")]
        [Validation(Required=false)]
        public string ServiceZone { get; set; }

        // 渠道
        /// <summary>
        /// <b>Example:</b>
        /// <para>HZSZKJ</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 决策租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEFAULT</para>
        /// </summary>
        [NameInMap("decision_tenant")]
        [Validation(Required=false)]
        public string DecisionTenant { get; set; }

        // 是否启用
        /// <summary>
        /// <b>Example:</b>
        /// <para>enabled</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 创建时间，格式:yyyy-MM-dd HH:mm:ss
        /// <summary>
        /// <b>Example:</b>
        /// <para>创建时间，格式:yyyy-MM-dd HH:mm:ss</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

    }

}
