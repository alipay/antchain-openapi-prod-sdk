<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ListDataauthorizationAuthorityCertRequest extends Model
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

    // 授权凭证ID列表
    /**
     * @var string[]
     */
    public $authorityCertIds;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authorityCertIds'  => 'authority_cert_ids',
    ];

    public function validate()
    {
        Model::validateRequired('authorityCertIds', $this->authorityCertIds, true);
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
        if (null !== $this->authorityCertIds) {
            $res['authority_cert_ids'] = $this->authorityCertIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListDataauthorizationAuthorityCertRequest
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
        if (isset($map['authority_cert_ids'])) {
            if (!empty($map['authority_cert_ids'])) {
                $model->authorityCertIds = $map['authority_cert_ids'];
            }
        }

        return $model;
    }
}
