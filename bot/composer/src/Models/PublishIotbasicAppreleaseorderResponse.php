<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PublishIotbasicAppreleaseorderResponse extends Model
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

    // 接口调用结果
    /**
     * @var bool
     */
    public $success;

    // 未完成的设备升级列表
    /**
     * @var IotbasicReleaseDeviceInfo[]
     */
    public $unfinishedList;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'success'        => 'success',
        'unfinishedList' => 'unfinished_list',
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
        if (null !== $this->unfinishedList) {
            $res['unfinished_list'] = [];
            if (null !== $this->unfinishedList && \is_array($this->unfinishedList)) {
                $n = 0;
                foreach ($this->unfinishedList as $item) {
                    $res['unfinished_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PublishIotbasicAppreleaseorderResponse
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
        if (isset($map['unfinished_list'])) {
            if (!empty($map['unfinished_list'])) {
                $model->unfinishedList = [];
                $n                     = 0;
                foreach ($map['unfinished_list'] as $item) {
                    $model->unfinishedList[$n++] = null !== $item ? IotbasicReleaseDeviceInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
