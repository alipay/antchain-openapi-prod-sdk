<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class AntSignUserInfoRequest extends Model
{
    // signUserId
    /**
     * @example signUserId
     *
     * @var string
     */
    public $signUserId;

    // 是否为我方（蚂蚁域）公司
    /**
     * @example true, false
     *
     * @var bool
     */
    public $ourCorp;

    // 签署文件列表（包含印模和签署区域）
    /**
     * @example
     *
     * @var CaSystemSignFileRequest[]
     */
    public $caSystemSignFileRequestList;

    // 用户类型
    /**
     * @example PERSON：个人 ORG：机构
     *
     * @var string
     */
    public $signUserType;

    // 签署人名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $signerName;

    // 签署人证件类型
    /**
     * @example CRED_PSN_CH_IDCARD：大陆身份证 CRED_ORG_USCC：统一社会信用代码
     *
     * @var string
     */
    public $signerCertType;

    // 签署人证件号码
    /**
     * @example 4201212121212121
     *
     * @var string
     */
    public $signerCertNumber;

    // 企业子类型
    /**
     * @example 企业子类型
     *
     * @var string
     */
    public $signSubType;

    // 签署方联系手机号
    /**
     * @example 12313124112
     *
     * @var string
     */
    public $mobile;

    // 邮件联系地址
    /**
     * @example 1212121@163.com
     *
     * @var string
     */
    public $email;

    // 签署顺序
    /**
     * @example -1
     *
     * @var int
     */
    public $order;

    // 是否自动签署
    // true：自动签署需传递坐标信息
    // false：非自动签署，不需要传递坐标信息，签署文件会发送给签署方签署
    /**
     * @example true, false
     *
     * @var bool
     */
    public $autoSign;

    // 签署方签署操作人签署时支持的印章来源类型目前支持上传公章(UPLOAD)、手写签名(PERSONAL)
    /**
     * @example ["UPLOAD","PERSONAL"]
     *
     * @var string[]
     */
    public $sealSourceTypes;
    protected $_name = [
        'signUserId'                  => 'sign_user_id',
        'ourCorp'                     => 'our_corp',
        'caSystemSignFileRequestList' => 'ca_system_sign_file_request_list',
        'signUserType'                => 'sign_user_type',
        'signerName'                  => 'signer_name',
        'signerCertType'              => 'signer_cert_type',
        'signerCertNumber'            => 'signer_cert_number',
        'signSubType'                 => 'sign_sub_type',
        'mobile'                      => 'mobile',
        'email'                       => 'email',
        'order'                       => 'order',
        'autoSign'                    => 'auto_sign',
        'sealSourceTypes'             => 'seal_source_types',
    ];

    public function validate()
    {
        Model::validateRequired('ourCorp', $this->ourCorp, true);
        Model::validateRequired('caSystemSignFileRequestList', $this->caSystemSignFileRequestList, true);
        Model::validateRequired('signUserType', $this->signUserType, true);
        Model::validateRequired('signerName', $this->signerName, true);
        Model::validateRequired('signerCertType', $this->signerCertType, true);
        Model::validateRequired('signerCertNumber', $this->signerCertNumber, true);
        Model::validateRequired('autoSign', $this->autoSign, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->signUserId) {
            $res['sign_user_id'] = $this->signUserId;
        }
        if (null !== $this->ourCorp) {
            $res['our_corp'] = $this->ourCorp;
        }
        if (null !== $this->caSystemSignFileRequestList) {
            $res['ca_system_sign_file_request_list'] = [];
            if (null !== $this->caSystemSignFileRequestList && \is_array($this->caSystemSignFileRequestList)) {
                $n = 0;
                foreach ($this->caSystemSignFileRequestList as $item) {
                    $res['ca_system_sign_file_request_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
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
        if (null !== $this->sealSourceTypes) {
            $res['seal_source_types'] = $this->sealSourceTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AntSignUserInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sign_user_id'])) {
            $model->signUserId = $map['sign_user_id'];
        }
        if (isset($map['our_corp'])) {
            $model->ourCorp = $map['our_corp'];
        }
        if (isset($map['ca_system_sign_file_request_list'])) {
            if (!empty($map['ca_system_sign_file_request_list'])) {
                $model->caSystemSignFileRequestList = [];
                $n                                  = 0;
                foreach ($map['ca_system_sign_file_request_list'] as $item) {
                    $model->caSystemSignFileRequestList[$n++] = null !== $item ? CaSystemSignFileRequest::fromMap($item) : $item;
                }
            }
        }
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
        if (isset($map['seal_source_types'])) {
            if (!empty($map['seal_source_types'])) {
                $model->sealSourceTypes = $map['seal_source_types'];
            }
        }

        return $model;
    }
}
