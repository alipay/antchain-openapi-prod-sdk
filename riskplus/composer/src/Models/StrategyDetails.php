<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StrategyDetails extends Model
{
    // 策略id
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 策略名称
    /**
     * @example 策略名称
     *
     * @var string
     */
    public $name;

    // 决策结果
    /**
     * @example accept
     *
     * @var string
     */
    public $decision;

    // 场景码
    /**
     * @example scene_code
     *
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'id'        => 'id',
        'name'      => 'name',
        'decision'  => 'decision',
        'sceneCode' => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('decision', $this->decision, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
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
     * @return StrategyDetails
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
