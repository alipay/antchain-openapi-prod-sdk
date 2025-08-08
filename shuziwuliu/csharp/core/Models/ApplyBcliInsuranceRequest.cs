// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyBcliInsuranceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 投保流水号，格式：日期_身份标识_全局唯一序号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 保司编码,CPIC_SHENZHEN-太保深分
        [NameInMap("external_channel_code")]
        [Validation(Required=true)]
        public string ExternalChannelCode { get; set; }

        // 保险产品编码,Pbins-动力电池延保保险产品编码
        [NameInMap("external_product_code")]
        [Validation(Required=true)]
        public string ExternalProductCode { get; set; }

        // 投保人名称
        [NameInMap("tbr_name")]
        [Validation(Required=true)]
        public string TbrName { get; set; }

        // 投保人证件类型，01-居民身份证、03-营业执照
        [NameInMap("tbr_id_type")]
        [Validation(Required=true)]
        public string TbrIdType { get; set; }

        // 投保人证件号码
        [NameInMap("tbr_id_no")]
        [Validation(Required=true)]
        public string TbrIdNo { get; set; }

        // 投保人联系地址
        [NameInMap("tbr_addr")]
        [Validation(Required=true)]
        public string TbrAddr { get; set; }

        // 被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=true)]
        public string BbrName { get; set; }

        // 01-居民身份证、03-营业执照
        [NameInMap("bbr_id_type")]
        [Validation(Required=true)]
        public string BbrIdType { get; set; }

        // 被保人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=true)]
        public string BbrIdNo { get; set; }

        // 被保人联系地址
        [NameInMap("bbr_addr")]
        [Validation(Required=true)]
        public string BbrAddr { get; set; }

        // 投保方案ID，battery202501
        [NameInMap("scheme_name")]
        [Validation(Required=true)]
        public string SchemeName { get; set; }

        // 保额，金额人民币元，整数
        [NameInMap("insured_amount")]
        [Validation(Required=true)]
        public string InsuredAmount { get; set; }

        // 客户所期待的保险起期，实际保司出单以保司出具的信息为准，格式：YYYY-MM-DD HH:MM:SS
        [NameInMap("insure_start")]
        [Validation(Required=false)]
        public string InsureStart { get; set; }

        // 客户所期待的保险止期，实际保司出单以保司出具的信息为准,格式：YYYY-MM-DD HH:MM:SS
        [NameInMap("insure_end")]
        [Validation(Required=false)]
        public string InsureEnd { get; set; }

        // 邮箱地址，用于保司回传科技公司电子保单
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 保险期限内电池容量允许衰减程度
        [NameInMap("bcda_pt")]
        [Validation(Required=true)]
        public string BcdaPt { get; set; }

        // 车牌号码
        [NameInMap("vehicle_plate")]
        [Validation(Required=true)]
        public string VehiclePlate { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=true)]
        public string Vin { get; set; }

        // 车辆初登日期  格式：YYYY-MM-DD
        [NameInMap("vehicle_regist_date")]
        [Validation(Required=true)]
        public string VehicleRegistDate { get; set; }

        // 行驶证发证日期,格式：YYYY-MM-DD
        [NameInMap("license_date")]
        [Validation(Required=true)]
        public string LicenseDate { get; set; }

        // 车辆使用性质,01-企业非营业用车、02出租车、03租赁车、04家庭自用车、05党政机关用车、06事业团体用车、07城市公交、08公路客运、09营运货车、10营业特种车
        [NameInMap("vehicle_usage")]
        [Validation(Required=true)]
        public string VehicleUsage { get; set; }

        // 投保车辆实际价值（元）,金额人民币元，精确到小数点后2位
        [NameInMap("vehicle_price")]
        [Validation(Required=true)]
        public string VehiclePrice { get; set; }

        // 投保车龄（月）
        [NameInMap("vehicle_age")]
        [Validation(Required=true)]
        public string VehicleAge { get; set; }

        // 行驶证图片信息url
        [NameInMap("license_picture")]
        [Validation(Required=true)]
        public string LicensePicture { get; set; }

        // 动力电池编码（ID),动力电池包的唯一标识
        [NameInMap("battery_code")]
        [Validation(Required=true)]
        public string BatteryCode { get; set; }

        // 动力电池铭牌照片url
        [NameInMap("battery_nameplate_picture")]
        [Validation(Required=true)]
        public string BatteryNameplatePicture { get; set; }

        // 动力电池包外观照片地址
        [NameInMap("battery_pack_photo_file")]
        [Validation(Required=true)]
        public string BatteryPackPhotoFile { get; set; }

    }

}
