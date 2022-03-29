<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XMetricResponse extends Model
{
    // timeseries
    /**
     * @example [{"metric":[{"key":"","value":""}],"value":{"timestamp":1,"value:"""}}]
     *
     * @var XMetricData[]
     */
    public $result;

    // result type
    /**
     * @example vector
     *
     * @var string
     */
    public $resultType;
    protected $_name = [
        'result'     => 'result',
        'resultType' => 'result_type',
    ];

    public function validate()
    {
        Model::validateRequired('result', $this->result, true);
        Model::validateRequired('resultType', $this->resultType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->result) {
            $res['result'] = [];
            if (null !== $this->result && \is_array($this->result)) {
                $n = 0;
                foreach ($this->result as $item) {
                    $res['result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resultType) {
            $res['result_type'] = $this->resultType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMetricResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result'])) {
            if (!empty($map['result'])) {
                $model->result = [];
                $n             = 0;
                foreach ($map['result'] as $item) {
                    $model->result[$n++] = null !== $item ? XMetricData::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_type'])) {
            $model->resultType = $map['result_type'];
        }

        return $model;
    }
}
