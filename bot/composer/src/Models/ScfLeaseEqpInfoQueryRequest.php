<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ScfLeaseEqpInfoQueryRequest extends Model
{
    // 设备识别号
    /**
     * @example 10010100101
     *
     * @var string
     */
    public $deviceNo;

    // 运营日期
    /**
     * @example 2021-07-20 11:34:00
     *
     * @var string
     */
    public $operationDate;
    protected $_name = [
        'deviceNo'      => 'device_no',
        'operationDate' => 'operation_date',
    ];

    public function validate()
    {
        Model::validateRequired('deviceNo', $this->deviceNo, true);
        Model::validateRequired('operationDate', $this->operationDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceNo) {
            $res['device_no'] = $this->deviceNo;
        }
        if (null !== $this->operationDate) {
            $res['operation_date'] = $this->operationDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScfLeaseEqpInfoQueryRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_no'])) {
            $model->deviceNo = $map['device_no'];
        }
        if (isset($map['operation_date'])) {
            $model->operationDate = $map['operation_date'];
        }

        return $model;
    }
}
