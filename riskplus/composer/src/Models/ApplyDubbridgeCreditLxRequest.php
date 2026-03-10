<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeCreditLxRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 授信申请编号
    /**
     * @var string
     */
    public $creditApplyId;

    // 合作方代码
    /**
     * @var string
     */
    public $partnerCode;

    // 申请人姓名
    /**
     * @var string
     */
    public $name;

    // 授信金额，单位:元
    /**
     * @var int
     */
    public $creditAmount;

    // 婚姻状况，
    // 0-未婚
    // 1-已婚
    // 3-离异
    // 4-未知
    // 5-丧偶
    /**
     * @var string
     */
    public $maritalStatus;

    // 学历，
    // 0未知，1本科，2大专，3硕士，4博士，7初中，10大专(老)，11中专，12高中，13小学
    /**
     * @var string
     */
    public $education;

    // 年龄
    /**
     * @var int
     */
    public $age;

    // 性别，
    // 1-男
    // 2-女
    // 0-未知
    /**
     * @var string
     */
    public $sex;

    // 证件类型，
    // 1、身份证
    /**
     * @var string
     */
    public $identiType;

    // 证件号码
    /**
     * @var string
     */
    public $identiNo;

    // 身份证有效期止，如果是长期用20991231
    /**
     * @var string
     */
    public $idCardExpireDate;

    // 身份证有效期起
    /**
     * @var string
     */
    public $idCardValidDate;

    // 身份证省
    /**
     * @var string
     */
    public $idProvince;

    // 身份证市
    /**
     * @var string
     */
    public $idCity;

    // 身份证地址
    /**
     * @var string
     */
    public $idAddr;

    // 身份证签发机关
    /**
     * @var string
     */
    public $issuedAgency;

    // 出生日期，yyyy-MM-dd
    /**
     * @var string
     */
    public $birthday;

    // 国籍
    /**
     * @var string
     */
    public $nationality;

    // 民族
    /**
     * @var string
     */
    public $nation;

    // 客户手机号
    /**
     * @var string
     */
    public $mobileNo;

    // 用户银行卡号
    /**
     * @var string
     */
    public $userBankCardNo;

    // 第一联系人姓名
    /**
     * @var string
     */
    public $contactName;

    // 第一联系人手机
    /**
     * @var string
     */
    public $contactMobile;

    // 第一联系人关系，
    // 1 父母
    // 2 配偶
    // 3 亲戚
    // 4 家人
    // 5 子女
    // 6 朋友
    // 7 同事
    // 8 兄弟姐妹
    // 9 同学
    // 99 其他
    /**
     * @var string
     */
    public $contactRel;

    // 居住地址对应的省，若为空则上送身份证地址对应的省
    /**
     * @var string
     */
    public $livingProvince;

    // 居住地址对应的市，若为空则上送身份证地址对应的市
    /**
     * @var string
     */
    public $livingCity;

    // 居住地对应的区
    /**
     * @var string
     */
    public $livingCounty;

    // 居住地址
    /**
     * @var string
     */
    public $livingAddress;

    // 客户职业，
    // 0 未知（空值默认按0提供）
    // 1 国家机关、党群组织、企业、事业单位负责人
    // 2 专业技术人员
    // 3 办事人员和有关人员
    // 4 商业、服务业人员
    // 5 农、林、牧、渔、水利业生产人员
    // 6 生产、运输设备操作人员及有关人员
    // 7 军人
    // 8 不便分类的其他从业人员
    /**
     * @var string
     */
    public $userOccupation;

    // 客户行业，
    // 0 未知（空值默认按0提供）
    // 1 信息传输、软件和信息技术服务业
    // 2 金融业
    // 3 制造业
    // 4 卫生和社会工作
    // 5 建筑业
    // 6 文化、体育和娱乐业
    // 7 租赁和商务服务业
    // 8 住宿和餐饮业
    // 9 交通运输、仓储和邮政业
    // 10 采矿业
    // 11 电力、热力、燃气及水生产和供应业
    // 12 科学研究和技术服务业
    // 13 农、林、牧、渔业
    // 14 水利、环境和公共设施管理业
    // 15 其他
    // 77 批发和零售业
    // 78 居民服务、修理和其他服务业
    // 79 房地产业
    // 81 教育
    // 82 公共管理、社会保障和社会组织
    // 80 国际组织
    /**
     * @var string
     */
    public $userIndustryCategory;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'creditApplyId'        => 'credit_apply_id',
        'partnerCode'          => 'partner_code',
        'name'                 => 'name',
        'creditAmount'         => 'credit_amount',
        'maritalStatus'        => 'marital_status',
        'education'            => 'education',
        'age'                  => 'age',
        'sex'                  => 'sex',
        'identiType'           => 'identi_type',
        'identiNo'             => 'identi_no',
        'idCardExpireDate'     => 'id_card_expire_date',
        'idCardValidDate'      => 'id_card_valid_date',
        'idProvince'           => 'id_province',
        'idCity'               => 'id_city',
        'idAddr'               => 'id_addr',
        'issuedAgency'         => 'issued_agency',
        'birthday'             => 'birthday',
        'nationality'          => 'nationality',
        'nation'               => 'nation',
        'mobileNo'             => 'mobile_no',
        'userBankCardNo'       => 'user_bank_card_no',
        'contactName'          => 'contact_name',
        'contactMobile'        => 'contact_mobile',
        'contactRel'           => 'contact_rel',
        'livingProvince'       => 'living_province',
        'livingCity'           => 'living_city',
        'livingCounty'         => 'living_county',
        'livingAddress'        => 'living_address',
        'userOccupation'       => 'user_occupation',
        'userIndustryCategory' => 'user_industry_category',
    ];

    public function validate()
    {
        Model::validateRequired('creditApplyId', $this->creditApplyId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('creditAmount', $this->creditAmount, true);
        Model::validateRequired('maritalStatus', $this->maritalStatus, true);
        Model::validateRequired('education', $this->education, true);
        Model::validateRequired('age', $this->age, true);
        Model::validateRequired('sex', $this->sex, true);
        Model::validateRequired('identiType', $this->identiType, true);
        Model::validateRequired('identiNo', $this->identiNo, true);
        Model::validateRequired('idCardExpireDate', $this->idCardExpireDate, true);
        Model::validateRequired('idCardValidDate', $this->idCardValidDate, true);
        Model::validateRequired('idProvince', $this->idProvince, true);
        Model::validateRequired('idCity', $this->idCity, true);
        Model::validateRequired('idAddr', $this->idAddr, true);
        Model::validateRequired('issuedAgency', $this->issuedAgency, true);
        Model::validateRequired('birthday', $this->birthday, true);
        Model::validateRequired('nationality', $this->nationality, true);
        Model::validateRequired('nation', $this->nation, true);
        Model::validateRequired('mobileNo', $this->mobileNo, true);
        Model::validateRequired('userBankCardNo', $this->userBankCardNo, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactMobile', $this->contactMobile, true);
        Model::validateRequired('contactRel', $this->contactRel, true);
        Model::validateRequired('livingProvince', $this->livingProvince, true);
        Model::validateRequired('livingCity', $this->livingCity, true);
        Model::validateRequired('livingAddress', $this->livingAddress, true);
        Model::validateRequired('userOccupation', $this->userOccupation, true);
        Model::validateRequired('userIndustryCategory', $this->userIndustryCategory, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->creditApplyId) {
            $res['credit_apply_id'] = $this->creditApplyId;
        }
        if (null !== $this->partnerCode) {
            $res['partner_code'] = $this->partnerCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->creditAmount) {
            $res['credit_amount'] = $this->creditAmount;
        }
        if (null !== $this->maritalStatus) {
            $res['marital_status'] = $this->maritalStatus;
        }
        if (null !== $this->education) {
            $res['education'] = $this->education;
        }
        if (null !== $this->age) {
            $res['age'] = $this->age;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->identiType) {
            $res['identi_type'] = $this->identiType;
        }
        if (null !== $this->identiNo) {
            $res['identi_no'] = $this->identiNo;
        }
        if (null !== $this->idCardExpireDate) {
            $res['id_card_expire_date'] = $this->idCardExpireDate;
        }
        if (null !== $this->idCardValidDate) {
            $res['id_card_valid_date'] = $this->idCardValidDate;
        }
        if (null !== $this->idProvince) {
            $res['id_province'] = $this->idProvince;
        }
        if (null !== $this->idCity) {
            $res['id_city'] = $this->idCity;
        }
        if (null !== $this->idAddr) {
            $res['id_addr'] = $this->idAddr;
        }
        if (null !== $this->issuedAgency) {
            $res['issued_agency'] = $this->issuedAgency;
        }
        if (null !== $this->birthday) {
            $res['birthday'] = $this->birthday;
        }
        if (null !== $this->nationality) {
            $res['nationality'] = $this->nationality;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->mobileNo) {
            $res['mobile_no'] = $this->mobileNo;
        }
        if (null !== $this->userBankCardNo) {
            $res['user_bank_card_no'] = $this->userBankCardNo;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->contactRel) {
            $res['contact_rel'] = $this->contactRel;
        }
        if (null !== $this->livingProvince) {
            $res['living_province'] = $this->livingProvince;
        }
        if (null !== $this->livingCity) {
            $res['living_city'] = $this->livingCity;
        }
        if (null !== $this->livingCounty) {
            $res['living_county'] = $this->livingCounty;
        }
        if (null !== $this->livingAddress) {
            $res['living_address'] = $this->livingAddress;
        }
        if (null !== $this->userOccupation) {
            $res['user_occupation'] = $this->userOccupation;
        }
        if (null !== $this->userIndustryCategory) {
            $res['user_industry_category'] = $this->userIndustryCategory;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeCreditLxRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['credit_apply_id'])) {
            $model->creditApplyId = $map['credit_apply_id'];
        }
        if (isset($map['partner_code'])) {
            $model->partnerCode = $map['partner_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['credit_amount'])) {
            $model->creditAmount = $map['credit_amount'];
        }
        if (isset($map['marital_status'])) {
            $model->maritalStatus = $map['marital_status'];
        }
        if (isset($map['education'])) {
            $model->education = $map['education'];
        }
        if (isset($map['age'])) {
            $model->age = $map['age'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['identi_type'])) {
            $model->identiType = $map['identi_type'];
        }
        if (isset($map['identi_no'])) {
            $model->identiNo = $map['identi_no'];
        }
        if (isset($map['id_card_expire_date'])) {
            $model->idCardExpireDate = $map['id_card_expire_date'];
        }
        if (isset($map['id_card_valid_date'])) {
            $model->idCardValidDate = $map['id_card_valid_date'];
        }
        if (isset($map['id_province'])) {
            $model->idProvince = $map['id_province'];
        }
        if (isset($map['id_city'])) {
            $model->idCity = $map['id_city'];
        }
        if (isset($map['id_addr'])) {
            $model->idAddr = $map['id_addr'];
        }
        if (isset($map['issued_agency'])) {
            $model->issuedAgency = $map['issued_agency'];
        }
        if (isset($map['birthday'])) {
            $model->birthday = $map['birthday'];
        }
        if (isset($map['nationality'])) {
            $model->nationality = $map['nationality'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['mobile_no'])) {
            $model->mobileNo = $map['mobile_no'];
        }
        if (isset($map['user_bank_card_no'])) {
            $model->userBankCardNo = $map['user_bank_card_no'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_mobile'])) {
            $model->contactMobile = $map['contact_mobile'];
        }
        if (isset($map['contact_rel'])) {
            $model->contactRel = $map['contact_rel'];
        }
        if (isset($map['living_province'])) {
            $model->livingProvince = $map['living_province'];
        }
        if (isset($map['living_city'])) {
            $model->livingCity = $map['living_city'];
        }
        if (isset($map['living_county'])) {
            $model->livingCounty = $map['living_county'];
        }
        if (isset($map['living_address'])) {
            $model->livingAddress = $map['living_address'];
        }
        if (isset($map['user_occupation'])) {
            $model->userOccupation = $map['user_occupation'];
        }
        if (isset($map['user_industry_category'])) {
            $model->userIndustryCategory = $map['user_industry_category'];
        }

        return $model;
    }
}
