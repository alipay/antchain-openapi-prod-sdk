<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryTwcNotaryLeaseOrderinfoRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'applicationId' => 'application_id',
        'leaseId' => 'lease_id',
        'orderId' => 'order_id',
        'phaseInfo' => 'phase_info',
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->phaseInfo) {
            $res['phase_info'] = $this->phaseInfo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryTwcNotaryLeaseOrderinfoRequest
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
        if(isset($map['application_id'])){
            $model->applicationId = $map['application_id'];
        }
        if(isset($map['lease_id'])){
            $model->leaseId = $map['lease_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['phase_info'])){
            $model->phaseInfo = $map['phase_info'];
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

    // 融资租赁业务id，由资方控制台生成返回
    /**
     * @var string
     */
    public $applicationId;

    // 租赁平台金融科技租户id
    /**
     * @var string
     */
    public $leaseId;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 阶段描述
    /**
     * @var string
     */
    public $phaseInfo;

}
