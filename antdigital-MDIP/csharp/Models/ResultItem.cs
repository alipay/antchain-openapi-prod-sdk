// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDIP.Models
{
    // 批量回溯结果内容
    public class ResultItem : TeaModel {
        // dataId
        /// <summary>
        /// <b>Example:</b>
        /// <para>46052e46721417297df682ef88a8ab91</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 分值
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.32223</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 特征值
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;feature1&quot;:0.223,&quot;feature2&quot;:0.33,&quot;feature3&quot;:0.323}</para>
        /// </summary>
        [NameInMap("feature_json")]
        [Validation(Required=false)]
        public string FeatureJson { get; set; }

        // 单调样本数据处理结果
        // 初始化/处理中/成功/失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT/PROCESS/SUCCESS/FAIL</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 各个子分
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;score1&quot;:0.22233,&quot;score2&quot;:0.34234,&quot;score3&quot;:0.34343}</para>
        /// </summary>
        [NameInMap("score_json")]
        [Validation(Required=true)]
        public string ScoreJson { get; set; }

    }

}
