// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    // 指标数据
    public class IndexData : TeaModel {
        // 月份
        // 
        [NameInMap("month")]
        [Validation(Required=true)]
        public string Month { get; set; }

        // 高低线
        [NameInMap("city_tier")]
        [Validation(Required=true)]
        public string CityTier { get; set; }

        // 省份编码
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

        // 总交易笔数指数
        [NameInMap("total_cnt")]
        [Validation(Required=true)]
        public string TotalCnt { get; set; }

        // 总交易金额指数
        [NameInMap("total_amt")]
        [Validation(Required=true)]
        public string TotalAmt { get; set; }

        // 总店铺数指数
        [NameInMap("total_shop")]
        [Validation(Required=true)]
        public string TotalShop { get; set; }

        // 去重用户数指数
        [NameInMap("total_csm")]
        [Validation(Required=true)]
        public string TotalCsm { get; set; }

        // 其中老店店铺总交易笔数指数
        [NameInMap("existing_cnt")]
        [Validation(Required=true)]
        public string ExistingCnt { get; set; }

        // 其中老店店铺总交易金额
        [NameInMap("existing_amt")]
        [Validation(Required=true)]
        public string ExistingAmt { get; set; }

        // 其中老店店铺数量指数
        [NameInMap("existing_shop")]
        [Validation(Required=true)]
        public string ExistingShop { get; set; }

        // 当月新增店铺数指数
        [NameInMap("new_shop")]
        [Validation(Required=true)]
        public string NewShop { get; set; }

        // 分金额段指数
        [NameInMap("amt_range")]
        [Validation(Required=true)]
        public string AmtRange { get; set; }

        // 店铺标签指数
        [NameInMap("shop_tag")]
        [Validation(Required=true)]
        public string ShopTag { get; set; }

    }

}
