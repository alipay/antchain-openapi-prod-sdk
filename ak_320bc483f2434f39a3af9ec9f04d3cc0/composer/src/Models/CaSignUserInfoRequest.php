<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class CaSignUserInfoRequest extends Model
{
    // 用户类型个人:PERSON 机构:ORG
    /**
     * @example PERSON
     *
     * @var string
     */
    public $signUserType;

    // 签署方名称，个人传真实姓名：张三 机构传机构正确的名称：xxx责任有限公司
    /**
     * @example 王小二
     *
     * @var string
     */
    public $signerName;

    // 授权签署时的签署人证件类型,签署方证件类型 CRED_PSN_CH_IDCARD(大陆身份证) CRED_ORG_USCC(统一社会信用代码)
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $signerCertType;

    // 签署方证件号码,签署方证件号码： 个人传递身份证件号 企业传递统一社会信用编码
    /**
     * @example 4301212199812121444
     *
     * @var string
     */
    public $signerCertNumber;

    // 企业子类型,signUserType为org时必选 企业子类型 * BUS("BUS", "企业"), * SINGLE("SINGLE", "个体工商户"), * GOV("GOV", "党政机关"), * INST("INST", "事业单位"), * COMMON("COMMON", "社会组织"), * OTHER("OTHER", "其他组织")
    /**
     * @example BUS
     *
     * @var string
     */
    public $signSubType;

    // 是否指定授权人签署
    /**
     * @example 1
     *
     * @var string
     */
    public $authorized;

    // authorized=1时必填,签署方名称
    /**
     * @example 王小二
     *
     * @var string
     */
    public $authSignerName;

    // authorized=1 时必填,授权签署时的签署人证件类型
    /**
     * @example CRED_PSN_CH_IDCARD
     *
     * @var string
     */
    public $authSignerCertType;

    // authorized=1 时必填,授权签署方证件号码
    /**
     * @example 4301212199812121444
     *
     * @var string
     */
    public $authSignerCertNumber;

    // 手机号，用于发送签署短信
    /**
     * @example 16777777777
     *
     * @var string
     */
    public $mobile;

    // 邮箱联系方式
    /**
     * @example xxx@qq.com
     *
     * @var string
     */
    public $email;

    // 签署顺序，默认-1无签署顺序
    /**
     * @example 1
     *
     * @var string
     */
    public $order;

    // 是否自动签署,ture为需要自动签署，false为手动签署
    /**
     * @example true
     *
     * @var bool
     */
    public $autoSign;

    // 签署文件列表（包含印模和签署区域）
    /**
     * @example
     *
     * @var CaSystemSignFileRequest[]
     */
    public $systemSignFileRequestList;
    protected $_name = [
        'signUserType'              => 'sign_user_type',
        'signerName'                => 'signer_name',
        'signerCertType'            => 'signer_cert_type',
        'signerCertNumber'          => 'signer_cert_number',
        'signSubType'               => 'sign_sub_type',
        'authorized'                => 'authorized',
        'authSignerName'            => 'auth_signer_name',
        'authSignerCertType'        => 'auth_signer_cert_type',
        'authSignerCertNumber'      => 'auth_signer_cert_number',
        'mobile'                    => 'mobile',
        'email'                     => 'email',
        'order'                     => 'order',
        'autoSign'                  => 'auto_sign',
        'systemSignFileRequestList' => 'system_sign_file_request_list',
    ];

    public function validate()
    {
        Model::validateRequired('signUserType', $this->signUserType, true);
        Model::validateRequired('signerName', $this->signerName, true);
        Model::validateRequired('signerCertType', $this->signerCertType, true);
        Model::validateRequired('signerCertNumber', $this->signerCertNumber, true);
        Model::validateRequired('autoSign', $this->autoSign, true);
        Model::validateRequired('systemSignFileRequestList', $this->systemSignFileRequestList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signUserType) {
            $res['sign_user_type'] = $this->signUserType;
        }
        if (null !== $this->signerName) {
            $res['signer_name'] = $this->signerName;
        }
        if (null !== $this->signerCertType) {
            $res['signer_cert_type'] = $this->signerCertType;
        }
        if (null !== $this->signerCertNumber) {
            $res['signer_cert_number'] = $this->signerCertNumber;
        }
        if (null !== $this->signSubType) {
            $res['sign_sub_type'] = $this->signSubType;
        }
        if (null !== $this->authorized) {
            $res['authorized'] = $this->authorized;
        }
        if (null !== $this->authSignerName) {
            $res['auth_signer_name'] = $this->authSignerName;
        }
        if (null !== $this->authSignerCertType) {
            $res['auth_signer_cert_type'] = $this->authSignerCertType;
        }
        if (null !== $this->authSignerCertNumber) {
            $res['auth_signer_cert_number'] = $this->authSignerCertNumber;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->autoSign) {
            $res['auto_sign'] = $this->autoSign;
        }
        if (null !== $this->systemSignFileRequestList) {
            $res['system_sign_file_request_list'] = [];
            if (null !== $this->systemSignFileRequestList && \is_array($this->systemSignFileRequestList)) {
                $n = 0;
                foreach ($this->systemSignFileRequestList as $item) {
                    $res['system_sign_file_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CaSignUserInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_user_type'])) {
            $model->signUserType = $map['sign_user_type'];
        }
        if (isset($map['signer_name'])) {
            $model->signerName = $map['signer_name'];
        }
        if (isset($map['signer_cert_type'])) {
            $model->signerCertType = $map['signer_cert_type'];
        }
        if (isset($map['signer_cert_number'])) {
            $model->signerCertNumber = $map['signer_cert_number'];
        }
        if (isset($map['sign_sub_type'])) {
            $model->signSubType = $map['sign_sub_type'];
        }
        if (isset($map['authorized'])) {
            $model->authorized = $map['authorized'];
        }
        if (isset($map['auth_signer_name'])) {
            $model->authSignerName = $map['auth_signer_name'];
        }
        if (isset($map['auth_signer_cert_type'])) {
            $model->authSignerCertType = $map['auth_signer_cert_type'];
        }
        if (isset($map['auth_signer_cert_number'])) {
            $model->authSignerCertNumber = $map['auth_signer_cert_number'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['auto_sign'])) {
            $model->autoSign = $map['auto_sign'];
        }
        if (isset($map['system_sign_file_request_list'])) {
            if (!empty($map['system_sign_file_request_list'])) {
                $model->systemSignFileRequestList = [];
                $n                                = 0;
                foreach ($map['system_sign_file_request_list'] as $item) {
                    $model->systemSignFileRequestList[$n++] = null !== $item ? CaSystemSignFileRequest::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
