<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAuthVcContentRequest extends Model
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

    // 如果此字段为空，则默认使用当前请求租户在授权宝配置的did来进行查询(此did需授权有权限)，此外情况都需要指定目标vc_id的owner_did
    /**
     * @var string
     */
    public $ownerDid;

    // 查询目标可验证声明的ID
    /**
     * @var string
     */
    public $vcId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'ownerDid'          => 'owner_did',
        'vcId'              => 'vc_id',
    ];

    public function validate()
    {
        Model::validateRequired('vcId', $this->vcId, true);
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
        if (null !== $this->ownerDid) {
            $res['owner_did'] = $this->ownerDid;
        }
        if (null !== $this->vcId) {
            $res['vc_id'] = $this->vcId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAuthVcContentRequest
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
        if (isset($map['owner_did'])) {
            $model->ownerDid = $map['owner_did'];
        }
        if (isset($map['vc_id'])) {
            $model->vcId = $map['vc_id'];
        }

        return $model;
    }
}
