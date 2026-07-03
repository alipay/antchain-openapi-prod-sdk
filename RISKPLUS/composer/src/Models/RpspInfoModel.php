<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RpspInfoModel extends Model
{
    // 流量分层计划code
    /**
     * @example planCode1
     *
     * @var string
     */
    public $planCode;

    // 场景策略Id
    /**
     * @example 15000
     *
     * @var int
     */
    public $sceneStrategyId;

    // 客群分层结果
    /**
     * @example 1
     *
     * @var string
     */
    public $rpspResult;

    //
    // json 结构的营销额外输出信息
    /**
     * @example {"f_01":"95.0"}
     *
     * @var string
     */
    public $rpspOutPutInfo;
    protected $_name = [
        'planCode'        => 'plan_code',
        'sceneStrategyId' => 'scene_strategy_id',
        'rpspResult'      => 'rpsp_result',
        'rpspOutPutInfo'  => 'rpsp_out_put_info',
    ];

    public function validate()
    {
        Model::validateRequired('planCode', $this->planCode, true);
        Model::validateRequired('sceneStrategyId', $this->sceneStrategyId, true);
        Model::validateRequired('rpspResult', $this->rpspResult, true);
        Model::validateRequired('rpspOutPutInfo', $this->rpspOutPutInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->planCode) {
            $res['plan_code'] = $this->planCode;
        }
        if (null !== $this->sceneStrategyId) {
            $res['scene_strategy_id'] = $this->sceneStrategyId;
        }
        if (null !== $this->rpspResult) {
            $res['rpsp_result'] = $this->rpspResult;
        }
        if (null !== $this->rpspOutPutInfo) {
            $res['rpsp_out_put_info'] = $this->rpspOutPutInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RpspInfoModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['plan_code'])) {
            $model->planCode = $map['plan_code'];
        }
        if (isset($map['scene_strategy_id'])) {
            $model->sceneStrategyId = $map['scene_strategy_id'];
        }
        if (isset($map['rpsp_result'])) {
            $model->rpspResult = $map['rpsp_result'];
        }
        if (isset($map['rpsp_out_put_info'])) {
            $model->rpspOutPutInfo = $map['rpsp_out_put_info'];
        }

        return $model;
    }
}
