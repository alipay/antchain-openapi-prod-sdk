// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企管盾票税交接决策服务指标
    public class RdaasTaxDecsionServiceIndicator : TeaModel {
        // 决策指标id
        /// <summary>
        /// <b>Example:</b>
        /// <para>决策指标id</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 决策服务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>700002</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 属性名
        /// <summary>
        /// <b>Example:</b>
        /// <para>weight</para>
        /// </summary>
        [NameInMap("property_name")]
        [Validation(Required=true)]
        public string PropertyName { get; set; }

        // 属性值或指标值
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("property_value")]
        [Validation(Required=false)]
        public string PropertyValue { get; set; }

        // 决策租户
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEFAULT</para>
        /// </summary>
        [NameInMap("decision_tenant")]
        [Validation(Required=false)]
        public string DecisionTenant { get; set; }

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
