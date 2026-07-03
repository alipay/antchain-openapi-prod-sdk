<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CompanyInfo extends Model
{
    // 活跃地json
    /**
     * @example 活跃地json
     *
     * @var string
     */
    public $activeAddrJson;

    // 活跃市(字段停用)
    /**
     * @example 活跃市(字段停用)
     *
     * @var string
     */
    public $activeCity;

    // 活跃县(字段停用)
    /**
     * @example 活跃县(字段停用)
     *
     * @var string
     */
    public $activeCounty;

    // 活跃省(字段停用)
    /**
     * @example 活跃省(字段停用)
     *
     * @var string
     */
    public $activeProvince;

    // 类经融行业分类
    /**
     * @example 类金融
     *
     * @var string
     */
    public $categories;

    // 核准日期
    /**
     * @example 20191023
     *
     * @var string
     */
    public $checkDate;

    // 删除标志
    /**
     * @example 0
     *
     * @var string
     */
    public $delFlag;

    // odps数据产生时间，业务上不关心
    /**
     * @example 20190922
     *
     * @var string
     */
    public $dt;

    // 企业曾用名
    /**
     * @example [123,45tee]
     *
     * @var string
     */
    public $formerOrgNames;

    // {"mct_one_id":"ID1","org_name":"总公司名称1"}
    /**
     * @example 总公司,json格式
     *
     * @var string
     */
    public $headOffice;

    // 记录ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 影响金额
    /**
     * @example 300
     *
     * @var int
     */
    public $involvedAmount;

    // 影响人数
    /**
     * @example 100
     *
     * @var int
     */
    public $involvedPeople;

    // 重要关联企业,json格式
    /**
     * @example [{"mct_one_id":"ID1","org_name":"企业名称1","relation_desc":"关联描述1"},{"mct_one_id":"ID2","org_name":"企业名称2","relation_desc":"关联描述2"}]
     *
     * @var string
     */
    public $keyRelaOrgs;

    // 法人
    /**
     * @example 张三
     *
     * @var string
     */
    public $legalRepresentative;

    // 企业ID
    /**
     * @example 12
     *
     * @var string
     */
    public $mctOneId;

    // 经营地json
    /**
     * @example 经营地json
     *
     * @var string
     */
    public $operatingAddrJson;

    // 经营市(字段停用)
    /**
     * @example 经营市(字段停用)
     *
     * @var string
     */
    public $operatingCity;

    // 经营县(字段停用)
    /**
     * @example 经营县(字段停用)
     *
     * @var string
     */
    public $operatingCounty;

    // 经营地址(字段停用)
    /**
     * @example 经营地址(字段停用)
     *
     * @var string
     */
    public $operatingPlace;

    // 经营省(字段停用)
    /**
     * @example operating_province
     *
     * @var string
     */
    public $operatingProvince;

    // 营运状态(1:营运0:不营运)
    /**
     * @example 1
     *
     * @var string
     */
    public $oprtActvState;

    // 经营期限至
    /**
     * @example 20210201
     *
     * @var string
     */
    public $oprtEndDate;

    // 经营范围
    /**
     * @example 工商
     *
     * @var string
     */
    public $oprtScope;

    // 经营期限自
    /**
     * @example 20190201
     *
     * @var string
     */
    public $oprtStartDate;

    // 操作类型
    //
    /**
     * @example add、delete、update
     *
     * @var string
     */
    public $opType;

    // 组织机构代码
    /**
     * @example 246667
     *
     * @var string
     */
    public $orgCode;

    // 电子邮箱
    /**
     * @example werr@163.com
     *
     * @var string
     */
    public $orgEmail;

    // 企业名
    /**
     * @example 恒生电子
     *
     * @var string
     */
    public $orgName;

    // 注册资本折人民币(万元)
    /**
     * @example 3000000000
     *
     * @var string
     */
    public $orgRegCptlRmb;

    // 企业状态
    /**
     * @example 正常
     *
     * @var string
     */
    public $orgState;

    // 联系电话
    /**
     * @example 1234567
     *
     * @var string
     */
    public $orgTel;

    // 企业类型
    /**
     * @example 工商
     *
     * @var string
     */
    public $orgType;

    // 平台名
    /**
     * @example p2p平台
     *
     * @var string
     */
    public $platformName;

    // 平台状态
    /**
     * @example 平台状态
     *
     * @var string
     */
    public $platformStates;

    // 注册资本币种
    /**
     * @example 人名币
     *
     * @var string
     */
    public $registerCapitalCurrency;

    // 注册资本值
    /**
     * @example 2300000
     *
     * @var string
     */
    public $registerCapitalValue;

    // 注册市
    /**
     * @example 宣城市
     *
     * @var string
     */
    public $registerCity;

    // 注册区县
    /**
     * @example 南海区
     *
     * @var string
     */
    public $registerCounty;

    // 注册时间
    /**
     * @example 20110203
     *
     * @var string
     */
    public $registerDate;

    // 注册地址
    /**
     * @example 江苏省
     *
     * @var string
     */
    public $registerPlace;

    // 注册省
    /**
     * @example 安徽省
     *
     * @var string
     */
    public $registerProvince;

    // 登记机关
    /**
     * @example XX金融办
     *
     * @var string
     */
    public $registrationAuthority;

    // 工商注册号
    /**
     * @example 23456667
     *
     * @var string
     */
    public $regNo;

    // 风报企业ID
    /**
     * @example 1234
     *
     * @var string
     */
    public $riskstormCompanyId;

    // 风险维度
    /**
     * @example 风险维度
     *
     * @var string
     */
    public $riskFactors;

    // 风险图谱可视化数据
    /**
     * @example 风险图谱可视化数据
     *
     * @var string
     */
    public $riskGraphJson;

    // 风险报文
    /**
     * @example 风险报文
     *
     * @var string
     */
    public $riskMessage;

    // 风险指数
    /**
     * @example 80
     *
     * @var int
     */
    public $riskScore;

    // 风险指数，按日的趋势图
    /**
     * @example 风险指数
     *
     * @var string
     */
    public $riskScoreTrend;

    // 风险指数周波动
    /**
     * @example 2.3
     *
     * @var int
     */
    public $riskScoreWeeklyFloat;

    // 风险标签(字段停用)
    /**
     * @example 经营异常
     *
     * @var string
     */
    public $riskTags;

    // 风险标签ID
    /**
     * @example NM12,NM34
     *
     * @var string
     */
    public $riskTagsId;

    // 风险定性
    /**
     * @example 风险定性
     *
     * @var string
     */
    public $riskType;

    // 搜索内容
    /**
     * @example 隐隐科技
     *
     * @var string
     */
    public $searchContent;

    // 传播人次
    /**
     * @example 传播人次
     *
     * @var int
     */
    public $spreadNumber;

    // 影响地区人次分布,json格式如下
    /**
     * @example [{"place_type":"prov","active_info":[{"place_name":"省1","num":3690},{"place_name":"省2","num":3680}]},{"place_type":"city","active_info":[{"place_name":"市1","num":3690},{"place_name":"市2","num":3680}]}]
     *
     * @var string
     */
    public $spreadNumDistribution;

    // 社会统一信用代码
    /**
     * @example 2456787878
     *
     * @var string
     */
    public $ucCode;

    // 公有云数据库产生时间
    /**
     * @example 20190923
     *
     * @var string
     */
    public $updateDate;

    // 平台json
    /**
     * @example  [{"platform_name":"ptp","platform_states":"平台状态"}]
     *
     * @var string
     */
    public $platform;
    protected $_name = [
        'activeAddrJson'          => 'active_addr_json',
        'activeCity'              => 'active_city',
        'activeCounty'            => 'active_county',
        'activeProvince'          => 'active_province',
        'categories'              => 'categories',
        'checkDate'               => 'check_date',
        'delFlag'                 => 'del_flag',
        'dt'                      => 'dt',
        'formerOrgNames'          => 'former_org_names',
        'headOffice'              => 'head_office',
        'id'                      => 'id',
        'involvedAmount'          => 'involved_amount',
        'involvedPeople'          => 'involved_people',
        'keyRelaOrgs'             => 'key_rela_orgs',
        'legalRepresentative'     => 'legal_representative',
        'mctOneId'                => 'mct_one_id',
        'operatingAddrJson'       => 'operating_addr_json',
        'operatingCity'           => 'operating_city',
        'operatingCounty'         => 'operating_county',
        'operatingPlace'          => 'operating_place',
        'operatingProvince'       => 'operating_province',
        'oprtActvState'           => 'oprt_actv_state',
        'oprtEndDate'             => 'oprt_end_date',
        'oprtScope'               => 'oprt_scope',
        'oprtStartDate'           => 'oprt_start_date',
        'opType'                  => 'op_type',
        'orgCode'                 => 'org_code',
        'orgEmail'                => 'org_email',
        'orgName'                 => 'org_name',
        'orgRegCptlRmb'           => 'org_reg_cptl_rmb',
        'orgState'                => 'org_state',
        'orgTel'                  => 'org_tel',
        'orgType'                 => 'org_type',
        'platformName'            => 'platform_name',
        'platformStates'          => 'platform_states',
        'registerCapitalCurrency' => 'register_capital_currency',
        'registerCapitalValue'    => 'register_capital_value',
        'registerCity'            => 'register_city',
        'registerCounty'          => 'register_county',
        'registerDate'            => 'register_date',
        'registerPlace'           => 'register_place',
        'registerProvince'        => 'register_province',
        'registrationAuthority'   => 'registration_authority',
        'regNo'                   => 'reg_no',
        'riskstormCompanyId'      => 'riskstorm_company_id',
        'riskFactors'             => 'risk_factors',
        'riskGraphJson'           => 'risk_graph_json',
        'riskMessage'             => 'risk_message',
        'riskScore'               => 'risk_score',
        'riskScoreTrend'          => 'risk_score_trend',
        'riskScoreWeeklyFloat'    => 'risk_score_weekly_float',
        'riskTags'                => 'risk_tags',
        'riskTagsId'              => 'risk_tags_id',
        'riskType'                => 'risk_type',
        'searchContent'           => 'search_content',
        'spreadNumber'            => 'spread_number',
        'spreadNumDistribution'   => 'spread_num_distribution',
        'ucCode'                  => 'uc_code',
        'updateDate'              => 'update_date',
        'platform'                => 'platform',
    ];

    public function validate()
    {
        Model::validateRequired('activeAddrJson', $this->activeAddrJson, true);
        Model::validateRequired('activeCity', $this->activeCity, true);
        Model::validateRequired('activeCounty', $this->activeCounty, true);
        Model::validateRequired('activeProvince', $this->activeProvince, true);
        Model::validateRequired('categories', $this->categories, true);
        Model::validateRequired('checkDate', $this->checkDate, true);
        Model::validateRequired('delFlag', $this->delFlag, true);
        Model::validateRequired('dt', $this->dt, true);
        Model::validateRequired('formerOrgNames', $this->formerOrgNames, true);
        Model::validateRequired('headOffice', $this->headOffice, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('involvedAmount', $this->involvedAmount, true);
        Model::validateRequired('involvedPeople', $this->involvedPeople, true);
        Model::validateRequired('keyRelaOrgs', $this->keyRelaOrgs, true);
        Model::validateRequired('legalRepresentative', $this->legalRepresentative, true);
        Model::validateRequired('mctOneId', $this->mctOneId, true);
        Model::validateRequired('operatingAddrJson', $this->operatingAddrJson, true);
        Model::validateRequired('operatingCity', $this->operatingCity, true);
        Model::validateRequired('operatingCounty', $this->operatingCounty, true);
        Model::validateRequired('operatingPlace', $this->operatingPlace, true);
        Model::validateRequired('operatingProvince', $this->operatingProvince, true);
        Model::validateRequired('oprtActvState', $this->oprtActvState, true);
        Model::validateRequired('oprtEndDate', $this->oprtEndDate, true);
        Model::validateRequired('oprtScope', $this->oprtScope, true);
        Model::validateRequired('oprtStartDate', $this->oprtStartDate, true);
        Model::validateRequired('opType', $this->opType, true);
        Model::validateRequired('orgCode', $this->orgCode, true);
        Model::validateRequired('orgEmail', $this->orgEmail, true);
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validateRequired('orgRegCptlRmb', $this->orgRegCptlRmb, true);
        Model::validateRequired('orgState', $this->orgState, true);
        Model::validateRequired('orgTel', $this->orgTel, true);
        Model::validateRequired('orgType', $this->orgType, true);
        Model::validateRequired('platformName', $this->platformName, true);
        Model::validateRequired('platformStates', $this->platformStates, true);
        Model::validateRequired('registerCapitalCurrency', $this->registerCapitalCurrency, true);
        Model::validateRequired('registerCapitalValue', $this->registerCapitalValue, true);
        Model::validateRequired('registerCity', $this->registerCity, true);
        Model::validateRequired('registerCounty', $this->registerCounty, true);
        Model::validateRequired('registerDate', $this->registerDate, true);
        Model::validateRequired('registerPlace', $this->registerPlace, true);
        Model::validateRequired('registerProvince', $this->registerProvince, true);
        Model::validateRequired('registrationAuthority', $this->registrationAuthority, true);
        Model::validateRequired('regNo', $this->regNo, true);
        Model::validateRequired('riskstormCompanyId', $this->riskstormCompanyId, true);
        Model::validateRequired('riskFactors', $this->riskFactors, true);
        Model::validateRequired('riskGraphJson', $this->riskGraphJson, true);
        Model::validateRequired('riskMessage', $this->riskMessage, true);
        Model::validateRequired('riskScore', $this->riskScore, true);
        Model::validateRequired('riskScoreTrend', $this->riskScoreTrend, true);
        Model::validateRequired('riskScoreWeeklyFloat', $this->riskScoreWeeklyFloat, true);
        Model::validateRequired('riskTags', $this->riskTags, true);
        Model::validateRequired('riskTagsId', $this->riskTagsId, true);
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('searchContent', $this->searchContent, true);
        Model::validateRequired('spreadNumber', $this->spreadNumber, true);
        Model::validateRequired('spreadNumDistribution', $this->spreadNumDistribution, true);
        Model::validateRequired('ucCode', $this->ucCode, true);
        Model::validateRequired('updateDate', $this->updateDate, true);
        Model::validateRequired('platform', $this->platform, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->activeAddrJson) {
            $res['active_addr_json'] = $this->activeAddrJson;
        }
        if (null !== $this->activeCity) {
            $res['active_city'] = $this->activeCity;
        }
        if (null !== $this->activeCounty) {
            $res['active_county'] = $this->activeCounty;
        }
        if (null !== $this->activeProvince) {
            $res['active_province'] = $this->activeProvince;
        }
        if (null !== $this->categories) {
            $res['categories'] = $this->categories;
        }
        if (null !== $this->checkDate) {
            $res['check_date'] = $this->checkDate;
        }
        if (null !== $this->delFlag) {
            $res['del_flag'] = $this->delFlag;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->formerOrgNames) {
            $res['former_org_names'] = $this->formerOrgNames;
        }
        if (null !== $this->headOffice) {
            $res['head_office'] = $this->headOffice;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->involvedAmount) {
            $res['involved_amount'] = $this->involvedAmount;
        }
        if (null !== $this->involvedPeople) {
            $res['involved_people'] = $this->involvedPeople;
        }
        if (null !== $this->keyRelaOrgs) {
            $res['key_rela_orgs'] = $this->keyRelaOrgs;
        }
        if (null !== $this->legalRepresentative) {
            $res['legal_representative'] = $this->legalRepresentative;
        }
        if (null !== $this->mctOneId) {
            $res['mct_one_id'] = $this->mctOneId;
        }
        if (null !== $this->operatingAddrJson) {
            $res['operating_addr_json'] = $this->operatingAddrJson;
        }
        if (null !== $this->operatingCity) {
            $res['operating_city'] = $this->operatingCity;
        }
        if (null !== $this->operatingCounty) {
            $res['operating_county'] = $this->operatingCounty;
        }
        if (null !== $this->operatingPlace) {
            $res['operating_place'] = $this->operatingPlace;
        }
        if (null !== $this->operatingProvince) {
            $res['operating_province'] = $this->operatingProvince;
        }
        if (null !== $this->oprtActvState) {
            $res['oprt_actv_state'] = $this->oprtActvState;
        }
        if (null !== $this->oprtEndDate) {
            $res['oprt_end_date'] = $this->oprtEndDate;
        }
        if (null !== $this->oprtScope) {
            $res['oprt_scope'] = $this->oprtScope;
        }
        if (null !== $this->oprtStartDate) {
            $res['oprt_start_date'] = $this->oprtStartDate;
        }
        if (null !== $this->opType) {
            $res['op_type'] = $this->opType;
        }
        if (null !== $this->orgCode) {
            $res['org_code'] = $this->orgCode;
        }
        if (null !== $this->orgEmail) {
            $res['org_email'] = $this->orgEmail;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->orgRegCptlRmb) {
            $res['org_reg_cptl_rmb'] = $this->orgRegCptlRmb;
        }
        if (null !== $this->orgState) {
            $res['org_state'] = $this->orgState;
        }
        if (null !== $this->orgTel) {
            $res['org_tel'] = $this->orgTel;
        }
        if (null !== $this->orgType) {
            $res['org_type'] = $this->orgType;
        }
        if (null !== $this->platformName) {
            $res['platform_name'] = $this->platformName;
        }
        if (null !== $this->platformStates) {
            $res['platform_states'] = $this->platformStates;
        }
        if (null !== $this->registerCapitalCurrency) {
            $res['register_capital_currency'] = $this->registerCapitalCurrency;
        }
        if (null !== $this->registerCapitalValue) {
            $res['register_capital_value'] = $this->registerCapitalValue;
        }
        if (null !== $this->registerCity) {
            $res['register_city'] = $this->registerCity;
        }
        if (null !== $this->registerCounty) {
            $res['register_county'] = $this->registerCounty;
        }
        if (null !== $this->registerDate) {
            $res['register_date'] = $this->registerDate;
        }
        if (null !== $this->registerPlace) {
            $res['register_place'] = $this->registerPlace;
        }
        if (null !== $this->registerProvince) {
            $res['register_province'] = $this->registerProvince;
        }
        if (null !== $this->registrationAuthority) {
            $res['registration_authority'] = $this->registrationAuthority;
        }
        if (null !== $this->regNo) {
            $res['reg_no'] = $this->regNo;
        }
        if (null !== $this->riskstormCompanyId) {
            $res['riskstorm_company_id'] = $this->riskstormCompanyId;
        }
        if (null !== $this->riskFactors) {
            $res['risk_factors'] = $this->riskFactors;
        }
        if (null !== $this->riskGraphJson) {
            $res['risk_graph_json'] = $this->riskGraphJson;
        }
        if (null !== $this->riskMessage) {
            $res['risk_message'] = $this->riskMessage;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskScoreTrend) {
            $res['risk_score_trend'] = $this->riskScoreTrend;
        }
        if (null !== $this->riskScoreWeeklyFloat) {
            $res['risk_score_weekly_float'] = $this->riskScoreWeeklyFloat;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = $this->riskTags;
        }
        if (null !== $this->riskTagsId) {
            $res['risk_tags_id'] = $this->riskTagsId;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->searchContent) {
            $res['search_content'] = $this->searchContent;
        }
        if (null !== $this->spreadNumber) {
            $res['spread_number'] = $this->spreadNumber;
        }
        if (null !== $this->spreadNumDistribution) {
            $res['spread_num_distribution'] = $this->spreadNumDistribution;
        }
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }
        if (null !== $this->updateDate) {
            $res['update_date'] = $this->updateDate;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['active_addr_json'])) {
            $model->activeAddrJson = $map['active_addr_json'];
        }
        if (isset($map['active_city'])) {
            $model->activeCity = $map['active_city'];
        }
        if (isset($map['active_county'])) {
            $model->activeCounty = $map['active_county'];
        }
        if (isset($map['active_province'])) {
            $model->activeProvince = $map['active_province'];
        }
        if (isset($map['categories'])) {
            $model->categories = $map['categories'];
        }
        if (isset($map['check_date'])) {
            $model->checkDate = $map['check_date'];
        }
        if (isset($map['del_flag'])) {
            $model->delFlag = $map['del_flag'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['former_org_names'])) {
            $model->formerOrgNames = $map['former_org_names'];
        }
        if (isset($map['head_office'])) {
            $model->headOffice = $map['head_office'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['involved_amount'])) {
            $model->involvedAmount = $map['involved_amount'];
        }
        if (isset($map['involved_people'])) {
            $model->involvedPeople = $map['involved_people'];
        }
        if (isset($map['key_rela_orgs'])) {
            $model->keyRelaOrgs = $map['key_rela_orgs'];
        }
        if (isset($map['legal_representative'])) {
            $model->legalRepresentative = $map['legal_representative'];
        }
        if (isset($map['mct_one_id'])) {
            $model->mctOneId = $map['mct_one_id'];
        }
        if (isset($map['operating_addr_json'])) {
            $model->operatingAddrJson = $map['operating_addr_json'];
        }
        if (isset($map['operating_city'])) {
            $model->operatingCity = $map['operating_city'];
        }
        if (isset($map['operating_county'])) {
            $model->operatingCounty = $map['operating_county'];
        }
        if (isset($map['operating_place'])) {
            $model->operatingPlace = $map['operating_place'];
        }
        if (isset($map['operating_province'])) {
            $model->operatingProvince = $map['operating_province'];
        }
        if (isset($map['oprt_actv_state'])) {
            $model->oprtActvState = $map['oprt_actv_state'];
        }
        if (isset($map['oprt_end_date'])) {
            $model->oprtEndDate = $map['oprt_end_date'];
        }
        if (isset($map['oprt_scope'])) {
            $model->oprtScope = $map['oprt_scope'];
        }
        if (isset($map['oprt_start_date'])) {
            $model->oprtStartDate = $map['oprt_start_date'];
        }
        if (isset($map['op_type'])) {
            $model->opType = $map['op_type'];
        }
        if (isset($map['org_code'])) {
            $model->orgCode = $map['org_code'];
        }
        if (isset($map['org_email'])) {
            $model->orgEmail = $map['org_email'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['org_reg_cptl_rmb'])) {
            $model->orgRegCptlRmb = $map['org_reg_cptl_rmb'];
        }
        if (isset($map['org_state'])) {
            $model->orgState = $map['org_state'];
        }
        if (isset($map['org_tel'])) {
            $model->orgTel = $map['org_tel'];
        }
        if (isset($map['org_type'])) {
            $model->orgType = $map['org_type'];
        }
        if (isset($map['platform_name'])) {
            $model->platformName = $map['platform_name'];
        }
        if (isset($map['platform_states'])) {
            $model->platformStates = $map['platform_states'];
        }
        if (isset($map['register_capital_currency'])) {
            $model->registerCapitalCurrency = $map['register_capital_currency'];
        }
        if (isset($map['register_capital_value'])) {
            $model->registerCapitalValue = $map['register_capital_value'];
        }
        if (isset($map['register_city'])) {
            $model->registerCity = $map['register_city'];
        }
        if (isset($map['register_county'])) {
            $model->registerCounty = $map['register_county'];
        }
        if (isset($map['register_date'])) {
            $model->registerDate = $map['register_date'];
        }
        if (isset($map['register_place'])) {
            $model->registerPlace = $map['register_place'];
        }
        if (isset($map['register_province'])) {
            $model->registerProvince = $map['register_province'];
        }
        if (isset($map['registration_authority'])) {
            $model->registrationAuthority = $map['registration_authority'];
        }
        if (isset($map['reg_no'])) {
            $model->regNo = $map['reg_no'];
        }
        if (isset($map['riskstorm_company_id'])) {
            $model->riskstormCompanyId = $map['riskstorm_company_id'];
        }
        if (isset($map['risk_factors'])) {
            $model->riskFactors = $map['risk_factors'];
        }
        if (isset($map['risk_graph_json'])) {
            $model->riskGraphJson = $map['risk_graph_json'];
        }
        if (isset($map['risk_message'])) {
            $model->riskMessage = $map['risk_message'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['risk_score_trend'])) {
            $model->riskScoreTrend = $map['risk_score_trend'];
        }
        if (isset($map['risk_score_weekly_float'])) {
            $model->riskScoreWeeklyFloat = $map['risk_score_weekly_float'];
        }
        if (isset($map['risk_tags'])) {
            $model->riskTags = $map['risk_tags'];
        }
        if (isset($map['risk_tags_id'])) {
            $model->riskTagsId = $map['risk_tags_id'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['search_content'])) {
            $model->searchContent = $map['search_content'];
        }
        if (isset($map['spread_number'])) {
            $model->spreadNumber = $map['spread_number'];
        }
        if (isset($map['spread_num_distribution'])) {
            $model->spreadNumDistribution = $map['spread_num_distribution'];
        }
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }
        if (isset($map['update_date'])) {
            $model->updateDate = $map['update_date'];
        }
        if (isset($map['platform'])) {
            $model->platform = $map['platform'];
        }

        return $model;
    }
}
