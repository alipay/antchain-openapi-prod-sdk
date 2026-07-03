// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾事件信息同步详情
    public class EventResultSyncDetail : TeaModel {
        // 事件唯一id（单个租户全局唯一）
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 营销计划id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345</para>
        /// </summary>
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

        // 消息id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 事件时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>yyyy-MM-dd HH:mm:ss.SSS </para>
        /// </summary>
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 事件类型：1为富信贴尾
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public long? EventType { get; set; }

        // 1为成功 2为失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("state")]
        [Validation(Required=true)]
        public long? State { get; set; }

        // 用户key类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>MOBILE</para>
        /// </summary>
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>15012340000</para>
        /// </summary>
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 扩展字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;operator&quot;:&quot;CMCC&quot;}</para>
        /// </summary>
        [NameInMap("ext_data")]
        [Validation(Required=true)]
        public string ExtData { get; set; }

    }

}
