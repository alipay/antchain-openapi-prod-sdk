<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ReplenishInfo extends Model {
    protected $_name = [
        'customName' => 'custom_name',
        'mobile' => 'mobile',
        'province' => 'province',
        'city' => 'city',
        'area' => 'area',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->customName) {
            $res['custom_name'] = $this->customName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
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
        return $res;
    }
    /**
     * @param array $map
     * @return ReplenishInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['custom_name'])){
            $model->customName = $map['custom_name'];
        }
        if(isset($map['mobile'])){
            $model->mobile = $map['mobile'];
        }
        if(isset($map['province'])){
            $model->province = $map['province'];
        }
        if(isset($map['city'])){
            $model->city = $map['city'];
        }
        if(isset($map['area'])){
            $model->area = $map['area'];
        }
        return $model;
    }
    // 客户姓名
    /**
     * @example 张三
     * @var string
     */
    public $customName;

    // 手机号
    /**
     * @example 13800000000
     * @var string
     */
    public $mobile;

    // 省份
    /**
     * @example 浙江省
     * @var string
     */
    public $province;

    // 城市
    /**
     * @example 杭州市
     * @var string
     */
    public $city;

    // 地区名称
    /**
     * @example 滨江区
     * @var string
     */
    public $area;

}
