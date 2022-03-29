<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ImportChannelapiResponse extends Model
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

    // 失败列表
    /**
     * @var ChannelApi[]
     */
    public $failureList;

    // 失败数量
    /**
     * @var int
     */
    public $failureNum;

    // 成功数量
    /**
     * @var int
     */
    public $successNum;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'failureList' => 'failure_list',
        'failureNum'  => 'failure_num',
        'successNum'  => 'success_num',
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
        if (null !== $this->failureList) {
            $res['failure_list'] = [];
            if (null !== $this->failureList && \is_array($this->failureList)) {
                $n = 0;
                foreach ($this->failureList as $item) {
                    $res['failure_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->failureNum) {
            $res['failure_num'] = $this->failureNum;
        }
        if (null !== $this->successNum) {
            $res['success_num'] = $this->successNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportChannelapiResponse
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
        if (isset($map['failure_list'])) {
            if (!empty($map['failure_list'])) {
                $model->failureList = [];
                $n                  = 0;
                foreach ($map['failure_list'] as $item) {
                    $model->failureList[$n++] = null !== $item ? ChannelApi::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['failure_num'])) {
            $model->failureNum = $map['failure_num'];
        }
        if (isset($map['success_num'])) {
            $model->successNum = $map['success_num'];
        }

        return $model;
    }
}
