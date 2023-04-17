<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class GetMessagesHistoryResponse extends Model
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

    // 总数
    /**
     * @var int
     */
    public $totalCount;

    // yuqing_messages
    /**
     * @var YuqingMessage[]
     */
    public $yuqingMessages;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'totalCount'     => 'total_count',
        'yuqingMessages' => 'yuqing_messages',
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
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->yuqingMessages) {
            $res['yuqing_messages'] = [];
            if (null !== $this->yuqingMessages && \is_array($this->yuqingMessages)) {
                $n = 0;
                foreach ($this->yuqingMessages as $item) {
                    $res['yuqing_messages'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMessagesHistoryResponse
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
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['yuqing_messages'])) {
            if (!empty($map['yuqing_messages'])) {
                $model->yuqingMessages = [];
                $n                     = 0;
                foreach ($map['yuqing_messages'] as $item) {
                    $model->yuqingMessages[$n++] = null !== $item ? YuqingMessage::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
