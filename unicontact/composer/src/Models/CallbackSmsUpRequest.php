<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\UNICONTACT\Models;

use AlibabaCloud\Tea\Model;

class CallbackSmsUpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 回执类型
    /**
     * @var string
     */
    public $type;

    // 手机号码
    /**
     * @var string
     */
    public $phoneNumber;

    // 发送时间
    /**
     * @var string
     */
    public $sendTime;

    // 发送内容
    /**
     * @var string
     */
    public $content;

    // 签名
    /**
     * @var string
     */
    public $signName;

    // 由通信平台提供的短信发送账号ak
    /**
     * @var string
     */
    public $appKey;

    // 上行短信扩展号码
    /**
     * @var string
     */
    public $destCode;

    // 序列
    /**
     * @var int
     */
    public $sequenceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'type'              => 'type',
        'phoneNumber'       => 'phone_number',
        'sendTime'          => 'send_time',
        'content'           => 'content',
        'signName'          => 'sign_name',
        'appKey'            => 'app_key',
        'destCode'          => 'dest_code',
        'sequenceId'        => 'sequence_id',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('sendTime', $this->sendTime, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('signName', $this->signName, true);
        Model::validateRequired('appKey', $this->appKey, true);
        Model::validateRequired('destCode', $this->destCode, true);
        Model::validateRequired('sequenceId', $this->sequenceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->sendTime) {
            $res['send_time'] = $this->sendTime;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->signName) {
            $res['sign_name'] = $this->signName;
        }
        if (null !== $this->appKey) {
            $res['app_key'] = $this->appKey;
        }
        if (null !== $this->destCode) {
            $res['dest_code'] = $this->destCode;
        }
        if (null !== $this->sequenceId) {
            $res['sequence_id'] = $this->sequenceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackSmsUpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['send_time'])) {
            $model->sendTime = $map['send_time'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['sign_name'])) {
            $model->signName = $map['sign_name'];
        }
        if (isset($map['app_key'])) {
            $model->appKey = $map['app_key'];
        }
        if (isset($map['dest_code'])) {
            $model->destCode = $map['dest_code'];
        }
        if (isset($map['sequence_id'])) {
            $model->sequenceId = $map['sequence_id'];
        }

        return $model;
    }
}
