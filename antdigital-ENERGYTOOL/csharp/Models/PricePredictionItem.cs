// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 现货电价预测
    public class PricePredictionItem : TeaModel {
        // 时间点位
        /// <summary>
        /// <b>Example:</b>
        /// <para>01:00</para>
        /// </summary>
        [NameInMap("period")]
        [Validation(Required=true)]
        public string Period { get; set; }

        // 预测电价，单位：元/mwh
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.7</para>
        /// </summary>
        [NameInMap("predicted_price")]
        [Validation(Required=true)]
        public string PredictedPrice { get; set; }

        // 实际电价，单位：元/mwh
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("actual_price")]
        [Validation(Required=false)]
        public string ActualPrice { get; set; }

    }

}
