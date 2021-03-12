<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class StartAuthVerifyCarinspectRequest extends Model
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

    // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
    /**
     * @var string
     */
    public $bizId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    /**
     * @var string
     */
    public $bizType;

    // 车牌号，内容大写，不带空格。
    /**
     * @var string
     */
    public $plateNo;

    // 非必填参数，号牌种类说明，比如"01"代表大型汽车，具体类型入参说明参考文档枚举。
    /**
     * @var string
     */
    public $plateType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'bizType'           => 'biz_type',
        'plateNo'           => 'plate_no',
        'plateType'         => 'plate_type',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('plateNo', $this->plateNo, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->plateNo) {
            $res['plate_no'] = $this->plateNo;
        }
        if (null !== $this->plateType) {
            $res['plate_type'] = $this->plateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAuthVerifyCarinspectRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['plate_no'])) {
            $model->plateNo = $map['plate_no'];
        }
        if (isset($map['plate_type'])) {
            $model->plateType = $map['plate_type'];
        }

        return $model;
    }
}
