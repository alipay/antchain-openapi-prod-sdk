<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateDeviceDatamodelRequest extends Model
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

    // 数据模型
    /**
     * @var string
     */
    public $dataModel;

    // 数据模型名称
    /**
     * @var string
     */
    public $dataModelName;

    // 数据模型类别
    /**
     * @var string
     */
    public $bizType;

    // 用户自定义版本
    /**
     * @var string
     */
    public $customerVersion;

    // 是否转化为物模型，默认false
    /**
     * @var bool
     */
    public $transformThingModel;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'dataModel'           => 'data_model',
        'dataModelName'       => 'data_model_name',
        'bizType'             => 'biz_type',
        'customerVersion'     => 'customer_version',
        'transformThingModel' => 'transform_thing_model',
    ];

    public function validate()
    {
        Model::validateRequired('dataModel', $this->dataModel, true);
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
        if (null !== $this->dataModel) {
            $res['data_model'] = $this->dataModel;
        }
        if (null !== $this->dataModelName) {
            $res['data_model_name'] = $this->dataModelName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->customerVersion) {
            $res['customer_version'] = $this->customerVersion;
        }
        if (null !== $this->transformThingModel) {
            $res['transform_thing_model'] = $this->transformThingModel;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDeviceDatamodelRequest
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
        if (isset($map['data_model'])) {
            $model->dataModel = $map['data_model'];
        }
        if (isset($map['data_model_name'])) {
            $model->dataModelName = $map['data_model_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['customer_version'])) {
            $model->customerVersion = $map['customer_version'];
        }
        if (isset($map['transform_thing_model'])) {
            $model->transformThingModel = $map['transform_thing_model'];
        }

        return $model;
    }
}
