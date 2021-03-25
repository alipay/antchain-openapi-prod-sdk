// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费周期
    public class CommissionPeriod : TeaModel {
        // 手续费费率
        [NameInMap("deduct_ratio")]
        [Validation(Required=true)]
        public string DeductRatio { get; set; }

        // 手续费子结构
        [NameInMap("sub_commission_rules")]
        [Validation(Required=true)]
        public List<SubCommissionRule> SubCommissionRules { get; set; }

        // 买家的历史统计做阶梯计费，最多50个
        [NameInMap("merchant_layers")]
        [Validation(Required=true)]
        public List<CommissionLayer> MerchantLayers { get; set; }

        // 商品阶梯
        [NameInMap("goods_layers")]
        [Validation(Required=true)]
        public List<CommissionLayer> GoodsLayers { get; set; }

        // 手续费开始时间（无结束时间）
        [NameInMap("start_time_mills")]
        [Validation(Required=true)]
        public long? StartTimeMills { get; set; }

        // 0: txcount（成功的交易）; 1: 累计交易金额; 2:累计手续费; 3：单笔金额, ...
        [NameInMap("layer_type")]
        [Validation(Required=true)]
        public long? LayerType { get; set; }

        // 分层的周期，（0是月，1是日，2是年（这期不用，需要设置一下）, 3是季度）
        [NameInMap("counter_time_type")]
        [Validation(Required=true)]
        public long? CounterTimeType { get; set; }

        // 商品固定费用
        [NameInMap("deduct_token")]
        [Validation(Required=true)]
        public string DeductToken { get; set; }

    }

}
