// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CompanyInfo extends TeaModel {
    // 活跃地json
    /**
     * <strong>example:</strong>
     * <p>活跃地json</p>
     */
    @NameInMap("active_addr_json")
    @Validation(required = true)
    public String activeAddrJson;

    // 活跃市(字段停用)
    /**
     * <strong>example:</strong>
     * <p>活跃市(字段停用)</p>
     */
    @NameInMap("active_city")
    @Validation(required = true)
    public String activeCity;

    // 活跃县(字段停用)
    /**
     * <strong>example:</strong>
     * <p>活跃县(字段停用)</p>
     */
    @NameInMap("active_county")
    @Validation(required = true)
    public String activeCounty;

    // 活跃省(字段停用)
    /**
     * <strong>example:</strong>
     * <p>活跃省(字段停用)</p>
     */
    @NameInMap("active_province")
    @Validation(required = true)
    public String activeProvince;

    // 类经融行业分类
    /**
     * <strong>example:</strong>
     * <p>类金融</p>
     */
    @NameInMap("categories")
    @Validation(required = true)
    public String categories;

    // 核准日期
    /**
     * <strong>example:</strong>
     * <p>20191023</p>
     */
    @NameInMap("check_date")
    @Validation(required = true)
    public String checkDate;

    // 删除标志
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("del_flag")
    @Validation(required = true)
    public String delFlag;

    // odps数据产生时间，业务上不关心
    /**
     * <strong>example:</strong>
     * <p>20190922</p>
     */
    @NameInMap("dt")
    @Validation(required = true)
    public String dt;

    // 企业曾用名
    /**
     * <strong>example:</strong>
     * <p>[123,45tee]</p>
     */
    @NameInMap("former_org_names")
    @Validation(required = true)
    public String formerOrgNames;

    // {"mct_one_id":"ID1","org_name":"总公司名称1"}
    /**
     * <strong>example:</strong>
     * <p>总公司,json格式</p>
     */
    @NameInMap("head_office")
    @Validation(required = true)
    public String headOffice;

    // 记录ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 影响金额
    /**
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("involved_amount")
    @Validation(required = true)
    public Long involvedAmount;

    // 影响人数
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("involved_people")
    @Validation(required = true)
    public Long involvedPeople;

    // 重要关联企业,json格式
    /**
     * <strong>example:</strong>
     * <p>[{&quot;mct_one_id&quot;:&quot;ID1&quot;,&quot;org_name&quot;:&quot;企业名称1&quot;,&quot;relation_desc&quot;:&quot;关联描述1&quot;},{&quot;mct_one_id&quot;:&quot;ID2&quot;,&quot;org_name&quot;:&quot;企业名称2&quot;,&quot;relation_desc&quot;:&quot;关联描述2&quot;}]</p>
     */
    @NameInMap("key_rela_orgs")
    @Validation(required = true)
    public String keyRelaOrgs;

    // 法人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("legal_representative")
    @Validation(required = true)
    public String legalRepresentative;

    // 企业ID
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("mct_one_id")
    @Validation(required = true)
    public String mctOneId;

    // 经营地json
    /**
     * <strong>example:</strong>
     * <p>经营地json</p>
     */
    @NameInMap("operating_addr_json")
    @Validation(required = true)
    public String operatingAddrJson;

    // 经营市(字段停用)
    /**
     * <strong>example:</strong>
     * <p>经营市(字段停用)</p>
     */
    @NameInMap("operating_city")
    @Validation(required = true)
    public String operatingCity;

    // 经营县(字段停用)
    /**
     * <strong>example:</strong>
     * <p>经营县(字段停用)</p>
     */
    @NameInMap("operating_county")
    @Validation(required = true)
    public String operatingCounty;

    // 经营地址(字段停用)
    /**
     * <strong>example:</strong>
     * <p>经营地址(字段停用)</p>
     */
    @NameInMap("operating_place")
    @Validation(required = true)
    public String operatingPlace;

    // 经营省(字段停用)
    /**
     * <strong>example:</strong>
     * <p>operating_province</p>
     */
    @NameInMap("operating_province")
    @Validation(required = true)
    public String operatingProvince;

    // 营运状态(1:营运0:不营运)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("oprt_actv_state")
    @Validation(required = true)
    public String oprtActvState;

    // 经营期限至
    /**
     * <strong>example:</strong>
     * <p>20210201</p>
     */
    @NameInMap("oprt_end_date")
    @Validation(required = true)
    public String oprtEndDate;

    // 经营范围
    /**
     * <strong>example:</strong>
     * <p>工商</p>
     */
    @NameInMap("oprt_scope")
    @Validation(required = true)
    public String oprtScope;

    // 经营期限自
    /**
     * <strong>example:</strong>
     * <p>20190201</p>
     */
    @NameInMap("oprt_start_date")
    @Validation(required = true)
    public String oprtStartDate;

    // 操作类型
    // 
    /**
     * <strong>example:</strong>
     * <p>add、delete、update</p>
     */
    @NameInMap("op_type")
    @Validation(required = true)
    public String opType;

    // 组织机构代码
    /**
     * <strong>example:</strong>
     * <p>246667</p>
     */
    @NameInMap("org_code")
    @Validation(required = true)
    public String orgCode;

    // 电子邮箱
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:werr@163.com">werr@163.com</a></p>
     */
    @NameInMap("org_email")
    @Validation(required = true)
    public String orgEmail;

    // 企业名
    /**
     * <strong>example:</strong>
     * <p>恒生电子</p>
     */
    @NameInMap("org_name")
    @Validation(required = true)
    public String orgName;

    // 注册资本折人民币(万元)
    /**
     * <strong>example:</strong>
     * <p>3000000000</p>
     */
    @NameInMap("org_reg_cptl_rmb")
    @Validation(required = true)
    public String orgRegCptlRmb;

    // 企业状态
    /**
     * <strong>example:</strong>
     * <p>正常</p>
     */
    @NameInMap("org_state")
    @Validation(required = true)
    public String orgState;

    // 联系电话
    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("org_tel")
    @Validation(required = true)
    public String orgTel;

    // 企业类型
    /**
     * <strong>example:</strong>
     * <p>工商</p>
     */
    @NameInMap("org_type")
    @Validation(required = true)
    public String orgType;

    // 平台名
    /**
     * <strong>example:</strong>
     * <p>p2p平台</p>
     */
    @NameInMap("platform_name")
    @Validation(required = true)
    public String platformName;

    // 平台状态
    /**
     * <strong>example:</strong>
     * <p>平台状态</p>
     */
    @NameInMap("platform_states")
    @Validation(required = true)
    public String platformStates;

    // 注册资本币种
    /**
     * <strong>example:</strong>
     * <p>人名币</p>
     */
    @NameInMap("register_capital_currency")
    @Validation(required = true)
    public String registerCapitalCurrency;

    // 注册资本值
    /**
     * <strong>example:</strong>
     * <p>2300000</p>
     */
    @NameInMap("register_capital_value")
    @Validation(required = true)
    public String registerCapitalValue;

    // 注册市
    /**
     * <strong>example:</strong>
     * <p>宣城市</p>
     */
    @NameInMap("register_city")
    @Validation(required = true)
    public String registerCity;

    // 注册区县
    /**
     * <strong>example:</strong>
     * <p>南海区</p>
     */
    @NameInMap("register_county")
    @Validation(required = true)
    public String registerCounty;

    // 注册时间
    /**
     * <strong>example:</strong>
     * <p>20110203</p>
     */
    @NameInMap("register_date")
    @Validation(required = true)
    public String registerDate;

    // 注册地址
    /**
     * <strong>example:</strong>
     * <p>江苏省</p>
     */
    @NameInMap("register_place")
    @Validation(required = true)
    public String registerPlace;

    // 注册省
    /**
     * <strong>example:</strong>
     * <p>安徽省</p>
     */
    @NameInMap("register_province")
    @Validation(required = true)
    public String registerProvince;

    // 登记机关
    /**
     * <strong>example:</strong>
     * <p>XX金融办</p>
     */
    @NameInMap("registration_authority")
    @Validation(required = true)
    public String registrationAuthority;

    // 工商注册号
    /**
     * <strong>example:</strong>
     * <p>23456667</p>
     */
    @NameInMap("reg_no")
    @Validation(required = true)
    public String regNo;

    // 风报企业ID
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("riskstorm_company_id")
    @Validation(required = true)
    public String riskstormCompanyId;

    // 风险维度
    /**
     * <strong>example:</strong>
     * <p>风险维度</p>
     */
    @NameInMap("risk_factors")
    @Validation(required = true)
    public String riskFactors;

    // 风险图谱可视化数据
    /**
     * <strong>example:</strong>
     * <p>风险图谱可视化数据</p>
     */
    @NameInMap("risk_graph_json")
    @Validation(required = true)
    public String riskGraphJson;

    // 风险报文
    /**
     * <strong>example:</strong>
     * <p>风险报文</p>
     */
    @NameInMap("risk_message")
    @Validation(required = true)
    public String riskMessage;

    // 风险指数
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("risk_score")
    @Validation(required = true)
    public Long riskScore;

    // 风险指数，按日的趋势图
    /**
     * <strong>example:</strong>
     * <p>风险指数</p>
     */
    @NameInMap("risk_score_trend")
    @Validation(required = true)
    public String riskScoreTrend;

    // 风险指数周波动
    /**
     * <strong>example:</strong>
     * <p>2.3</p>
     */
    @NameInMap("risk_score_weekly_float")
    @Validation(required = true)
    public Long riskScoreWeeklyFloat;

    // 风险标签(字段停用)
    /**
     * <strong>example:</strong>
     * <p>经营异常</p>
     */
    @NameInMap("risk_tags")
    @Validation(required = true)
    public String riskTags;

    // 风险标签ID
    /**
     * <strong>example:</strong>
     * <p>NM12,NM34</p>
     */
    @NameInMap("risk_tags_id")
    @Validation(required = true)
    public String riskTagsId;

    // 风险定性
    /**
     * <strong>example:</strong>
     * <p>风险定性</p>
     */
    @NameInMap("risk_type")
    @Validation(required = true)
    public String riskType;

    // 搜索内容
    /**
     * <strong>example:</strong>
     * <p>隐隐科技</p>
     */
    @NameInMap("search_content")
    @Validation(required = true)
    public String searchContent;

    // 传播人次
    /**
     * <strong>example:</strong>
     * <p>传播人次</p>
     */
    @NameInMap("spread_number")
    @Validation(required = true)
    public Long spreadNumber;

    // 影响地区人次分布,json格式如下
    /**
     * <strong>example:</strong>
     * <p>[{&quot;place_type&quot;:&quot;prov&quot;,&quot;active_info&quot;:[{&quot;place_name&quot;:&quot;省1&quot;,&quot;num&quot;:3690},{&quot;place_name&quot;:&quot;省2&quot;,&quot;num&quot;:3680}]},{&quot;place_type&quot;:&quot;city&quot;,&quot;active_info&quot;:[{&quot;place_name&quot;:&quot;市1&quot;,&quot;num&quot;:3690},{&quot;place_name&quot;:&quot;市2&quot;,&quot;num&quot;:3680}]}]</p>
     */
    @NameInMap("spread_num_distribution")
    @Validation(required = true)
    public String spreadNumDistribution;

    // 社会统一信用代码
    /**
     * <strong>example:</strong>
     * <p>2456787878</p>
     */
    @NameInMap("uc_code")
    @Validation(required = true)
    public String ucCode;

    // 公有云数据库产生时间
    /**
     * <strong>example:</strong>
     * <p>20190923</p>
     */
    @NameInMap("update_date")
    @Validation(required = true)
    public String updateDate;

    // 平台json  
    /**
     * <strong>example:</strong>
     * <p> [{&quot;platform_name&quot;:&quot;ptp&quot;,&quot;platform_states&quot;:&quot;平台状态&quot;}]</p>
     */
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    public static CompanyInfo build(java.util.Map<String, ?> map) throws Exception {
        CompanyInfo self = new CompanyInfo();
        return TeaModel.build(map, self);
    }

    public CompanyInfo setActiveAddrJson(String activeAddrJson) {
        this.activeAddrJson = activeAddrJson;
        return this;
    }
    public String getActiveAddrJson() {
        return this.activeAddrJson;
    }

    public CompanyInfo setActiveCity(String activeCity) {
        this.activeCity = activeCity;
        return this;
    }
    public String getActiveCity() {
        return this.activeCity;
    }

    public CompanyInfo setActiveCounty(String activeCounty) {
        this.activeCounty = activeCounty;
        return this;
    }
    public String getActiveCounty() {
        return this.activeCounty;
    }

    public CompanyInfo setActiveProvince(String activeProvince) {
        this.activeProvince = activeProvince;
        return this;
    }
    public String getActiveProvince() {
        return this.activeProvince;
    }

    public CompanyInfo setCategories(String categories) {
        this.categories = categories;
        return this;
    }
    public String getCategories() {
        return this.categories;
    }

    public CompanyInfo setCheckDate(String checkDate) {
        this.checkDate = checkDate;
        return this;
    }
    public String getCheckDate() {
        return this.checkDate;
    }

    public CompanyInfo setDelFlag(String delFlag) {
        this.delFlag = delFlag;
        return this;
    }
    public String getDelFlag() {
        return this.delFlag;
    }

    public CompanyInfo setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

    public CompanyInfo setFormerOrgNames(String formerOrgNames) {
        this.formerOrgNames = formerOrgNames;
        return this;
    }
    public String getFormerOrgNames() {
        return this.formerOrgNames;
    }

    public CompanyInfo setHeadOffice(String headOffice) {
        this.headOffice = headOffice;
        return this;
    }
    public String getHeadOffice() {
        return this.headOffice;
    }

    public CompanyInfo setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CompanyInfo setInvolvedAmount(Long involvedAmount) {
        this.involvedAmount = involvedAmount;
        return this;
    }
    public Long getInvolvedAmount() {
        return this.involvedAmount;
    }

    public CompanyInfo setInvolvedPeople(Long involvedPeople) {
        this.involvedPeople = involvedPeople;
        return this;
    }
    public Long getInvolvedPeople() {
        return this.involvedPeople;
    }

    public CompanyInfo setKeyRelaOrgs(String keyRelaOrgs) {
        this.keyRelaOrgs = keyRelaOrgs;
        return this;
    }
    public String getKeyRelaOrgs() {
        return this.keyRelaOrgs;
    }

    public CompanyInfo setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
        return this;
    }
    public String getLegalRepresentative() {
        return this.legalRepresentative;
    }

    public CompanyInfo setMctOneId(String mctOneId) {
        this.mctOneId = mctOneId;
        return this;
    }
    public String getMctOneId() {
        return this.mctOneId;
    }

    public CompanyInfo setOperatingAddrJson(String operatingAddrJson) {
        this.operatingAddrJson = operatingAddrJson;
        return this;
    }
    public String getOperatingAddrJson() {
        return this.operatingAddrJson;
    }

    public CompanyInfo setOperatingCity(String operatingCity) {
        this.operatingCity = operatingCity;
        return this;
    }
    public String getOperatingCity() {
        return this.operatingCity;
    }

    public CompanyInfo setOperatingCounty(String operatingCounty) {
        this.operatingCounty = operatingCounty;
        return this;
    }
    public String getOperatingCounty() {
        return this.operatingCounty;
    }

    public CompanyInfo setOperatingPlace(String operatingPlace) {
        this.operatingPlace = operatingPlace;
        return this;
    }
    public String getOperatingPlace() {
        return this.operatingPlace;
    }

    public CompanyInfo setOperatingProvince(String operatingProvince) {
        this.operatingProvince = operatingProvince;
        return this;
    }
    public String getOperatingProvince() {
        return this.operatingProvince;
    }

    public CompanyInfo setOprtActvState(String oprtActvState) {
        this.oprtActvState = oprtActvState;
        return this;
    }
    public String getOprtActvState() {
        return this.oprtActvState;
    }

    public CompanyInfo setOprtEndDate(String oprtEndDate) {
        this.oprtEndDate = oprtEndDate;
        return this;
    }
    public String getOprtEndDate() {
        return this.oprtEndDate;
    }

    public CompanyInfo setOprtScope(String oprtScope) {
        this.oprtScope = oprtScope;
        return this;
    }
    public String getOprtScope() {
        return this.oprtScope;
    }

    public CompanyInfo setOprtStartDate(String oprtStartDate) {
        this.oprtStartDate = oprtStartDate;
        return this;
    }
    public String getOprtStartDate() {
        return this.oprtStartDate;
    }

    public CompanyInfo setOpType(String opType) {
        this.opType = opType;
        return this;
    }
    public String getOpType() {
        return this.opType;
    }

    public CompanyInfo setOrgCode(String orgCode) {
        this.orgCode = orgCode;
        return this;
    }
    public String getOrgCode() {
        return this.orgCode;
    }

    public CompanyInfo setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
        return this;
    }
    public String getOrgEmail() {
        return this.orgEmail;
    }

    public CompanyInfo setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public CompanyInfo setOrgRegCptlRmb(String orgRegCptlRmb) {
        this.orgRegCptlRmb = orgRegCptlRmb;
        return this;
    }
    public String getOrgRegCptlRmb() {
        return this.orgRegCptlRmb;
    }

    public CompanyInfo setOrgState(String orgState) {
        this.orgState = orgState;
        return this;
    }
    public String getOrgState() {
        return this.orgState;
    }

    public CompanyInfo setOrgTel(String orgTel) {
        this.orgTel = orgTel;
        return this;
    }
    public String getOrgTel() {
        return this.orgTel;
    }

    public CompanyInfo setOrgType(String orgType) {
        this.orgType = orgType;
        return this;
    }
    public String getOrgType() {
        return this.orgType;
    }

    public CompanyInfo setPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }
    public String getPlatformName() {
        return this.platformName;
    }

    public CompanyInfo setPlatformStates(String platformStates) {
        this.platformStates = platformStates;
        return this;
    }
    public String getPlatformStates() {
        return this.platformStates;
    }

    public CompanyInfo setRegisterCapitalCurrency(String registerCapitalCurrency) {
        this.registerCapitalCurrency = registerCapitalCurrency;
        return this;
    }
    public String getRegisterCapitalCurrency() {
        return this.registerCapitalCurrency;
    }

    public CompanyInfo setRegisterCapitalValue(String registerCapitalValue) {
        this.registerCapitalValue = registerCapitalValue;
        return this;
    }
    public String getRegisterCapitalValue() {
        return this.registerCapitalValue;
    }

    public CompanyInfo setRegisterCity(String registerCity) {
        this.registerCity = registerCity;
        return this;
    }
    public String getRegisterCity() {
        return this.registerCity;
    }

    public CompanyInfo setRegisterCounty(String registerCounty) {
        this.registerCounty = registerCounty;
        return this;
    }
    public String getRegisterCounty() {
        return this.registerCounty;
    }

    public CompanyInfo setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }
    public String getRegisterDate() {
        return this.registerDate;
    }

    public CompanyInfo setRegisterPlace(String registerPlace) {
        this.registerPlace = registerPlace;
        return this;
    }
    public String getRegisterPlace() {
        return this.registerPlace;
    }

    public CompanyInfo setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince;
        return this;
    }
    public String getRegisterProvince() {
        return this.registerProvince;
    }

    public CompanyInfo setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
        return this;
    }
    public String getRegistrationAuthority() {
        return this.registrationAuthority;
    }

    public CompanyInfo setRegNo(String regNo) {
        this.regNo = regNo;
        return this;
    }
    public String getRegNo() {
        return this.regNo;
    }

    public CompanyInfo setRiskstormCompanyId(String riskstormCompanyId) {
        this.riskstormCompanyId = riskstormCompanyId;
        return this;
    }
    public String getRiskstormCompanyId() {
        return this.riskstormCompanyId;
    }

    public CompanyInfo setRiskFactors(String riskFactors) {
        this.riskFactors = riskFactors;
        return this;
    }
    public String getRiskFactors() {
        return this.riskFactors;
    }

    public CompanyInfo setRiskGraphJson(String riskGraphJson) {
        this.riskGraphJson = riskGraphJson;
        return this;
    }
    public String getRiskGraphJson() {
        return this.riskGraphJson;
    }

    public CompanyInfo setRiskMessage(String riskMessage) {
        this.riskMessage = riskMessage;
        return this;
    }
    public String getRiskMessage() {
        return this.riskMessage;
    }

    public CompanyInfo setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
        return this;
    }
    public Long getRiskScore() {
        return this.riskScore;
    }

    public CompanyInfo setRiskScoreTrend(String riskScoreTrend) {
        this.riskScoreTrend = riskScoreTrend;
        return this;
    }
    public String getRiskScoreTrend() {
        return this.riskScoreTrend;
    }

    public CompanyInfo setRiskScoreWeeklyFloat(Long riskScoreWeeklyFloat) {
        this.riskScoreWeeklyFloat = riskScoreWeeklyFloat;
        return this;
    }
    public Long getRiskScoreWeeklyFloat() {
        return this.riskScoreWeeklyFloat;
    }

    public CompanyInfo setRiskTags(String riskTags) {
        this.riskTags = riskTags;
        return this;
    }
    public String getRiskTags() {
        return this.riskTags;
    }

    public CompanyInfo setRiskTagsId(String riskTagsId) {
        this.riskTagsId = riskTagsId;
        return this;
    }
    public String getRiskTagsId() {
        return this.riskTagsId;
    }

    public CompanyInfo setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public CompanyInfo setSearchContent(String searchContent) {
        this.searchContent = searchContent;
        return this;
    }
    public String getSearchContent() {
        return this.searchContent;
    }

    public CompanyInfo setSpreadNumber(Long spreadNumber) {
        this.spreadNumber = spreadNumber;
        return this;
    }
    public Long getSpreadNumber() {
        return this.spreadNumber;
    }

    public CompanyInfo setSpreadNumDistribution(String spreadNumDistribution) {
        this.spreadNumDistribution = spreadNumDistribution;
        return this;
    }
    public String getSpreadNumDistribution() {
        return this.spreadNumDistribution;
    }

    public CompanyInfo setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

    public CompanyInfo setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
        return this;
    }
    public String getUpdateDate() {
        return this.updateDate;
    }

    public CompanyInfo setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

}
