<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class OpenCutpaymentsubAccountRequest extends Model
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

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
    /**
     * @var string
     */
    public $outerOrderNo;

    // 登录号，商户自定义，要求全局唯一，长度11位以上
    /**
     * @var string
     */
    public $loginNo;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 是否个体户企业为 false个体户为 true
    /**
     * @var bool
     */
    public $selfEmployed;

    // 商户名称（营业执照上的名称）
    /**
     * @var string
     */
    public $licenseName;

    // 营业执照号
    /**
     * @var string
     */
    public $licenseNo;

    // 法人姓名
    /**
     * @var string
     */
    public $certName;

    // 法人身份证号
    /**
     * @var string
     */
    public $certNo;

    // 法人手机号
    /**
     * @var string
     */
    public $mobile;

    // 公司所属行业
    /**
     * @var string
     */
    public $industryId;

    // 银行卡号
    /**
     * @var string
     */
    public $bankCard;

    // 银行名称
    /**
     * @var string
     */
    public $bankName;

    // 开户行省份
    /**
     * @var string
     */
    public $bankProvince;

    // 开户行城市
    /**
     * @var string
     */
    public $bankCity;

    // 开户支行名称
    /**
     * @var string
     */
    public $bankBranchName;

    // 持卡人姓名
    // 当开个体户且绑定对私卡时需传此字段,否则默认绑定对公卡
    /**
     * @var string
     */
    public $cardUserName;

    // 一级商户商户号
    /**
     * @var string
     */
    public $firstLevelMemberid;

    // 一级商户终端号
    /**
     * @var string
     */
    public $firstLevelTerminalid;

    // 扩展信息，预留字段
    /**
     * @var string
     */
    public $externParam;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'outerOrderNo'         => 'outer_order_no',
        'loginNo'              => 'login_no',
        'email'                => 'email',
        'selfEmployed'         => 'self_employed',
        'licenseName'          => 'license_name',
        'licenseNo'            => 'license_no',
        'certName'             => 'cert_name',
        'certNo'               => 'cert_no',
        'mobile'               => 'mobile',
        'industryId'           => 'industry_id',
        'bankCard'             => 'bank_card',
        'bankName'             => 'bank_name',
        'bankProvince'         => 'bank_province',
        'bankCity'             => 'bank_city',
        'bankBranchName'       => 'bank_branch_name',
        'cardUserName'         => 'card_user_name',
        'firstLevelMemberid'   => 'first_level_memberid',
        'firstLevelTerminalid' => 'first_level_terminalid',
        'externParam'          => 'extern_param',
    ];

    public function validate()
    {
        Model::validateRequired('outerOrderNo', $this->outerOrderNo, true);
        Model::validateRequired('loginNo', $this->loginNo, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('selfEmployed', $this->selfEmployed, true);
        Model::validateRequired('licenseName', $this->licenseName, true);
        Model::validateRequired('licenseNo', $this->licenseNo, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('industryId', $this->industryId, true);
        Model::validateRequired('bankCard', $this->bankCard, true);
        Model::validateRequired('bankName', $this->bankName, true);
        Model::validateRequired('bankProvince', $this->bankProvince, true);
        Model::validateRequired('bankCity', $this->bankCity, true);
        Model::validateRequired('bankBranchName', $this->bankBranchName, true);
        Model::validateRequired('firstLevelMemberid', $this->firstLevelMemberid, true);
        Model::validateRequired('firstLevelTerminalid', $this->firstLevelTerminalid, true);
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
        if (null !== $this->outerOrderNo) {
            $res['outer_order_no'] = $this->outerOrderNo;
        }
        if (null !== $this->loginNo) {
            $res['login_no'] = $this->loginNo;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->selfEmployed) {
            $res['self_employed'] = $this->selfEmployed;
        }
        if (null !== $this->licenseName) {
            $res['license_name'] = $this->licenseName;
        }
        if (null !== $this->licenseNo) {
            $res['license_no'] = $this->licenseNo;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->industryId) {
            $res['industry_id'] = $this->industryId;
        }
        if (null !== $this->bankCard) {
            $res['bank_card'] = $this->bankCard;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->bankProvince) {
            $res['bank_province'] = $this->bankProvince;
        }
        if (null !== $this->bankCity) {
            $res['bank_city'] = $this->bankCity;
        }
        if (null !== $this->bankBranchName) {
            $res['bank_branch_name'] = $this->bankBranchName;
        }
        if (null !== $this->cardUserName) {
            $res['card_user_name'] = $this->cardUserName;
        }
        if (null !== $this->firstLevelMemberid) {
            $res['first_level_memberid'] = $this->firstLevelMemberid;
        }
        if (null !== $this->firstLevelTerminalid) {
            $res['first_level_terminalid'] = $this->firstLevelTerminalid;
        }
        if (null !== $this->externParam) {
            $res['extern_param'] = $this->externParam;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenCutpaymentsubAccountRequest
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
        if (isset($map['outer_order_no'])) {
            $model->outerOrderNo = $map['outer_order_no'];
        }
        if (isset($map['login_no'])) {
            $model->loginNo = $map['login_no'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['self_employed'])) {
            $model->selfEmployed = $map['self_employed'];
        }
        if (isset($map['license_name'])) {
            $model->licenseName = $map['license_name'];
        }
        if (isset($map['license_no'])) {
            $model->licenseNo = $map['license_no'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['industry_id'])) {
            $model->industryId = $map['industry_id'];
        }
        if (isset($map['bank_card'])) {
            $model->bankCard = $map['bank_card'];
        }
        if (isset($map['bank_name'])) {
            $model->bankName = $map['bank_name'];
        }
        if (isset($map['bank_province'])) {
            $model->bankProvince = $map['bank_province'];
        }
        if (isset($map['bank_city'])) {
            $model->bankCity = $map['bank_city'];
        }
        if (isset($map['bank_branch_name'])) {
            $model->bankBranchName = $map['bank_branch_name'];
        }
        if (isset($map['card_user_name'])) {
            $model->cardUserName = $map['card_user_name'];
        }
        if (isset($map['first_level_memberid'])) {
            $model->firstLevelMemberid = $map['first_level_memberid'];
        }
        if (isset($map['first_level_terminalid'])) {
            $model->firstLevelTerminalid = $map['first_level_terminalid'];
        }
        if (isset($map['extern_param'])) {
            $model->externParam = $map['extern_param'];
        }

        return $model;
    }
}
