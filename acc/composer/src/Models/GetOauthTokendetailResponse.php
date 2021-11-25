<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class GetOauthTokendetailResponse extends Model
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

    // 授权token
    /**
     * @var string
     */
    public $accessToken;

    // 授权可查看的用户的信息
    /**
     * @var UserData
     */
    public $dataGrant;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'accessToken' => 'access_token',
        'dataGrant'   => 'data_grant',
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
        if (null !== $this->accessToken) {
            $res['access_token'] = $this->accessToken;
        }
        if (null !== $this->dataGrant) {
            $res['data_grant'] = null !== $this->dataGrant ? $this->dataGrant->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetOauthTokendetailResponse
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
        if (isset($map['access_token'])) {
            $model->accessToken = $map['access_token'];
        }
        if (isset($map['data_grant'])) {
            $model->dataGrant = UserData::fromMap($map['data_grant']);
        }

        return $model;
    }
}
