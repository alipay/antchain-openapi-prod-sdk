<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyUmktRobotcallRequest extends Model
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

    // 外呼主叫号码
    /**
     * @var string
     */
    public $calledShowNumber;

    // 被叫号码
    /**
     * @var string
     */
    public $calledNumber;

    // 机器人id
    /**
     * @var int
     */
    public $robotId;

    // 是否开启录音
    /**
     * @var bool
     */
    public $recordFlag;

    // 是否开启早媒体
    /**
     * @var bool
     */
    public $earlyMediaAsr;

    // 机器人参数
    /**
     * @var string
     */
    public $params;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'calledShowNumber'  => 'called_show_number',
        'calledNumber'      => 'called_number',
        'robotId'           => 'robot_id',
        'recordFlag'        => 'record_flag',
        'earlyMediaAsr'     => 'early_media_asr',
        'params'            => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('calledShowNumber', $this->calledShowNumber, true);
        Model::validateRequired('calledNumber', $this->calledNumber, true);
        Model::validateRequired('robotId', $this->robotId, true);
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
        if (null !== $this->calledShowNumber) {
            $res['called_show_number'] = $this->calledShowNumber;
        }
        if (null !== $this->calledNumber) {
            $res['called_number'] = $this->calledNumber;
        }
        if (null !== $this->robotId) {
            $res['robot_id'] = $this->robotId;
        }
        if (null !== $this->recordFlag) {
            $res['record_flag'] = $this->recordFlag;
        }
        if (null !== $this->earlyMediaAsr) {
            $res['early_media_asr'] = $this->earlyMediaAsr;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUmktRobotcallRequest
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
        if (isset($map['called_show_number'])) {
            $model->calledShowNumber = $map['called_show_number'];
        }
        if (isset($map['called_number'])) {
            $model->calledNumber = $map['called_number'];
        }
        if (isset($map['robot_id'])) {
            $model->robotId = $map['robot_id'];
        }
        if (isset($map['record_flag'])) {
            $model->recordFlag = $map['record_flag'];
        }
        if (isset($map['early_media_asr'])) {
            $model->earlyMediaAsr = $map['early_media_asr'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
