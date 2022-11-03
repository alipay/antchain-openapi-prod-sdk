<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class UmktInfoModel extends Model
{
    // 场景策略id
    /**
     * @example 1
     *
     * @var int
     */
    public $sceneStrategyId;

    // 实时营销结果
    /**
     * @example 1
     *
     * @var int
     */
    public $umktResult;

    // json 结构的营销额外输出信息
    /**
     * @example {"f_01":"95.0"}
     *
     * @var string
     */
    public $umktOutPutInfo;
    protected $_name = [
        'sceneStrategyId' => 'scene_strategy_id',
        'umktResult'      => 'umkt_result',
        'umktOutPutInfo'  => 'umkt_out_put_info',
    ];

    public function validate()
    {
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('umktResult', $this->umktResult, true);
        Model::validateRequired('umktOutPutInfo', $this->umktOutPutInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->umktResult) {
            $res['umkt_result'] = $this->umktResult;
        }
        if (null !== $this->umktOutPutInfo) {
            $res['umkt_out_put_info'] = $this->umktOutPutInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UmktInfoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['umkt_result'])) {
            $model->umktResult = $map['umkt_result'];
        }
        if (isset($map['umkt_out_put_info'])) {
            $model->umktOutPutInfo = $map['umkt_out_put_info'];
        }

        return $model;
    }
}
