<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ProposerObject extends Model
{
    // 申请人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $name;

    // 统一社会信用代码
    /**
     * @example 412702199812252774
     *
     * @var string
     */
    public $idNumber;

    // 联系电话
    /**
     * @example 13821212121
     *
     * @var string
     */
    public $phoneNumber;

    // 电子邮箱地址
    /**
     * @example 323232321@alibba-inc.com
     *
     * @var string
     */
    public $email;

    // 经营地址
    /**
     * @example 北京市朝阳区XX地址
     *
     * @var string
     */
    public $businessAddress;

    // 营业执照照片
    // fileKey 列表
    /**
     * @example 201906182149291c15e6c2d400fc3323b09f44a4e79bdf2db867a3fb9400a168de3325205519.txt
     *
     * @var string[]
     */
    public $idNumberFile;

    // 法定代表人姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $representativeName;

    // 法定代表人性别
    // 0: 男 1: 女
    /**
     * @example 0
     *
     * @var int
     */
    public $representativeSex;

    // 法定代表人身份证号码
    /**
     * @example 412702199812252774
     *
     * @var string
     */
    public $representativeIdNumber;

    // 法定代表人手机号码
    /**
     * @example 1383312323
     *
     * @var string
     */
    public $representativeMobileNumber;

    // 法定代表人代表身份证明
    // fileKey 列表
    /**
     * @example 201906182149291c15e6c2d400fc3323b09f44a4e79bdf2db867a3fb9400a168de3325205519.txt
     *
     * @var string[]
     */
    public $representativeIdNumberFile;

    // 法定代表人职务
    /**
     * @example 经理
     *
     * @var string
     */
    public $representativePost;

    // 法定代表人职务证明
    // fileKey 列表
    /**
     * @example 201906182149291c15e6c2d400fc3323b09f44a4e79bdf2db867a3fb9400a168de3325205519.txt
     *
     * @var string[]
     */
    public $representativePostFile;

    // 签章管理员姓名
    /**
     * @example 李四
     *
     * @var string
     */
    public $signatureManagerName;

    // 签章管理员身份证号码
    /**
     * @example 412702199812252774
     *
     * @var string
     */
    public $signatureManagerIdCard;

    // 签章管理员手机号码
    /**
     * @example 13812123232
     *
     * @var string
     */
    public $signatureManagerPhone;
    protected $_name = [
        'name'                       => 'name',
        'idNumber'                   => 'id_number',
        'phoneNumber'                => 'phone_number',
        'email'                      => 'email',
        'businessAddress'            => 'business_address',
        'idNumberFile'               => 'id_number_file',
        'representativeName'         => 'representative_name',
        'representativeSex'          => 'representative_sex',
        'representativeIdNumber'     => 'representative_id_number',
        'representativeMobileNumber' => 'representative_mobile_number',
        'representativeIdNumberFile' => 'representative_id_number_file',
        'representativePost'         => 'representative_post',
        'representativePostFile'     => 'representative_post_file',
        'signatureManagerName'       => 'signature_manager_name',
        'signatureManagerIdCard'     => 'signature_manager_id_card',
        'signatureManagerPhone'      => 'signature_manager_phone',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('idNumber', $this->idNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->businessAddress) {
            $res['business_address'] = $this->businessAddress;
        }
        if (null !== $this->idNumberFile) {
            $res['id_number_file'] = $this->idNumberFile;
        }
        if (null !== $this->representativeName) {
            $res['representative_name'] = $this->representativeName;
        }
        if (null !== $this->representativeSex) {
            $res['representative_sex'] = $this->representativeSex;
        }
        if (null !== $this->representativeIdNumber) {
            $res['representative_id_number'] = $this->representativeIdNumber;
        }
        if (null !== $this->representativeMobileNumber) {
            $res['representative_mobile_number'] = $this->representativeMobileNumber;
        }
        if (null !== $this->representativeIdNumberFile) {
            $res['representative_id_number_file'] = $this->representativeIdNumberFile;
        }
        if (null !== $this->representativePost) {
            $res['representative_post'] = $this->representativePost;
        }
        if (null !== $this->representativePostFile) {
            $res['representative_post_file'] = $this->representativePostFile;
        }
        if (null !== $this->signatureManagerName) {
            $res['signature_manager_name'] = $this->signatureManagerName;
        }
        if (null !== $this->signatureManagerIdCard) {
            $res['signature_manager_id_card'] = $this->signatureManagerIdCard;
        }
        if (null !== $this->signatureManagerPhone) {
            $res['signature_manager_phone'] = $this->signatureManagerPhone;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProposerObject
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['business_address'])) {
            $model->businessAddress = $map['business_address'];
        }
        if (isset($map['id_number_file'])) {
            if (!empty($map['id_number_file'])) {
                $model->idNumberFile = $map['id_number_file'];
            }
        }
        if (isset($map['representative_name'])) {
            $model->representativeName = $map['representative_name'];
        }
        if (isset($map['representative_sex'])) {
            $model->representativeSex = $map['representative_sex'];
        }
        if (isset($map['representative_id_number'])) {
            $model->representativeIdNumber = $map['representative_id_number'];
        }
        if (isset($map['representative_mobile_number'])) {
            $model->representativeMobileNumber = $map['representative_mobile_number'];
        }
        if (isset($map['representative_id_number_file'])) {
            if (!empty($map['representative_id_number_file'])) {
                $model->representativeIdNumberFile = $map['representative_id_number_file'];
            }
        }
        if (isset($map['representative_post'])) {
            $model->representativePost = $map['representative_post'];
        }
        if (isset($map['representative_post_file'])) {
            if (!empty($map['representative_post_file'])) {
                $model->representativePostFile = $map['representative_post_file'];
            }
        }
        if (isset($map['signature_manager_name'])) {
            $model->signatureManagerName = $map['signature_manager_name'];
        }
        if (isset($map['signature_manager_id_card'])) {
            $model->signatureManagerIdCard = $map['signature_manager_id_card'];
        }
        if (isset($map['signature_manager_phone'])) {
            $model->signatureManagerPhone = $map['signature_manager_phone'];
        }

        return $model;
    }
}
