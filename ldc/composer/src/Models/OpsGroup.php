<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsGroup extends Model
{
    // 运维操作组当前状态。取值列表： INITED：初始化完成； EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败； CANCELED：已取消； CONFIRM_WAITING：待确认
    /**
     * @example
     *
     * @var string
     */
    public $status;

    // 包含在此运维操作组中的运维单元列表
    /**
     * @example
     *
     * @var OpsUnit[]
     */
    public $units;

    // 运维任务进度列表
    /**
     * @example [{action_code: "DISABLE_LB_TRAFFIC", action_name: "LB摘流", state: "SUCCEEDED"}]
     *
     * @var OpsGroupTaskProgress[]
     */
    public $progresses;
    protected $_name = [
        'status'     => 'status',
        'units'      => 'units',
        'progresses' => 'progresses',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->units) {
            $res['units'] = [];
            if (null !== $this->units && \is_array($this->units)) {
                $n = 0;
                foreach ($this->units as $item) {
                    $res['units'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->progresses) {
            $res['progresses'] = [];
            if (null !== $this->progresses && \is_array($this->progresses)) {
                $n = 0;
                foreach ($this->progresses as $item) {
                    $res['progresses'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['units'])) {
            if (!empty($map['units'])) {
                $model->units = [];
                $n            = 0;
                foreach ($map['units'] as $item) {
                    $model->units[$n++] = null !== $item ? OpsUnit::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['progresses'])) {
            if (!empty($map['progresses'])) {
                $model->progresses = [];
                $n                 = 0;
                foreach ($map['progresses'] as $item) {
                    $model->progresses[$n++] = null !== $item ? OpsGroupTaskProgress::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
