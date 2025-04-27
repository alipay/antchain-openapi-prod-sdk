<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ExecFaceverifyServermodeResponse extends Model
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

    // 认证ID
    /**
     * @var string
     */
    public $certifyId;

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

    // 认证主体附件信息，包含共计类型等
    /**
     * @var string
     */
    public $materialInfo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'certifyId'    => 'certify_id',
        'passed'       => 'passed',
        'reason'       => 'reason',
        'materialInfo' => 'material_info',
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->passed) {
            $res['passed'] = $this->passed;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->materialInfo) {
            $res['material_info'] = $this->materialInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecFaceverifyServermodeResponse
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['passed'])) {
            $model->passed = $map['passed'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['material_info'])) {
            $model->materialInfo = $map['material_info'];
        }

        return $model;
    }
}
