<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryTwcNotaryLeaseIotinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'endTime' => 'end_time',
        'productImeiId' => 'product_imei_id',
        'startTime' => 'start_time',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->productImeiId) {
            $res['product_imei_id'] = $this->productImeiId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTwcNotaryLeaseIotinfoRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['end_time'])){
            $model->endTime = $map['end_time'];
        }
        if(isset($map['product_imei_id'])){
            $model->productImeiId = $map['product_imei_id'];
        }
        if(isset($map['start_time'])){
            $model->startTime = $map['start_time'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 查询截止时间
    /**
     * @var string
     */
    public $endTime;

    // 设备唯一id imei id
    /**
     * @var string
     */
    public $productImeiId;

    // 查询开启时间
    /**
     * @var string
     */
    public $startTime;

}
