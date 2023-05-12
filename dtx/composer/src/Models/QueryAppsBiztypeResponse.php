<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class QueryAppsBiztypeResponse extends Model
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

    // 异库模式更新信息
    /**
     * @var AsynDbTxInfo
     */
    public $asynInfo;

    // Saga状态机的json定义
    /**
     * @var string
     */
    public $content;

    // initiator
    /**
     * @var Initiator
     */
    public $initiator;

    // participators
    /**
     * @var Participator[]
     */
    public $participators;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'asynInfo'      => 'asyn_info',
        'content'       => 'content',
        'initiator'     => 'initiator',
        'participators' => 'participators',
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
        if (null !== $this->asynInfo) {
            $res['asyn_info'] = null !== $this->asynInfo ? $this->asynInfo->toMap() : null;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->initiator) {
            $res['initiator'] = null !== $this->initiator ? $this->initiator->toMap() : null;
        }
        if (null !== $this->participators) {
            $res['participators'] = [];
            if (null !== $this->participators && \is_array($this->participators)) {
                $n = 0;
                foreach ($this->participators as $item) {
                    $res['participators'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppsBiztypeResponse
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
        if (isset($map['asyn_info'])) {
            $model->asynInfo = AsynDbTxInfo::fromMap($map['asyn_info']);
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['initiator'])) {
            $model->initiator = Initiator::fromMap($map['initiator']);
        }
        if (isset($map['participators'])) {
            if (!empty($map['participators'])) {
                $model->participators = [];
                $n                    = 0;
                foreach ($map['participators'] as $item) {
                    $model->participators[$n++] = null !== $item ? Participator::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
