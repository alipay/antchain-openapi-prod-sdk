// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 行驶证信息
    public class DrivingPermitInfo : TeaModel {
        // 品牌名称
        [NameInMap("brandname")]
        [Validation(Required=false)]
        public string Brandname { get; set; }

        // 车身颜色
        [NameInMap("bodycolor")]
        [Validation(Required=false)]
        public string Bodycolor { get; set; }

        // 使用性质
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 车型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 车辆类型
        [NameInMap("vehicletype")]
        [Validation(Required=false)]
        public string Vehicletype { get; set; }

        // 发动机号
        [NameInMap("enginenumber")]
        [Validation(Required=false)]
        public string Enginenumber { get; set; }

        // 发动机型号
        [NameInMap("enginemodel")]
        [Validation(Required=false)]
        public string Enginemodel { get; set; }

        // 初次登记日期
        [NameInMap("firsissuedate")]
        [Validation(Required=false)]
        public string Firsissuedate { get; set; }

        // 检验有效期止
        [NameInMap("validitydayend")]
        [Validation(Required=false)]
        public string Validitydayend { get; set; }

        // 车辆状态
        [NameInMap("vehiclestatus")]
        [Validation(Required=false)]
        public string Vehiclestatus { get; set; }

        // 核定载客数
        [NameInMap("passengers")]
        [Validation(Required=false)]
        public string Passengers { get; set; }

        // 强制报废期止
        [NameInMap("retirementdate")]
        [Validation(Required=false)]
        public string Retirementdate { get; set; }

        // 燃料种类
        [NameInMap("fueltype")]
        [Validation(Required=false)]
        public string Fueltype { get; set; }

        // 排量
        [NameInMap("cc")]
        [Validation(Required=false)]
        public string Cc { get; set; }

        // 出厂日期
        [NameInMap("ppsdate")]
        [Validation(Required=false)]
        public string Ppsdate { get; set; }

        // 最大功率
        [NameInMap("maxjourney")]
        [Validation(Required=false)]
        public string Maxjourney { get; set; }

        // 轴数
        [NameInMap("shaft")]
        [Validation(Required=false)]
        public string Shaft { get; set; }

        // 轴距
        [NameInMap("wheelbase")]
        [Validation(Required=false)]
        public string Wheelbase { get; set; }

        // 前轮距
        [NameInMap("fronttread")]
        [Validation(Required=false)]
        public string Fronttread { get; set; }

        // 后轮距
        [NameInMap("reartread")]
        [Validation(Required=false)]
        public string Reartread { get; set; }

        // 总重量
        [NameInMap("crossweight")]
        [Validation(Required=false)]
        public string Crossweight { get; set; }

        // 整备质量
        [NameInMap("curbweight")]
        [Validation(Required=false)]
        public string Curbweight { get; set; }

        // 核定载质量
        [NameInMap("loadweight")]
        [Validation(Required=false)]
        public string Loadweight { get; set; }

        // 车架号
        [NameInMap("vin")]
        [Validation(Required=false)]
        public string Vin { get; set; }

        // 车牌号
        [NameInMap("plate")]
        [Validation(Required=false)]
        public string Plate { get; set; }

        // 车牌种类
        [NameInMap("platetype")]
        [Validation(Required=false)]
        public string Platetype { get; set; }

        // 年检日期
        [NameInMap("jianchetime")]
        [Validation(Required=false)]
        public string Jianchetime { get; set; }

    }

}
