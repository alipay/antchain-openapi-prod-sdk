<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDIGITAL\Models;

use AlibabaCloud\Tea\Model;

class CreateAsseturiResponse extends Model
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

    // 可公开访问的asseturi地址。
    /**
     * @var string
     */
    public $accessUri;

    // assetUri文件内容
    /**
     * @var string
     */
    public $jsonInfo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'accessUri'  => 'access_uri',
        'jsonInfo'   => 'json_info',
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
        if (null !== $this->accessUri) {
            $res['access_uri'] = $this->accessUri;
        }
        if (null !== $this->jsonInfo) {
            $res['json_info'] = $this->jsonInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAsseturiResponse
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
        if (isset($map['access_uri'])) {
            $model->accessUri = $map['access_uri'];
        }
        if (isset($map['json_info'])) {
            $model->jsonInfo = $map['json_info'];
        }

        return $model;
    }
}
