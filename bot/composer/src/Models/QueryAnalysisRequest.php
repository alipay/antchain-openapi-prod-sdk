<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryAnalysisRequest extends Model
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

    // 发行设备Id集合
    //
    //
    /**
     * @var string[]
     */
    public $disIdList;

    // 时间，格式YYYYMMDD
    //
    //
    /**
     * @var string
     */
    public $time;

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // SCENE : 场景设备资产分析   DEVICE：设备分析 BIZ：订单分析   ， 默认为DEVICE
    /**
     * @var string
     */
    public $scope;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'disIdList'         => 'dis_id_list',
        'time'              => 'time',
        'scene'             => 'scene',
        'scope'             => 'scope',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
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
        if (null !== $this->disIdList) {
            $res['dis_id_list'] = $this->disIdList;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAnalysisRequest
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
        if (isset($map['dis_id_list'])) {
            if (!empty($map['dis_id_list'])) {
                $model->disIdList = $map['dis_id_list'];
            }
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }

        return $model;
    }
}
