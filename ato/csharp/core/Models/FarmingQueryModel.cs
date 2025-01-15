// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 行业刷单风险识别入参模型
    public class FarmingQueryModel : TeaModel {
        // 支付宝外部交易号
        [NameInMap("out_order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OutOrderNo { get; set; }

        // 支付宝内部交易号
        [NameInMap("order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OrderNo { get; set; }

        // 金额，用户购买或使用服务时产生的具体金额，单位：分
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=128)]
        public string BankCardNo { get; set; }

        // 服务商 pid
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        [NameInMap("store_mcc_desc")]
        [Validation(Required=false, MaxLength=30)]
        public string StoreMccDesc { get; set; }

        // 门店地址；不需要传城市和行政区
        [NameInMap("outlet_address")]
        [Validation(Required=false, MaxLength=128)]
        public string OutletAddress { get; set; }

        // 公司名称
        [NameInMap("company_name")]
        [Validation(Required=false, MaxLength=128)]
        public string CompanyName { get; set; }

        // 店铺名称
        [NameInMap("store_name")]
        [Validation(Required=false, MaxLength=128)]
        public string StoreName { get; set; }

    }

}
