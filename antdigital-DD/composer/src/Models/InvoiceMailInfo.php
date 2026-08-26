<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class InvoiceMailInfo extends Model {
    protected $_name = [
        'pid' => 'pid',
        'name' => 'name',
        'country' => 'country',
        'email' => 'email',
        'telephone' => 'telephone',
        'province' => 'province',
        'city' => 'city',
        'countyDistrict' => 'county_district',
        'street' => 'street',
        'detailAddress' => 'detail_address',
        'bdEmail' => 'bd_email',
    ];
    public function validate() {
        Model::validateRequired('pid', $this->pid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('country', $this->country, true);
        Model::validateRequired('email', $this->email, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->pid) {
            $res['pid'] = $this->pid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->telephone) {
            $res['telephone'] = $this->telephone;
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
        if (null !== $this->bdEmail) {
            $res['bd_email'] = $this->bdEmail;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return InvoiceMailInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['pid'])){
            $model->pid = $map['pid'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['country'])){
            $model->country = $map['country'];
        }
        if(isset($map['email'])){
            $model->email = $map['email'];
        }
        if(isset($map['telephone'])){
            $model->telephone = $map['telephone'];
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
        if(isset($map['bd_email'])){
            $model->bdEmail = $map['bd_email'];
        }
        return $model;
    }
    // PID，指定发票邮寄地址归属的PID
    /**
     * @example 123
     * @var string
     */
    public $pid;

    // 联系人名字
    /**
     * @example 张三
     * @var string
     */
    public $name;

    // 国家
    /**
     * @example 中国
     * @var string
     */
    public $country;

    // 收件人邮箱
    /**
     * @example 715680094@qq.com
     * @var string
     */
    public $email;

    // 联系人电话
    /**
     * @example 17797768851
     * @var string
     */
    public $telephone;

    // 省份
    /**
     * @example 河南
     * @var string
     */
    public $province;

    // 城市
    /**
     * @example 郑州
     * @var string
     */
    public $city;

    // 区/县
    /**
     * @example 金水区
     * @var string
     */
    public $countyDistrict;

    // 街道
    /**
     * @example 良秀路街道
     * @var string
     */
    public $street;

    // 详细地址
    /**
     * @example 良秀路180号
     * @var string
     */
    public $detailAddress;

    // BD邮箱
    /**
     * @example 715680093@qq.com
     * @var string
     */
    public $bdEmail;

}
