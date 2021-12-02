<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class CreateModelrelationshipRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 目标模型的唯一标识
    /**
     * @var string
     */
    public $destinationModelId;

    // 源模型的唯一标识（目标模型内唯一）
    /**
     * @var string
     */
    public $sourceModelId;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
    /**
     * @var string
     */
    public $relationType;
    protected $_name = [
        'authToken'          => 'auth_token',
        'destinationModelId' => 'destination_model_id',
        'sourceModelId'      => 'source_model_id',
        'description'        => 'description',
        'relationType'       => 'relation_type',
    ];

    public function validate()
    {
        Model::validateRequired('destinationModelId', $this->destinationModelId, true);
        Model::validateRequired('sourceModelId', $this->sourceModelId, true);
        Model::validateRequired('relationType', $this->relationType, true);
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->relationType) {
            $res['relation_type'] = $this->relationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateModelrelationshipRequest
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
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['relation_type'])) {
            $model->relationType = $map['relation_type'];
        }

        return $model;
    }
}
