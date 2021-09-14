<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthDasAuthresultResponse extends Model
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

    // 授权实例biz_uuid
    /**
     * @var string
     */
    public $authInstanceBizUuid;

    // 授权详情biz_uuid
    /**
     * @var string
     */
    public $authResultBizUuid;

    // VC 完整信息
    /**
     * @var string
     */
    public $vc;
    protected $_name = [
        'reqMsgId'            => 'req_msg_id',
        'resultCode'          => 'result_code',
        'resultMsg'           => 'result_msg',
        'authInstanceBizUuid' => 'auth_instance_biz_uuid',
        'authResultBizUuid'   => 'auth_result_biz_uuid',
        'vc'                  => 'vc',
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
        if (null !== $this->authInstanceBizUuid) {
            $res['auth_instance_biz_uuid'] = $this->authInstanceBizUuid;
        }
        if (null !== $this->authResultBizUuid) {
            $res['auth_result_biz_uuid'] = $this->authResultBizUuid;
        }
        if (null !== $this->vc) {
            $res['vc'] = $this->vc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthDasAuthresultResponse
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
        if (isset($map['auth_instance_biz_uuid'])) {
            $model->authInstanceBizUuid = $map['auth_instance_biz_uuid'];
        }
        if (isset($map['auth_result_biz_uuid'])) {
            $model->authResultBizUuid = $map['auth_result_biz_uuid'];
        }
        if (isset($map['vc'])) {
            $model->vc = $map['vc'];
        }

        return $model;
    }
}
