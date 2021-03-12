<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ALiYunTransactionReceipt extends Model
{
    // data
    /**
     * @example data
     *
     * @var string
     */
    public $data;

    // gas_used
    /**
     * @example gas_used
     *
     * @var string
     */
    public $gasUsed;

    // result
    /**
     * @example result
     *
     * @var int
     */
    public $result;

    // logs
    /**
     * @example logs
     *
     * @var string[]
     */
    public $logs;
    protected $_name = [
        'data'    => 'data',
        'gasUsed' => 'gas_used',
        'result'  => 'result',
        'logs'    => 'logs',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->gasUsed) {
            $res['gas_used'] = $this->gasUsed;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }
        if (null !== $this->logs) {
            $res['logs'] = $this->logs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ALiYunTransactionReceipt
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['gas_used'])) {
            $model->gasUsed = $map['gas_used'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }
        if (isset($map['logs'])) {
            if (!empty($map['logs'])) {
                $model->logs = $map['logs'];
            }
        }

        return $model;
    }
}
