<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class CheckPoint extends Model
{
    // 检查结果
    /**
     * @example VALID
     *
     * @var string
     */
    public $checkResult;

    // 检查点, 例如参数检查
    /**
     * @example PARAM
     *
     * @var string
     */
    public $checkPoint;

    // 非法原因
    /**
     * @example yunyoutest.solution.check.SolutionParamCheckBuilder.ParametersConflictOrThereNot
     *
     * @var string
     */
    public $invalidReason;
    protected $_name = [
        'checkResult'   => 'check_result',
        'checkPoint'    => 'check_point',
        'invalidReason' => 'invalid_reason',
    ];

    public function validate()
    {
        Model::validateRequired('checkResult', $this->checkResult, true);
        Model::validateRequired('checkPoint', $this->checkPoint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }
        if (null !== $this->checkPoint) {
            $res['check_point'] = $this->checkPoint;
        }
        if (null !== $this->invalidReason) {
            $res['invalid_reason'] = $this->invalidReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckPoint
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }
        if (isset($map['check_point'])) {
            $model->checkPoint = $map['check_point'];
        }
        if (isset($map['invalid_reason'])) {
            $model->invalidReason = $map['invalid_reason'];
        }

        return $model;
    }
}
