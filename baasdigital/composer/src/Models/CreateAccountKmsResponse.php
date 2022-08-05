<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateAccountKmsResponse extends Model
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

    // 账户公钥
    /**
     * @var string
     */
    public $pubKey;

    // 托管秘钥ID
    /**
     * @var string
     */
    public $myKmsId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'pubKey'     => 'pub_key',
        'myKmsId'    => 'my_kms_id',
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
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }
        if (null !== $this->myKmsId) {
            $res['my_kms_id'] = $this->myKmsId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAccountKmsResponse
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
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }
        if (isset($map['my_kms_id'])) {
            $model->myKmsId = $map['my_kms_id'];
        }

        return $model;
    }
}
