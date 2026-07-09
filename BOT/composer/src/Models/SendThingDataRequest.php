<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SendThingDataRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 上报数据模型ID
    /**
     * @var string
     */
    public $dataModelId;

    // 物模型数据集合
    /**
     * @var string[]
     */
    public $thingDataList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'dataModelId'       => 'data_model_id',
        'thingDataList'     => 'thing_data_list',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('dataModelId', $this->dataModelId, true);
        Model::validateRequired('thingDataList', $this->thingDataList, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }
        if (null !== $this->thingDataList) {
            $res['thing_data_list'] = $this->thingDataList;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendThingDataRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }
        if (isset($map['thing_data_list'])) {
            if (!empty($map['thing_data_list'])) {
                $model->thingDataList = $map['thing_data_list'];
            }
        }

        return $model;
    }
}
