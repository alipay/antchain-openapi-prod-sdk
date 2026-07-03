<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRtopCompanyRiskinfoRequest extends Model
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

    // 租户access key
    /**
     * @var string
     */
    public $ak;

    // 业务场景 ""
    /**
     * @var string
     */
    public $bizType;

    // 预留字段
    /**
     * @var string
     */
    public $memo;

    // 区域中文名称
    /**
     * @var string
     */
    public $placeName;

    // 区域类型
    /**
     * @var string
     */
    public $placeType;

    // 租户seceret key
    /**
     * @var string
     */
    public $sk;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ak'                => 'ak',
        'bizType'           => 'biz_type',
        'memo'              => 'memo',
        'placeName'         => 'place_name',
        'placeType'         => 'place_type',
        'sk'                => 'sk',
    ];

    public function validate()
    {
        Model::validateRequired('ak', $this->ak, true);
        Model::validateRequired('placeName', $this->placeName, true);
        Model::validateRequired('placeType', $this->placeType, true);
        Model::validateRequired('sk', $this->sk, true);
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
        if (null !== $this->ak) {
            $res['ak'] = $this->ak;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->placeName) {
            $res['place_name'] = $this->placeName;
        }
        if (null !== $this->placeType) {
            $res['place_type'] = $this->placeType;
        }
        if (null !== $this->sk) {
            $res['sk'] = $this->sk;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRtopCompanyRiskinfoRequest
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
        if (isset($map['ak'])) {
            $model->ak = $map['ak'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['place_name'])) {
            $model->placeName = $map['place_name'];
        }
        if (isset($map['place_type'])) {
            $model->placeType = $map['place_type'];
        }
        if (isset($map['sk'])) {
            $model->sk = $map['sk'];
        }

        return $model;
    }
}
