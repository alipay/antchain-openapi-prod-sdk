<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class CreateSpProductLogicinstanceRequest extends Model
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

    // 主产品实例唯一id
    /**
     * @var string
     */
    public $productInstanceUniqueId;

    // 逻辑实例唯一id
    /**
     * @var string
     */
    public $uniqueId;

    // 幂等号
    /**
     * @var string
     */
    public $outBizNo;

    // 账号Id
    /**
     * @var string
     */
    public $providerId;

    // ACTIVE
    /**
     * @var string
     */
    public $status;

    // 逻辑实例描述
    /**
     * @var string
     */
    public $description;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'               => 'auth_token',
        'productInstanceId'       => 'product_instance_id',
        'productAccessCode'       => 'product_access_code',
        'productInstanceUniqueId' => 'product_instance_unique_id',
        'uniqueId'                => 'unique_id',
        'outBizNo'                => 'out_biz_no',
        'providerId'              => 'provider_id',
        'status'                  => 'status',
        'description'             => 'description',
        'properties'              => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('productInstanceUniqueId', $this->productInstanceUniqueId, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('properties', $this->properties, true);
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
        if (null !== $this->productInstanceUniqueId) {
            $res['product_instance_unique_id'] = $this->productInstanceUniqueId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSpProductLogicinstanceRequest
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
        if (isset($map['product_instance_unique_id'])) {
            $model->productInstanceUniqueId = $map['product_instance_unique_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
