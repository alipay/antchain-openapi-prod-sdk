// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 相似日分析结果
    public class SimilarDayAnalysisData : TeaModel {
        // 综合相似度，单位%
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("com_similar_value")]
        [Validation(Required=true)]
        public string ComSimilarValue { get; set; }

        // 特征相似度，单位%
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.0</para>
        /// </summary>
        [NameInMap("feature_similar_value")]
        [Validation(Required=true)]
        public string FeatureSimilarValue { get; set; }

        // 特征数据列表
        [NameInMap("similar_feature_data")]
        [Validation(Required=true)]
        public List<SimilarFeatureData> SimilarFeatureData { get; set; }

    }

}
