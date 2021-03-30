<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDisDidResponse extends Model
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

    // 分布式数字身份did
    /**
     * @var string
     */
    public $did;

    // 组织类型
    /**
     * @var string
     */
    public $organizationType;

    // 现阶段此did下的所有授予的角色
    /**
     * @var string[]
     */
    public $roleTypes;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'did'              => 'did',
        'organizationType' => 'organization_type',
        'roleTypes'        => 'role_types',
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->organizationType) {
            $res['organization_type'] = $this->organizationType;
        }
        if (null !== $this->roleTypes) {
            $res['role_types'] = $this->roleTypes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDisDidResponse
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['organization_type'])) {
            $model->organizationType = $map['organization_type'];
        }
        if (isset($map['role_types'])) {
            if (!empty($map['role_types'])) {
                $model->roleTypes = $map['role_types'];
            }
        }

        return $model;
    }
}
