<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class RebootDidNotificationConsumerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // method： POST
    // applicatoin/json
    /**
     * @var string
     */
    public $callBackUrl;

    // 注册是得到的consumer_id
    /**
     * @var string
     */
    public $consumerId;

    // 重新从哪个高度开始同步信息，目前did messager只保留1周之内的数据，所以这个高度如果早于一周，会返回异常。
    /**
     * @var int
     */
    public $restartBlockHeight;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'callBackUrl'        => 'call_back_url',
        'consumerId'         => 'consumer_id',
        'restartBlockHeight' => 'restart_block_height',
        'bizCode'            => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('callBackUrl', $this->callBackUrl, true);
        Model::validateRequired('consumerId', $this->consumerId, true);
        Model::validateRequired('restartBlockHeight', $this->restartBlockHeight, true);
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
        if (null !== $this->callBackUrl) {
            $res['call_back_url'] = $this->callBackUrl;
        }
        if (null !== $this->consumerId) {
            $res['consumer_id'] = $this->consumerId;
        }
        if (null !== $this->restartBlockHeight) {
            $res['restart_block_height'] = $this->restartBlockHeight;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RebootDidNotificationConsumerRequest
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
        if (isset($map['call_back_url'])) {
            $model->callBackUrl = $map['call_back_url'];
        }
        if (isset($map['consumer_id'])) {
            $model->consumerId = $map['consumer_id'];
        }
        if (isset($map['restart_block_height'])) {
            $model->restartBlockHeight = $map['restart_block_height'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
