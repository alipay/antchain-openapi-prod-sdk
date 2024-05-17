<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthVcTransactionRequest extends Model
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

    // 查询目标可验证声明的ID
    /**
     * @var string
     */
    public $vcId;

    // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
    /**
     * @var string
     */
    public $bizType;

    // 如果此字段为空，则默认使用当前请求租户在授权宝配置的did来进行查询(此did需授权有权限)，此外情况都需要指定目标vc_id的owner_did
    //
    /**
     * @var string
     */
    public $ownerDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'vcId'              => 'vc_id',
        'bizType'           => 'biz_type',
        'ownerDid'          => 'owner_did',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
        Model::validateRequired('bizType', $this->bizType, true);
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
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthVcTransactionRequest
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
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }

        return $model;
    }
}
