<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class Bank extends Model
{
    // 地址
    /**
     * @example xx省xx市xx区xx街道xx路xx号
     *
     * @var string
     */
    public $address;

    // 银行编号
    /**
     * @example 20200810001220030000000000000001
     *
     * @var string
     */
    public $bankNo;

    // 法人证件号
    /**
     * @example 330108******1234
     *
     * @var string
     */
    public $legalPersonCertNo;

    // 法人手机号
    /**
     * @example 135****2323
     *
     * @var string
     */
    public $legalPersonMobile;

    // 法人姓名
    /**
     * @example 成吉思汗
     *
     * @var string
     */
    public $legalPersonName;

    // 行内级别，比如：SUB_BRANCH=支行
    /**
     * @example SUB_BRANCH
     *
     * @var string
     */
    public $level;

    // 蚂蚁智能合同的机构id
    /**
     * @example 23343431
     *
     * @var string
     */
    public $mycOrgId;

    // 银行名称
    /**
     * @example XX银行股份有限公司
     *
     * @var string
     */
    public $name;

    // OSS存储跟路径
    /**
     * @example bk-ningbo
     *
     * @var string
     */
    public $ossBaseFold;

    // 银行证件号
    /**
     * @example 1943331213
     *
     * @var string
     */
    public $certNo;

    // 上级行号，比如支行对应的分行
    /**
     * @example 20200810001220030000000000000002
     *
     * @var string
     */
    public $parentBankNo;

    // 蚂蚁链隐私数据网络的身份id
    /**
     * @example 668fa851746fdf358c5f96efe87d07178b49b17c143e06a659c368e83de2027e
     *
     * @var string
     */
    public $pdnDid;

    // 公钥
    /**
     * @example 668fa851746fdf358c5f96efe87d07178b49b17c143e06a659c368e83de2027e
     *
     * @var string
     */
    public $pubKey;

    // 租户ID
    /**
     * @example TNBNKQCN
     *
     * @var string
     */
    public $tenantId;

    // 法人证件类型，比如：ID_CARD=身份证
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $legalPersonCertType;

    // 授权合同签署后小程序端的回跳地址
    /**
     * @example http://x.x.x.x/x
     *
     * @var string
     */
    public $authCallbackUrl;

    // 抵押登记相关合同签署后小程序端的回跳地址
    /**
     * @example https://x.x.x.x/x
     *
     * @var string
     */
    public $mgCallbackUrl;

    // 银行接收房产链通知接口地址
    /**
     * @example http://x.x.x.x/x
     *
     * @var string
     */
    public $bkCallbackUrl;

    // 银行证件类型
    /**
     * @example UNIFIED_SOCIAL_CODE
     *
     * @var string
     */
    public $certType;
    protected $_name = [
        'address'             => 'address',
        'bankNo'              => 'bank_no',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'legalPersonMobile'   => 'legal_person_mobile',
        'legalPersonName'     => 'legal_person_name',
        'level'               => 'level',
        'mycOrgId'            => 'myc_org_id',
        'name'                => 'name',
        'ossBaseFold'         => 'oss_base_fold',
        'certNo'              => 'cert_no',
        'parentBankNo'        => 'parent_bank_no',
        'pdnDid'              => 'pdn_did',
        'pubKey'              => 'pub_key',
        'tenantId'            => 'tenant_id',
        'legalPersonCertType' => 'legal_person_cert_type',
        'authCallbackUrl'     => 'auth_callback_url',
        'mgCallbackUrl'       => 'mg_callback_url',
        'bkCallbackUrl'       => 'bk_callback_url',
        'certType'            => 'cert_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->bankNo) {
            $res['bank_no'] = $this->bankNo;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonMobile) {
            $res['legal_person_mobile'] = $this->legalPersonMobile;
        }
        if (null !== $this->legalPersonName) {
            $res['legal_person_name'] = $this->legalPersonName;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->mycOrgId) {
            $res['myc_org_id'] = $this->mycOrgId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->ossBaseFold) {
            $res['oss_base_fold'] = $this->ossBaseFold;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->parentBankNo) {
            $res['parent_bank_no'] = $this->parentBankNo;
        }
        if (null !== $this->pdnDid) {
            $res['pdn_did'] = $this->pdnDid;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->authCallbackUrl) {
            $res['auth_callback_url'] = $this->authCallbackUrl;
        }
        if (null !== $this->mgCallbackUrl) {
            $res['mg_callback_url'] = $this->mgCallbackUrl;
        }
        if (null !== $this->bkCallbackUrl) {
            $res['bk_callback_url'] = $this->bkCallbackUrl;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Bank
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['bank_no'])) {
            $model->bankNo = $map['bank_no'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_mobile'])) {
            $model->legalPersonMobile = $map['legal_person_mobile'];
        }
        if (isset($map['legal_person_name'])) {
            $model->legalPersonName = $map['legal_person_name'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['myc_org_id'])) {
            $model->mycOrgId = $map['myc_org_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['oss_base_fold'])) {
            $model->ossBaseFold = $map['oss_base_fold'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['parent_bank_no'])) {
            $model->parentBankNo = $map['parent_bank_no'];
        }
        if (isset($map['pdn_did'])) {
            $model->pdnDid = $map['pdn_did'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['auth_callback_url'])) {
            $model->authCallbackUrl = $map['auth_callback_url'];
        }
        if (isset($map['mg_callback_url'])) {
            $model->mgCallbackUrl = $map['mg_callback_url'];
        }
        if (isset($map['bk_callback_url'])) {
            $model->bkCallbackUrl = $map['bk_callback_url'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }

        return $model;
    }
}
