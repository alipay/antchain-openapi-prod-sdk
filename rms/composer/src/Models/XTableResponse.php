<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XTableResponse extends Model
{
    /**
     * @example
     *
     * @var string
     */
    public $resultType;

    /**
     * @example
     *
     * @var XTableData[]
     */
    public $result;
    protected $_name = [
        'resultType' => 'result_type',
        'result'     => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('resultType', $this->resultType, true);
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->resultType) {
            $res['result_type'] = $this->resultType;
        }
        if (null !== $this->result) {
            $res['result'] = [];
            if (null !== $this->result && \is_array($this->result)) {
                $n = 0;
                foreach ($this->result as $item) {
                    $res['result'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XTableResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['result_type'])) {
            $model->resultType = $map['result_type'];
        }
        if (isset($map['result'])) {
            if (!empty($map['result'])) {
                $model->result = [];
                $n             = 0;
                foreach ($map['result'] as $item) {
                    $model->result[$n++] = null !== $item ? XTableData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
