<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryJointconstraintBreachrecordResponse extends Model
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

    // 是否存在履行记录
    //
    //
    /**
     * @var bool
     */
    public $hasRecord;

    // 违约次数
    //
    //
    /**
     * @var int
     */
    public $breachCount;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'hasRecord'   => 'has_record',
        'breachCount' => 'breach_count',
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
        if (null !== $this->hasRecord) {
            $res['has_record'] = $this->hasRecord;
        }
        if (null !== $this->breachCount) {
            $res['breach_count'] = $this->breachCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryJointconstraintBreachrecordResponse
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
        if (isset($map['has_record'])) {
            $model->hasRecord = $map['has_record'];
        }
        if (isset($map['breach_count'])) {
            $model->breachCount = $map['breach_count'];
        }

        return $model;
    }
}
