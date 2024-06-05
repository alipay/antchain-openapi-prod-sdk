<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_dc040d759c7a442f89b4b6590b1e39a0\Models;

use AlibabaCloud\Tea\Model;

class OperateBlockchainBotIotbasicBatchcollectResponse extends Model
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

    // 是否成功
    /**
     * @var bool
     */
    public $success;

    // 上链成功列表
    /**
     * @var DeviceCollectResult[]
     */
    public $successList;

    // 上链失败列表
    /**
     * @var DeviceCollectFail[]
     */
    public $failList;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'success'     => 'success',
        'successList' => 'success_list',
        'failList'    => 'fail_list',
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
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->successList) {
            $res['success_list'] = [];
            if (null !== $this->successList && \is_array($this->successList)) {
                $n = 0;
                foreach ($this->successList as $item) {
                    $res['success_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failList) {
            $res['fail_list'] = [];
            if (null !== $this->failList && \is_array($this->failList)) {
                $n = 0;
                foreach ($this->failList as $item) {
                    $res['fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateBlockchainBotIotbasicBatchcollectResponse
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
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['success_list'])) {
            if (!empty($map['success_list'])) {
                $model->successList = [];
                $n                  = 0;
                foreach ($map['success_list'] as $item) {
                    $model->successList[$n++] = null !== $item ? DeviceCollectResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['fail_list'])) {
            if (!empty($map['fail_list'])) {
                $model->failList = [];
                $n               = 0;
                foreach ($map['fail_list'] as $item) {
                    $model->failList[$n++] = null !== $item ? DeviceCollectFail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
