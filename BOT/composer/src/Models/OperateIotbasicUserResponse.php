<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class OperateIotbasicUserResponse extends Model
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

    // 操作结果
    /**
     * @var bool
     */
    public $success;

    // 操作失败集合
    /**
     * @var IotBasicUserRequest[]
     */
    public $failList;

    // 用户信息
    /**
     * @var IotBasicUserInfo[]
     */
    public $queryList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'success'    => 'success',
        'failList'   => 'fail_list',
        'queryList'  => 'query_list',
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
        if (null !== $this->failList) {
            $res['fail_list'] = [];
            if (null !== $this->failList && \is_array($this->failList)) {
                $n = 0;
                foreach ($this->failList as $item) {
                    $res['fail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->queryList) {
            $res['query_list'] = [];
            if (null !== $this->queryList && \is_array($this->queryList)) {
                $n = 0;
                foreach ($this->queryList as $item) {
                    $res['query_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateIotbasicUserResponse
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
        if (isset($map['fail_list'])) {
            if (!empty($map['fail_list'])) {
                $model->failList = [];
                $n               = 0;
                foreach ($map['fail_list'] as $item) {
                    $model->failList[$n++] = null !== $item ? IotBasicUserRequest::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['query_list'])) {
            if (!empty($map['query_list'])) {
                $model->queryList = [];
                $n                = 0;
                foreach ($map['query_list'] as $item) {
                    $model->queryList[$n++] = null !== $item ? IotBasicUserInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
