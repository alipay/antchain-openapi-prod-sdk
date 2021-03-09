<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateComputerResponse extends Model
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

    // computer_sequences
    /**
     * @var string[]
     */
    public $computerSequences;

    // paas_request_id，可以根据这个值查询日志
    /**
     * @var string
     */
    public $paasRequestId;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'computerSequences' => 'computer_sequences',
        'paasRequestId'     => 'paas_request_id',
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
        if (null !== $this->computerSequences) {
            $res['computer_sequences'] = $this->computerSequences;
        }
        if (null !== $this->paasRequestId) {
            $res['paas_request_id'] = $this->paasRequestId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateComputerResponse
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
        if (isset($map['computer_sequences'])) {
            if (!empty($map['computer_sequences'])) {
                $model->computerSequences = $map['computer_sequences'];
            }
        }
        if (isset($map['paas_request_id'])) {
            $model->paasRequestId = $map['paas_request_id'];
        }

        return $model;
    }
}
