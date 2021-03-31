// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsurancepolicyZhonghuacaixianRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被保险人地址
        [NameInMap("bbr_addr")]
        [Validation(Required=false, MaxLength=80)]
        public string BbrAddr { get; set; }

        // 被保险人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=true, MaxLength=40)]
        public string BbrIdNo { get; set; }

        // 被保险人证件类型。按照如下值填写
        // 464001	身份证
        // 464002	护照
        // 464003	其他
        // 464004	组织机构代码
        // 464005	军人证
        // 464006	工商注册号码
        // 464007	统一社会信用代码
        // 464008	临时身份证
        // 464009	外国护照
        // 464010	中国人民武装警察身份证件
        // 464011	军官证
        // 464012	企业营业执照号码
        // 464013	统一社会信用代码（五证合一号码）
        // 464014	个体工商户营业执照号码
        // 464015	户口本
        // 464016	其他类境内个人身份有效证件
        // 464017	其他类境外个人身份有效证件
        // 464018	税务登记证
        // 464019	金融许可证号码
        // 464020	国家主管部门颁外国驻华机构批文号码
        // 464021	其他类境外机构代码
        [NameInMap("bbr_id_type")]
        [Validation(Required=true, MaxLength=40)]
        public string BbrIdType { get; set; }

        // 被保险人姓名
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=40)]
        public string BbrName { get; set; }

        // 被保险人联系电话
        [NameInMap("bbr_tel")]
        [Validation(Required=true, MaxLength=40)]
        public string BbrTel { get; set; }

        // 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
        [NameInMap("carriage")]
        [Validation(Required=true, MaxLength=20)]
        public string Carriage { get; set; }

        // 货物名称
        [NameInMap("car_go")]
        [Validation(Required=true, MaxLength=40)]
        public string CarGo { get; set; }

        // 厂牌型号
        [NameInMap("cp_model")]
        [Validation(Required=true, MaxLength=80)]
        public string CpModel { get; set; }

        // 目的地
        [NameInMap("destination")]
        [Validation(Required=false, MaxLength=200)]
        public string Destination { get; set; }

        // 行驶证车主
        [NameInMap("driv_per")]
        [Validation(Required=true, MaxLength=40)]
        public string DrivPer { get; set; }

        // 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
        [NameInMap("eff_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EffDate { get; set; }

        // 发动机编号
        [NameInMap("engine_no")]
        [Validation(Required=true, MaxLength=40)]
        public string EngineNo { get; set; }

        // 车架号
        [NameInMap("frame_no")]
        [Validation(Required=true, MaxLength=40)]
        public string FrameNo { get; set; }

        // 运单所属集团分布式身份标识
        [NameInMap("group_platform_did")]
        [Validation(Required=true, MaxLength=80)]
        public string GroupPlatformDid { get; set; }

        // 投保人证件类型有效止期
        [NameInMap("identify_period_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdentifyPeriodEnd { get; set; }

        // 投保人证件类型有效起期
        [NameInMap("identify_period_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IdentifyPeriodStart { get; set; }

        // 车牌号码
        [NameInMap("license_no")]
        [Validation(Required=true, MaxLength=40)]
        public string LicenseNo { get; set; }

        // 运单所属平台分布式身份标识
        [NameInMap("platform_did")]
        [Validation(Required=true, MaxLength=80)]
        public string PlatformDid { get; set; }

        // 运营证号
        [NameInMap("run_no")]
        [Validation(Required=true, MaxLength=40)]
        public string RunNo { get; set; }

        // 起运地
        [NameInMap("start_place")]
        [Validation(Required=false, MaxLength=200)]
        public string StartPlace { get; set; }

        // 投保人地址
        [NameInMap("tbr_addr")]
        [Validation(Required=false, MaxLength=80)]
        public string TbrAddr { get; set; }

        // 投保人邮箱
        [NameInMap("tbr_email")]
        [Validation(Required=false, MaxLength=40)]
        public string TbrEmail { get; set; }

        // 投保人证件号
        [NameInMap("tbr_id_no")]
        [Validation(Required=true, MaxLength=40)]
        public string TbrIdNo { get; set; }

        // 投保人证件类型，按照如下状态进行填写 
        // 464001	身份证
        // 464002	护照
        // 464003	其他
        // 464004	组织机构代码
        // 464005	军人证
        // 464006	工商注册号码
        // 464007	统一社会信用代码
        // 464008	临时身份证
        // 464009	外国护照
        // 464010	中国人民武装警察身份证件
        // 464011	军官证
        // 464012	企业营业执照号码
        // 464013	统一社会信用代码（五证合一号码）
        // 464014	个体工商户营业执照号码
        // 464015	户口本
        // 464016	其他类境内个人身份有效证件
        // 464017	其他类境外个人身份有效证件
        // 464018	税务登记证
        // 464019	金融许可证号码
        // 464020	国家主管部门颁外国驻华机构批文号码
        // 464021	其他类境外机构代码
        [NameInMap("tbr_id_type")]
        [Validation(Required=true, MaxLength=40)]
        public string TbrIdType { get; set; }

        // 投保人姓名
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=40)]
        public string TbrName { get; set; }

        // 投保人联系电话
        [NameInMap("tbr_tel")]
        [Validation(Required=true, MaxLength=40)]
        public string TbrTel { get; set; }

        // 保险止期，保期时间间隔为1-30天。
        [NameInMap("term_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TermDate { get; set; }

        // 吨位
        [NameInMap("ton_nage")]
        [Validation(Required=true, MaxLength=20)]
        public string TonNage { get; set; }

        // 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=32)]
        public string TradeNo { get; set; }

        // 运输货物
        [NameInMap("ts_car_go")]
        [Validation(Required=true, MaxLength=80)]
        public string TsCarGo { get; set; }

        // 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
        [NameInMap("waybill_id")]
        [Validation(Required=true, MaxLength=128)]
        public string WaybillId { get; set; }

        // 重量
        [NameInMap("weight")]
        [Validation(Required=false, MaxLength=20)]
        public string Weight { get; set; }

    }

}
