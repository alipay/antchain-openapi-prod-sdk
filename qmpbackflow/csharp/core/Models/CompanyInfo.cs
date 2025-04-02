// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 企业信息
    public class CompanyInfo : TeaModel {
        // 活跃地json
        [NameInMap("active_addr_json")]
        [Validation(Required=true)]
        public string ActiveAddrJson { get; set; }

        // 活跃市(字段停用)
        [NameInMap("active_city")]
        [Validation(Required=true)]
        public string ActiveCity { get; set; }

        // 活跃县(字段停用)
        [NameInMap("active_county")]
        [Validation(Required=true)]
        public string ActiveCounty { get; set; }

        // 活跃省(字段停用)
        [NameInMap("active_province")]
        [Validation(Required=true)]
        public string ActiveProvince { get; set; }

        // 类经融行业分类
        [NameInMap("categories")]
        [Validation(Required=true)]
        public string Categories { get; set; }

        // 核准日期
        [NameInMap("check_date")]
        [Validation(Required=true)]
        public string CheckDate { get; set; }

        // 删除标志
        [NameInMap("del_flag")]
        [Validation(Required=true)]
        public string DelFlag { get; set; }

        // odps数据产生时间，业务上不关心
        [NameInMap("dt")]
        [Validation(Required=true)]
        public string Dt { get; set; }

        // 企业曾用名
        [NameInMap("former_org_names")]
        [Validation(Required=true)]
        public string FormerOrgNames { get; set; }

        // {"mct_one_id":"ID1","org_name":"总公司名称1"}
        [NameInMap("head_office")]
        [Validation(Required=true)]
        public string HeadOffice { get; set; }

        // 记录ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 影响金额
        [NameInMap("involved_amount")]
        [Validation(Required=true)]
        public long? InvolvedAmount { get; set; }

        // 影响人数
        [NameInMap("involved_people")]
        [Validation(Required=true)]
        public long? InvolvedPeople { get; set; }

        // 重要关联企业,json格式
        [NameInMap("key_rela_orgs")]
        [Validation(Required=true)]
        public string KeyRelaOrgs { get; set; }

        // 法人
        [NameInMap("legal_representative")]
        [Validation(Required=true)]
        public string LegalRepresentative { get; set; }

        // 企业ID
        [NameInMap("mct_one_id")]
        [Validation(Required=true)]
        public string MctOneId { get; set; }

        // 经营地json
        [NameInMap("operating_addr_json")]
        [Validation(Required=true)]
        public string OperatingAddrJson { get; set; }

        // 经营市(字段停用)
        [NameInMap("operating_city")]
        [Validation(Required=true)]
        public string OperatingCity { get; set; }

        // 经营县(字段停用)
        [NameInMap("operating_county")]
        [Validation(Required=true)]
        public string OperatingCounty { get; set; }

        // 经营地址(字段停用)
        [NameInMap("operating_place")]
        [Validation(Required=true)]
        public string OperatingPlace { get; set; }

        // 经营省(字段停用)
        [NameInMap("operating_province")]
        [Validation(Required=true)]
        public string OperatingProvince { get; set; }

        // 营运状态(1:营运0:不营运)
        [NameInMap("oprt_actv_state")]
        [Validation(Required=true)]
        public string OprtActvState { get; set; }

        // 经营期限至
        [NameInMap("oprt_end_date")]
        [Validation(Required=true)]
        public string OprtEndDate { get; set; }

        // 经营范围
        [NameInMap("oprt_scope")]
        [Validation(Required=true)]
        public string OprtScope { get; set; }

        // 经营期限自
        [NameInMap("oprt_start_date")]
        [Validation(Required=true)]
        public string OprtStartDate { get; set; }

        // 操作类型
        // 
        [NameInMap("op_type")]
        [Validation(Required=true)]
        public string OpType { get; set; }

        // 组织机构代码
        [NameInMap("org_code")]
        [Validation(Required=true)]
        public string OrgCode { get; set; }

        // 电子邮箱
        [NameInMap("org_email")]
        [Validation(Required=true)]
        public string OrgEmail { get; set; }

        // 企业名
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 注册资本折人民币(万元)
        [NameInMap("org_reg_cptl_rmb")]
        [Validation(Required=true)]
        public string OrgRegCptlRmb { get; set; }

        // 企业状态
        [NameInMap("org_state")]
        [Validation(Required=true)]
        public string OrgState { get; set; }

        // 联系电话
        [NameInMap("org_tel")]
        [Validation(Required=true)]
        public string OrgTel { get; set; }

        // 企业类型
        [NameInMap("org_type")]
        [Validation(Required=true)]
        public string OrgType { get; set; }

        // 平台名
        [NameInMap("platform_name")]
        [Validation(Required=true)]
        public string PlatformName { get; set; }

        // 平台状态
        [NameInMap("platform_states")]
        [Validation(Required=true)]
        public string PlatformStates { get; set; }

        // 注册资本币种
        [NameInMap("register_capital_currency")]
        [Validation(Required=true)]
        public string RegisterCapitalCurrency { get; set; }

        // 注册资本值
        [NameInMap("register_capital_value")]
        [Validation(Required=true)]
        public string RegisterCapitalValue { get; set; }

        // 注册市
        [NameInMap("register_city")]
        [Validation(Required=true)]
        public string RegisterCity { get; set; }

        // 注册区县
        [NameInMap("register_county")]
        [Validation(Required=true)]
        public string RegisterCounty { get; set; }

        // 注册时间
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 注册地址
        [NameInMap("register_place")]
        [Validation(Required=true)]
        public string RegisterPlace { get; set; }

        // 注册省
        [NameInMap("register_province")]
        [Validation(Required=true)]
        public string RegisterProvince { get; set; }

        // 登记机关
        [NameInMap("registration_authority")]
        [Validation(Required=true)]
        public string RegistrationAuthority { get; set; }

        // 工商注册号
        [NameInMap("reg_no")]
        [Validation(Required=true)]
        public string RegNo { get; set; }

        // 风报企业ID
        [NameInMap("riskstorm_company_id")]
        [Validation(Required=true)]
        public string RiskstormCompanyId { get; set; }

        // 风险维度
        [NameInMap("risk_factors")]
        [Validation(Required=true)]
        public string RiskFactors { get; set; }

        // 风险图谱可视化数据
        [NameInMap("risk_graph_json")]
        [Validation(Required=true)]
        public string RiskGraphJson { get; set; }

        // 风险报文
        [NameInMap("risk_message")]
        [Validation(Required=true)]
        public string RiskMessage { get; set; }

        // 风险指数
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public long? RiskScore { get; set; }

        // 风险指数，按日的趋势图
        [NameInMap("risk_score_trend")]
        [Validation(Required=true)]
        public string RiskScoreTrend { get; set; }

        // 风险指数周波动
        [NameInMap("risk_score_weekly_float")]
        [Validation(Required=true)]
        public long? RiskScoreWeeklyFloat { get; set; }

        // 风险标签(字段停用)
        [NameInMap("risk_tags")]
        [Validation(Required=true)]
        public string RiskTags { get; set; }

        // 风险标签ID
        [NameInMap("risk_tags_id")]
        [Validation(Required=true)]
        public string RiskTagsId { get; set; }

        // 风险定性
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // 搜索内容
        [NameInMap("search_content")]
        [Validation(Required=true)]
        public string SearchContent { get; set; }

        // 传播人次
        [NameInMap("spread_number")]
        [Validation(Required=true)]
        public long? SpreadNumber { get; set; }

        // 影响地区人次分布,json格式如下
        [NameInMap("spread_num_distribution")]
        [Validation(Required=true)]
        public string SpreadNumDistribution { get; set; }

        // 社会统一信用代码
        [NameInMap("uc_code")]
        [Validation(Required=true)]
        public string UcCode { get; set; }

        // 公有云数据库产生时间
        [NameInMap("update_date")]
        [Validation(Required=true)]
        public string UpdateDate { get; set; }

        // 平台json  
        [NameInMap("platform")]
        [Validation(Required=true)]
        public string Platform { get; set; }

    }

}
