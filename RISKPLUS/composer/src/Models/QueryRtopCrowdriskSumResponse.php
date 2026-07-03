<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCrowdriskSumResponse extends Model
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

    // 查询企业的影响金额之和
    /**
     * @var int
     */
    public $moneyInvolved;

    // 查询企业的影响人数之和
    /**
     * @var int
     */
    public $peopleInvolved;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'moneyInvolved'  => 'money_involved',
        'peopleInvolved' => 'people_involved',
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
        if (null !== $this->moneyInvolved) {
            $res['money_involved'] = $this->moneyInvolved;
        }
        if (null !== $this->peopleInvolved) {
            $res['people_involved'] = $this->peopleInvolved;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopCrowdriskSumResponse
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
        if (isset($map['money_involved'])) {
            $model->moneyInvolved = $map['money_involved'];
        }
        if (isset($map['people_involved'])) {
            $model->peopleInvolved = $map['people_involved'];
        }

        return $model;
    }
}
