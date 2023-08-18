// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateBclOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单外部id 商家关联自己的订单,长度不超过64位
        [NameInMap("order_outer_id")]
        [Validation(Required=true, MaxLength=64)]
        public string OrderOuterId { get; set; }

        // 商家租赁订单创建时间
        // 长度不超过32位 
        // 示例：2023-06-27T10:50:23+08:00
        [NameInMap("order_create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderCreateTime { get; set; }

        // 承租人用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public BclUserInfo UserInfo { get; set; }

        // 到期形式
        // DUE_BUYOUT 到期买断 
        // DUE_RETURN 到期归还
        [NameInMap("due_mode")]
        [Validation(Required=true, MaxLength=16)]
        public string DueMode { get; set; }

        // 租金总额，单位：分
        // 最小值需大于0
        [NameInMap("total_rent_money")]
        [Validation(Required=true)]
        public long? TotalRentMoney { get; set; }

        // 租期，单位：月
        // 最小值需大于0
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 订单租期单位，
        // 1.月：MONTH
        // 例如：rent_term入参12，rent_unit入参MONTH代表租期12个月
        [NameInMap("rent_unit")]
        [Validation(Required=true, MaxLength=16)]
        public string RentUnit { get; set; }

        // 到期买断价，单位：分
        // 到期金额，最小值需大于0，若为买断形式传买断金额，否则传到期归还金额
        [NameInMap("buy_out_price")]
        [Validation(Required=false)]
        public long? BuyOutPrice { get; set; }

        // 芝麻信用订单免押金额，单位：分
        // 最小值需大于0
        [NameInMap("deposit_free")]
        [Validation(Required=false)]
        public long? DepositFree { get; set; }

        // 芝麻信用实际预授权金额，单位：分
        // 最小值需大于0
        [NameInMap("acutal_pre_auth_free")]
        [Validation(Required=false)]
        public long? AcutalPreAuthFree { get; set; }

        // 代扣协议号
        // 网商代扣和预授权代扣必填，长度不超过64位
        [NameInMap("mybank_agreement_no")]
        [Validation(Required=false, MaxLength=64)]
        public string MybankAgreementNo { get; set; }

        // 网商代扣受理订单号
        // 网商代扣必填，长度不超过64位
        [NameInMap("mybank_agreement_order_id")]
        [Validation(Required=false, MaxLength=64)]
        public string MybankAgreementOrderId { get; set; }

        // 租金支付方式
        // 1.网商代扣：MY_BANK_PROXY_WITHHOLDING 
        // 2.预授权代扣：PRE_AUTHORIZATION_WITHHOLDING
        // 3.租赁代扣：PROXY_WITHHOLDING
        [NameInMap("order_withhold_type")]
        [Validation(Required=true, MaxLength=32)]
        public string OrderWithholdType { get; set; }

        // 首付款金额 单位分
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

        // 承诺详情
        // 按期数从小到大且连续排序
        [NameInMap("promise_details")]
        [Validation(Required=false)]
        public List<BclCreatePromiseDetailInfo> PromiseDetails { get; set; }

        // 物流方式
        // 1.邮寄：POST 
        // 2.线下自取：OFFLINE
        [NameInMap("logistic_type")]
        [Validation(Required=true, MaxLength=16)]
        public string LogisticType { get; set; }

        // 商品列表
        [NameInMap("product_infos")]
        [Validation(Required=true)]
        public List<BclOrderProductInfo> ProductInfos { get; set; }

        // 需要使用的增值服务
        // 1.实名：REAL_PERSON
        // 2.风控：RISK
        // 3.租赁合同：CONTRACT
        // 实人和合同服务使用最长超时时间为72小时
        [NameInMap("service_types")]
        [Validation(Required=false)]
        public List<string> ServiceTypes { get; set; }

        // 用户下单时的ip地址
        // 如果可选服务选择了风控，必须填写，长度不超过32位
        [NameInMap("user_ip")]
        [Validation(Required=false, MaxLength=32)]
        public string UserIp { get; set; }

        // 承租人实人认证完成后回跳地址
        // 比如商户小程序下单地址，选择实人认证服务时必填
        [NameInMap("real_person_return_url")]
        [Validation(Required=false, MaxLength=512)]
        public string RealPersonReturnUrl { get; set; }

        // 签署流程信息
        // 当service_types为包含CONTRACT时或order_withhold_type为PROXY_WITHHOLDING时必填
        [NameInMap("contract_flow_info")]
        [Validation(Required=false)]
        public BclContractFlowInfo ContractFlowInfo { get; set; }

        // 是否不需要融资：
        // 1.明确这笔订单不需要融资：true
        // 2.该笔订单后续可能融资也可能不融资：false
        // 注意：标明不需要融资可以提升代扣回款速度
        [NameInMap("none_financing")]
        [Validation(Required=false)]
        public bool? NoneFinancing { get; set; }

    }

}
