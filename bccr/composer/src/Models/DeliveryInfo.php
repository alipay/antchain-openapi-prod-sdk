<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class DeliveryInfo extends Model
{
    // 收件人姓名
    /**
     * @example 这是一个姓名
     *
     * @var string
     */
    public $receiveName;

    // 联系电话
    /**
     * @example 13000000000
     *
     * @var string
     */
    public $contact;

    // 省（需要接收纸质文件时必填）
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $province;

    // 市（需要接收纸质文件时必填）
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $city;

    // 区（需要接收纸质文件时必填）
    /**
     * @example 西湖区
     *
     * @var string
     */
    public $area;

    // 详细地址（需要接收纸质文件时必填）
    /**
     * @example 黄龙时代广场
     *
     * @var string
     */
    public $address;

    // 电子邮箱（需要接收电子文件时必填）
    /**
     * @example xxx@xx.com
     *
     * @var string
     */
    public $email;
    protected $_name = [
        'receiveName' => 'receive_name',
        'contact'     => 'contact',
        'province'    => 'province',
        'city'        => 'city',
        'area'        => 'area',
        'address'     => 'address',
        'email'       => 'email',
    ];

    public function validate()
    {
        Model::validateRequired('receiveName', $this->receiveName, true);
        Model::validateRequired('contact', $this->contact, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->receiveName) {
            $res['receive_name'] = $this->receiveName;
        }
        if (null !== $this->contact) {
            $res['contact'] = $this->contact;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->area) {
            $res['area'] = $this->area;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeliveryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['receive_name'])) {
            $model->receiveName = $map['receive_name'];
        }
        if (isset($map['contact'])) {
            $model->contact = $map['contact'];
        }
        if (isset($map['province'])) {
            $model->province = $map['province'];
        }
        if (isset($map['city'])) {
            $model->city = $map['city'];
        }
        if (isset($map['area'])) {
            $model->area = $map['area'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }

        return $model;
    }
}
