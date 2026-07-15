// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryAheadrealtimePricediffpredictionResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 全天价差方向预测准确率
        [NameInMap("pre_accuracy")]
        [Validation(Required=false)]
        public string PreAccuracy { get; set; }

        // 光伏价差方向预测准确率
        [NameInMap("pv_pre_accuracy")]
        [Validation(Required=false)]
        public string PvPreAccuracy { get; set; }

        // 价差预测列表
        [NameInMap("price_diff_prediction_list")]
        [Validation(Required=false)]
        public List<AheadRealtimePriceDiffPredictionData> PriceDiffPredictionList { get; set; }

    }

}
