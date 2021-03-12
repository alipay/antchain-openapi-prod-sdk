<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartDidNotificationConsumerRequest extends Model
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

    // 事件发生时的回调路径，必须满足：
    // metho：POST
    // Content-Type：application/json
    /**
     * @var string
     */
    public $callBackUrl;

    // 关注的did；这个did必须是调用者自己的did，也可以是托管给调用者的did
    /**
     * @var string
     */
    public $did;

    // 1 所有相关事件，
    // 2 所有相关did事件，
    // 3 所有相关vc事件，
    /**
     * @var int
     */
    public $type;

    // 场景码，找dis工作人员进行分配
    /**
     * @var string
     */
    public $bizCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'callBackUrl'       => 'call_back_url',
        'did'               => 'did',
        'type'              => 'type',
        'bizCode'           => 'biz_code',
    ];

    public function validate()
    {
        Model::validateRequired('callBackUrl', $this->callBackUrl, true);
        Model::validateRequired('did', $this->did, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartDidNotificationConsumerRequest
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
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }

        return $model;
    }
}
