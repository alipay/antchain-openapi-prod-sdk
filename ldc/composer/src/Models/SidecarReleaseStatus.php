<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarReleaseStatus extends Model
{
    // 运维单号
    /**
     * @example ASDFGH1234
     *
     * @var string
     */
    public $orderNum;

    // 部署单元
    /**
     * @example rz001
     *
     * @var string
     */
    public $cellName;

    // 所处状态
    /**
     * @example start
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'orderNum' => 'order_num',
        'cellName' => 'cell_name',
        'status'   => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('orderNum', $this->orderNum, true);
        Model::validateRequired('cellName', $this->cellName, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNum) {
            $res['order_num'] = $this->orderNum;
        }
        if (null !== $this->cellName) {
            $res['cell_name'] = $this->cellName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarReleaseStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_num'])) {
            $model->orderNum = $map['order_num'];
        }
        if (isset($map['cell_name'])) {
            $model->cellName = $map['cell_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
