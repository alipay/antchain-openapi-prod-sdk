<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ListTransactionAppsResponse extends Model
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

    // apps
    /**
     * @var TrasactionAppInfo[]
     */
    public $apps;

    // true
    /**
     * @var bool
     */
    public $success;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'apps'       => 'apps',
        'success'    => 'success',
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
        if (null !== $this->apps) {
            $res['apps'] = [];
            if (null !== $this->apps && \is_array($this->apps)) {
                $n = 0;
                foreach ($this->apps as $item) {
                    $res['apps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListTransactionAppsResponse
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
        if (isset($map['apps'])) {
            if (!empty($map['apps'])) {
                $model->apps = [];
                $n           = 0;
                foreach ($map['apps'] as $item) {
                    $model->apps[$n++] = null !== $item ? TrasactionAppInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
