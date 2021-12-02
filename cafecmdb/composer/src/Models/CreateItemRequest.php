<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class CreateItemRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // model_id
    /**
     * @var string
     */
    public $modelId;

    // name
    /**
     * @var string
     */
    public $name;

    // id
    /**
     * @var string
     */
    public $id;

    // 注意，data_json是一个MAP<String,Object>，但OP不支持MAP，，用户需要用Json序列化成字符串。不正确的格式将会报错
    /**
     * @var string
     */
    public $dataJson;
    protected $_name = [
        'authToken' => 'auth_token',
        'modelId'   => 'model_id',
        'name'      => 'name',
        'id'        => 'id',
        'dataJson'  => 'data_json',
    ];

    public function validate()
    {
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('dataJson', $this->dataJson, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->dataJson) {
            $res['data_json'] = $this->dataJson;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateItemRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['data_json'])) {
            $model->dataJson = $map['data_json'];
        }

        return $model;
    }
}
