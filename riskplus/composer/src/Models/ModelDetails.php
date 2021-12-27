<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ModelDetails extends Model
{
    // 风险场景编码
    /**
     * @example scene_code
     *
     * @var string
     */
    public $sceneCode;

    // 该风险场景的风险分值
    //
    /**
     * @example 90
     *
     * @var string
     */
    public $score;
    protected $_name = [
        'sceneCode' => 'scene_code',
        'score'     => 'score',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('score', $this->score, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ModelDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
