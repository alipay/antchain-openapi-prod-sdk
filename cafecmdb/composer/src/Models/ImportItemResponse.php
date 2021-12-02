<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAFECMDB\Models;

use AlibabaCloud\Tea\Model;

class ImportItemResponse extends Model
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

    // succeed_count
    /**
     * @var int
     */
    public $succeedCount;

    // failed_count
    /**
     * @var int
     */
    public $failedCount;

    // failed_reasons
    /**
     * @var string[]
     */
    public $failedReasons;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'succeedCount'  => 'succeed_count',
        'failedCount'   => 'failed_count',
        'failedReasons' => 'failed_reasons',
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
        if (null !== $this->succeedCount) {
            $res['succeed_count'] = $this->succeedCount;
        }
        if (null !== $this->failedCount) {
            $res['failed_count'] = $this->failedCount;
        }
        if (null !== $this->failedReasons) {
            $res['failed_reasons'] = $this->failedReasons;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportItemResponse
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
        if (isset($map['succeed_count'])) {
            $model->succeedCount = $map['succeed_count'];
        }
        if (isset($map['failed_count'])) {
            $model->failedCount = $map['failed_count'];
        }
        if (isset($map['failed_reasons'])) {
            if (!empty($map['failed_reasons'])) {
                $model->failedReasons = $map['failed_reasons'];
            }
        }

        return $model;
    }
}
