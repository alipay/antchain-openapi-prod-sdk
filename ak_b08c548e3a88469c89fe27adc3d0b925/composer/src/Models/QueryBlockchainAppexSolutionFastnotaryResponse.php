<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b08c548e3a88469c89fe27adc3d0b925\Models;

use AlibabaCloud\Tea\Model;

class QueryBlockchainAppexSolutionFastnotaryResponse extends Model
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

    // 存证记录
    /**
     * @var NotaryRecord
     */
    public $notaryRecord;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'notaryRecord' => 'notary_record',
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
        if (null !== $this->notaryRecord) {
            $res['notary_record'] = null !== $this->notaryRecord ? $this->notaryRecord->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBlockchainAppexSolutionFastnotaryResponse
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
        if (isset($map['notary_record'])) {
            $model->notaryRecord = NotaryRecord::fromMap($map['notary_record']);
        }

        return $model;
    }
}
