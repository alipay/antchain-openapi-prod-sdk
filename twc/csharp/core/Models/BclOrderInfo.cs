// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 租赁订单信息
    public class BclOrderInfo : TeaModel {
        // 订单外部id,商户自己定义的订单id
        [NameInMap("order_outer_id")]
        [Validation(Required=true)]
        public string OrderOuterId { get; set; }

        // 订单创建时间
        [NameInMap("order_create_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderCreateTime { get; set; }

        // DUE_BUYOUT 到期买断 
        // DUE_RETURN 到期归还
        [NameInMap("due_mode")]
        [Validation(Required=true)]
        public string DueMode { get; set; }

        // 订单总金额 单位分
        [NameInMap("total_money")]
        [Validation(Required=true)]
        public long? TotalMoney { get; set; }

        // 到期买断价  单位分，
        // 到期金额，若为买断形式传买断金额，否则传到期归还金额
        [NameInMap("buy_out_price")]
        [Validation(Required=false)]
        public long? BuyOutPrice { get; set; }

        // 芝麻信用订单免押金额 单位分
        [NameInMap("deposit_free")]
        [Validation(Required=false)]
        public long? DepositFree { get; set; }

        // 芝麻信用 实际预授权金额 单位分
        [NameInMap("acutal_pre_auth_free")]
        [Validation(Required=false)]
        public long? AcutalPreAuthFree { get; set; }

        // 网商直付通模式的代扣协议号
        [NameInMap("mybank_agreement_no")]
        [Validation(Required=false)]
        public string MybankAgreementNo { get; set; }

        // 直付通代扣受理订单号
        [NameInMap("mybank_agreement_order_id")]
        [Validation(Required=false)]
        public string MybankAgreementOrderId { get; set; }

        // -网商代扣：MY_BANK_PROXY_WITHHOLDING
        // -合同代扣：CONTRACT_PROXY_WITHHOLDING
        [NameInMap("order_withhold_type")]
        [Validation(Required=true)]
        public string OrderWithholdType { get; set; }

        // 首付款金额 单位分
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

        // 商品列表
        [NameInMap("product_infos")]
        [Validation(Required=true)]
        public List<BclOrderProductInfo> ProductInfos { get; set; }

        // 物流方式： POST 邮寄 OFFLINE 线下自取
        [NameInMap("logistic_type")]
        [Validation(Required=true)]
        public string LogisticType { get; set; }

        // 订单状态
        // 已创建 CREATED
        // 待发起 PRE_SUBMIT
        // 已发起 SUBMIT
        // 履约中 PERFORMING
        // 履约完成 PERFORMED
        // 订单完结 ORDER_FINISH
        // 风控失败 RISK_FAIL
        // 核身失败 IDENTITY_NOT_MATCH
        // 网商订单核验失败 MY_BANK_VERIFY_FAIL
        // 实人中 PERSON_FACE_VERIFY
        // 实人认证失败 PERSON_FACE_VERIFY_FAIL
        // 订单异常 ORDER_ERROR
        // 
        // 
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 订单状态失败的描述
        [NameInMap("status_remark")]
        [Validation(Required=false)]
        public string StatusRemark { get; set; }

        // 承租方用户信息
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public BclUserInfo UserInfo { get; set; }

    }

}
