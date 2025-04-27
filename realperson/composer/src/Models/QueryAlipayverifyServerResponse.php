<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class QueryAlipayverifyServerResponse extends Model
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

    // 认证的主体信息，一般的认证场景返回为空
    /**
     * @var string
     */
    public $identityInfo;

    // 认证主体附件信息，一般的认证场景都是返回空
    /**
     * @var string
     */
    public $materialInfo;

    // 是否通过，通过为T，不通过为F
    /**
     * @var string
     */
    public $materialMatched;

    // 是否通过，通过为T，不通过为F
    /**
     * @var string
     */
    public $passed;

    // 业务失败原因
    /**
     * @var string
     */
    public $reason;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'identityInfo'    => 'identity_info',
        'materialInfo'    => 'material_info',
        'materialMatched' => 'material_matched',
        'passed'          => 'passed',
        'reason'          => 'reason',
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
        if (null !== $this->identityInfo) {
            $res['identity_info'] = $this->identityInfo;
        }
        if (null !== $this->materialInfo) {
            $res['material_info'] = $this->materialInfo;
        }
        if (null !== $this->materialMatched) {
            $res['material_matched'] = $this->materialMatched;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAlipayverifyServerResponse
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
        if (isset($map['identity_info'])) {
            $model->identityInfo = $map['identity_info'];
        }
        if (isset($map['material_info'])) {
            $model->materialInfo = $map['material_info'];
        }
        if (isset($map['material_matched'])) {
            $model->materialMatched = $map['material_matched'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }

        return $model;
    }
}
