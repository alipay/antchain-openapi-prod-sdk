// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceYzbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
        // yyyyMMdd请传递当前时间。 
        // 身份标识可自定义。
        // 其他编码建议为随机值。
        // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 保司编码，PAIC---平安、CPIC---太保
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码，05-驿站宝
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 投保人姓名，保险协议中的投保人全称
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人证件类型，01-居民身份证,03--统一社会信用代码
        [NameInMap("tbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string TbrIdType { get; set; }

        // 投保人证件号码
        [NameInMap("tbr_id_no")]
        [Validation(Required=true, MaxLength=30)]
        public string TbrIdNo { get; set; }

        // 被保人姓名，实际的保险被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人证件类型，01--居民身份证、03--统一社会信用代码
        [NameInMap("bbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string BbrIdType { get; set; }

        // 被保人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=true, MaxLength=30)]
        public string BbrIdNo { get; set; }

        // 被保人联系方式
        [NameInMap("bbr_contact")]
        [Validation(Required=true, MaxLength=30)]
        public string BbrContact { get; set; }

        // 受益人名称，实际的保险受益人名称
        [NameInMap("beneficiary_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BeneficiaryName { get; set; }

        // 受益人证件类型，01--居民身份证、03--统一社会信用代码
        [NameInMap("beneficiary_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string BeneficiaryIdType { get; set; }

        // 受益人证件号码
        [NameInMap("beneficiary_no")]
        [Validation(Required=true, MaxLength=30)]
        public string BeneficiaryNo { get; set; }

        // 保险起期，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_start")]
        [Validation(Required=true)]
        public string InsureStart { get; set; }

        // 套餐编码，
        // 平安（PK00053022、PK00053025、PK00053026、PK00125463、PK00125467）
        // 太保（xjbdbnd01、pssmyd02、xnfayd03、xnfayd04、xnfayd05）
        [NameInMap("product_package_type")]
        [Validation(Required=true, MaxLength=20)]
        public string ProductPackageType { get; set; }

        // 站点ID，站点的唯一标识
        [NameInMap("site_id")]
        [Validation(Required=true, MaxLength=30)]
        public string SiteId { get; set; }

        // 站点名称
        [NameInMap("site_name")]
        [Validation(Required=true, MaxLength=100)]
        public string SiteName { get; set; }

        // 总资产，单位（元），最多2位小数，超过拒绝请求
        [NameInMap("total_assets")]
        [Validation(Required=true)]
        public string TotalAssets { get; set; }

        // 雇员人数，站点的雇佣人员数
        [NameInMap("employee_num")]
        [Validation(Required=true)]
        public string EmployeeNum { get; set; }

        // 省编码，站点位于的省份编码
        [NameInMap("province_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ProvinceCode { get; set; }

        // 市编码，站点位于的市区编码
        [NameInMap("city_code")]
        [Validation(Required=true, MaxLength=10)]
        public string CityCode { get; set; }

        // 区编码,站点位于的区县编码
        [NameInMap("district_code")]
        [Validation(Required=true, MaxLength=10)]
        public string DistrictCode { get; set; }

        // 完整地址，站点的详细地址
        [NameInMap("whole_address")]
        [Validation(Required=true, MaxLength=300)]
        public string WholeAddress { get; set; }

        // 方案名称，菜鸟驿站宝、菜鸟校园驿站宝、溪鸟公共服务站保障，上门人员综合险-30万保额，上门人员综合险-50万保额
        [NameInMap("scheme_name")]
        [Validation(Required=true, MaxLength=100)]
        public string SchemeName { get; set; }

        // 意健险被保人姓名
        [NameInMap("acpl_bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string AcplBbrName { get; set; }

        // 意健险被保人身份证号
        [NameInMap("acpl_bbr_id_no")]
        [Validation(Required=true, MaxLength=30)]
        public string AcplBbrIdNo { get; set; }

        // 产品市场编码，平安---保司端险种编码、太保--与套餐编码保持一致
        [NameInMap("pdt_mkt_code")]
        [Validation(Required=false, MaxLength=16)]
        public string PdtMktCode { get; set; }

    }

}
