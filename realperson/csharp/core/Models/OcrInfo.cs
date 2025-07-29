// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 卡证OCR识别结果
    public class OcrInfo : TeaModel {
        // 当识别到身份证是人像面时返回FACE，国徽面时返回BACK
        [NameInMap("side")]
        [Validation(Required=false)]
        public string Side { get; set; }

        // 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
        // *当服务降级时，返回null
        [NameInMap("photo")]
        [Validation(Required=false)]
        public string Photo { get; set; }

        // {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
        // *当服务降级时，返回null
        [NameInMap("photo_location")]
        [Validation(Required=false)]
        public OcrLocation PhotoLocation { get; set; }

        // 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
        // *当服务降级时，返回null
        [NameInMap("card_image")]
        [Validation(Required=false)]
        public string CardImage { get; set; }

        // 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
        // *当服务降级时，返回null
        [NameInMap("card_location")]
        [Validation(Required=false)]
        public OcrLocation CardLocation { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 性别
        [NameInMap("sex")]
        [Validation(Required=false)]
        public string Sex { get; set; }

        // 民族
        [NameInMap("nationality")]
        [Validation(Required=false)]
        public string Nationality { get; set; }

        // 出生日期（yyyyMMdd格式）
        [NameInMap("birth")]
        [Validation(Required=false)]
        public string Birth { get; set; }

        // 住址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 身份证号
        [NameInMap("num")]
        [Validation(Required=false)]
        public string Num { get; set; }

        // 发证日期（yyyyMMdd格式）
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 到期日（yyyyMMdd格式）。
        // 如果是长期身份证，该字段内容为“长期”（不含引号）。
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 签发机关
        [NameInMap("issue")]
        [Validation(Required=false)]
        public string Issue { get; set; }

        // 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
        [NameInMap("bank_card_type")]
        [Validation(Required=false)]
        public string BankCardType { get; set; }

        // 银行名，不能识别时为空
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行卡号
        [NameInMap("card_number")]
        [Validation(Required=false)]
        public string CardNumber { get; set; }

        // 有效期至
        [NameInMap("valid_to_date")]
        [Validation(Required=false)]
        public string ValidToDate { get; set; }

        // 证件类别
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
        [NameInMap("date_of_expiry")]
        [Validation(Required=false)]
        public string DateOfExpiry { get; set; }

        // 换证次数
        [NameInMap("change_num")]
        [Validation(Required=false)]
        public string ChangeNum { get; set; }

        // 初次领证日期
        [NameInMap("first_issue")]
        [Validation(Required=false)]
        public string FirstIssue { get; set; }

        // 准驾车型
        [NameInMap("driver_class")]
        [Validation(Required=false)]
        public string DriverClass { get; set; }

        // 档案编号
        [NameInMap("doc_num")]
        [Validation(Required=false)]
        public string DocNum { get; set; }

        // 电子驾驶证生成时间
        [NameInMap("issue_time")]
        [Validation(Required=false)]
        public string IssueTime { get; set; }

        // 当前时间
        [NameInMap("current_time")]
        [Validation(Required=false)]
        public string CurrentTime { get; set; }

        // 条形码编号
        [NameInMap("bar_code")]
        [Validation(Required=false)]
        public string BarCode { get; set; }

        // 累计记分
        [NameInMap("points")]
        [Validation(Required=false)]
        public string Points { get; set; }

        // 记录
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 车辆识别代号
        [NameInMap("vehicle")]
        [Validation(Required=false)]
        public string Vehicle { get; set; }

        // 品牌型号
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 车辆类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 使用性质
        [NameInMap("useage")]
        [Validation(Required=false)]
        public string Useage { get; set; }

        // 发动机号码
        [NameInMap("eng_num")]
        [Validation(Required=false)]
        public string EngNum { get; set; }

        // 车牌号码
        [NameInMap("plate")]
        [Validation(Required=false)]
        public string Plate { get; set; }

        // 检验记录
        [NameInMap("inspec_record")]
        [Validation(Required=false)]
        public string InspecRecord { get; set; }

        // 核定载质量
        [NameInMap("load")]
        [Validation(Required=false)]
        public string Load { get; set; }

        // 整备质量
        [NameInMap("curb_mass")]
        [Validation(Required=false)]
        public string CurbMass { get; set; }

        // 外廓尺寸
        [NameInMap("overall_dimension")]
        [Validation(Required=false)]
        public string OverallDimension { get; set; }

        // 核定载人数
        [NameInMap("seating")]
        [Validation(Required=false)]
        public string Seating { get; set; }

        // 总质量
        [NameInMap("gross_mass")]
        [Validation(Required=false)]
        public string GrossMass { get; set; }

        // 燃油类型
        [NameInMap("fuel")]
        [Validation(Required=false)]
        public string Fuel { get; set; }

        // 准牵引总质量
        [NameInMap("traction_mass")]
        [Validation(Required=false)]
        public string TractionMass { get; set; }

        // 证芯编号
        [NameInMap("chip_num")]
        [Validation(Required=false)]
        public string ChipNum { get; set; }

    }

}
