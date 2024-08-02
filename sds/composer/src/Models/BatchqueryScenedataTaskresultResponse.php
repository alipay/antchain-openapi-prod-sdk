<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryScenedataTaskresultResponse extends Model
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

    // 0-未开始
    // 1-可继续
    // 2-结束
    /**
     * @var string
     */
    public $syncStatus;

    // 本次的最后一个游标，保存起来下一次使用
    /**
     * @var string
     */
    public $lastCursor;

    // 结果列表
    /**
     * @var BatchResult[]
     */
    public $resultList;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'syncStatus' => 'sync_status',
        'lastCursor' => 'last_cursor',
        'resultList' => 'result_list',
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
        if (null !== $this->syncStatus) {
            $res['sync_status'] = $this->syncStatus;
        }
        if (null !== $this->lastCursor) {
            $res['last_cursor'] = $this->lastCursor;
        }
        if (null !== $this->resultList) {
            $res['result_list'] = [];
            if (null !== $this->resultList && \is_array($this->resultList)) {
                $n = 0;
                foreach ($this->resultList as $item) {
                    $res['result_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchqueryScenedataTaskresultResponse
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
        if (isset($map['sync_status'])) {
            $model->syncStatus = $map['sync_status'];
        }
        if (isset($map['last_cursor'])) {
            $model->lastCursor = $map['last_cursor'];
        }
        if (isset($map['result_list'])) {
            if (!empty($map['result_list'])) {
                $model->resultList = [];
                $n                 = 0;
                foreach ($map['result_list'] as $item) {
                    $model->resultList[$n++] = null !== $item ? BatchResult::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
