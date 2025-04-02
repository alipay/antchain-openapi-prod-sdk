<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class BatchQueryResult extends Model
{
    // 查询主体
    /**
     * @example test
     *
     * @var string
     */
    public $queryKey;

    // 单用户决策结果
    /**
     * @example accept
     *
     * @var string
     */
    public $decision;

    // 输出变量信息
    /**
     * @example
     *
     * @var BatchQueryOutputModelInfo
     */
    public $outputInfo;
    protected $_name = [
        'queryKey'   => 'query_key',
        'decision'   => 'decision',
        'outputInfo' => 'output_info',
    ];

    public function validate()
    {
        Model::validateRequired('queryKey', $this->queryKey, true);
        Model::validateRequired('decision', $this->decision, true);
        Model::validateRequired('outputInfo', $this->outputInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->queryKey) {
            $res['query_key'] = $this->queryKey;
        }
        if (null !== $this->decision) {
            $res['decision'] = $this->decision;
        }
        if (null !== $this->outputInfo) {
            $res['output_info'] = null !== $this->outputInfo ? $this->outputInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['query_key'])) {
            $model->queryKey = $map['query_key'];
        }
        if (isset($map['decision'])) {
            $model->decision = $map['decision'];
        }
        if (isset($map['output_info'])) {
            $model->outputInfo = BatchQueryOutputModelInfo::fromMap($map['output_info']);
        }

        return $model;
    }
}
