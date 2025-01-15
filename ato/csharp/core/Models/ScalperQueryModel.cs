// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 行业黄牛风险识别入参模型
    public class ScalperQueryModel : TeaModel {
        // 注册手机号，填写咨询对象所关联的注册手机号
        [NameInMap("registration_phone")]
        [Validation(Required=false, MaxLength=20)]
        public string RegistrationPhone { get; set; }

        // 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
        [NameInMap("certificate_date")]
        [Validation(Required=false, MaxLength=20)]
        public string CertificateDate { get; set; }

        // 登录手机号，填写风险咨询对象关联账号的登录手机号
        [NameInMap("login_phone")]
        [Validation(Required=false, MaxLength=20)]
        public string LoginPhone { get; set; }

        // 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
        [NameInMap("registration_cert")]
        [Validation(Required=false, MaxLength=30)]
        public string RegistrationCert { get; set; }

        // 登录账号身份证，登录账号的身份证号码
        [NameInMap("login_cert")]
        [Validation(Required=false, MaxLength=30)]
        public string LoginCert { get; set; }

        // 注册时间，填写风险咨询对象所关联的账号的注册时间
        [NameInMap("registration_date")]
        [Validation(Required=false, MaxLength=20)]
        public string RegistrationDate { get; set; }

        // 证件类型；枚举值：1 - 身份证；2 - 护照
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public long? CertType { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=50)]
        public string BankCardNo { get; set; }

        // 用户邮箱
        [NameInMap("email_address")]
        [Validation(Required=false, MaxLength=35)]
        public string EmailAddress { get; set; }

        // 手机序列号
        [NameInMap("imei")]
        [Validation(Required=false, MaxLength=100)]
        public string Imei { get; set; }

        // 国际移动用户识别码
        [NameInMap("imsi")]
        [Validation(Required=false, MaxLength=100)]
        public string Imsi { get; set; }

        // mac 地址或设备唯一标识
        [NameInMap("mac_address")]
        [Validation(Required=false, MaxLength=30)]
        public string MacAddress { get; set; }

        // 设备号，设备唯一号码
        [NameInMap("apdid")]
        [Validation(Required=false, MaxLength=128)]
        public string Apdid { get; set; }

        // 支付宝外部交易号
        [NameInMap("out_order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OutOrderNo { get; set; }

        // 所咨询的唯一支付宝交易号
        [NameInMap("order_no")]
        [Validation(Required=false, MaxLength=128)]
        public string OrderNo { get; set; }

        // 用户购买或使用服务时产生的具体金额总数，单位：分
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=false, MaxLength=50)]
        public string UserName { get; set; }

        // 收货手机号，用于区分 mobile_no 所填的手机号
        [NameInMap("mailing_phone")]
        [Validation(Required=false, MaxLength=20)]
        public string MailingPhone { get; set; }

        // 收货地址
        [NameInMap("mailing_address")]
        [Validation(Required=false, MaxLength=128)]
        public string MailingAddress { get; set; }

        // 是否为员工账号，枚举值：1 - 是
        [NameInMap("is_employee")]
        [Validation(Required=false, MaxLength=10)]
        public string IsEmployee { get; set; }

        // 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
        [NameInMap("channel")]
        [Validation(Required=false, MaxLength=10)]
        public string Channel { get; set; }

        // 服务商 pid
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        [NameInMap("store_mcc_desc")]
        [Validation(Required=false, MaxLength=20)]
        public string StoreMccDesc { get; set; }

        // 消费者 id，外部会员账号
        [NameInMap("customer_id")]
        [Validation(Required=false, MaxLength=128)]
        public string CustomerId { get; set; }

        // 订单所有商品信息列表
        [NameInMap("order_items_info_list")]
        [Validation(Required=false)]
        public List<ScalperQueryOrderItem> OrderItemsInfoList { get; set; }

    }

}
