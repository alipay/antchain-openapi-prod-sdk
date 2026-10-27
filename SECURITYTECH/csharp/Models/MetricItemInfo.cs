// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 健康指标数据
    public class MetricItemInfo : TeaModel {
        // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION/...
        /// <summary>
        /// <b>Example:</b>
        /// <para>HEART_RATE</para>
        /// </summary>
        [NameInMap("metric_type")]
        [Validation(Required=true)]
        public string MetricType { get; set; }

        // 测量时间(毫秒级时间戳)
        [NameInMap("measure_time")]
        [Validation(Required=true)]
        public long? MeasureTime { get; set; }

        // 指标值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 指标值单位 -平台固定值
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 扩展字段（JSON），如睡眠阶段时长等
        [NameInMap("ext")]
        [Validation(Required=false)]
        public string Ext { get; set; }

    }

}
