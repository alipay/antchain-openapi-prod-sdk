// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseOrderdetailinfoResponse : TeaModel {
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

        // 融资租赁订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单创建时间 
        [NameInMap("order_create_time")]
        [Validation(Required=false)]
        public string OrderCreateTime { get; set; }

        // 订单支付时间 格式为
        [NameInMap("order_pay_time")]
        [Validation(Required=false)]
        public string OrderPayTime { get; set; }

        // 支付订单id
        [NameInMap("order_pay_id")]
        [Validation(Required=false)]
        public string OrderPayId { get; set; }

        // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他，5网商直付通代扣
        [NameInMap("order_pay_type")]
        [Validation(Required=false)]
        public long? OrderPayType { get; set; }

        // 免押金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
        [NameInMap("deposit_free")]
        [Validation(Required=false)]
        public long? DepositFree { get; set; }

        // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
        [NameInMap("acutal_pre_auth_free")]
        [Validation(Required=false)]
        public long? AcutalPreAuthFree { get; set; }

        // 租期单位月
        [NameInMap("rent_term")]
        [Validation(Required=false)]
        public long? RentTerm { get; set; }

        // 月租金 精确到毫厘，即123400表示12.34元
        [NameInMap("rent_price_per_month")]
        [Validation(Required=false)]
        public long? RentPricePerMonth { get; set; }

        // 到期买断价
        [NameInMap("buy_out_price")]
        [Validation(Required=false)]
        public long? BuyOutPrice { get; set; }

        // 承租人收货地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 省份编码
        [NameInMap("province_code")]
        [Validation(Required=false)]
        public string ProvinceCode { get; set; }

        // 城市编码
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 地区编码
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 租赁合同链接
        [NameInMap("rent_contract_url")]
        [Validation(Required=false)]
        public string RentContractUrl { get; set; }

        // 保险单号
        [NameInMap("insurance_number")]
        [Validation(Required=false)]
        public string InsuranceNumber { get; set; }

        // 保险链接
        [NameInMap("insurance_url")]
        [Validation(Required=false)]
        public string InsuranceUrl { get; set; }

        // 采购合同协议
        [NameInMap("purchase_contract_url")]
        [Validation(Required=false)]
        public string PurchaseContractUrl { get; set; }

        // 蚁盾分数
        [NameInMap("yidun_score")]
        [Validation(Required=false)]
        public long? YidunScore { get; set; }

        // 物流订单id
        [NameInMap("out_store_deliver_number")]
        [Validation(Required=false)]
        public string OutStoreDeliverNumber { get; set; }

        // 物流发货时间
        [NameInMap("out_store_time")]
        [Validation(Required=false)]
        public string OutStoreTime { get; set; }

    }

}
