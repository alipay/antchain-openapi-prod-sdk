<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryEverifyTwometaResponse extends Model
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

    // 0:核验成功
    // 1:企业信息有误
    // 2:企业非正常营业
    /**
     * @var string
     */
    public $code;

    // resultCode=0，核验一致
    // resultCode=1，核验不一致（人企核验不一致）
    // resultCode=2，库无（人在库中不存在，无法校验）
    // resultCode=3，企业二要素核验不通过
    // resultCode=4，查无企业，无法校验（此场景属于三要素核验）
    /**
     * @var string
     */
    public $returnCode;

    // 核验不通过异常编码
    /**
     * @var string
     */
    public $reasonCode;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'enterpriseStatus' => 'enterprise_status',
        'openTime'         => 'open_time',
        'passed'           => 'passed',
        'code'             => 'code',
        'returnCode'       => 'return_code',
        'reasonCode'       => 'reason_code',
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
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->returnCode) {
            $res['return_code'] = $this->returnCode;
        }
        if (null !== $this->reasonCode) {
            $res['reason_code'] = $this->reasonCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryEverifyTwometaResponse
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
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['return_code'])) {
            $model->returnCode = $map['return_code'];
        }
        if (isset($map['reason_code'])) {
            $model->reasonCode = $map['reason_code'];
        }

        return $model;
    }
}
