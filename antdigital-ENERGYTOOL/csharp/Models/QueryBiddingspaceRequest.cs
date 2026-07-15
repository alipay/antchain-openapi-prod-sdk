// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryBiddingspaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 运行日期，yyyy-mm-dd
        [NameInMap("query_date")]
        [Validation(Required=true)]
        public string QueryDate { get; set; }

        // 业务类型枚举，枚举范围如下
        // BIDDING_SPACE: 竞价空间
        // 
        [NameInMap("busi_type")]
        [Validation(Required=true)]
        public string BusiType { get; set; }

        // 业务偏差类型枚举，枚举范围：
        // DAY_AHEAD_ACTUAL: 日前-实际
        // DAY_AHEAD_FORECAST: 日前-预测
        // PRE_CLEARING_ACTUAL: 预出清-实际
        // PRE_CLEARING_FORECAST: 预出清-预测
        // ACTUAL_FORECAST: 实际-预测
        // PRE_CLEARING: 预出清
        // DAY_AHEAD: 日前
        // REAL_TIME: 实时
        // ACTUAL: 实际
        [NameInMap("deviation_type")]
        [Validation(Required=true)]
        public string DeviationType { get; set; }

        // 省地区编码，目前仅支持江苏省
        [NameInMap("province")]
        [Validation(Required=true)]
        public string Province { get; set; }

    }

}
