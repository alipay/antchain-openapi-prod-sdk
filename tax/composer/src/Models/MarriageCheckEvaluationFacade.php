<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAX\Models;

use AlibabaCloud\Tea\Model;

class MarriageCheckEvaluationFacade extends Model
{
    // 婚姻状况查验结果
    /**
     * @example 0:结婚 1:离婚 2:未匹配；-1:数据源查询异常；-2:核查中
     *
     * @var string
     */
    public $checkResult;
    protected $_name = [
        'checkResult' => 'check_result',
    ];

    public function validate()
    {
        Model::validateRequired('checkResult', $this->checkResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarriageCheckEvaluationFacade
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }

        return $model;
    }
}
