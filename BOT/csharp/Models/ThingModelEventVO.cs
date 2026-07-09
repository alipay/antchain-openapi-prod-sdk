// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 物模型事件VO
    public class ThingModelEventVO : TeaModel {
        // 名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备状态数据</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 物模型功能Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>7067312861108285440</para>
        /// </summary>
        [NameInMap("feature_id")]
        [Validation(Required=true)]
        public string FeatureId { get; set; }

        // 业务标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>LOCATION</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 事件属性列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[...]</para>
        /// </summary>
        [NameInMap("event_properties")]
        [Validation(Required=true)]
        public string EventProperties { get; set; }

    }

}
