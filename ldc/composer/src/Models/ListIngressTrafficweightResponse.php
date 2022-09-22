<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ListIngressTrafficweightResponse extends Model
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

    // 流量权重列表
    /**
     * @var ServiceWeight[]
     */
    public $serviceWeights;

    // 流量权重列表蓝绿发布v2
    /**
     * @var CellWeight[]
     */
    public $cellWeights;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'serviceWeights' => 'service_weights',
        'cellWeights'    => 'cell_weights',
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
        if (null !== $this->serviceWeights) {
            $res['service_weights'] = [];
            if (null !== $this->serviceWeights && \is_array($this->serviceWeights)) {
                $n = 0;
                foreach ($this->serviceWeights as $item) {
                    $res['service_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->cellWeights) {
            $res['cell_weights'] = [];
            if (null !== $this->cellWeights && \is_array($this->cellWeights)) {
                $n = 0;
                foreach ($this->cellWeights as $item) {
                    $res['cell_weights'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListIngressTrafficweightResponse
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
        if (isset($map['service_weights'])) {
            if (!empty($map['service_weights'])) {
                $model->serviceWeights = [];
                $n                     = 0;
                foreach ($map['service_weights'] as $item) {
                    $model->serviceWeights[$n++] = null !== $item ? ServiceWeight::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cell_weights'])) {
            if (!empty($map['cell_weights'])) {
                $model->cellWeights = [];
                $n                  = 0;
                foreach ($map['cell_weights'] as $item) {
                    $model->cellWeights[$n++] = null !== $item ? CellWeight::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
