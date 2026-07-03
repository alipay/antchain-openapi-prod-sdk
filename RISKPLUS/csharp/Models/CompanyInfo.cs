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
        /// <summary>
        /// <b>Example:</b>
        /// <para>活跃地json</para>
        /// </summary>
        [NameInMap("active_addr_json")]
        [Validation(Required=true)]
        public string ActiveAddrJson { get; set; }

        // 活跃市(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>活跃市(字段停用)</para>
        /// </summary>
        [NameInMap("active_city")]
        [Validation(Required=true)]
        public string ActiveCity { get; set; }

        // 活跃县(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>活跃县(字段停用)</para>
        /// </summary>
        [NameInMap("active_county")]
        [Validation(Required=true)]
        public string ActiveCounty { get; set; }

        // 活跃省(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>活跃省(字段停用)</para>
        /// </summary>
        [NameInMap("active_province")]
        [Validation(Required=true)]
        public string ActiveProvince { get; set; }

        // 类经融行业分类
        /// <summary>
        /// <b>Example:</b>
        /// <para>类金融</para>
        /// </summary>
        [NameInMap("categories")]
        [Validation(Required=true)]
        public string Categories { get; set; }

        // 核准日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>20191023</para>
        /// </summary>
        [NameInMap("check_date")]
        [Validation(Required=true)]
        public string CheckDate { get; set; }

        // 删除标志
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("del_flag")]
        [Validation(Required=true)]
        public string DelFlag { get; set; }

        // odps数据产生时间，业务上不关心
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190922</para>
        /// </summary>
        [NameInMap("dt")]
        [Validation(Required=true)]
        public string Dt { get; set; }

        // 企业曾用名
        /// <summary>
        /// <b>Example:</b>
        /// <para>[123,45tee]</para>
        /// </summary>
        [NameInMap("former_org_names")]
        [Validation(Required=true)]
        public string FormerOrgNames { get; set; }

        // {"mct_one_id":"ID1","org_name":"总公司名称1"}
        /// <summary>
        /// <b>Example:</b>
        /// <para>总公司,json格式</para>
        /// </summary>
        [NameInMap("head_office")]
        [Validation(Required=true)]
        public string HeadOffice { get; set; }

        // 记录ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 影响金额
        /// <summary>
        /// <b>Example:</b>
        /// <para>300</para>
        /// </summary>
        [NameInMap("involved_amount")]
        [Validation(Required=true)]
        public long? InvolvedAmount { get; set; }

        // 影响人数
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("involved_people")]
        [Validation(Required=true)]
        public long? InvolvedPeople { get; set; }

        // 重要关联企业,json格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;mct_one_id&quot;:&quot;ID1&quot;,&quot;org_name&quot;:&quot;企业名称1&quot;,&quot;relation_desc&quot;:&quot;关联描述1&quot;},{&quot;mct_one_id&quot;:&quot;ID2&quot;,&quot;org_name&quot;:&quot;企业名称2&quot;,&quot;relation_desc&quot;:&quot;关联描述2&quot;}]</para>
        /// </summary>
        [NameInMap("key_rela_orgs")]
        [Validation(Required=true)]
        public string KeyRelaOrgs { get; set; }

        // 法人
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("legal_representative")]
        [Validation(Required=true)]
        public string LegalRepresentative { get; set; }

        // 企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("mct_one_id")]
        [Validation(Required=true)]
        public string MctOneId { get; set; }

        // 经营地json
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营地json</para>
        /// </summary>
        [NameInMap("operating_addr_json")]
        [Validation(Required=true)]
        public string OperatingAddrJson { get; set; }

        // 经营市(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营市(字段停用)</para>
        /// </summary>
        [NameInMap("operating_city")]
        [Validation(Required=true)]
        public string OperatingCity { get; set; }

        // 经营县(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营县(字段停用)</para>
        /// </summary>
        [NameInMap("operating_county")]
        [Validation(Required=true)]
        public string OperatingCounty { get; set; }

        // 经营地址(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营地址(字段停用)</para>
        /// </summary>
        [NameInMap("operating_place")]
        [Validation(Required=true)]
        public string OperatingPlace { get; set; }

        // 经营省(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>operating_province</para>
        /// </summary>
        [NameInMap("operating_province")]
        [Validation(Required=true)]
        public string OperatingProvince { get; set; }

        // 营运状态(1:营运0:不营运)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("oprt_actv_state")]
        [Validation(Required=true)]
        public string OprtActvState { get; set; }

        // 经营期限至
        /// <summary>
        /// <b>Example:</b>
        /// <para>20210201</para>
        /// </summary>
        [NameInMap("oprt_end_date")]
        [Validation(Required=true)]
        public string OprtEndDate { get; set; }

        // 经营范围
        /// <summary>
        /// <b>Example:</b>
        /// <para>工商</para>
        /// </summary>
        [NameInMap("oprt_scope")]
        [Validation(Required=true)]
        public string OprtScope { get; set; }

        // 经营期限自
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190201</para>
        /// </summary>
        [NameInMap("oprt_start_date")]
        [Validation(Required=true)]
        public string OprtStartDate { get; set; }

        // 操作类型
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>add、delete、update</para>
        /// </summary>
        [NameInMap("op_type")]
        [Validation(Required=true)]
        public string OpType { get; set; }

        // 组织机构代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>246667</para>
        /// </summary>
        [NameInMap("org_code")]
        [Validation(Required=true)]
        public string OrgCode { get; set; }

        // 电子邮箱
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="mailto:werr@163.com">werr@163.com</a></para>
        /// </summary>
        [NameInMap("org_email")]
        [Validation(Required=true)]
        public string OrgEmail { get; set; }

        // 企业名
        /// <summary>
        /// <b>Example:</b>
        /// <para>恒生电子</para>
        /// </summary>
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 注册资本折人民币(万元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>3000000000</para>
        /// </summary>
        [NameInMap("org_reg_cptl_rmb")]
        [Validation(Required=true)]
        public string OrgRegCptlRmb { get; set; }

        // 企业状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>正常</para>
        /// </summary>
        [NameInMap("org_state")]
        [Validation(Required=true)]
        public string OrgState { get; set; }

        // 联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234567</para>
        /// </summary>
        [NameInMap("org_tel")]
        [Validation(Required=true)]
        public string OrgTel { get; set; }

        // 企业类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>工商</para>
        /// </summary>
        [NameInMap("org_type")]
        [Validation(Required=true)]
        public string OrgType { get; set; }

        // 平台名
        /// <summary>
        /// <b>Example:</b>
        /// <para>p2p平台</para>
        /// </summary>
        [NameInMap("platform_name")]
        [Validation(Required=true)]
        public string PlatformName { get; set; }

        // 平台状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>平台状态</para>
        /// </summary>
        [NameInMap("platform_states")]
        [Validation(Required=true)]
        public string PlatformStates { get; set; }

        // 注册资本币种
        /// <summary>
        /// <b>Example:</b>
        /// <para>人名币</para>
        /// </summary>
        [NameInMap("register_capital_currency")]
        [Validation(Required=true)]
        public string RegisterCapitalCurrency { get; set; }

        // 注册资本值
        /// <summary>
        /// <b>Example:</b>
        /// <para>2300000</para>
        /// </summary>
        [NameInMap("register_capital_value")]
        [Validation(Required=true)]
        public string RegisterCapitalValue { get; set; }

        // 注册市
        /// <summary>
        /// <b>Example:</b>
        /// <para>宣城市</para>
        /// </summary>
        [NameInMap("register_city")]
        [Validation(Required=true)]
        public string RegisterCity { get; set; }

        // 注册区县
        /// <summary>
        /// <b>Example:</b>
        /// <para>南海区</para>
        /// </summary>
        [NameInMap("register_county")]
        [Validation(Required=true)]
        public string RegisterCounty { get; set; }

        // 注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20110203</para>
        /// </summary>
        [NameInMap("register_date")]
        [Validation(Required=true)]
        public string RegisterDate { get; set; }

        // 注册地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>江苏省</para>
        /// </summary>
        [NameInMap("register_place")]
        [Validation(Required=true)]
        public string RegisterPlace { get; set; }

        // 注册省
        /// <summary>
        /// <b>Example:</b>
        /// <para>安徽省</para>
        /// </summary>
        [NameInMap("register_province")]
        [Validation(Required=true)]
        public string RegisterProvince { get; set; }

        // 登记机关
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX金融办</para>
        /// </summary>
        [NameInMap("registration_authority")]
        [Validation(Required=true)]
        public string RegistrationAuthority { get; set; }

        // 工商注册号
        /// <summary>
        /// <b>Example:</b>
        /// <para>23456667</para>
        /// </summary>
        [NameInMap("reg_no")]
        [Validation(Required=true)]
        public string RegNo { get; set; }

        // 风报企业ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234</para>
        /// </summary>
        [NameInMap("riskstorm_company_id")]
        [Validation(Required=true)]
        public string RiskstormCompanyId { get; set; }

        // 风险维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险维度</para>
        /// </summary>
        [NameInMap("risk_factors")]
        [Validation(Required=true)]
        public string RiskFactors { get; set; }

        // 风险图谱可视化数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险图谱可视化数据</para>
        /// </summary>
        [NameInMap("risk_graph_json")]
        [Validation(Required=true)]
        public string RiskGraphJson { get; set; }

        // 风险报文
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险报文</para>
        /// </summary>
        [NameInMap("risk_message")]
        [Validation(Required=true)]
        public string RiskMessage { get; set; }

        // 风险指数
        /// <summary>
        /// <b>Example:</b>
        /// <para>80</para>
        /// </summary>
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public long? RiskScore { get; set; }

        // 风险指数，按日的趋势图
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险指数</para>
        /// </summary>
        [NameInMap("risk_score_trend")]
        [Validation(Required=true)]
        public string RiskScoreTrend { get; set; }

        // 风险指数周波动
        /// <summary>
        /// <b>Example:</b>
        /// <para>2.3</para>
        /// </summary>
        [NameInMap("risk_score_weekly_float")]
        [Validation(Required=true)]
        public long? RiskScoreWeeklyFloat { get; set; }

        // 风险标签(字段停用)
        /// <summary>
        /// <b>Example:</b>
        /// <para>经营异常</para>
        /// </summary>
        [NameInMap("risk_tags")]
        [Validation(Required=true)]
        public string RiskTags { get; set; }

        // 风险标签ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>NM12,NM34</para>
        /// </summary>
        [NameInMap("risk_tags_id")]
        [Validation(Required=true)]
        public string RiskTagsId { get; set; }

        // 风险定性
        /// <summary>
        /// <b>Example:</b>
        /// <para>风险定性</para>
        /// </summary>
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // 搜索内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>隐隐科技</para>
        /// </summary>
        [NameInMap("search_content")]
        [Validation(Required=true)]
        public string SearchContent { get; set; }

        // 传播人次
        /// <summary>
        /// <b>Example:</b>
        /// <para>传播人次</para>
        /// </summary>
        [NameInMap("spread_number")]
        [Validation(Required=true)]
        public long? SpreadNumber { get; set; }

        // 影响地区人次分布,json格式如下
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;place_type&quot;:&quot;prov&quot;,&quot;active_info&quot;:[{&quot;place_name&quot;:&quot;省1&quot;,&quot;num&quot;:3690},{&quot;place_name&quot;:&quot;省2&quot;,&quot;num&quot;:3680}]},{&quot;place_type&quot;:&quot;city&quot;,&quot;active_info&quot;:[{&quot;place_name&quot;:&quot;市1&quot;,&quot;num&quot;:3690},{&quot;place_name&quot;:&quot;市2&quot;,&quot;num&quot;:3680}]}]</para>
        /// </summary>
        [NameInMap("spread_num_distribution")]
        [Validation(Required=true)]
        public string SpreadNumDistribution { get; set; }

        // 社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>2456787878</para>
        /// </summary>
        [NameInMap("uc_code")]
        [Validation(Required=true)]
        public string UcCode { get; set; }

        // 公有云数据库产生时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190923</para>
        /// </summary>
        [NameInMap("update_date")]
        [Validation(Required=true)]
        public string UpdateDate { get; set; }

        // 平台json  
        /// <summary>
        /// <b>Example:</b>
        /// <para> [{&quot;platform_name&quot;:&quot;ptp&quot;,&quot;platform_states&quot;:&quot;平台状态&quot;}]</para>
        /// </summary>
        [NameInMap("platform")]
        [Validation(Required=true)]
        public string Platform { get; set; }

    }

}
