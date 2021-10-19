// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 预测请求结构体
    public class PredictRequest : TeaModel {
        // 资产明细ID
        [NameInMap("asset_detail_id")]
        [Validation(Required=false)]
        public string AssetDetailId { get; set; }

        // 身份证号码MD5
        [NameInMap("cert_no_md5")]
        [Validation(Required=true)]
        public string CertNoMd5 { get; set; }

        // 已还总额,默认0
        [NameInMap("payback_amount")]
        [Validation(Required=false)]
        public long? PaybackAmount { get; set; }

        // 已还期数，默认0
        [NameInMap("payback_num")]
        [Validation(Required=false)]
        public long? PaybackNum { get; set; }

        // 逾期月数
        [NameInMap("overdue_month")]
        [Validation(Required=false)]
        public long? OverdueMonth { get; set; }

        // 债务人信用分数，由系统计算得出，无须传入。
        [NameInMap("prediction_score")]
        [Validation(Required=false)]
        public string PredictionScore { get; set; }

        // 手机号码MD5
        [NameInMap("mobile_md5")]
        [Validation(Required=false)]
        public string MobileMd5 { get; set; }

    }

}
