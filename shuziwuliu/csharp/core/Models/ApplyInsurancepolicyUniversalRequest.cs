// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsurancepolicyUniversalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 投保人开户银行，当打印发票选择为“1”时，必填
        [NameInMap("account_bank_name")]
        [Validation(Required=false, MaxLength=100)]
        public string AccountBankName { get; set; }

        // 投保人银行账户，当打印发票选择为“1”时，必填
        [NameInMap("bank_account_information")]
        [Validation(Required=false, MaxLength=50)]
        public string BankAccountInformation { get; set; }

        // 被保人地址
        [NameInMap("bbr_addr")]
        [Validation(Required=false, MaxLength=200)]
        public string BbrAddr { get; set; }

        // 被保人did（被保人所在链上分布式数字身份）
        [NameInMap("bbr_did")]
        [Validation(Required=false, MaxLength=200)]
        public string BbrDid { get; set; }

        // 被保人证件号
        [NameInMap("bbr_id_no")]
        [Validation(Required=true, MaxLength=50)]
        public string BbrIdNo { get; set; }

        // 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他	
        // 
        [NameInMap("bbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string BbrIdType { get; set; }

        // 被保人姓名
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人电话号
        [NameInMap("bbr_tel")]
        [Validation(Required=true, MaxLength=20)]
        public string BbrTel { get; set; }

        // 被保人类型, 1-个人 2-团队
        [NameInMap("bbr_type")]
        [Validation(Required=true, MaxLength=1)]
        public string BbrType { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=false, MaxLength=100)]
        public string CargoName { get; set; }

        // 货物数量
        [NameInMap("cargo_quantity")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoQuantity { get; set; }

        // 货物数量单位
        [NameInMap("cargo_quantity_unit")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoQuantityUnit { get; set; }

        // 货物吨位
        [NameInMap("cargo_tonnage")]
        [Validation(Required=false, MaxLength=20)]
        public string CargoTonnage { get; set; }

        // 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
        [NameInMap("cargo_type")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoType { get; set; }

        // 货物体积
        [NameInMap("cargo_volume")]
        [Validation(Required=false, MaxLength=20)]
        public string CargoVolume { get; set; }

        // 货值
        [NameInMap("cargo_worth")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoWorth { get; set; }

        // 车长
        [NameInMap("car_length")]
        [Validation(Required=false, MaxLength=10)]
        public string CarLength { get; set; }

        // 车型
        [NameInMap("car_model")]
        [Validation(Required=false, MaxLength=20)]
        public string CarModel { get; set; }

        // 目的地，格式为"省-市-区"
        [NameInMap("destination")]
        [Validation(Required=true, MaxLength=100)]
        public string Destination { get; set; }

        // 司机姓名
        [NameInMap("driver_name")]
        [Validation(Required=true, MaxLength=50)]
        public string DriverName { get; set; }

        // 司机联系方式
        [NameInMap("driver_tel")]
        [Validation(Required=true, MaxLength=20)]
        public string DriverTel { get; set; }

        // 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
        [NameInMap("eff_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffDate { get; set; }

        // 保司, 01-华泰, 02-平安, 03-亚太
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalChannelCode { get; set; }

        // 险种, 01-承运人平台责任险
        // 
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=false, MaxLength=50)]
        public string FrameNo { get; set; }

        // 投保额，整数以元为单位
        // 
        [NameInMap("insured_amount")]
        [Validation(Required=true, MaxLength=12)]
        public string InsuredAmount { get; set; }

        // 车牌号
        [NameInMap("license_no")]
        [Validation(Required=true, MaxLength=20)]
        public string LicenseNo { get; set; }

        // 车牌颜色，01-黄牌，02-蓝牌
        [NameInMap("license_plate_color")]
        [Validation(Required=false, MaxLength=2)]
        public string LicensePlateColor { get; set; }

        // 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
        [NameInMap("nsr_identifier")]
        [Validation(Required=false, MaxLength=50)]
        public string NsrIdentifier { get; set; }

        // 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
        [NameInMap("order_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrderTime { get; set; }

        // 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
        [NameInMap("packing")]
        [Validation(Required=false, MaxLength=100)]
        public string Packing { get; set; }

        // 是否打印发票，默认0-不开票  1-专票 2-电子发票
        [NameInMap("print_invoice")]
        [Validation(Required=true, MaxLength=1)]
        public string PrintInvoice { get; set; }

        // 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
        [NameInMap("rate")]
        [Validation(Required=true, MaxLength=8)]
        public string Rate { get; set; }

        // 起运地，格式为"省-市-区"
        [NameInMap("start_place")]
        [Validation(Required=true, MaxLength=100)]
        public string StartPlace { get; set; }

        // 投保人地址，当打印发票选择为“1”时，必填
        [NameInMap("tbr_addr")]
        [Validation(Required=false, MaxLength=200)]
        public string TbrAddr { get; set; }

        // 投保人-企业联系人联系方式
        [NameInMap("tbr_corporate_contract")]
        [Validation(Required=false, MaxLength=20)]
        public string TbrCorporateContract { get; set; }

        // 投保人did（投保人所在链上分布式数字身份）
        [NameInMap("tbr_did")]
        [Validation(Required=false, MaxLength=200)]
        public string TbrDid { get; set; }

        // 投保人邮箱，用以接受电子发票的邮箱地址
        [NameInMap("tbr_email")]
        [Validation(Required=false, MaxLength=50)]
        public string TbrEmail { get; set; }

        // 投保人证件号
        [NameInMap("tbr_id_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TbrIdNo { get; set; }

        // 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
        [NameInMap("tbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string TbrIdType { get; set; }

        // 投保人名称
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人电话号
        [NameInMap("tbr_tel")]
        [Validation(Required=true, MaxLength=20)]
        public string TbrTel { get; set; }

        // 投保人类型, 1-个人 2-团队
        [NameInMap("tbr_type")]
        [Validation(Required=true, MaxLength=1)]
        public string TbrType { get; set; }

        // 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
        [NameInMap("term_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TermDate { get; set; }

        // 专票邮寄地址
        [NameInMap("ticket_addr")]
        [Validation(Required=false, MaxLength=200)]
        public string TicketAddr { get; set; }

        // 订单号, 年月日+唯一字符ID
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 中转地，格式为"省-市-区"
        [NameInMap("transit_point")]
        [Validation(Required=false, MaxLength=100)]
        public string TransitPoint { get; set; }

        // 运单id（平台方运单id）
        [NameInMap("waybill_id")]
        [Validation(Required=true, MaxLength=50)]
        public string WaybillId { get; set; }

    }

}
