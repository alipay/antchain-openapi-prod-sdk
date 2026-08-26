<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ApplyInvoiceDelivery extends Model {
    protected $_name = [
        'deliveryType' => 'delivery_type',
        'pid' => 'pid',
        'name' => 'name',
        'telephone' => 'telephone',
        'country' => 'country',
        'province' => 'province',
        'city' => 'city',
        'countyDistrict' => 'county_district',
        'street' => 'street',
        'detailAddress' => 'detail_address',
        'email' => 'email',
    ];
    public function validate() {
        Model::validateRequired('pid', $this->pid, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->deliveryType) {
            $res['delivery_type'] = $this->deliveryType;
        }
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        if (null !== $this->countyDistrict) {
            $res['county_district'] = $this->countyDistrict;
        }
        if (null !== $this->street) {
            $res['street'] = $this->street;
        }
        if (null !== $this->detailAddress) {
            $res['detail_address'] = $this->detailAddress;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyInvoiceDelivery
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['delivery_type'])){
            $model->deliveryType = $map['delivery_type'];
        }
        if(isset($map['pid'])){
            $model->pid = $map['pid'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['telephone'])){
            $model->telephone = $map['telephone'];
        }
        if(isset($map['country'])){
            $model->country = $map['country'];
        }
        if(isset($map['province'])){
            $model->province = $map['province'];
        }
        if(isset($map['city'])){
            $model->city = $map['city'];
        }
        if(isset($map['county_district'])){
            $model->countyDistrict = $map['county_district'];
        }
        if(isset($map['street'])){
            $model->street = $map['street'];
        }
        if(isset($map['detail_address'])){
            $model->detailAddress = $map['detail_address'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        return $model;
    }
    // 寄送类型，如1表示快递，2表示email
    /**
     * @example 1
     * @var string
     */
    public $deliveryType;

    // 开票人PID
    /**
     * @example 2088720671581149
     * @var string
     */
    public $pid;

    // 收件人名称
    /**
     * @example 收件人名称
     * @var string
     */
    public $name;

    // 电话
    /**
     * @example 13987654321
     * @var string
     */
    public $telephone;

    // 国家
    /**
     * @example 中国
     * @var string
     */
    public $country;

    // 省份
    /**
     * @example 上海市
     * @var string
     */
    public $province;

    // 市
    /**
     * @example 上海市
     * @var string
     */
    public $city;

    // 区县
    /**
     * @example 黄浦区
     * @var string
     */
    public $countyDistrict;

    // 街道
    /**
     * @example 街道
     * @var string
     */
    public $street;

    // 详细地址
    /**
     * @example 外马路618号
     * @var string
     */
    public $detailAddress;

    // 收件人邮件
    /**
     * @example a@1.com
     * @var string
     */
    public $email;

}
