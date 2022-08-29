<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SaasTest16\Models;

use AlibabaCloud\Tea\Model;

class InitDemoBbpInsuranceUserRequest extends Model
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

    // 保司编码
    /**
     * @var string
     */
    public $businessCode;

    // 第三方id，此处为天猫uid
    /**
     * @var string
     */
    public $thirdPartId;

    // 来源渠道
    /**
     * @var string
     */
    public $channel;

    // 埋点信息
    /**
     * @var QueryMap
     */
    public $burieds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'businessCode'      => 'business_code',
        'thirdPartId'       => 'third_part_id',
        'channel'           => 'channel',
        'burieds'           => 'burieds',
    ];

    public function validate()
    {
        Model::validateRequired('businessCode', $this->businessCode, true);
        Model::validateRequired('thirdPartId', $this->thirdPartId, true);
        Model::validateRequired('channel', $this->channel, true);
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
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->thirdPartId) {
            $res['third_part_id'] = $this->thirdPartId;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->burieds) {
            $res['burieds'] = null !== $this->burieds ? $this->burieds->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitDemoBbpInsuranceUserRequest
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
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['third_part_id'])) {
            $model->thirdPartId = $map['third_part_id'];
        }
        if (isset($map['channel'])) {
            $model->channel = $map['channel'];
        }
        if (isset($map['burieds'])) {
            $model->burieds = QueryMap::fromMap($map['burieds']);
        }

        return $model;
    }
}
