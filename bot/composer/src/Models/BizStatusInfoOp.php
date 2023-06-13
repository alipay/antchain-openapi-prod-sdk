<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BizStatusInfoOp extends Model
{
    // 业务状态类型
    /**
     * @example SMART_CAR_KEY
     *
     * @var string
     */
    public $bizType;

    // 业务状态
    /**
     * @example unbound
     *
     * @var string
     */
    public $bizStatus;

    // 时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $opTime;
    protected $_name = [
        'bizType'   => 'biz_type',
        'bizStatus' => 'biz_status',
        'opTime'    => 'op_time',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizStatus', $this->bizStatus, true);
        Model::validateRequired('opTime', $this->opTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizStatus) {
            $res['biz_status'] = $this->bizStatus;
        }
        if (null !== $this->opTime) {
            $res['op_time'] = $this->opTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizStatusInfoOp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_status'])) {
            $model->bizStatus = $map['biz_status'];
        }
        if (isset($map['op_time'])) {
            $model->opTime = $map['op_time'];
        }

        return $model;
    }
}
