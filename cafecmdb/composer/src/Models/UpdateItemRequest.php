<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class UpdateItemRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // id
    /**
     * @var string
     */
    public $id;

    // model_id
    /**
     * @var string
     */
    public $modelId;

    // 同创建的data
    /**
     * @var string
     */
    public $dataJson;
    protected $_name = [
        'authToken' => 'auth_token',
        'id'        => 'id',
        'modelId'   => 'model_id',
        'dataJson'  => 'data_json',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('dataJson', $this->dataJson, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->dataJson) {
            $res['data_json'] = $this->dataJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateItemRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['data_json'])) {
            $model->dataJson = $map['data_json'];
        }

        return $model;
    }
}
