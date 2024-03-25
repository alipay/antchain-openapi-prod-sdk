<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ModelResult extends Model
{
    // 分数
    /**
     * @example 0.91
     *
     * @var string
     */
    public $score;

    // 模型id
    /**
     * @example 20230701_001
     *
     * @var string
     */
    public $modelId;
    protected $_name = [
        'score'   => 'score',
        'modelId' => 'model_id',
    ];

    public function validate()
    {
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('modelId', $this->modelId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModelResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }

        return $model;
    }
}
