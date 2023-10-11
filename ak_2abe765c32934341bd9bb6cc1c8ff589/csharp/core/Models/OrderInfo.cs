// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    // 主订单信息
    public class OrderInfo : TeaModel {
        // 订单 id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单创建时间，格式为2019-08-31 12:00:00
        [NameInMap("order_create_time")]
        [Validation(Required=true)]
        public string OrderCreateTime { get; set; }

        // 订单支付时间，格式为 2019-08-31 12:00:00
        [NameInMap("order_pay_time")]
        [Validation(Required=true)]
        public string OrderPayTime { get; set; }

        // 订单支付 id
        [NameInMap("order_pay_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderPayId { get; set; }

        // 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
        [NameInMap("order_pay_type")]
        [Validation(Required=true)]
        public long? OrderPayType { get; set; }

        // 订单支付主题
        [NameInMap("order_pay_subject")]
        [Validation(Required=true, MaxLength=500)]
        public string OrderPaySubject { get; set; }

        // 租期，单位：月
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 月租金 精确到分，即 1234 表示 12.34 元
        [NameInMap("rent_price_per_month")]
        [Validation(Required=true)]
        public long? RentPricePerMonth { get; set; }

        // 到期买断价 精确到分，即 1234 表示 12.34 元
        [NameInMap("buy_out_price")]
        [Validation(Required=true)]
        public long? BuyOutPrice { get; set; }

        // 租赁合同,需要客户自己提供合并的 url
        [NameInMap("lease_contract_url")]
        [Validation(Required=true, MaxLength=1000)]
        public string LeaseContractUrl { get; set; }

        // 仓库类型；1: 实体仓 2: 虚拟仓
        [NameInMap("store_type")]
        [Validation(Required=true)]
        public long? StoreType { get; set; }

        // 承租人收货地址
        [NameInMap("user_address")]
        [Validation(Required=true, MaxLength=100)]
        public string UserAddress { get; set; }

        // 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
        [NameInMap("supplier_isv_account")]
        [Validation(Required=true, MaxLength=100)]
        public string SupplierIsvAccount { get; set; }

        // 省份编码
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

        // 城市编码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 地区码
        [NameInMap("district_code")]
        [Validation(Required=true)]
        public string DistrictCode { get; set; }

        // 到期形式；1:到期买断 2:到期归还
        [NameInMap("due_mode")]
        [Validation(Required=true)]
        public long? DueMode { get; set; }

        // 租赁合同 id，可用作幂等
        [NameInMap("contract_id")]
        [Validation(Required=false, MaxLength=100)]
        public string ContractId { get; set; }

        // 租金总额，精确到分，即 1234 表示 12.34 元
        [NameInMap("total_rent_money")]
        [Validation(Required=true)]
        public long? TotalRentMoney { get; set; }

        // 保险单号
        [NameInMap("insurance_number")]
        [Validation(Required=false, MaxLength=100)]
        public string InsuranceNumber { get; set; }

        // 保险地址
        [NameInMap("insurance_url")]
        [Validation(Required=false, MaxLength=1000)]
        public string InsuranceUrl { get; set; }

        // 蚁盾分数
        [NameInMap("yidun_score")]
        [Validation(Required=false)]
        public long? YidunScore { get; set; }

        // 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
        [NameInMap("agreement_no")]
        [Validation(Required=false, MaxLength=100)]
        public string AgreementNo { get; set; }

        // 直付通代扣受理订单号，订单类型为网商直付通模式为必填
        [NameInMap("agreement_order_id")]
        [Validation(Required=false, MaxLength=100)]
        public string AgreementOrderId { get; set; }

        // 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

        // 订单付款内容描述
        [NameInMap("order_pay_body")]
        [Validation(Required=false, MaxLength=500)]
        public string OrderPayBody { get; set; }

        // 额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
