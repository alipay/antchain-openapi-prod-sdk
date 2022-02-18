<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ApplyIpCodeResponse extends Model
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

    // 数字凭证的批次ID
    /**
     * @var string
     */
    public $codeBatchId;

    // 数字凭证左区间
    /**
     * @var int
     */
    public $codeBatchStart;

    // 数字凭证右区间
    /**
     * @var int
     */
    public $codeBatchEnd;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'codeBatchId'    => 'code_batch_id',
        'codeBatchStart' => 'code_batch_start',
        'codeBatchEnd'   => 'code_batch_end',
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
        if (null !== $this->codeBatchId) {
            $res['code_batch_id'] = $this->codeBatchId;
        }
        if (null !== $this->codeBatchStart) {
            $res['code_batch_start'] = $this->codeBatchStart;
        }
        if (null !== $this->codeBatchEnd) {
            $res['code_batch_end'] = $this->codeBatchEnd;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyIpCodeResponse
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
        if (isset($map['code_batch_id'])) {
            $model->codeBatchId = $map['code_batch_id'];
        }
        if (isset($map['code_batch_start'])) {
            $model->codeBatchStart = $map['code_batch_start'];
        }
        if (isset($map['code_batch_end'])) {
            $model->codeBatchEnd = $map['code_batch_end'];
        }

        return $model;
    }
}
