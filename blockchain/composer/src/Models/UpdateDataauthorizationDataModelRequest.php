<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class UpdateDataauthorizationDataModelRequest extends Model
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

    // 数据模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 数据模型描述
    /**
     * @var string
     */
    public $description;

    // 模型字段详细信息
    /**
     * @var string
     */
    public $fieldDetail;

    // 模型业务ID
    /**
     * @var string
     */
    public $modelBizId;

    // 数据模型名称
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataModelId'       => 'data_model_id',
        'description'       => 'description',
        'fieldDetail'       => 'field_detail',
        'modelBizId'        => 'model_biz_id',
        'name'              => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('fieldDetail', $this->fieldDetail, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->fieldDetail) {
            $res['field_detail'] = $this->fieldDetail;
        }
        if (null !== $this->modelBizId) {
            $res['model_biz_id'] = $this->modelBizId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDataauthorizationDataModelRequest
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
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['field_detail'])) {
            $model->fieldDetail = $map['field_detail'];
        }
        if (isset($map['model_biz_id'])) {
            $model->modelBizId = $map['model_biz_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
