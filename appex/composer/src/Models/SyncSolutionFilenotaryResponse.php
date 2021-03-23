<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APPEX\Models;

use AlibabaCloud\Tea\Model;

class SyncSolutionFilenotaryResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 是否被接收
    //
    /**
     * @var bool
     */
    public $accepted;

    // 拒绝原因
    //
    /**
     * @var string
     */
    public $deniedReason;

    // 文件存证id
    //
    /**
     * @var string
     */
    public $fileNotaryId;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'accepted'     => 'accepted',
        'deniedReason' => 'denied_reason',
        'fileNotaryId' => 'file_notary_id',
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
        if (null !== $this->accepted) {
            $res['accepted'] = $this->accepted;
        }
        if (null !== $this->deniedReason) {
            $res['denied_reason'] = $this->deniedReason;
        }
        if (null !== $this->fileNotaryId) {
            $res['file_notary_id'] = $this->fileNotaryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncSolutionFilenotaryResponse
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
        if (isset($map['accepted'])) {
            $model->accepted = $map['accepted'];
        }
        if (isset($map['denied_reason'])) {
            $model->deniedReason = $map['denied_reason'];
        }
        if (isset($map['file_notary_id'])) {
            $model->fileNotaryId = $map['file_notary_id'];
        }

        return $model;
    }
}
