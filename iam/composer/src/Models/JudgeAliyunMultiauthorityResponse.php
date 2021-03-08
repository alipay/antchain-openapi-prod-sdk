<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class JudgeAliyunMultiauthorityResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 鉴权结果列表
    /**
     * @var Judgement[]
     */
    public $judgements;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'judgements' => 'judgements',
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
        if (null !== $this->judgements) {
            $res['judgements'] = [];
            if (null !== $this->judgements && \is_array($this->judgements)) {
                $n = 0;
                foreach ($this->judgements as $item) {
                    $res['judgements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JudgeAliyunMultiauthorityResponse
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
        if (isset($map['judgements'])) {
            if (!empty($map['judgements'])) {
                $model->judgements = [];
                $n                 = 0;
                foreach ($map['judgements'] as $item) {
                    $model->judgements[$n++] = null !== $item ? Judgement::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
