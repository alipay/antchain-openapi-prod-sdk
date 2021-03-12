<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class BlockchainBrowserTransactionReceipt extends Model
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
     * @example 0
     *
     * @var int
     */
    public $gasUsed;

    // logs
    /**
     * @example awdawd
     *
     * @var string[]
     */
    public $logs;

    // result
    /**
     * @example 0
     *
     * @var int
     */
    public $result;
    protected $_name = [
        'data'    => 'data',
        'gasUsed' => 'gas_used',
        'logs'    => 'logs',
        'result'  => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('gasUsed', $this->gasUsed, true);
        Model::validateRequired('logs', $this->logs, true);
        Model::validateRequired('result', $this->result, true);
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
        if (null !== $this->logs) {
            $res['logs'] = $this->logs;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockchainBrowserTransactionReceipt
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
        if (isset($map['logs'])) {
            if (!empty($map['logs'])) {
                $model->logs = $map['logs'];
            }
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
