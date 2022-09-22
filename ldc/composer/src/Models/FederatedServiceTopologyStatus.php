<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class FederatedServiceTopologyStatus extends Model
{
    // 部署单元
    /**
     * @example gz00a
     *
     * @var string
     */
    public $topologyName;

    // annotations
    /**
     * @example []
     *
     * @var Annotation[]
     */
    public $annotations;

    // 状态：succeed、updating、fail
    /**
     * @example succeed
     *
     * @var string
     */
    public $status;

    // 错误信息
    /**
     * @example test
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'topologyName' => 'topology_name',
        'annotations'  => 'annotations',
        'status'       => 'status',
        'message'      => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('topologyName', $this->topologyName, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->topologyName) {
            $res['topology_name'] = $this->topologyName;
        }
        if (null !== $this->annotations) {
            $res['annotations'] = [];
            if (null !== $this->annotations && \is_array($this->annotations)) {
                $n = 0;
                foreach ($this->annotations as $item) {
                    $res['annotations'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
     * @return FederatedServiceTopologyStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['topology_name'])) {
            $model->topologyName = $map['topology_name'];
        }
        if (isset($map['annotations'])) {
            if (!empty($map['annotations'])) {
                $model->annotations = [];
                $n                  = 0;
                foreach ($map['annotations'] as $item) {
                    $model->annotations[$n++] = null !== $item ? Annotation::fromMap($item) : $item;
                }
            }
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
