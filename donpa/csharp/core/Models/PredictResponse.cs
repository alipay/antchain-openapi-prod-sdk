// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 预测结果响应体
    public class PredictResponse : TeaModel {
        // 资产明细ID
        [NameInMap("asset_detail_id")]
        [Validation(Required=false)]
        public string AssetDetailId { get; set; }

        // 反向指标
        [NameInMap("probability0")]
        [Validation(Required=false)]
        public string Probability0 { get; set; }

        // 正向指标
        [NameInMap("probability1")]
        [Validation(Required=false)]
        public string Probability1 { get; set; }

        // 身份证号码MD5
        [NameInMap("cert_no_md5")]
        [Validation(Required=false)]
        public string CertNoMd5 { get; set; }

        // 身份证号码MD5
        [NameInMap("mobile_md5")]
        [Validation(Required=false)]
        public string MobileMd5 { get; set; }

        // 可选值，A,B,C
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

        // 内部特征预测分数
        [NameInMap("prediction_score")]
        [Validation(Required=false)]
        public string PredictionScore { get; set; }

        // 身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=false)]
        public string CertNo { get; set; }

    }

}
