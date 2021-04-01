<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryIdentificationEnterpriseFourmetaResponse extends Model
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

    // 经营状态
    /**
     * @var string
     */
    public $enterpriseStatus;

    // 营业期限
    /**
     * @var string
     */
    public $openTime;

    // 认证是否通过
    /**
     * @var bool
     */
    public $passed;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'enterpriseStatus' => 'enterprise_status',
        'openTime'         => 'open_time',
        'passed'           => 'passed',
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
        if (null !== $this->enterpriseStatus) {
            $res['enterprise_status'] = $this->enterpriseStatus;
        }
        if (null !== $this->openTime) {
            $res['open_time'] = $this->openTime;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryIdentificationEnterpriseFourmetaResponse
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
        if (isset($map['enterprise_status'])) {
            $model->enterpriseStatus = $map['enterprise_status'];
        }
        if (isset($map['open_time'])) {
            $model->openTime = $map['open_time'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }

        return $model;
    }
}
