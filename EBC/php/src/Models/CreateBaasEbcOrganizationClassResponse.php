<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\EBC\Models;

use AlibabaCloud\Tea\Model;

class CreateBaasEbcOrganizationClassResponse extends Model
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

    // 班级id
    /**
     * @var string
     */
    public $classId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'classId'    => 'class_id',
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
        if (null !== $this->classId) {
            $res['class_id'] = $this->classId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBaasEbcOrganizationClassResponse
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
        if (isset($map['class_id'])) {
            $model->classId = $map['class_id'];
        }

        return $model;
    }
}
