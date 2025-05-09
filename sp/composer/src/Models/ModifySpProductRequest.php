<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class ModifySpProductRequest extends Model
{
    // OAuth模式下的授权token
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
    public $productAccessCode;

    // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
    /**
     * @var string
     */
    public $orderNo;

    // 产品码 全局唯一
    /**
     * @var string
     */
    public $productCode;

    // 产品实例Id
    /**
     * @var string
     */
    public $instanceId;

    // 具体规格配置信息（JSON格式）会按照key进行排序
    /**
     * @var string
     */
    public $specification;

    // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
    /**
     * @var string
     */
    public $accessCode;

    // 变配类型：
    // ONLY_SPECIFICATION只规格变配,
    // SPECIFICATION_AND_TIME 规格和时间同时变配
    /**
     * @var string
     */
    public $modifyType;

    // 变配新的开始时间。格式为UTC时间。
    // modify_type是SPECIFICATION_AND_TIME时，必填
    /**
     * @var string
     */
    public $newStartTime;

    // 变配新的结束时间。格式为UTC时间.
    // modify_type是SPECIFICATION_AND_TIME时，必填
    /**
     * @var string
     */
    public $newEndTime;

    // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等
    /**
     * @var string
     */
    public $businessData;

    // 具体规格配置信息（JSON格式）会按照key进行排序。
    // 此字段传入的是变配前的老规格信息。
    /**
     * @var string
     */
    public $oldSpecification;

    // 具体规格配置信息（JSON格式）会按照key进行排序.
    // 传入新的规格信息，包括在新的规格中不存在，但是老的规格中有的kv。
    /**
     * @var string
     */
    public $newSpecification;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productAccessCode' => 'product_access_code',
        'orderNo'           => 'order_no',
        'productCode'       => 'product_code',
        'instanceId'        => 'instance_id',
        'specification'     => 'specification',
        'accessCode'        => 'access_code',
        'modifyType'        => 'modify_type',
        'newStartTime'      => 'new_start_time',
        'newEndTime'        => 'new_end_time',
        'businessData'      => 'business_data',
        'oldSpecification'  => 'old_specification',
        'newSpecification'  => 'new_specification',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('specification', $this->specification, true);
        Model::validateRequired('accessCode', $this->accessCode, true);
        Model::validateRequired('modifyType', $this->modifyType, true);
        Model::validateMaxLength('orderNo', $this->orderNo, 64);
        Model::validateMaxLength('productCode', $this->productCode, 20);
        Model::validateMaxLength('instanceId', $this->instanceId, 50);
        Model::validateMaxLength('accessCode', $this->accessCode, 24);
        Model::validateMaxLength('modifyType', $this->modifyType, 32);
        Model::validateMinLength('orderNo', $this->orderNo, 32);
        Model::validateMinLength('productCode', $this->productCode, 3);
        Model::validateMinLength('instanceId', $this->instanceId, 20);
        Model::validateMinLength('accessCode', $this->accessCode, 3);
        Model::validateMinLength('modifyType', $this->modifyType, 4);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productAccessCode) {
            $res['product_access_code'] = $this->productAccessCode;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->specification) {
            $res['specification'] = $this->specification;
        }
        if (null !== $this->accessCode) {
            $res['access_code'] = $this->accessCode;
        }
        if (null !== $this->modifyType) {
            $res['modify_type'] = $this->modifyType;
        }
        if (null !== $this->newStartTime) {
            $res['new_start_time'] = $this->newStartTime;
        }
        if (null !== $this->newEndTime) {
            $res['new_end_time'] = $this->newEndTime;
        }
        if (null !== $this->businessData) {
            $res['business_data'] = $this->businessData;
        }
        if (null !== $this->oldSpecification) {
            $res['old_specification'] = $this->oldSpecification;
        }
        if (null !== $this->newSpecification) {
            $res['new_specification'] = $this->newSpecification;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModifySpProductRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['product_access_code'])) {
            $model->productAccessCode = $map['product_access_code'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['specification'])) {
            $model->specification = $map['specification'];
        }
        if (isset($map['access_code'])) {
            $model->accessCode = $map['access_code'];
        }
        if (isset($map['modify_type'])) {
            $model->modifyType = $map['modify_type'];
        }
        if (isset($map['new_start_time'])) {
            $model->newStartTime = $map['new_start_time'];
        }
        if (isset($map['new_end_time'])) {
            $model->newEndTime = $map['new_end_time'];
        }
        if (isset($map['business_data'])) {
            $model->businessData = $map['business_data'];
        }
        if (isset($map['old_specification'])) {
            $model->oldSpecification = $map['old_specification'];
        }
        if (isset($map['new_specification'])) {
            $model->newSpecification = $map['new_specification'];
        }

        return $model;
    }
}
