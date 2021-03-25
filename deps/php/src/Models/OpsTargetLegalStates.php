<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsTargetLegalStates extends Model {
    protected $_name = [
        'targetType' => 'target_type',
        'states' => 'states',
    ];
    public function validate() {
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('states', $this->states, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->states) {
            $res['states'] = $this->states;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsTargetLegalStates
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['target_type'])){
            $model->targetType = $map['target_type'];
        }
        if(isset($map['states'])){
            if(!empty($map['states'])){
                $model->states = $map['states'];
            }
        }
        return $model;
    }
    // 目标类型
    /**
     * @example aa
     * @var string
     */
    public $targetType;

    // 合法状态
    /**
     * @example 
     * @var string[]
     */
    public $states;

}
