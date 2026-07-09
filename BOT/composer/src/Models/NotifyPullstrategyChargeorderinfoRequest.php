<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class NotifyPullstrategyChargeorderinfoRequest extends Model
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

    // 运营商标识
    /**
     * @var string
     */
    public $operatorId;

    // 加密后的核心数据
    /**
     * @var string
     */
    public $data;

    // 接口请求时的时间戳信息，格式为yyyyMMddHHmmss
    /**
     * @var string
     */
    public $timeStamp;

    // 自增序列，4位自增序列取自时间戳，同一秒内按序列自增长，新秒重计
    /**
     * @var string
     */
    public $seq;

    // 参数签名，原文为operatorId+data+timeStamp+seq
    /**
     * @var string
     */
    public $sig;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 数据模型ID，用于校验data原文数据
    /**
     * @var string
     */
    public $dataModelId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'operatorId'        => 'operator_id',
        'data'              => 'data',
        'timeStamp'         => 'time_stamp',
        'seq'               => 'seq',
        'sig'               => 'sig',
        'scene'             => 'scene',
        'dataModelId'       => 'data_model_id',
    ];

    public function validate()
    {
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('timeStamp', $this->timeStamp, true);
        Model::validateRequired('seq', $this->seq, true);
        Model::validateRequired('sig', $this->sig, true);
        Model::validateRequired('scene', $this->scene, true);
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
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->timeStamp) {
            $res['time_stamp'] = $this->timeStamp;
        }
        if (null !== $this->seq) {
            $res['seq'] = $this->seq;
        }
        if (null !== $this->sig) {
            $res['sig'] = $this->sig;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->dataModelId) {
            $res['data_model_id'] = $this->dataModelId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NotifyPullstrategyChargeorderinfoRequest
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
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['time_stamp'])) {
            $model->timeStamp = $map['time_stamp'];
        }
        if (isset($map['seq'])) {
            $model->seq = $map['seq'];
        }
        if (isset($map['sig'])) {
            $model->sig = $map['sig'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['data_model_id'])) {
            $model->dataModelId = $map['data_model_id'];
        }

        return $model;
    }
}
