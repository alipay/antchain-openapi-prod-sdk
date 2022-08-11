<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_4b3196fa612148cd8407b20f4e5ed132\Models;

use AlibabaCloud\Tea\Model;

class Person extends Model
{
    // 身份证地址
    /**
     * @example xx省xx市xx区xx街道xx133号
     *
     * @var string
     */
    public $address;

    // 居民身份证号
    /**
     * @example 330108******1231
     *
     * @var string
     */
    public $certNo;

    // 证件类型,比如：ID_CARD=身份证
    /**
     * @example ID_CARD
     *
     * @var string
     */
    public $certType;

    // 客户编号
    /**
     * @example 20200810001220010000000000000001
     *
     * @var string
     */
    public $cmNo;

    // 电子邮箱
    /**
     * @example xx@xx.com
     *
     * @var string
     */
    public $email;

    // 证件反面照片oss存储路径
    /**
     * @example bk-ningbo/20200810001220080000000000000001/absdfs.jpg
     *
     * @var string
     */
    public $certBackPicOssKey;

    // 证件正面照片OSS存储路径
    /**
     * @example bk-ningbo/20200810001220080000000000000001/absdfs.jpg
     *
     * @var string
     */
    public $certFrontPicOssKey;

    // 手机号
    /**
     * @example 135****2323
     *
     * @var string
     */
    public $mobile;

    // 客户姓名
    /**
     * @example 成吉思汗
     *
     * @var string
     */
    public $name;

    // 身份证所在地邮编
    /**
     * @example 310051
     *
     * @var string
     */
    public $postCode;
    protected $_name = [
        'address'            => 'address',
        'certNo'             => 'cert_no',
        'certType'           => 'cert_type',
        'cmNo'               => 'cm_no',
        'email'              => 'email',
        'certBackPicOssKey'  => 'cert_back_pic_oss_key',
        'certFrontPicOssKey' => 'cert_front_pic_oss_key',
        'mobile'             => 'mobile',
        'name'               => 'name',
        'postCode'           => 'post_code',
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->cmNo) {
            $res['cm_no'] = $this->cmNo;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->certBackPicOssKey) {
            $res['cert_back_pic_oss_key'] = $this->certBackPicOssKey;
        }
        if (null !== $this->certFrontPicOssKey) {
            $res['cert_front_pic_oss_key'] = $this->certFrontPicOssKey;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->postCode) {
            $res['post_code'] = $this->postCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Person
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cm_no'])) {
            $model->cmNo = $map['cm_no'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['cert_back_pic_oss_key'])) {
            $model->certBackPicOssKey = $map['cert_back_pic_oss_key'];
        }
        if (isset($map['cert_front_pic_oss_key'])) {
            $model->certFrontPicOssKey = $map['cert_front_pic_oss_key'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['post_code'])) {
            $model->postCode = $map['post_code'];
        }

        return $model;
    }
}
