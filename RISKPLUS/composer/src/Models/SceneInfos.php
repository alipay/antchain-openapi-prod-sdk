<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class SceneInfos extends Model
{
    // 决策结果
    /**
     * @example accept
     *
     * @var string
     */
    public $decision;

    // 场景code
    /**
     * @example ANFAPP
     *
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'decision'  => 'decision',
        'sceneCode' => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('decision', $this->decision, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SceneInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
