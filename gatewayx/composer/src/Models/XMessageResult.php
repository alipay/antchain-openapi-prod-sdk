<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class XMessageResult extends Model
{
    // 消息key
    /**
     * @example demo.test.ccc
     *
     * @var string
     */
    public $msgKey;

    // 发送方租户
    /**
     * @example ORGJC1CN
     *
     * @var string
     */
    public $providerId;

    // 接收方租户
    /**
     * @example ORGJC1CN
     *
     * @var string
     */
    public $consumerId;

    // 发送结果
    /**
     * @example success
     *
     * @var string
     */
    public $status;

    // 发送次数（重试次数）
    /**
     * @example 1
     *
     * @var int
     */
    public $pushTimes;

    // 发送内容
    /**
     * @example ["{}"]
     *
     * @var string
     */
    public $bizContent;

    // 错误码
    /**
     * @example OK
     *
     * @var string
     */
    public $errorCode;

    // 错误消息
    /**
     * @example 非法请求
     *
     * @var string
     */
    public $errorMsg;

    // 发送地址
    /**
     * @example http://example.com/callback.do
     *
     * @var string
     */
    public $targetUrl;

    // 消息唯一id
    /**
     * @example ORGJC1CN-ORGJC1CN-20250206ApiTest_76ae5ae3-4230-490d-80c1-b503fe35f126_117b2cb0_1738804339825
     *
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'msgKey'     => 'msg_key',
        'providerId' => 'provider_id',
        'consumerId' => 'consumer_id',
        'status'     => 'status',
        'pushTimes'  => 'push_times',
        'bizContent' => 'biz_content',
        'errorCode'  => 'error_code',
        'errorMsg'   => 'error_msg',
        'targetUrl'  => 'target_url',
        'uniqueId'   => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('msgKey', $this->msgKey, true);
        Model::validateRequired('providerId', $this->providerId, true);
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('pushTimes', $this->pushTimes, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('targetUrl', $this->targetUrl, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->msgKey) {
            $res['msg_key'] = $this->msgKey;
        }
        if (null !== $this->providerId) {
            $res['provider_id'] = $this->providerId;
        }
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pushTimes) {
            $res['push_times'] = $this->pushTimes;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->targetUrl) {
            $res['target_url'] = $this->targetUrl;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XMessageResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['msg_key'])) {
            $model->msgKey = $map['msg_key'];
        }
        if (isset($map['provider_id'])) {
            $model->providerId = $map['provider_id'];
        }
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['push_times'])) {
            $model->pushTimes = $map['push_times'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }
        if (isset($map['error_code'])) {
            $model->errorCode = $map['error_code'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['target_url'])) {
            $model->targetUrl = $map['target_url'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
