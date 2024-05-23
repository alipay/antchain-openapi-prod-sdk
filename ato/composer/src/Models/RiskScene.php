<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RiskScene extends Model
{
    // 风险场景编码
    /**
     * @example 风险场景编码
     *
     * @var string
     */
    public $sceneCode;

    // 该场景的风险决策结果
    /**
     * @example 该场景的风险决策结果
     *
     * @var string
     */
    public $decision;
    protected $_name = [
        'sceneCode' => 'scene_code',
        'decision'  => 'decision',
    ];

    public function validate()
    {
        Model::validateRequired('sceneCode', $this->sceneCode, true);
        Model::validateRequired('decision', $this->decision, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskScene
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }

        return $model;
    }
}
