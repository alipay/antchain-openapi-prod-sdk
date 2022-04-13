<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CountContainerserviceCellreplicasResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 应用服务当前的部署单元，及其部署副本数
    /**
     * @var ReplicaCount[]
     */
    public $cellReplicasList;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'cellReplicasList' => 'cell_replicas_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->cellReplicasList) {
            $res['cell_replicas_list'] = [];
            if (null !== $this->cellReplicasList && \is_array($this->cellReplicasList)) {
                $n = 0;
                foreach ($this->cellReplicasList as $item) {
                    $res['cell_replicas_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountContainerserviceCellreplicasResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['cell_replicas_list'])) {
            if (!empty($map['cell_replicas_list'])) {
                $model->cellReplicasList = [];
                $n                       = 0;
                foreach ($map['cell_replicas_list'] as $item) {
                    $model->cellReplicasList[$n++] = null !== $item ? ReplicaCount::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
