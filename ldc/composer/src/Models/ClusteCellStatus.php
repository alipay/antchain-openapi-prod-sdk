<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ClusteCellStatus extends Model
{
    // 部署单元所在集群名称
    /**
     * @example cluster-name
     *
     * @var string
     */
    public $cluster;

    // 部署单元名称
    /**
     * @example gz00a
     *
     * @var string
     */
    public $cell;

    // 联邦资源的分发状态，空字符串代表成功，否则为错误码
    /**
     * @example CreationFailed
     *
     * @var string
     */
    public $status;

    // 详细错误信息
    /**
     * @example some error message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'cluster' => 'cluster',
        'cell'    => 'cell',
        'status'  => 'status',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('cluster', $this->cluster, true);
        Model::validateRequired('cell', $this->cell, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cluster) {
            $res['cluster'] = $this->cluster;
        }
        if (null !== $this->cell) {
            $res['cell'] = $this->cell;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusteCellStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cluster'])) {
            $model->cluster = $map['cluster'];
        }
        if (isset($map['cell'])) {
            $model->cell = $map['cell'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
