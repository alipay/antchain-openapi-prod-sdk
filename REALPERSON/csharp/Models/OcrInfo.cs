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
        /// <summary>
        /// <b>Example:</b>
        /// <para>FACE</para>
        /// </summary>
        [NameInMap("side")]
        [Validation(Required=false)]
        public string Side { get; set; }

        // 当请求参数 return_photo = true时返回，头像切图的 base64 编码（无编码头，需自行处理）
        // *当服务降级时，返回null
        /// <summary>
        /// <b>Example:</b>
        /// <para>BASE64String</para>
        /// </summary>
        [NameInMap("photo")]
        [Validation(Required=false)]
        public string Photo { get; set; }

        // {}	当请求参数 return_photo = true时返回，头像的位置信息（坐标0点为左上角）
        // *当服务降级时，返回null
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("photo_location")]
        [Validation(Required=false)]
        public OcrLocation PhotoLocation { get; set; }

        // 当请求参数 return_card = true时返回，身份证裁剪切图的 base64 编码（无编码头，需自行处理）
        // *当服务降级时，返回null
        /// <summary>
        /// <b>Example:</b>
        /// <para>BASE64String</para>
        /// </summary>
        [NameInMap("card_image")]
        [Validation(Required=false)]
        public string CardImage { get; set; }

        // 当请求参数 return_card = true时返回，身份证裁剪切图的位置信息（坐标0点为左上角）
        // *当服务降级时，返回null
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("card_location")]
        [Validation(Required=false)]
        public OcrLocation CardLocation { get; set; }

        // 姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 性别
        /// <summary>
        /// <b>Example:</b>
        /// <para>女</para>
        /// </summary>
        [NameInMap("sex")]
        [Validation(Required=false)]
        public string Sex { get; set; }

        // 民族
        /// <summary>
        /// <b>Example:</b>
        /// <para>汉</para>
        /// </summary>
        [NameInMap("nationality")]
        [Validation(Required=false)]
        public string Nationality { get; set; }

        // 出生日期（yyyyMMdd格式）
        /// <summary>
        /// <b>Example:</b>
        /// <para>19620710</para>
        /// </summary>
        [NameInMap("birth")]
        [Validation(Required=false)]
        public string Birth { get; set; }

        // 住址
        /// <summary>
        /// <b>Example:</b>
        /// <para>江苏省睢宁县xxxx</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>320324196207101234</para>
        /// </summary>
        [NameInMap("num")]
        [Validation(Required=false)]
        public string Num { get; set; }

        // 发证日期（yyyyMMdd格式）
        /// <summary>
        /// <b>Example:</b>
        /// <para>20120912</para>
        /// </summary>
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 到期日（yyyyMMdd格式）。
        // 如果是长期身份证，该字段内容为“长期”（不含引号）。
        /// <summary>
        /// <b>Example:</b>
        /// <para>20220912</para>
        /// </summary>
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 签发机关
        /// <summary>
        /// <b>Example:</b>
        /// <para>宜川县公安局</para>
        /// </summary>
        [NameInMap("issue")]
        [Validation(Required=false)]
        public string Issue { get; set; }

        // 银行卡类型（CC（贷记卡），SCC（准贷记卡），DCC（存贷合一卡），DC（储蓄卡），PC（预付卡））
        /// <summary>
        /// <b>Example:</b>
        /// <para>CC</para>
        /// </summary>
        [NameInMap("bank_card_type")]
        [Validation(Required=false)]
        public string BankCardType { get; set; }

        // 银行名，不能识别时为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国建设银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=false)]
        public string BankName { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6227001223456784765</para>
        /// </summary>
        [NameInMap("card_number")]
        [Validation(Required=false)]
        public string CardNumber { get; set; }

        // 有效期至
        /// <summary>
        /// <b>Example:</b>
        /// <para>10/30</para>
        /// </summary>
        [NameInMap("valid_to_date")]
        [Validation(Required=false)]
        public string ValidToDate { get; set; }

        // 证件类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>港澳居民来往内地通行证</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 有效期限(yyyy.MM.dd-yyyy.MM.dd格式)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2017.07.13-2027.07.12</para>
        /// </summary>
        [NameInMap("date_of_expiry")]
        [Validation(Required=false)]
        public string DateOfExpiry { get; set; }

        // 换证次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("change_num")]
        [Validation(Required=false)]
        public string ChangeNum { get; set; }

        // 初次领证日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>20200202</para>
        /// </summary>
        [NameInMap("first_issue")]
        [Validation(Required=false)]
        public string FirstIssue { get; set; }

        // 准驾车型
        /// <summary>
        /// <b>Example:</b>
        /// <para>C1</para>
        /// </summary>
        [NameInMap("driver_class")]
        [Validation(Required=false)]
        public string DriverClass { get; set; }

        // 档案编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>110012345678</para>
        /// </summary>
        [NameInMap("doc_num")]
        [Validation(Required=false)]
        public string DocNum { get; set; }

        // 电子驾驶证生成时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021年08月06日</para>
        /// </summary>
        [NameInMap("issue_time")]
        [Validation(Required=false)]
        public string IssueTime { get; set; }

        // 当前时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021年04月16日14:09:39</para>
        /// </summary>
        [NameInMap("current_time")]
        [Validation(Required=false)]
        public string CurrentTime { get; set; }

        // 条形码编号
        /// <summary>
        /// <b>Example:</b>
        /// <para><em>4360028416316</em></para>
        /// </summary>
        [NameInMap("bar_code")]
        [Validation(Required=false)]
        public string BarCode { get; set; }

        // 累计记分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("points")]
        [Validation(Required=false)]
        public string Points { get; set; }

        // 记录
        /// <summary>
        /// <b>Example:</b>
        /// <para>请于每个记分周期结束后三十日接受审验。无记分的，免予本次审验。</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>正常</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 车辆识别代号
        /// <summary>
        /// <b>Example:</b>
        /// <para>SSVUDDTT2J2022558</para>
        /// </summary>
        [NameInMap("vehicle")]
        [Validation(Required=false)]
        public string Vehicle { get; set; }

        // 品牌型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>大众汽车牌SVW6474DFD</para>
        /// </summary>
        [NameInMap("model")]
        [Validation(Required=false)]
        public string Model { get; set; }

        // 车辆类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>小型普通客车</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 使用性质
        /// <summary>
        /// <b>Example:</b>
        /// <para>非运营</para>
        /// </summary>
        [NameInMap("useage")]
        [Validation(Required=false)]
        public string Useage { get; set; }

        // 发动机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>111533</para>
        /// </summary>
        [NameInMap("eng_num")]
        [Validation(Required=false)]
        public string EngNum { get; set; }

        // 车牌号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙BF12345</para>
        /// </summary>
        [NameInMap("plate")]
        [Validation(Required=false)]
        public string Plate { get; set; }

        // 检验记录
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018年11月渝A()</para>
        /// </summary>
        [NameInMap("inspec_record")]
        [Validation(Required=false)]
        public string InspecRecord { get; set; }

        // 核定载质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1490kg</para>
        /// </summary>
        [NameInMap("load")]
        [Validation(Required=false)]
        public string Load { get; set; }

        // 整备质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2600kg</para>
        /// </summary>
        [NameInMap("curb_mass")]
        [Validation(Required=false)]
        public string CurbMass { get; set; }

        // 外廓尺寸
        /// <summary>
        /// <b>Example:</b>
        /// <para>5990X2500X4400mm</para>
        /// </summary>
        [NameInMap("overall_dimension")]
        [Validation(Required=false)]
        public string OverallDimension { get; set; }

        // 核定载人数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5人</para>
        /// </summary>
        [NameInMap("seating")]
        [Validation(Required=false)]
        public string Seating { get; set; }

        // 总质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>4290kg</para>
        /// </summary>
        [NameInMap("gross_mass")]
        [Validation(Required=false)]
        public string GrossMass { get; set; }

        // 燃油类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>柴油</para>
        /// </summary>
        [NameInMap("fuel")]
        [Validation(Required=false)]
        public string Fuel { get; set; }

        // 准牵引总质量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2700kg</para>
        /// </summary>
        [NameInMap("traction_mass")]
        [Validation(Required=false)]
        public string TractionMass { get; set; }

        // 证芯编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>50027372380230106</para>
        /// </summary>
        [NameInMap("chip_num")]
        [Validation(Required=false)]
        public string ChipNum { get; set; }

        // 证件类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>P</para>
        /// </summary>
        [NameInMap("passport_type")]
        [Validation(Required=false)]
        public string PassportType { get; set; }

        // 姓
        /// <summary>
        /// <b>Example:</b>
        /// <para>张</para>
        /// </summary>
        [NameInMap("surname")]
        [Validation(Required=false)]
        public string Surname { get; set; }

        // 名
        /// <summary>
        /// <b>Example:</b>
        /// <para>三</para>
        /// </summary>
        [NameInMap("given_name")]
        [Validation(Required=false)]
        public string GivenName { get; set; }

        // 护照号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>L12880801</para>
        /// </summary>
        [NameInMap("passport_number")]
        [Validation(Required=false)]
        public string PassportNumber { get; set; }

        // 英文姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZHENGJIAN</para>
        /// </summary>
        [NameInMap("name_en")]
        [Validation(Required=false)]
        public string NameEn { get; set; }

        // 英文出生地
        /// <summary>
        /// <b>Example:</b>
        /// <para>GUANGDONG</para>
        /// </summary>
        [NameInMap("birth_place_en")]
        [Validation(Required=false)]
        public string BirthPlaceEn { get; set; }

        // 非英文出生地
        /// <summary>
        /// <b>Example:</b>
        /// <para>广东</para>
        /// </summary>
        [NameInMap("birth_place")]
        [Validation(Required=false)]
        public string BirthPlace { get; set; }

        // 国籍
        /// <summary>
        /// <b>Example:</b>
        /// <para>CHINESE</para>
        /// </summary>
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 出生日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>850320</para>
        /// </summary>
        [NameInMap("birth_date")]
        [Validation(Required=false)]
        public string BirthDate { get; set; }

        // 出生日期（年月日）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1985年03月20日</para>
        /// </summary>
        [NameInMap("birth_date_ymd")]
        [Validation(Required=false)]
        public string BirthDateYmd { get; set; }

        // 签发日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019年01月18日</para>
        /// </summary>
        [NameInMap("issue_date_ymd")]
        [Validation(Required=false)]
        public string IssueDateYmd { get; set; }

        // 签发地
        /// <summary>
        /// <b>Example:</b>
        /// <para>GUANGDONG</para>
        /// </summary>
        [NameInMap("issue_place_en")]
        [Validation(Required=false)]
        public string IssuePlaceEn { get; set; }

        // 非英文签发地
        /// <summary>
        /// <b>Example:</b>
        /// <para>广东</para>
        /// </summary>
        [NameInMap("issue_place")]
        [Validation(Required=false)]
        public string IssuePlace { get; set; }

        // 签发机关
        /// <summary>
        /// <b>Example:</b>
        /// <para>National Immigration Administration, PRC</para>
        /// </summary>
        [NameInMap("issue_authority_en")]
        [Validation(Required=false)]
        public string IssueAuthorityEn { get; set; }

        // 中华人民共和国国家移民管理局
        /// <summary>
        /// <b>Example:</b>
        /// <para>非英文签发机关</para>
        /// </summary>
        [NameInMap("issue_authority")]
        [Validation(Required=false)]
        public string IssueAuthority { get; set; }

        // 身份号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("id_number")]
        [Validation(Required=false)]
        public string IdNumber { get; set; }

        // 机读码一
        /// <summary>
        /// <b>Example:</b>
        /// <para>POCHNZHENGJIAN</para>
        /// </summary>
        [NameInMap("mrz_line1")]
        [Validation(Required=false)]
        public string MrzLine1 { get; set; }

        // 机读码二
        /// <summary>
        /// <b>Example:</b>
        /// <para>EF12608921CHN8503208F2901178NGKELMPONBPJB978</para>
        /// </summary>
        [NameInMap("mrz_line2")]
        [Validation(Required=false)]
        public string MrzLine2 { get; set; }

        // 证件类别
        /// <summary>
        /// <b>Example:</b>
        /// <para>往来台湾通行证</para>
        /// </summary>
        [NameInMap("permit_type")]
        [Validation(Required=false)]
        public string PermitType { get; set; }

        // 中文姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>证件样本</para>
        /// </summary>
        [NameInMap("name_cn")]
        [Validation(Required=false)]
        public string NameCn { get; set; }

        // 有效期限 (yyyy.MM.dd-yyyy.MM.dd)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2019.01.18-2029.01.17</para>
        /// </summary>
        [NameInMap("valid_period")]
        [Validation(Required=false)]
        public string ValidPeriod { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>H01162111</para>
        /// </summary>
        [NameInMap("permit_number")]
        [Validation(Required=false)]
        public string PermitNumber { get; set; }

        // 机读码
        /// <summary>
        /// <b>Example:</b>
        /// <para>CSCA3273201&lt;901178&lt;8108038&lt;2</para>
        /// </summary>
        [NameInMap("mrz_code")]
        [Validation(Required=false)]
        public string MrzCode { get; set; }

    }

}
