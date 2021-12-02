<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class DeleteModelrelationshipRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 要删除的模型关联的目标模型的唯一标识
    /**
     * @var string
     */
    public $destinationModelId;

    // 要删除的模型关联的源模型的唯一标识
    /**
     * @var string
     */
    public $sourceModelId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'destinationModelId' => 'destination_model_id',
        'sourceModelId'      => 'source_model_id',
    ];

    public function validate()
    {
        Model::validateRequired('destinationModelId', $this->destinationModelId, true);
        Model::validateRequired('sourceModelId', $this->sourceModelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->destinationModelId) {
            $res['destination_model_id'] = $this->destinationModelId;
        }
        if (null !== $this->sourceModelId) {
            $res['source_model_id'] = $this->sourceModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteModelrelationshipRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['destination_model_id'])) {
            $model->destinationModelId = $map['destination_model_id'];
        }
        if (isset($map['source_model_id'])) {
            $model->sourceModelId = $map['source_model_id'];
        }

        return $model;
    }
}
